
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minha
 */
public class SearchEmployee extends javax.swing.JFrame {
    MyHashTable hashTable;
    
    /**
     * Creates new form SearchEmployee
     */
    public SearchEmployee(MyHashTable hashTable) {
        this.hashTable = hashTable;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();
        SearchBack = new javax.swing.JButton();
        SearchButtonActionPerformed = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DisplayLastNameField = new javax.swing.JTextField();
        DisplayLocationField = new javax.swing.JTextField();
        DisplayGenderField = new javax.swing.JTextField();
        DisplayNetIncomeField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DisplayAgeField = new javax.swing.JTextField();
        ErrorMessage = new javax.swing.JLabel();
        UpdateEmployeeButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        DisplayFirstNameField = new javax.swing.JTextField();
        DeducationLabel = new javax.swing.JLabel();
        YearlySalaryLabel = new javax.swing.JLabel();
        DisplayYearlySalaryField = new javax.swing.JTextField();
        HourlyWageLabel = new javax.swing.JLabel();
        DisplayHourlyWageField = new javax.swing.JTextField();
        DisplayHoursPerWeekField = new javax.swing.JTextField();
        HoursPerWeekLabel = new javax.swing.JLabel();
        DisplayWeeksPerYearField = new javax.swing.JTextField();
        WeeksPerYearLabel = new javax.swing.JLabel();
        DisplayDeductionRateField = new javax.swing.JTextField();
        DisplayStatusField = new javax.swing.JTextField();
        SecondErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search and Edit Employee");

        jLabel2.setText("Employee Number");

        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        SearchBack.setText("Back");
        SearchBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBackActionPerformed(evt);
            }
        });

        SearchButtonActionPerformed.setText("Search");
        SearchButtonActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformedActionPerformed(evt);
            }
        });

        jLabel4.setText("Last Name");

        jLabel5.setText("Location");

        jLabel6.setText("Gender");

        jLabel7.setText("Net Annual Income");

        jLabel8.setText("Status");

        jLabel3.setText("Age");

        ErrorMessage.setText("Error: The employee you searched is not in the system!");
        ErrorMessage.setVisible(false);

        UpdateEmployeeButton.setText("Update");
        UpdateEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEmployeeButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("First Name");

        DeducationLabel.setText("Deduction Rate");

        YearlySalaryLabel.setText("Yearly Salary");

        HourlyWageLabel.setText("Hourly Wage");

        DisplayHoursPerWeekField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayHoursPerWeekFieldActionPerformed(evt);
            }
        });

        HoursPerWeekLabel.setText("Hours/Week");

        WeeksPerYearLabel.setText("Weeks/Year");

        SecondErrorMessage.setText("Error!");
        SecondErrorMessage.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ErrorMessage)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SearchBack, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(SearchButtonActionPerformed))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(DisplayLastNameField))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DisplayLocationField))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(DisplayGenderField, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(DisplayAgeField)
                                        .addComponent(DisplayStatusField)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(DisplayFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(DeducationLabel)
                                                .addComponent(YearlySalaryLabel)
                                                .addComponent(HourlyWageLabel)
                                                .addComponent(HoursPerWeekLabel)
                                                .addComponent(WeeksPerYearLabel))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(DisplayWeeksPerYearField)
                                                .addComponent(DisplayHoursPerWeekField)
                                                .addComponent(DisplayYearlySalaryField)
                                                .addComponent(DisplayHourlyWageField)
                                                .addComponent(DisplayDeductionRateField)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(DisplayNetIncomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(UpdateEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SecondErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(66, 66, 66))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorMessage)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchBack)
                    .addComponent(SearchButtonActionPerformed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(DisplayFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DisplayLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DisplayLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DisplayGenderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DisplayAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(DisplayStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeducationLabel)
                    .addComponent(DisplayDeductionRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YearlySalaryLabel)
                    .addComponent(DisplayYearlySalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HourlyWageLabel)
                    .addComponent(DisplayHourlyWageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DisplayHoursPerWeekField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoursPerWeekLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WeeksPerYearLabel)
                    .addComponent(DisplayWeeksPerYearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(DisplayNetIncomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateEmployeeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SecondErrorMessage)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBackActionPerformed
        //MainJFrame new_Window = new MainJFrame();
        //new_Window.setVisible(true);
        //SearchEmployee.this.setVisible(false);
        dispose();
    }//GEN-LAST:event_SearchBackActionPerformed

    private void SearchButtonActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformedActionPerformed
        // TODO add your handling code here:
        if (SearchField.getText().equals("")){
            ErrorMessage.setVisible(true);
            
        }
        else{
        int number = Integer.parseInt(SearchField.getText());

        this.hashTable.searchEmployee(number); 
        if(hashTable.searchEmployee(number) == null){          //error message
            ErrorMessage.setVisible(true);          
        }
        else{
            ErrorMessage.setVisible(false);

        DisplayFirstNameField.setText(this.hashTable.searchEmployee(number).getFirstName());    //set the attributes of employee to be visible
        DisplayLastNameField.setText(this.hashTable.searchEmployee(number).getLastName());
        
        if("0".equals(Integer.toString(this.hashTable.searchEmployee(number).getLocation()))){
            DisplayLocationField.setText("Mississauga");
        }
        if("1".equals(Integer.toString(this.hashTable.searchEmployee(number).getLocation()))){
            DisplayLocationField.setText("Ottawa");
        }
        if("2".equals(Integer.toString(this.hashTable.searchEmployee(number).getLocation()))){
            DisplayLocationField.setText("Chicago");
        }
        
        if("0".equals(Integer.toString(this.hashTable.searchEmployee(number).getSex()))){
            DisplayGenderField.setText("Male");
        }
        if("1".equals(Integer.toString(this.hashTable.searchEmployee(number).getSex()))){
            DisplayGenderField.setText("Female");
        }
        if("2".equals(Integer.toString(this.hashTable.searchEmployee(number).getSex()))){
            DisplayGenderField.setText("Other");
        }
        
        if(this.hashTable.searchEmployee(number) instanceof PTE){
            DisplayStatusField.setText("Part Time Employee");
        }
        if(this.hashTable.searchEmployee(number) instanceof FTE){
            DisplayStatusField.setText("Full Time Employee");
        }
        
        DisplayAgeField.setText(Integer.toString(this.hashTable.searchEmployee(number).getAge()));
        
        if(this.hashTable.searchEmployee(number) instanceof PTE){                   //display values based off of employee type
            PTE partTimeToBeSearched = (PTE) this.hashTable.searchEmployee(number);
            DisplayNetIncomeField.setText("$ " + Double.toString(partTimeToBeSearched.calcAnnualNetIncome(partTimeToBeSearched)));
            DisplayDeductionRateField.setText(Double.toString(partTimeToBeSearched.getDeductionRate()));
            DisplayHourlyWageField.setText(Double.toString(partTimeToBeSearched.getHourlyWage()));
            DisplayHoursPerWeekField.setText(Double.toString(partTimeToBeSearched.getHoursInWeek()));
            DisplayWeeksPerYearField.setText(Double.toString(partTimeToBeSearched.weekInYears()));
            DisplayYearlySalaryField.setText("0");
            
        }
        if(this.hashTable.searchEmployee(number) instanceof FTE){               
            FTE fullTimeToBeSearched = (FTE) this.hashTable.searchEmployee(number);
            DisplayNetIncomeField.setText("$ " + Double.toString(fullTimeToBeSearched.calcAnnualNetIncome(fullTimeToBeSearched)));
            DisplayDeductionRateField.setText(Double.toString(fullTimeToBeSearched.getDeductionRate()));
            DisplayYearlySalaryField.setText(Double.toString(fullTimeToBeSearched.getAnnualSalary()));
            DisplayHourlyWageField.setText("0");
            DisplayHoursPerWeekField.setText("0");
            DisplayWeeksPerYearField.setText("0");
        }
        }
        }
    }//GEN-LAST:event_SearchButtonActionPerformedActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void UpdateEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEmployeeButtonActionPerformed
        // TODO add your handling code here:
        //int en = parseInt(DisplayNumberField.getText());
            if (DisplayFirstNameField.getText().equals("") || DisplayLastNameField.getText().equals("") || DisplayLocationField.getText().equals("") || DisplayStatusField.getText().equals("") || DisplayGenderField.getText().equals("")
                    || DisplayHoursPerWeekField.getText().equals("") || DisplayAgeField.getText().equals("") || DisplayHourlyWageField.getText().equals("")
                    || DisplayWeeksPerYearField.getText().equals("") || DisplayDeductionRateField.getText().equals("") 
                    || DisplayYearlySalaryField.getText().equals("")){
                SecondErrorMessage.setVisible(true);
            }
            else{
            try{
            Double.parseDouble(DisplayHoursPerWeekField.getText());            //get the text of the values in the textbox and convert it to int or double
            Integer.parseInt(DisplayAgeField.getText());
            Double.parseDouble(DisplayHourlyWageField.getText());
            Double.parseDouble(DisplayWeeksPerYearField.getText());
            Double.parseDouble(DisplayDeductionRateField.getText());
            Double.parseDouble(DisplayYearlySalaryField.getText());
            }
                catch (Exception e){
                SecondErrorMessage.setVisible(true);
            }
        if("Full Time Employee".equals(DisplayStatusField.getText())){   //if FTE button is selcted
            int en = parseInt(SearchField.getText());                       //set values of new employee
            String firstN = DisplayFirstNameField.getText();        
            String lastN = DisplayLastNameField.getText();
            int age = parseInt(DisplayAgeField.getText());
            int sex = 0;
            int location = 0;
            if("Male".equals(DisplayGenderField.getText())){
                sex = 0;
            }
            if("Female".equals(DisplayGenderField.getText())){
                sex = 1;
            }
             if("Other".equals(DisplayGenderField.getText())){
                sex = 2;
            }
            if("Mississauga".equals(DisplayLocationField.getText())){
                location = 0;
            }
            if("Ottawa".equals(DisplayLocationField.getText())){
                location = 1;
            }
             if("Chicago".equals(DisplayLocationField.getText())){
                location = 2;
            }            
            double deduct = parseDouble(DisplayDeductionRateField.getText());
            double salary = parseDouble(DisplayYearlySalaryField.getText());
            double hourlyWage = parseDouble(DisplayHourlyWageField.getText());
            double hoursPerWeek = parseDouble(DisplayHoursPerWeekField.getText());   
            double weeksPerYear = parseDouble(DisplayWeeksPerYearField.getText());
            /*boolean equals = "0".equals(DisplayHourlyWageField.getText());
            boolean equals1 = "0".equals(DisplayHoursPerWeekField.getText());
            boolean equals2 = "0".equals(DisplayWeeksPerYearField.getText());*/
            FTE FullTimer = new FTE (en, firstN, lastN, age, sex, deduct, location, salary);
            this.hashTable.removeEmployee(en);                                  //remove old employee             
            this.hashTable.addEmployee(FullTimer);                              //add new employee to the table
            SuccessfullyUpdate new_Window = new SuccessfullyUpdate();
            new_Window.setVisible(true);
            dispose();
        }
        if("Part Time Employee".equals(DisplayStatusField.getText())){          // if PTE button is selected; code is basically the same as FTE
            int en = parseInt(SearchField.getText());
            String firstN = DisplayFirstNameField.getText();
            String lastN = DisplayLastNameField.getText();
            int age = parseInt(DisplayAgeField.getText());
            int sex = 0;
            int location = 0;
            if("Male".equals(DisplayGenderField.getText())){
                sex = 0;
            }
            if("Female".equals(DisplayGenderField.getText())){
                sex = 1;
            }
             if("Other".equals(DisplayGenderField.getText())){
                sex = 2;
            }
            if("Mississauga".equals(DisplayLocationField.getText())){
                location = 0;
            }
            if("Ottawa".equals(DisplayLocationField.getText())){
                location = 1;
            }
             if("Chicago".equals(DisplayLocationField.getText())){
                location = 2;
            }            
            double deduct = parseDouble(DisplayDeductionRateField.getText());
            double salary = parseDouble(DisplayYearlySalaryField.getText());
            double hourlyWage = parseDouble(DisplayHourlyWageField.getText());
            double hoursPerWeek = parseDouble(DisplayHoursPerWeekField.getText());   
            double weeksPerYear = parseDouble(DisplayWeeksPerYearField.getText());
            PTE PartTimer = new PTE (en, firstN, lastN, age, sex, deduct, location, hourlyWage, hoursPerWeek, weeksPerYear);
            //boolean equals = "0".equals(DisplayYearlySalaryField.getText());
            this.hashTable.removeEmployee(en);
            this.hashTable.addEmployee(PartTimer); 
            SuccessfullyUpdate new_Window = new SuccessfullyUpdate();
            new_Window.setVisible(true);
            dispose();
        
        }
            }
            //System.out.println(this.hashTable.getRealSize());
            //Successfully_Added new_Window = new Successfully_Added();
            //new_Window.setVisible(true);
            
    }//GEN-LAST:event_UpdateEmployeeButtonActionPerformed

    private void DisplayHoursPerWeekFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayHoursPerWeekFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayHoursPerWeekFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeducationLabel;
    private javax.swing.JTextField DisplayAgeField;
    private javax.swing.JTextField DisplayDeductionRateField;
    private javax.swing.JTextField DisplayFirstNameField;
    private javax.swing.JTextField DisplayGenderField;
    private javax.swing.JTextField DisplayHourlyWageField;
    private javax.swing.JTextField DisplayHoursPerWeekField;
    private javax.swing.JTextField DisplayLastNameField;
    private javax.swing.JTextField DisplayLocationField;
    private javax.swing.JTextField DisplayNetIncomeField;
    private javax.swing.JTextField DisplayStatusField;
    private javax.swing.JTextField DisplayWeeksPerYearField;
    private javax.swing.JTextField DisplayYearlySalaryField;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JLabel HourlyWageLabel;
    private javax.swing.JLabel HoursPerWeekLabel;
    private javax.swing.JButton SearchBack;
    private javax.swing.JButton SearchButtonActionPerformed;
    private javax.swing.JTextField SearchField;
    private javax.swing.JLabel SecondErrorMessage;
    private javax.swing.JButton UpdateEmployeeButton;
    private javax.swing.JLabel WeeksPerYearLabel;
    private javax.swing.JLabel YearlySalaryLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
