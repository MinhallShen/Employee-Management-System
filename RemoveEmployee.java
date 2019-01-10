/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minha
 */
public class RemoveEmployee extends javax.swing.JFrame {
    MyHashTable hashTable;
    /**
     * Creates new form RemoveEmployee
     */
    public RemoveEmployee(MyHashTable hashTable) {
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

        RemoveEmployeeLabel = new javax.swing.JLabel();
        RemoveEMPNumLabel = new javax.swing.JLabel();
        RemoveEMPNumField = new javax.swing.JTextField();
        ConfirmButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        EMPNumError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RemoveEmployeeLabel.setText("Remove Employee");

        RemoveEMPNumLabel.setText("Employee Number");

        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        EMPNumError.setText("You did not enter anything!");
        EMPNumError.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(RemoveEmployeeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(RemoveEMPNumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveEMPNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EMPNumError)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ConfirmButton)))
                .addGap(260, 260, 260))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RemoveEmployeeLabel)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveEMPNumLabel)
                    .addComponent(RemoveEMPNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(EMPNumError)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmButton)
                    .addComponent(BackButton))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
    //MainJFrame new_Window = new MainJFrame();
    //new_Window.setVisible(true);
    //RemoveEmployee.this.setVisible(false);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        // TODO add your handling code here:
        try{
      int number = Integer.parseInt(RemoveEMPNumField.getText());
      
      this.hashTable.removeEmployee(number);
      System.out.println(this.hashTable.getRealSize());
      dispose();
  }
  catch (Exception e){
      EMPNumError.setVisible(true);
  }   
        //boolean removed = true;
        /*int number = Integer.parseInt(RemoveEMPNumField.getText());       
        this.hashTable.removeEmployee(number);
        System.out.println(this.hashTable.getRealSize());
        dispose();*/
        //this.hashTable.getRealSize();
        //this.hashTable.listEmployees();
        /*if ("".equals(RemoveEMPNumField.getText())){
            EMPNumError.setVisible(true);
            RemoveEMPNumField.setText("");
        }*/
        //RemoveEmployee.this.setVisible(false);
        //MainJFrame new_Window = new MainJFrame();
        //new_Window.setVisible(true);
        
        
        /*if (tempEmployee.getEmployeeNumber() == 0){
            removed = false;
        }
        
        if (removed = true){
            //save to file
            Successfully_Removed new_Window = new Successfully_Removed();
            new_Window.setVisible(true);
            RemoveEmployee.this.setVisible(false);
            
        }
        if (removed = false){
            EMPNumError.setVisible(true);
        }*/
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new RemoveEmployee().setVisible(true);
            }
        }); 
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel EMPNumError;
    private javax.swing.JTextField RemoveEMPNumField;
    private javax.swing.JLabel RemoveEMPNumLabel;
    private javax.swing.JLabel RemoveEmployeeLabel;
    // End of variables declaration//GEN-END:variables
}
