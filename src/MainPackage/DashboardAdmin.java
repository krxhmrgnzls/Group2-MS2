package MainPackage;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

 public class DashboardAdmin extends javax.swing.JFrame {
     
    public DashboardAdmin() {
        
        
        initComponents();
        
        String timecardCSV = "C:\\Users\\Krixhia\\Documents\\NetBeansProjects\\MotorPH-PayrollSystem\\src\\MainPackage\\AdminAttendance.csv";
        String[] timecardColumns = {"Employee Number", "Date", "Time-in", "Time-out"};
        populateTableFromCSV(timecardCSV, TimecardTable, timecardColumns);
        
        String payrollCSV ="C:\\Users\\Krixhia\\Documents\\NetBeansProjects\\MotorPH-PayrollSystem\\src\\MainPackage\\Manage List.csv";
        String[] payrollColumns = {"Total of Compensation", "Batch Number", "Proposed Date","CheckDate", "View", "Approval"};
        populateTableFromCSV(payrollCSV, ProcessPayrollTable, payrollColumns);
        
        TableColumn approvalColumn = ProcessPayrollTable.getColumnModel().getColumn(5);
        setUpApprovalComboBox(ProcessPayrollTable, 5);
        approvalColumn.setCellRenderer(new TableCellRenderer() {
        @Override
        
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        JComboBox<String> rendererComboBox = new JComboBox<>(new String[]{"Approved", "Denied", "Pending"});
        rendererComboBox.setSelectedItem(value);
        return rendererComboBox;
        }
    });

        
    }
   
    @SuppressWarnings("unchecked")
    
    private void setUpApprovalComboBox(JTable table, int column) {
        String[] approvalOptions = {"Approved", "Denied", "Pending"};
        JComboBox<String> approvalComboBox = new JComboBox<>(approvalOptions);
        
        TableColumn approvalColumn = table.getColumnModel().getColumn(column);
        
      
        approvalColumn.setCellEditor(new DefaultCellEditor(approvalComboBox));
       
        approvalColumn.setCellRenderer(new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JComboBox<String> rendererComboBox = new JComboBox<>(approvalOptions);
                rendererComboBox.setSelectedItem(value);
                return rendererComboBox;
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TimecardTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProcessPayrollTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TimecardTable.setBackground(new java.awt.Color(204, 204, 255));
        TimecardTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TimecardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TimecardTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Timecard Review", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        ProcessPayrollTable.setBackground(new java.awt.Color(204, 204, 255));
        ProcessPayrollTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProcessPayrollTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(ProcessPayrollTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Process Payroll", jPanel3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Logout");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
        MainPage main = new MainPage();
        main.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked
    private void populateTableFromCSV(String csvFilePath){
        File file = new File (csvFilePath);
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String[] columnsName = {"Employee Number", "Date", "Time-in", "Time-out"};
            DefaultTableModel model = (DefaultTableModel)TimecardTable.getModel();
            model.setColumnIdentifiers(columnsName);
            
            br.readLine();
            Object[] tableLines = br.lines().toArray();
            
            for(Object tableLine:tableLines){
                String line = tableLine.toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
        }catch(IOException ex){
        
    }
    }
    private void populateTableFromCSV(String csvFilePath, JTable table, String[]columnsName){
        File file = new File(csvFilePath);
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setColumnIdentifiers(columnsName);
            
            br.readLine();
            String line;
            while((line = br.readLine())!=null){
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(this, "Error reading from CSV file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
  
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProcessPayrollTable;
    private javax.swing.JTable TimecardTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
