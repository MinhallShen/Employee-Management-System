
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.util.*;

public class MyHashTable {

    //Attributes

    private int bucketSize = 16;

    private int realSize = 0;

    private double defaultLoadFactor = 0.75;   //when number of employees reach 0.75 of number of buckets, rehash
    
    //private String saveLocation = "C:/Users/minha/Downloads/EmployeeManagementSystem/src";

    ArrayList<EmployeeInfo>[] buckets;

    public MyHashTable() {   // hash function
        buckets = new ArrayList[bucketSize];
        for (int i = 0; i < bucketSize; i++) {
            buckets[i] = new ArrayList<>();

        }
    }

    private int myHash(int employeeNumber) {
        return employeeNumber % bucketSize;

    }

    //Methods
    private void insert(EmployeeInfo toBeAdded, ArrayList<EmployeeInfo>[] newHashTable) {    //used for rehash function
        int index = myHash(toBeAdded.getEmployeeNumber());
        if (newHashTable[index] == null) {
            ArrayList<EmployeeInfo> temp = new ArrayList<EmployeeInfo>();
            temp.add(toBeAdded);
            newHashTable[index] = temp;
        } else {                               
            boolean scanned = false;
            for (int i = 0; i < newHashTable[index].size(); i++) {
                if (toBeAdded.getEmployeeNumber() == newHashTable[index].get(i).getEmployeeNumber()) {
                    newHashTable[index].set(i, toBeAdded);
                    scanned = true;
                    break;
                }
                if (scanned = false) {
                    newHashTable[index].add(toBeAdded);
                }
            }
        }
    }

    private void rehash() {                               //As buckets fill up, add more
        bucketSize = 2 * bucketSize;
        ArrayList<EmployeeInfo>[] newBucket = new ArrayList[bucketSize];
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != null) {
                for (int j = 0; j < buckets[j].size(); j++) {
                    insert(buckets[i].get(j), newBucket);
                }
            }
        }
        buckets = newBucket;
    }

    public void addEmployee(EmployeeInfo toBeAdded) { // add employee to the hashtable
        if (realSize / bucketSize > defaultLoadFactor) {
            rehash();
        }
        int index = myHash(toBeAdded.getEmployeeNumber()); 
        if (buckets[index] == null) {                                       
            ArrayList<EmployeeInfo> temp = new ArrayList<EmployeeInfo>();
            temp.add(toBeAdded);
            buckets[index] = temp;
            realSize++;
        } else {
            boolean scanned = false;
            for (int i = 0; i < buckets[index].size(); i++) {
                if (toBeAdded.getEmployeeNumber() == buckets[index].get(i).getEmployeeNumber()) {
                    buckets[index].set(i, toBeAdded);
                    scanned = true;
                    break;
                }
            }
            if (scanned == false) {
                buckets[index].add(toBeAdded);
                realSize++;
            }
        }
    }


    public EmployeeInfo searchEmployee(int employeeNumber) {                    // search for an employee and display his/her information
        for (int i = 0; i != buckets[myHash(employeeNumber)].size(); i++) {
            if (employeeNumber == buckets[myHash(employeeNumber)].get(i).getEmployeeNumber()) {
                return buckets[myHash(employeeNumber)].get(i);
            }
        }
        return null;
    }

    public EmployeeInfo removeEmployee(int toBeRemoved) {   //remove from hashtable
        int index = myHash(toBeRemoved);
        if (buckets[index] != null) {
            for (int i = 0; i < buckets[index].size(); i++) {
                if (toBeRemoved != buckets[index].get(i).getEmployeeNumber()) {
                    continue;
                } else {
                    EmployeeInfo removedEmployee = buckets[index].get(i);
                    buckets[index].remove(i);
                    realSize--;
                    return removedEmployee;
                }
            }
        }
        return null;

        //else{
        //System.out.println("Employee does not exist");
        //}
    }

    public void listEmployees() {                          //display a table of all the employees in the system
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] == null) {
                continue;
            }
            for (int j = 0; j < buckets[i].size(); j++) {
                if (buckets[i].isEmpty()) {
                    System.out.println("You have no employees!");
                } else {
                
                    System.out.println(buckets[i].get(j).getEmployeeNumber() + "^"
                    + buckets[i].get(j).getFirstName() + "^"
                    + buckets[i].get(j).getLastName() + "^"
                    ); 

                }
            }
        }
    }   
    public int getRealSize() {
        return realSize;
    }

}
