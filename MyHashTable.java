
import java.util.*;

public class MyHashTable {

    //Attributes

    private int bucketSize = 16;

    private int realSize = 0;

    private double defaultLoadFactor = 0.75;

    ArrayList<EmployeeInfo>[] buckets = new ArrayList[bucketSize];

    public MyHashTable() {
        for (int i = 0; i < bucketSize; i++) {
            buckets[i] = new ArrayList<EmployeeInfo>();

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

    public void addEmployee(EmployeeInfo toBeAdded) {
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

    /*private int calcBucket(int employeeNumber) {
     return employeeNumber % buckets.length;
     }*/
    public EmployeeInfo searchEmployee(int employeeNumber) {
        for (int i = 0; i != buckets[myHash(employeeNumber)].size(); i++) {
            if (employeeNumber == buckets[myHash(employeeNumber)].get(i).getEmployeeNumber()) {
                return buckets[myHash(employeeNumber)].get(i);
            }
        }
        return null;
    }

    public EmployeeInfo removeEmployee(int toBeRemoved) {
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

    public void listEmployees() { // EmployeeInfo or void???
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] == null) {
                continue;
            }
            for (int j = 0; j < buckets[i].size(); j++) {
                if (buckets[i].isEmpty()) {
                    System.out.println("You have no employees!");
                } else {
                //return buckets[i].get(j).getEmployeeNumber();
                    //System.out.println("Employee Number: " + buckets[i].get(j).getEmployeeNumber() + " Name: " 
                    //+ buckets[i].get(j).getFirstName() 
                    //+ " " + buckets[i].get(j).getLastName());

                }
            }
        }
    }
    /*public void populateJFrameTable(TheList table) {
     <default package>.logger.info("Preparing to populate JTable");
     DefaultTableModel model = (DefaultTableModel) table.getModel();
     model.setRowCount(0);
     for (int i = 0; i < length; i++) {

     if (buckets[i].isEmpty()) {

     continue;
     }

     for (int k = 0; k < buckets[i].size(); k++) {
     if (buckets[i].get(k) instanceof PartTimeEmployee) {
     PartTimeEmployee employee = (PartTimeEmployee) buckets[i].get(k);
     double salaryCalculated;
     if (employee.getDeductionRate() == 0) {
     salaryCalculated = (employee.getHourlyWage() * employee.getHoursPerWeek() * employee.getWeeksPerYear());
     } else {
     salaryCalculated = (employee.getHourlyWage() * employee.getHoursPerWeek() * employee.getWeeksPerYear()) * (employee.getDeductionRate() / 100);
     }
     model.addRow(new Object[]{employee.getFirstName(), employee.getLastName(), employee.getEmployeeNumber(), "Part Time", salaryCalculated});
     } else if (buckets[i].get(k) instanceof FullTimeEmployee) {
     FullTimeEmployee employee = (FullTimeEmployee) buckets[i].get(k);
     double salaryCalculated;
     if (employee.getDeductionRate() == 0) {
     salaryCalculated = (employee.getYearlySalary());
     } else {
     salaryCalculated = (employee.getYearlySalary()) * (employee.getDeductionRate() / 100);
     }
     model.addRow(new Object[]{employee.getFirstName(), employee.getLastName(), employee.getEmployeeNumber(), "Full Time", salaryCalculated});
     } else {
     //Silence
     }

     }
     EMSMain.logger.info("The Main Menu JTable has been populated.");

     }

     }*/

    public String[][] exportContents() {

        int employeesAdded = 0;

        String[][] allEmployees = new String[realSize][7];

        for (int i = 0; i < buckets.length; i++) {
            int listSize = buckets[i].size();
            if (listSize == 0) {
                System.out.println("You have no employees!");
            } else {
                for (int j = 0; j < listSize; j++) {
                    EmployeeInfo toBeAdded = buckets[i].get(j);
                    String sexText;
                    String workLocText;

                    switch (toBeAdded.getSex()) {
                        case 1:
                            sexText = "Male";
                            break;
                        case 2:
                            sexText = "Female";
                            break;
                        case 3:
                            sexText = "Other";
                            break;
                        default:
                            sexText = "Male";
                            break;
                    }
                    switch (toBeAdded.getLocation()) {
                        case 1:
                            workLocText = "Mississauga";
                            break;
                        case 2:
                            workLocText = "Ottawa";
                            break;
                        case 3:
                            workLocText = "Chicago";
                            break;

                        default:
                            workLocText = "Mississauga";
                            break;
                    }
                    allEmployees[employeesAdded][0] = Integer.toString(toBeAdded.getEmployeeNumber());
                    allEmployees[employeesAdded][1] = toBeAdded.getFirstName();
                    allEmployees[employeesAdded][2] = toBeAdded.getLastName();
                    allEmployees[employeesAdded][3] = sexText;
                    allEmployees[employeesAdded][4] = workLocText;
                    allEmployees[employeesAdded][5] = Integer.toString(toBeAdded.getAge());
                    allEmployees[employeesAdded][6] = Double.toString(toBeAdded.getDeductionRate());
                    employeesAdded++;
                } // end for

            } // end else

        } // end for
        return allEmployees;
    } // end method exportContents 

    public int getRealSize() {
        return realSize;
    }

}
