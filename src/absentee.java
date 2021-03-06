/*
 * Copyright 2016 james.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.sql.*;
import org.jopendocument.dom.spreadsheet.*;
import java.lang.IndexOutOfBoundsException;
/**
 *
 * @author james
 */
public class absentee extends javax.swing.JDialog {
    main parent;
    dbConnection connection;
    commonFunctions comFunc;
    ArrayList<cover> absentee = new ArrayList<cover>();
    /**
     * Creates new form absentee
     */
    public absentee(main inParent, dbConnection inConnection, commonFunctions inCommon) {
        super(inParent, true);
        initComponents();
        parent = inParent;
        connection = inConnection;
        comFunc = inCommon;
        loadData();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        absenteeList = new javax.swing.JList();
        exportBttn = new javax.swing.JButton();
        closeBttn = new javax.swing.JButton();
        updateBttn = new javax.swing.JButton();
        startDaySpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        startMonthSpinner = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        endDaySpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        endMonthSpinner = new javax.swing.JSpinner();
        startYearCombo = new javax.swing.JComboBox<>();
        endYearCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Absentee");

        absenteeList.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        absenteeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(absenteeList);

        exportBttn.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        exportBttn.setText("Export");
        exportBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportBttnActionPerformed(evt);
            }
        });

        closeBttn.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        closeBttn.setText("Close");
        closeBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBttnActionPerformed(evt);
            }
        });

        updateBttn.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        updateBttn.setText("Update List");
        updateBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBttnActionPerformed(evt);
            }
        });

        startDaySpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        startDaySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Start Date");
        jLabel1.setBorder(null);

        startMonthSpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        startMonthSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        endDaySpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        endDaySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("End Date");
        jLabel2.setBorder(null);

        endMonthSpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        endMonthSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        startYearCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        endYearCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exportBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeBttn))
                    .addComponent(updateBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startDaySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(startMonthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(startYearCombo, 0, 105, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(endDaySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(endMonthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(endYearCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startDaySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startMonthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startYearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endDaySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endMonthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endYearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBttn)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exportBttn)
                            .addComponent(closeBttn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBttnActionPerformed
        absenteeList.setListData(absentee.toArray());
        String startDate = startYearCombo.getSelectedItem() + "-" + startMonthSpinner.getValue() + "-" + startDaySpinner.getValue();
        System.out.println("Start Date: " + startDate);
        String endDate = endYearCombo.getSelectedItem() + "-" + endMonthSpinner.getValue() + "-" + endDaySpinner.getValue();
        System.out.println("End Date: " + endDate);
        java.sql.Date beginDate = java.sql.Date.valueOf(startDate);
        java.sql.Date finishDate = java.sql.Date.valueOf(endDate);
        
        if (startDate.equalsIgnoreCase(endDate))
        {
            JOptionPane.showMessageDialog(parent, "Start and End date are the same\nOne of the dates must be changed ");
        }
        else
        {
            try
            {
                ResultSet result;
                result = connection.absentee(beginDate, finishDate);
                
                while (result.next())
                {
                    cover tempCover = new cover (result.getInt("ID"), result.getDate("cover_date"), result.getTime("start_time"), result.getTime("end_time"), result.getString("location"), result.getString("staff"), result.getString("cover_for"));
                    absentee.add(tempCover);
                }
                absenteeList.setListData(absentee.toArray());
            }
            catch (SQLException ex)
            {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_updateBttnActionPerformed

    private void closeBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBttnActionPerformed
        dispose();
    }//GEN-LAST:event_closeBttnActionPerformed

    private void exportBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportBttnActionPerformed
        try
        {
        //SpreadSheet absent = SpreadSheet.create(1, 50, 50);
        Sheet absenteeSheet = comFunc.loadTemplate("absent");
        int count = 0;
        String id = null;
        char column = 'B';
        int row = 2;
        cover tmpCover = absentee.get(count);;
        String user = null;
        
        // first table entry
        absenteeSheet.getCellAt("B1").setValue(tmpCover.getCoverFor());
        absenteeSheet.getCellAt("B2").setValue(tmpCover.getDate());
        user = tmpCover.getCoverFor();
        count++;
        
        // remaining table entries
        while (absentee.size()> count)
        {
            tmpCover = absentee.get(count);
            System.out.println("Previous user: " + user);
            System.out.println("New User: " + tmpCover.getCoverFor());
            if (tmpCover.getCoverFor().equalsIgnoreCase(user))
            {
                row++;
                id = String.valueOf(column).concat(String.valueOf(row));
                absenteeSheet.getCellAt(id).setValue(tmpCover.getDate());
            }
            else
            {
                column++;
                row = 2;
                id = String.valueOf(column).concat(String.valueOf(1));
                absenteeSheet.getCellAt(id).setValue(tmpCover.getCoverFor());
                user = tmpCover.getCoverFor();
                id = String.valueOf(column).concat(String.valueOf(row));
                absenteeSheet.getCellAt(id).setValue(tmpCover.getDate());
            }
            count++;
        }
        //absenteeSheet.getCellAt("A1").setValue("Staff:");
        //absenteeSheet.getCellAt("A2").setValue("Absent Dates:");
        
        comFunc.saveFile(absenteeSheet, "absentee " + startDaySpinner.getValue().toString() + "-" + startMonthSpinner.getValue().toString() + "-" + startYearCombo.getSelectedItem() + " to " + endDaySpinner.getValue().toString() + "-" + endMonthSpinner.getValue().toString() + "-" + endYearCombo.getSelectedItem());
        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println(ex);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_exportBttnActionPerformed

    public void loadData()
    {
        LocalDate todaysDate = LocalDate.now();
        int year = todaysDate.getYear();
        // start year manipulation
        String yearString = String.valueOf(year -1);
        startYearCombo.addItem(yearString);
        yearString = String.valueOf(year);
        startYearCombo.addItem(yearString);
        // end year manipulation
        endYearCombo.addItem(yearString);
        yearString = String.valueOf(year +1);
        endYearCombo.addItem(yearString);
        // set selected year
        year = todaysDate.getYear();
        yearString = String.valueOf(year);
        startYearCombo.setSelectedItem(yearString);
        endYearCombo.setSelectedItem(yearString);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList absenteeList;
    private javax.swing.JButton closeBttn;
    private javax.swing.JSpinner endDaySpinner;
    private javax.swing.JSpinner endMonthSpinner;
    private javax.swing.JComboBox<String> endYearCombo;
    private javax.swing.JButton exportBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner startDaySpinner;
    private javax.swing.JSpinner startMonthSpinner;
    private javax.swing.JComboBox<String> startYearCombo;
    private javax.swing.JButton updateBttn;
    // End of variables declaration//GEN-END:variables
}
