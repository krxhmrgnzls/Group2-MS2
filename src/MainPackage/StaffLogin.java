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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        unlbl = new javax.swing.JLabel();
        untxtfield = new javax.swing.JTextField();
        passlbl = new javax.swing.JLabel();
        pwpsfield = new javax.swing.JPasswordField();
        outputlbl = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Payroll Staff Login");

        unlbl.setText("Username");

        untxtfield.setForeground(new java.awt.Color(153, 153, 153));
        untxtfield.setText("Enter Username");
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

        passlbl.setText("Password");

        pwpsfield.setForeground(new java.awt.Color(204, 204, 204));
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

        loginbtn.setText("LOGIN");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(114, 114, 114))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(outputlbl)
                    .addComponent(passlbl)
                    .addComponent(unlbl)
                    .addComponent(untxtfield, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(pwpsfield)
                    .addComponent(loginbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(unlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(untxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwpsfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void untxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_untxtfieldActionPerformed
        
    }//GEN-LAST:event_untxtfieldActionPerformed

    private void untxtfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_untxtfieldFocusGained
     if(untxtfield.getText().equals("Enter Username")) {
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
    if (pwpsfield.getPassword().equals("Enter Password")){
            pwpsfield.setText("Enter Password");
            pwpsfield.setForeground(Color.gray);
        }
    }//GEN-LAST:event_pwpsfieldFocusLost

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
       String username = untxtfield.getText();
        char[] password;
        password = pwpsfield.getPassword();

    if (isValidCredentials(username, password)) {
        outputlbl.setText("Login successful!");
        dispose();
        Dashboard newFrame = new Dashboard();
        newFrame.setVisible(true);
    } else {
        outputlbl.setText("Invalid username or password!");
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

    return false; // Credentials are not valid
    }   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel outputlbl;
    private javax.swing.JLabel passlbl;
    private javax.swing.JPasswordField pwpsfield;
    private javax.swing.JLabel unlbl;
    private javax.swing.JTextField untxtfield;
    // End of variables declaration//GEN-END:variables
}
    
