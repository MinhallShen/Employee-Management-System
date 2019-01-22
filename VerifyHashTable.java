/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minha
 */
public class VerifyHashTable {
    public static void main(String[] Args){
        MyHashTable Test = new MyHashTable();
        
        EmployeeInfo e1 = new EmployeeInfo();
        e1.setEmployeeNumber(1);
        e1.setFirstName("Bob");
        e1.setLastName("Smith");
        e1.setAge(16);
        e1.setSex(0);
        e1.setDeductionRate(0.1);
        e1.setLocation(1);
        
        EmployeeInfo e2 = new EmployeeInfo();
        e2.setEmployeeNumber(2);
        e2.setFirstName("John");
        e2.setLastName("Doe");
        e2.setAge(19);
        e2.setSex(1);
        e2.setDeductionRate(0.3);
        e2.setLocation(0);
        
        EmployeeInfo e3 = new EmployeeInfo();
        e3.setEmployeeNumber(3);
        e3.setFirstName("Jane");
        e3.setLastName("Griffin");
        e3.setAge(65);
        e3.setSex(1);
        e3.setDeductionRate(0.23);
        e3.setLocation(2);
        
        EmployeeInfo e4 = new EmployeeInfo(4,"jack", "asdf", 60, 1, 0.2, 2);
        
        EmployeeInfo e5 = new EmployeeInfo(5,"quinn", "a", 60, 1, 0.2, 2);
        
        
        //Test.addEmployee(e1);
        Test.addEmployee(e2);
        Test.addEmployee(e3);
        Test.addEmployee(e4);
        //Test.addEmployee(e4);
        //Test.removeEmployee(2);
        Test.listEmployees();
        Test.addEmployee(e1);
        //Test.addEmployee(e4);
        Test.addEmployee(e5);
        Test.listEmployees();
        System.out.println(Test.getRealSize());
        
    }
    
}
