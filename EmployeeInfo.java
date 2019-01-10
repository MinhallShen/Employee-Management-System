/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minha
 */
class EmployeeInfo {
    int employeeNumber;
    private String firstName;
    private String lastName;
    private int age;
    private int sex;
    private double deductionRate;
    private int location;
    
    public EmployeeInfo(){  //constructor
        employeeNumber = -1;
        firstName = null;
        lastName = null;
        age = -1;
        sex = -1;
        deductionRate = 0;
        location = -1;
    }
    public EmployeeInfo(int em, String fN, String lN, int old, int gender, double deduction, int place){    //constructor
        employeeNumber = em;
        firstName = fN;
        lastName = lN;
        age = old;
        sex = gender;
        deductionRate = deduction;
        location = place;   
    }
    //getters and setters
    public void setEmployeeNumber(int Number){
        this.employeeNumber = Number;
    }
    public int getEmployeeNumber(){
        return this.employeeNumber;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setAge(int Number){
        this.age = Number;
    }
    public int getAge(){
        return this.age;
    }
    public void setSex(int Number){
        this.sex = Number;
    }
    public int getSex(){
        return this.sex;
    }
    public void setDeductionRate(double Number){
        this.deductionRate = Number;
    }
    public double getDeductionRate(){
        return this.deductionRate;
    }
    public void setLocation(int location){
        this.location = location;
    }
    public int getLocation(){
        return this.location;
    }
             
}
