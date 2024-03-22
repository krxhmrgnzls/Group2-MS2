package MainPackage;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Leave extends javax.swing.JFrame {
    
    String[][] employeeData = {
        {"1", "Manuel Garcia III"},
        {"2", "Antonio Lim"},
        {"3", "Bianca Sofia Aquino"},
        {"4", "Isabella Reyes"},
        {"5", "Eduard Hernandez"},
        {"6", "Andrea Mae Villanueva"},
        {"7", "Brad San Jose"},
        {"8", "Alice Romualdez"},
        {"9", "Rosie Atienza"},
        {"10", "Roderick Alvaro"},
        {"11", "Anthony Salcedo"},
        {"12", "Josie Lopez"},
        {"13", "Martha Farala"},
        {"14", "Leila Martinez"},
        {"15", "Fredrick Romualdez"},
        {"16", "Christian Mata"},
        {"17", "Selena De Leon"},
        {"18", "Allison San Jose"},
        {"19", "Cydney Rosario"},
        {"20", "Mark Bautista"},
        {"21", "Darlene Lazaro"},
        {"22", "Kolby Delos Santos"},
        {"23", "Vella Santos"},
        {"24", "Tomas Del Rosario"},
        {"25", "Jacklyn Tolentino"},
        {"26", "Percival Gutierrez"},
        {"27", "Garfiel Manalaysay"},
        {"28", "Lizeth Villegas"},
        {"29", "Carol Ramos"},
        {"30", "Emelia Maceda"},
        {"31", "Delia Aguilar"},
        {"32", "John Rafael Castro"},
        {"33", "Carlos Ian Martinez"},
        {"34", "Beatriz Santos"} 
    
    };

    public Leave() {
        initComponents();
        elrsubmit.setBackground(Color.WHITE);
        jcombobox1.setBackground(Color.WHITE);
        elrdays.setBackground(Color.WHITE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        elrempno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        elrname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcombobox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        elrdays = new javax.swing.JComboBox<>();
        elrsubmit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Employee Leave Request");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Home");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Employee No.");

        elrempno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elrempnoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Type of Leave");

        jcombobox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcombobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Annual leave", "Bereavement leave", "Casual leave", "Sick leave", "Vacation leave", "Personal leave", "Emergency leave", "Birthday leave", "Leave without pay", "Suspension Item" }));
        jcombobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombobox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Days");

        elrdays.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elrdays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        elrdays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elrdaysActionPerformed(evt);
            }
        });

        elrsubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elrsubmit.setText("SUBMIT");
        elrsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elrsubmitActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/leave.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(358, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(elrsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jcombobox1, 0, 238, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(elrempno, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                    .addComponent(elrname))))
                        .addGap(80, 80, 80)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(elrdays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(elrempno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(elrdays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(elrname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(elrsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elrsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elrsubmitActionPerformed
        JOptionPane.showMessageDialog(this, "Sucess! Your request has been submitted.");
        
    }//GEN-LAST:event_elrsubmitActionPerformed

    private void elrempnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elrempnoActionPerformed
        String empNumber = elrempno.getText().trim();
        String empName = lookupEmployeeName(empNumber);
        elrname.setText(empName);
        
        if (empName.equals("Employee not found")) {
            JOptionPane.showMessageDialog(this, "Employee not found.");
        }
    }//GEN-LAST:event_elrempnoActionPerformed

    private void elrdaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elrdaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elrdaysActionPerformed

    private void jcombobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombobox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombobox1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        DashboardEmployee back = new DashboardEmployee();
        back.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> elrdays;
    private javax.swing.JTextField elrempno;
    private javax.swing.JTextField elrname;
    private javax.swing.JButton elrsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcombobox1;
    // End of variables declaration//GEN-END:variables

    private String lookupEmployeeName(String empNumber) {
        for (String[] employee : employeeData) {
        if (employee[0].equals(empNumber)) {
            return employee[1];
        }
        }

    return "Employee not found";
    }
}
