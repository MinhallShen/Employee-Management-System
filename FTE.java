/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minha
 */
public class FTE extends EmployeeInfo{  
        private double annualSalary;
        
        public FTE(int em, String fN, String lN, int old, int gender, double deduction, int place, double annualSalary){
            super(em, fN, lN, old, gender, deduction, place);
            this.annualSalary = annualSalary;       
        }
        public void setAnnualSalary(double annualSalary){
            this.annualSalary = annualSalary;
        }
        public double getAnnualSalary(){
            return annualSalary;
        }
        
        public double calcAnnualNetIncome(EmployeeInfo toBeAdded){
            double deduct = toBeAdded.getDeductionRate();
            return(annualSalary * (1 - deduct));
        }
    }
