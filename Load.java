import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
public class Load extends javax.swing.JFrame {
    MyHashTable hashTable;
    /**
     * Creates new form Load
     */
    public Load(MyHashTable hashTable) {
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
        LoadFileBox = new javax.swing.JTextField();
        LoadButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter file to load");

        LoadFileBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadFileBoxActionPerformed(evt);
            }
        });

        LoadButton.setText("Load");

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoadButton)
                        .addGap(59, 59, 59)
                        .addComponent(CancelButton))
                    .addComponent(jLabel1)
                    .addComponent(LoadFileBox, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoadFileBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoadButton)
                    .addComponent(CancelButton))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void LoadFileBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadFileBoxActionPerformed
        // TODO add your handling code here:
        BufferedReader reader;
        
        try{
            reader = new BufferedReader(new FileReader(LoadFileBox.getText() + ".txt"));
            String line = reader.readLine();
            while((line = reader.readLine()) != null){
                String[] var = line.split("^");
                if(var[8] != null){
                    int en = parseInt(var[0]);
                    String firstN = var[1];
                    String lastN = var[2];
                    int age = parseInt(var[3]);
                    int sex = parseInt(var[4]);
                    int location = parseInt(var[5]);
                    double deduct = parseDouble(var[6]);
                    double hourlyWage = parseDouble(var[7]);
                    double hoursInWeek = parseDouble(var[8]);
                    double weeksInYear = parseDouble(var[9]);
                    PTE tempPTE = new PTE(en, firstN, lastN, age, sex, deduct, location, hourlyWage, hoursInWeek, weeksInYear);
                    this.hashTable.addEmployee(tempPTE);
                }
                else{
                    int en = parseInt(var[0]);
                    String firstN = var[1];
                    String lastN = var[2];
                    int age = parseInt(var[3]);
                    int sex = parseInt(var[4]);
                    int location = parseInt(var[5]);
                    double deduct = parseDouble(var[6]);
                    double salary = parseDouble(var[7]);
                    FTE tempFTE = new FTE(en, firstN, lastN, age, sex, deduct, location, salary);
                    this.hashTable.addEmployee(tempFTE);
                }
            }
            reader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_LoadFileBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton LoadButton;
    private javax.swing.JTextField LoadFileBox;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
