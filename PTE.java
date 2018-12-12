/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minha
 */
public class PTE extends EmployeeInfo{
        private double hourlyWage;
        private double hoursInWeek;
        private double weekInYears;
        
        public PTE(int em, String fN, String lN, int old, int gender, double deduction, int place, double hourlyWage, double hoursInWeek, double weekInYears){
            super(em, fN, lN, old, gender, deduction, place);
            this.hourlyWage = hourlyWage;
            this.hoursInWeek = hoursInWeek;
            this.weekInYears = weekInYears;
        }
        
        public void setHourlyWage(double hourlyWage){
            this.hourlyWage = hourlyWage;
        }
        public double getHourlyWage(){
            return hourlyWage;
        }
        public void setHoursInWeek(double hoursInWeek){
            this.hoursInWeek = hoursInWeek;
        }
        public double getHoursInWeek(){
            return hoursInWeek;
        }
        public void setWeekInYears(double weekInYears){
            this.weekInYears = weekInYears;
        }
        public double weekInYears(){
            return weekInYears;
        }
        
        public double calcAnnualNetIncome(EmployeeInfo toBeAdded){
            double deduct = toBeAdded.getDeductionRate();
            return(hourlyWage * hoursInWeek * weekInYears * (1 - deduct));
        }
        
    }
