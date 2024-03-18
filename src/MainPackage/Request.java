package MainPackage;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Request extends javax.swing.JFrame {

  
    public Request() {
        initComponents();
        setUpStatusColumn();
        loadCSVIntoTable("C:\\Users\\Krixhia\\Documents\\NetBeansProjects\\MotorPH-PayrollSystem\\src\\MainPackage\\RequestList.csv");
        loadCSVIntoPreviousTable ("C:\\Users\\Krixhia\\Documents\\NetBeansProjects\\MotorPH-PayrollSystem\\src\\MainPackage\\Process Payroll.csv");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RequestPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        sendselectedbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RequestTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PreviousTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sendselectedbtn.setText("Send Selected");
        sendselectedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendselectedbtnActionPerformed(evt);
            }
        });

        RequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Employee Name", "Request Type", "Requirements", "Status"
            }
        ));
        jScrollPane1.setViewportView(RequestTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(691, Short.MAX_VALUE)
                        .addComponent(sendselectedbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sendselectedbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        RequestPane.addTab("Request Status", jPanel1);

        PreviousTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Employee Name", "Date", "Request Type", "Status"
            }
        ));
        jScrollPane2.setViewportView(PreviousTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        RequestPane.addTab("Previous Status", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RequestPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(RequestPane, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendselectedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendselectedbtnActionPerformed
       JOptionPane.showMessageDialog(Request.this, "Successfully Sent to Admin!", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_sendselectedbtnActionPerformed
    private void loadCSVIntoTable(String csvFilePath) {
    File csvFile = new File(csvFilePath);
    if (!csvFile.isFile()) {
        JOptionPane.showMessageDialog(this, "File does not exist: " + csvFilePath, "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    try (BufferedReader csvReader = new BufferedReader(new FileReader(csvFile))) {
        String row;
        List<String[]> data = new ArrayList<>();
        while ((row = csvReader.readLine()) != null) {
            String[] dataRow = row.split(","); // Assuming comma is the delimiter
            data.add(dataRow);
        }
        String[] columnNames = data.remove(0); // Assuming the first row is column headers
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Only the fifth column (Status) is editable
                return column == 4;
            }
        };
        for (String[] rowData : data) {
            model.addRow(rowData);
        }
        RequestTable.setModel(model);
        setUpStatusColumn();
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error reading file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void setUpStatusColumn() {
    JComboBox<String> comboBox = new JComboBox<>();
    comboBox.addItem("Waiting");
    comboBox.addItem("On-Hold");
    comboBox.addItem("Approved");
    comboBox.addItem("Disapproved");

    TableColumn statusColumn = RequestTable.getColumnModel().getColumn(4);
    
 
    statusColumn.setCellRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
            if (isSelected) {
                comboBox.setSelectedItem(value);
                return comboBox;
            }
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    });

   
    statusColumn.setCellEditor(new DefaultCellEditor(comboBox));
}
    private void loadCSVIntoPreviousTable(String csvFilePath) {
    File csvFile = new File(csvFilePath);
    if (!csvFile.isFile()) {
        JOptionPane.showMessageDialog(this, "File does not exist: " + csvFilePath, "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    try (BufferedReader csvReader = new BufferedReader(new FileReader(csvFile))) {
        String row;
        List<String[]> data = new ArrayList<>();
        while ((row = csvReader.readLine()) != null) {
            String[] dataRow = row.split(","); // Assuming comma is the delimiter
            data.add(dataRow);
        }
        String[] columnNames = data.remove(0); // Assuming the first row is column headers
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        for (String[] rowData : data) {
            model.addRow(rowData);
        }
        PreviousTable.setModel(model);
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error reading file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}



   public static void main(String args[]) {
    try {
        // Set to system look and feel
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
        e.printStackTrace();
    }
  
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Request().setVisible(true);
        }
    });
}




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PreviousTable;
    private javax.swing.JTabbedPane RequestPane;
    private javax.swing.JTable RequestTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sendselectedbtn;
    // End of variables declaration//GEN-END:variables
}
