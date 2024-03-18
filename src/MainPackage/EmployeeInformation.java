package MainPackage;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;

public class EmployeeInformation extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeInformation
     */
    public EmployeeInformation() {
        initComponents();
        
        loadEmployeeDataFromFile("C:\\Users\\Krixhia\\Documents\\NetBeansProjects\\MotorPH-PayrollSystem\\src\\MainPackage\\Employee Data.csv", Arrays.asList(0, 1, 2, 10, 11, 12, 3, 4, 5), 9, "Active");


    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        empinfotab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        entempnumtxtfield = new javax.swing.JTextField();
        addempbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        empinfotable = new javax.swing.JTable();
        searchbtn = new javax.swing.JButton();
        msglbl = new javax.swing.JLabel();
        deleterecordbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lntxtfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fntxtfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        empnotxtfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ptxtfield = new javax.swing.JTextField();
        stxtfield = new javax.swing.JTextField();
        istxtfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        philtxtfield = new javax.swing.JTextField();
        pitxtfield = new javax.swing.JTextField();
        bdaytxtfield = new javax.swing.JTextField();
        addtxtfield = new javax.swing.JTextField();
        pntxtfield = new javax.swing.JTextField();
        ssstxtfield = new javax.swing.JTextField();
        tintxtfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        entempnumtxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entempnumtxtfieldActionPerformed(evt);
            }
        });

        addempbtn.setText("Add Employee");
        addempbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addempbtnActionPerformed(evt);
            }
        });

        empinfotable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee No.", "Last Name", "First Name", "Status", "Position", "Supervisor", "Birthday", "Address", "Phone No."
            }
        ));
        empinfotable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empinfotableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(empinfotable);

        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        deleterecordbtn.setText("Delete Record");
        deleterecordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleterecordbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(msglbl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(entempnumtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addempbtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleterecordbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entempnumtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addempbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleterecordbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msglbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        empinfotab.addTab("All Employee", jPanel1);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText(" Last Name:");

        jLabel2.setText("First Name:");

        jLabel3.setText("Employee No:");

        jLabel4.setText("Position:");

        jLabel5.setText("Status:");

        jLabel6.setText("Immediate Supervisor:");

        jLabel7.setText("Birthday:");

        jLabel8.setText("Address:");

        jLabel9.setText("Phone  Number:");

        jLabel10.setText("PAGIBIG Number:");

        jLabel11.setText("SSS Number:");

        jLabel12.setText("PhilHealth Number:");

        jLabel13.setText("TIN Number:");

        ssstxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssstxtfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fntxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(empnotxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ptxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lntxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bdaytxtfield)
                                    .addComponent(addtxtfield, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(stxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tintxtfield)
                                    .addComponent(ssstxtfield)
                                    .addComponent(pntxtfield)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pitxtfield, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(istxtfield)
                            .addComponent(philtxtfield))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lntxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fntxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(empnotxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(bdaytxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ptxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(addtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(stxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(pntxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(istxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(ssstxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(philtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(pitxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tintxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        empinfotab.addTab("Employee Information", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empinfotab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empinfotab)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        String searchTerm = entempnumtxtfield.getText().trim();
        searchAndDisplayEmployee(searchTerm);
    }//GEN-LAST:event_searchbtnActionPerformed

    private void addempbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addempbtnActionPerformed
        AddEmployee addEmployeeFrame = new AddEmployee(this);
        addEmployeeFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addempbtnActionPerformed

    private void entempnumtxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entempnumtxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entempnumtxtfieldActionPerformed

    private void ssstxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssstxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssstxtfieldActionPerformed

    private void empinfotableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empinfotableMouseClicked
        if(evt.getClickCount() == 1) {
        int row = empinfotable.getSelectedRow();
        String empNo = empinfotable.getModel().getValueAt(row, 0).toString();
        DeleteEmployee deleteEmployeeFrame = new DeleteEmployee(this, empNo);
        deleteEmployeeFrame.setVisible(true);
        }
    }//GEN-LAST:event_empinfotableMouseClicked

    private void deleterecordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleterecordbtnActionPerformed
       
    }//GEN-LAST:event_deleterecordbtnActionPerformed
           
        
    private void loadEmployeeDataFromFile(String filePath, List<Integer> includeColumnIndices, int filterColumnIndex, String filterValue) {
    Vector columnNames = new Vector();
    Vector data = new Vector();

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line = br.readLine();

        
        if (line != null) {
            String[] headers = line.split(",");
            for (int i=0; i< headers.length; i++) {
                if(includeColumnIndices.contains(i)) {
                    columnNames.add(headers[i]);
                }
            }
        }

        
        while ((line = br.readLine()) != null) {
            Vector rowData = new Vector();
            String[] dataRow = line.split(",");
            for (int i=0; i < dataRow.length; i++) {
                if(includeColumnIndices.contains(i)){
                  rowData.add(dataRow[i]);  
                }
                
            }
            data.add(rowData);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    
    DefaultTableModel model = new DefaultTableModel(data, columnNames);
    empinfotable.setModel(model);
    model.fireTableDataChanged(); 
}
    private void searchAndDisplayEmployee(String searchTerm) {
   empinfotab.setSelectedIndex(1);

    String filePath = "C:\\Users\\Krixhia\\Documents\\NetBeansProjects\\MotorPH-PayrollSystem\\src\\MainPackage\\Employee Data.csv";

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        boolean found = false;
        while ((line = br.readLine()) != null) { // Corrected the condition here
            String[] dataRow = line.split(",");
            if (dataRow[0].trim().equals(searchTerm)) {
                lntxtfield.setText(dataRow[1]);
                fntxtfield.setText(dataRow[2]);
                empnotxtfield.setText(dataRow[0]);
                ptxtfield.setText(dataRow[11]);
                stxtfield.setText(dataRow[10]);
                istxtfield.setText(dataRow[12]);
                philtxtfield.setText(dataRow[7]);
                pitxtfield.setText(dataRow[9]);
                bdaytxtfield.setText(dataRow[3]);
                addtxtfield.setText(dataRow[4]);
                pntxtfield.setText(dataRow[5]);
                ssstxtfield.setText(dataRow[6]);
                tintxtfield.setText(dataRow[7]);
                
                found = true;
                break;
                }
            }
            if (!found) {
                msglbl.setText("Employee not found!");
        }
    } catch (IOException e) {
        e.printStackTrace();
        msglbl.setText("Error reading file");
    }

    DefaultTableModel model = (DefaultTableModel) empinfotable.getModel();
    
}
    public void addNewEmployee(Vector<String> newEmployeeData){
        DefaultTableModel model = (DefaultTableModel) empinfotable.getModel();
        model.addRow(newEmployeeData);
        
        loadEmployeeDataFromFile("C:\\Users\\Krixhia\\Documents\\NetBeansProjects\\MotorPH-PayrollSystem\\src\\MainPackage\\Employee Data.csv", Arrays.asList(0, 1, 2, 10, 11, 12, 3, 4, 5), 9, "Active");

    }
    private void writeNewEmployeeToCSV(Vector<String> employeeData, String filePath){
        String employeeCSV = String.join(",", employeeData);
        try(FileWriter writer = new FileWriter(filePath, true)){
            writer.append(employeeCSV + System.lineSeparator());
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
     private void openDeleteEmployeeFrame(String empNo) {
        DeleteEmployee deleteEmployeeFrame = new DeleteEmployee(empNo);
        deleteEmployeeFrame.setVisible(true);
    }
    
   
    public void refreshEmployeeList() {
        DefaultTableModel model = (DefaultTableModel) empinfotable.getModel();
        model.setRowCount(0); 

    
        loadEmployeeDataFromFile(
        "C:\\Users\\Krixhia\\Documents\\NetBeansProjects\\MotorPH-PayrollSystem\\src\\MainPackage\\Employee Data.csv",
        Arrays.asList(0, 1, 2, 10, 11, 12, 3, 4, 5), 
        9, 
        "Active" 
        );
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeInformation().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addempbtn;
    private javax.swing.JTextField addtxtfield;
    private javax.swing.JTextField bdaytxtfield;
    private javax.swing.JButton deleterecordbtn;
    private javax.swing.JTabbedPane empinfotab;
    private javax.swing.JTable empinfotable;
    private javax.swing.JTextField empnotxtfield;
    private javax.swing.JTextField entempnumtxtfield;
    private javax.swing.JTextField fntxtfield;
    private javax.swing.JTextField istxtfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lntxtfield;
    private javax.swing.JLabel msglbl;
    private javax.swing.JTextField philtxtfield;
    private javax.swing.JTextField pitxtfield;
    private javax.swing.JTextField pntxtfield;
    private javax.swing.JTextField ptxtfield;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField ssstxtfield;
    private javax.swing.JTextField stxtfield;
    private javax.swing.JTextField tintxtfield;
    // End of variables declaration//GEN-END:variables

    
}
