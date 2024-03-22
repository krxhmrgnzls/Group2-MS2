package MainPackage;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;


public class PayrollManagement extends javax.swing.JFrame {

    public PayrollManagement() {
        initComponents();
        loadCSVIntoTable("C:\\Users\\Krixhia\\Documents\\NetBeansProjects\\MotorPH-PayrollSystem\\src\\MainPackage\\Salary Information.csv");
        loadCSVIntoProcessTable("C:\\Users\\Krixhia\\Documents\\NetBeansProjects\\MotorPH-PayrollSystem\\src\\MainPackage\\Process.csv");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel3 = new javax.swing.JPanel();
        homelbl = new javax.swing.JLabel();
        ProcessPayroll = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salarytable = new javax.swing.JTable();
        processbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        payrolltable = new javax.swing.JTable();
        sendbtn = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        homelbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        homelbl.setText("Home");
        homelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homelblMouseClicked(evt);
            }
        });

        ProcessPayroll.setBackground(new java.awt.Color(153, 153, 255));

        salarytable.setBackground(new java.awt.Color(204, 204, 255));
        salarytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(salarytable);
        if (salarytable.getColumnModel().getColumnCount() > 0) {
            salarytable.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            salarytable.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            salarytable.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            salarytable.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        processbtn.setBackground(new java.awt.Color(153, 153, 255));
        processbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        processbtn.setText("Process Selected");
        processbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(processbtn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(processbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
        );

        ProcessPayroll.addTab("Salary Center", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        payrolltable.setBackground(new java.awt.Color(204, 204, 255));
        payrolltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Total of Compensation", "Batch Number", "Proposed Date", "Check Date", "View ", "Status"
            }
        ));
        jScrollPane2.setViewportView(payrolltable);

        sendbtn.setBackground(new java.awt.Color(153, 153, 255));
        sendbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sendbtn.setText("Send Selected");
        sendbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sendbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        ProcessPayroll.addTab("Process Payroll", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homelbl)
                .addGap(27, 27, 27))
            .addComponent(ProcessPayroll, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(homelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ProcessPayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void processbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processbtnActionPerformed
        ProcessPayroll.setSelectedIndex(1);
        
    }//GEN-LAST:event_processbtnActionPerformed

    private void homelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homelblMouseClicked
        this.dispose();
        Dashboard db = new Dashboard();
        db.setVisible(true);

    }//GEN-LAST:event_homelblMouseClicked

    private void sendbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbtnActionPerformed
        JOptionPane.showMessageDialog(this, "Successfully Sent to Admin!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_sendbtnActionPerformed

   private void loadCSVIntoTable(String csvFilePath) {
       File csvFile = new File(csvFilePath);
       if (!csvFile.isFile()) {
           System.out.println("File does not exist: " + csvFilePath);
           return;
       }
       try (BufferedReader csvReader = new BufferedReader(new FileReader(csvFile))) {
           String row;
           List<String[]> data = new ArrayList<>();
           while ((row = csvReader.readLine()) !=null) {
               String[] dataRow = row.split(",");
               data.add(dataRow);
           }
           String [] columnNames = data.remove(0);
           DefaultTableModel model = (DefaultTableModel) salarytable.getModel();
           model.setColumnIdentifiers(columnNames);
           model.setRowCount(0);
           
           for (String[] rowData : data) {
               model.addRow(rowData);
           }
       } catch(IOException ex) {
           ex.printStackTrace();
       }
   }
  private void setUpStatusColumnForPayrollTable(int par) {
    JComboBox<String> comboBox = new JComboBox<>();
    comboBox.addItem("Approved");
    comboBox.addItem("Waiting");
    comboBox.addItem("Disapproved");
    comboBox.addItem("On-Hold");

    int statusColumnIndex = payrolltable.getColumn("Status").getModelIndex();
    TableColumn statusColumn = payrolltable.getColumnModel().getColumn(statusColumnIndex);
    statusColumn.setCellEditor(new DefaultCellEditor(comboBox));

    statusColumn.setCellRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus, int row, int column) {
            comboBox.setSelectedItem(value);
            if (isSelected) {
                return comboBox;
            }
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    });

    payrolltable.revalidate();
    payrolltable.repaint();
}


   private void loadCSVIntoProcessTable(String csvFilePath) {
       File csvFile = new File(csvFilePath);
       if (!csvFile.isFile()) {
           System.out.println("File does not exist: " + csvFilePath);
           return;
       }
       try (BufferedReader csvReader = new BufferedReader(new FileReader(csvFile))) {
           String row;
        List<String[]> data = new ArrayList<>();
        while ((row = csvReader.readLine()) != null) {
            String[] dataRow = row.split(",");
            data.add(dataRow);
        }
        String[] columnNames = data.remove(0); 
        DefaultTableModel model = (DefaultTableModel) payrolltable.getModel();
        model.setColumnIdentifiers(columnNames);
        model.setRowCount(0);

        for (String[] rowData : data) {
            model.addRow(rowData);
        }
        setUpStatusColumnForPayrollTable(model.getColumnCount() - 1);

    } catch (IOException ex) {
        ex.printStackTrace();
    }
       
   }
  
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane ProcessPayroll;
    private javax.swing.JLabel homelbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTable payrolltable;
    private javax.swing.JButton processbtn;
    private javax.swing.JTable salarytable;
    private javax.swing.JButton sendbtn;
    // End of variables declaration//GEN-END:variables
}
