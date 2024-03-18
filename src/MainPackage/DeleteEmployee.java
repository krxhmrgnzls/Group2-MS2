
package MainPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class DeleteEmployee extends javax.swing.JFrame {
    private EmployeeInformation parentFrame;
    private String empNo;
    
    public DeleteEmployee(EmployeeInformation parent, String empNo) {
        initComponents();
        this.parentFrame = parent;
        this.empNo = empNo;
        try {
        loadEmployeeDetails(empNo, "C:\\Users\\Krixhia\\Documents\\NetBeansProjects\\MotorPH-PayrollSystem\\src\\MainPackage\\Employee Data.csv");
        } catch (IOException e) {
        e.printStackTrace();
        }
        
    }

    DeleteEmployee(String empNo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dstats = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dposition = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dis = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dbs = new javax.swing.JTextField();
        dempnum = new javax.swing.JTextField();
        drs = new javax.swing.JTextField();
        dlastname = new javax.swing.JTextField();
        dpa = new javax.swing.JTextField();
        dfirstname = new javax.swing.JTextField();
        dca = new javax.swing.JTextField();
        dbday = new javax.swing.JTextField();
        dadd = new javax.swing.JTextField();
        dsr = new javax.swing.JTextField();
        dhr = new javax.swing.JTextField();
        dpn = new javax.swing.JTextField();
        deletebtn = new javax.swing.JButton();
        dsss = new javax.swing.JTextField();
        backdeletebtn = new javax.swing.JButton();
        dph = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        dtin = new javax.swing.JTextField();
        dpagibig = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel12.setText("Immediate Supervisor:");

        jLabel13.setText("Basic Salary:");

        jLabel1.setText("Employee Number:");

        jLabel14.setText("Rice Subsidy:");

        jLabel2.setText("Last Name:");

        jLabel15.setText("Phone Allowance:");

        jLabel3.setText("First Name:");

        jLabel4.setText("Birthday:");

        jLabel16.setText("Clothing Allowance:");

        jLabel17.setText("Semi-monthly Rate:");

        jLabel5.setText("Address:");

        jLabel18.setText("Hourly Rate:");

        jLabel6.setText("Phone Number:");

        jLabel7.setText("SSS Number:");

        jLabel8.setText("PhilHealth Number:");

        jLabel9.setText("TIN Number:");

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        backdeletebtn.setText("Back");
        backdeletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backdeletebtnActionPerformed(evt);
            }
        });

        jLabel19.setText("PAGIBIG Number:");

        jLabel10.setText("Status:");

        jLabel11.setText("Position:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel19))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dpagibig)
                    .addComponent(dempnum)
                    .addComponent(dlastname)
                    .addComponent(dfirstname)
                    .addComponent(dbday)
                    .addComponent(dadd)
                    .addComponent(dpn)
                    .addComponent(dsss)
                    .addComponent(dph)
                    .addComponent(dtin, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backdeletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addComponent(dstats)
                    .addComponent(dposition)
                    .addComponent(dis)
                    .addComponent(dbs)
                    .addComponent(drs)
                    .addComponent(dpa)
                    .addComponent(dca)
                    .addComponent(dsr)
                    .addComponent(dhr))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dempnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(dstats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(dposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(dis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dbday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(dbs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(drs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(dpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dsss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(dca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(dsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(dtin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(dhr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(dpagibig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backdeletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        boolean success = deleteEmployee(empNo); // Implement this method.
        if(success) {
        parentFrame.refreshEmployeeList(); // Ensure this method correctly reloads the table.
        setVisible(false); // Close the DeleteEmployee frame.
        } else {
        // Handle failure (e.g., show a message dialog).
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void backdeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backdeletebtnActionPerformed
        

    }//GEN-LAST:event_backdeletebtnActionPerformed
    
    public void loadEmployeeDetails(String empNo, String filePath) throws IOException{
       
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            boolean found = false;
            while ((line = br.readLine()) != null){
                String[] values = line.split(",");
                if(values[0].trim().equals(empNo)){
                    dempnum.setText(values[0]);
                    dlastname.setText(values[1]);
                    dfirstname.setText(values[2]);
                    dbday.setText(values[3]);
                    dadd.setText(values[4]);
                    dpn.setText(values[5]);
                    dsss.setText(values[6]);
                    dph.setText(values[7]);
                    dtin.setText(values[8]);
                    dstats.setText(values[9]);
                    dposition.setText(values[10]);
                    dis.setText(values[11]);
                    dbs.setText(values[12]);
                    drs.setText(values[13]);
                    dpa.setText(values[14]);
                    dca.setText(values[15]);
                    dsr.setText(values[16]);
                    dhr.setText(values[17]);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Employee not found: " + empNo);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    private boolean deleteEmployee(String empNo) {
    List<String[]> allEmployees = new ArrayList<>();
    boolean found = false;
    
    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Krixhia\\Documents\\NetBeansProjects\\MotorPH-PayrollSystem\\src\\MainPackage\\Employee Data.csv"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            if (!values[0].trim().equals(empNo)) {
                allEmployees.add(values);
            } else {
                found = true; // Mark found if the employee record is found.
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        return false;
    }
    
    if (found) {
        // Rewrite the CSV without the deleted employee
        try (PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Krixhia\\Documents\\NetBeansProjects\\MotorPH-PayrollSystem\\src\\MainPackage\\Employee Data.csv"))) {
            allEmployees.forEach(values -> pw.println(String.join(",", values)));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    return found;
}

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteEmployee(null, "employeeNumber").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backdeletebtn;
    private javax.swing.JTextField dadd;
    private javax.swing.JTextField dbday;
    private javax.swing.JTextField dbs;
    private javax.swing.JTextField dca;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField dempnum;
    private javax.swing.JTextField dfirstname;
    private javax.swing.JTextField dhr;
    private javax.swing.JTextField dis;
    private javax.swing.JTextField dlastname;
    private javax.swing.JTextField dpa;
    private javax.swing.JTextField dpagibig;
    private javax.swing.JTextField dph;
    private javax.swing.JTextField dpn;
    private javax.swing.JTextField dposition;
    private javax.swing.JTextField drs;
    private javax.swing.JTextField dsr;
    private javax.swing.JTextField dsss;
    private javax.swing.JTextField dstats;
    private javax.swing.JTextField dtin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
