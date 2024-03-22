package MainPackage;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StaffLogin extends javax.swing.JFrame {

    
    public StaffLogin() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        unlbl = new javax.swing.JLabel();
        untxtfield = new javax.swing.JTextField();
        passlbl = new javax.swing.JLabel();
        pwpsfield = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        output = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        outputlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Payroll Staff Login");

        unlbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        unlbl.setText("Username");

        untxtfield.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        untxtfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                untxtfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                untxtfieldFocusLost(evt);
            }
        });
        untxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                untxtfieldActionPerformed(evt);
            }
        });

        passlbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passlbl.setText("Password");

        pwpsfield.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pwpsfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwpsfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwpsfieldFocusLost(evt);
            }
        });
        pwpsfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwpsfieldActionPerformed(evt);
            }
        });

        loginbtn.setBackground(new java.awt.Color(153, 153, 255));
        loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginbtn.setText("LOGIN");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/stafflogin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(61, 61, 61))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        output.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        output.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGap(22, 22, 22))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passlbl)
                            .addComponent(unlbl)
                            .addComponent(untxtfield)
                            .addComponent(pwpsfield)
                            .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(unlbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(untxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passlbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pwpsfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(output)
                        .addGap(26, 26, 26)
                        .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(outputlbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(outputlbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(850, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void untxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_untxtfieldActionPerformed
        
    }//GEN-LAST:event_untxtfieldActionPerformed

    private void untxtfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_untxtfieldFocusGained
     if(untxtfield.getText().equals("")) {
            untxtfield.setText("");
            untxtfield.setForeground(Color.gray); 
        }   
    }//GEN-LAST:event_untxtfieldFocusGained

    private void untxtfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_untxtfieldFocusLost
     if(untxtfield.getText().equals("Enter Username")) {
            untxtfield.setText("Enter Username");
            untxtfield.setForeground(Color.gray); 
        }
    }//GEN-LAST:event_untxtfieldFocusLost

    private void pwpsfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwpsfieldFocusGained
    if(pwpsfield.getPassword().equals("Enter Password")) {
            pwpsfield.setText("");
            pwpsfield.setForeground(Color.gray);
        }   
    }//GEN-LAST:event_pwpsfieldFocusGained

    private void pwpsfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwpsfieldFocusLost
    if (pwpsfield.getPassword().equals("")){
            pwpsfield.setText("Enter Password");
            pwpsfield.setForeground(Color.gray);
        }
    }//GEN-LAST:event_pwpsfieldFocusLost

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
       String username = untxtfield.getText();
        char[] password;
        password = pwpsfield.getPassword();

    if (isValidCredentials(username, password)) {
        output.setText("Login successful!");
        dispose();
        Dashboard newFrame = new Dashboard();
        newFrame.setVisible(true);
    } else {
        output.setText("Invalid username or password!");
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void pwpsfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwpsfieldActionPerformed
        
    }//GEN-LAST:event_pwpsfieldActionPerformed
    private boolean isValidCredentials(String username, char[] password) {
        String csvFilePath = "C:\\Users\\Krixhia\\Documents\\NetBeansProjects\\MotorPH-PayrollSystem\\src\\MainPackage\\ListOfAdmins.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
         String line;
            while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String storedUsername = parts[0];
            String storedPassword = parts[1];

         
            if (username.equals(storedUsername) && new String(password).equals(storedPassword)) {
                return true; 
                }
            }
         } catch (IOException e) {
    
        e.printStackTrace();
        }

    return false; 
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel output;
    private javax.swing.JLabel outputlbl;
    private javax.swing.JLabel passlbl;
    private javax.swing.JPasswordField pwpsfield;
    private javax.swing.JLabel unlbl;
    private javax.swing.JTextField untxtfield;
    // End of variables declaration//GEN-END:variables
}
    
