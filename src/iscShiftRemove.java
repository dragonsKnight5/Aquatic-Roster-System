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

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author james
 */
public class iscShiftRemove extends javax.swing.JDialog {
    main parent;
    dbConnection connection;
    commonFunctions comFunc;
    ArrayList<isc> iscShifts = new ArrayList<isc>();
    int ID;
    /**
     * Creates new form Lifeguard
     */
    public iscShiftRemove(main inParent, dbConnection inConnection, commonFunctions inCommon) {
        super(inParent, true);
        initComponents();
        parent = inParent;
        connection = inConnection;
        comFunc = inCommon;
        loadData();
        firstLoad();
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

        nameButtonGroup = new javax.swing.ButtonGroup();
        closeButton = new javax.swing.JButton();
        endTimeLabel = new javax.swing.JLabel();
        startTimeLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        staffLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        staffLabel2 = new javax.swing.JLabel();
        staffLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shiftList = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        removeButton = new javax.swing.JButton();
        completionTickbox = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        locationLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        onCallLbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        staffLabel4 = new javax.swing.JLabel();
        endTimeLabel1 = new javax.swing.JLabel();
        startTimeLabel1 = new javax.swing.JLabel();
        allRadioButton = new javax.swing.JRadioButton();
        dateRadioButton = new javax.swing.JRadioButton();
        dateCombo = new javax.swing.JComboBox<>();
        lookupBttn = new javax.swing.JButton();
        nameRadioButton = new javax.swing.JRadioButton();
        nameTxtFld = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ISC Shift Remove");

        closeButton.setFont(new java.awt.Font("Al Bayan", 0, 15)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        endTimeLabel.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        endTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        startTimeLabel.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        startTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setText("Start Time:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setText("End Time:");

        staffLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        staffLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setText("Staff:");

        staffLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        staffLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        staffLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        staffLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        shiftList.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        shiftList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        shiftList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                shiftListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(shiftList);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        removeButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        completionTickbox.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        completionTickbox.setText("Close On Completion");
        completionTickbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completionTickboxActionPerformed(evt);
            }
        });

        locationLbl.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        locationLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel7.setText("Location:");

        onCallLbl.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        onCallLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel8.setText("On Call:");

        staffLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        staffLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        endTimeLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        endTimeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        startTimeLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        startTimeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        nameButtonGroup.add(allRadioButton);
        allRadioButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        allRadioButton.setSelected(true);
        allRadioButton.setText("All");
        allRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allRadioButtonActionPerformed(evt);
            }
        });

        nameButtonGroup.add(dateRadioButton);
        dateRadioButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        dateRadioButton.setText("Date");
        dateRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateRadioButtonActionPerformed(evt);
            }
        });

        dateCombo.setEditable(true);
        dateCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        dateCombo.setEnabled(false);
        dateCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dateComboKeyPressed(evt);
            }
        });

        lookupBttn.setFont(new java.awt.Font("Al Bayan", 0, 15)); // NOI18N
        lookupBttn.setText("Lookup");
        lookupBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookupBttnActionPerformed(evt);
            }
        });

        nameButtonGroup.add(nameRadioButton);
        nameRadioButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        nameRadioButton.setText("Name");
        nameRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameRadioButtonActionPerformed(evt);
            }
        });

        nameTxtFld.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        nameTxtFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameTxtFld.setEnabled(false);
        nameTxtFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTxtFldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(29, 29, 29)
                                                            .addComponent(jLabel6))
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addComponent(jLabel7)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(allRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(staffLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(staffLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(staffLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(locationLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(staffLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(onCallLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator2)
                                    .addComponent(jSeparator3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(endTimeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(startTimeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(startTimeLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                            .addComponent(endTimeLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(closeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lookupBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeButton)))
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(completionTickbox, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(endTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startTimeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(endTimeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(locationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(staffLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(staffLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(staffLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(staffLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(onCallLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel6)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel8))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(allRadioButton)
                            .addComponent(dateRadioButton)
                            .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameRadioButton)
                        .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(completionTickbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeButton)
                        .addComponent(lookupBttn)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void shiftListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_shiftListValueChanged
        // need to find out if there's another way to deal null pointer exception problem
        try
        {
            isc selectedShift = (isc)shiftList.getSelectedValue();
            startTimeLabel.setText(selectedShift.getStartTimeString());
            startTimeLabel1.setText(comFunc.timeConvert(selectedShift.getStartTime()));
            endTimeLabel.setText(selectedShift.getEndTimeString());
            endTimeLabel1.setText(comFunc.timeConvert(selectedShift.getEndTime()));
            staffLabel1.setText(selectedShift.getStaff1());
            staffLabel2.setText(selectedShift.getStaff2());
            staffLabel3.setText(selectedShift.getStaff3());
            staffLabel4.setText(selectedShift.getStaff4());
            ID = selectedShift.getID();
            locationLbl.setText(selectedShift.getLocation());
            onCallLbl.setText(selectedShift.getOnCall());
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_shiftListValueChanged

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
       int shiftListSelection = shiftList.getSelectedIndex();
        if (shiftListSelection >= 0)
       {
            if (JOptionPane.showConfirmDialog(parent, "Confirm to continue",
                    "",
                    JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION)
            {
                String command = "delete from isc where ID = \'" + ID + "\'";
            
                int status = connection.removeGuardShift(command);
            
                if (status == 1)
                {
                    JOptionPane.showMessageDialog(parent, "Shift Removed", "", JOptionPane.INFORMATION_MESSAGE);
                    if (completionTickbox.isSelected())
                    {
                        dispose();
                    }
                    else
                    {
                        iscShifts.clear();
                        loadData();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(parent, "Unable To Remove Shift", "", JOptionPane.ERROR_MESSAGE);
                }
            }
       }
       else
       {
           JOptionPane.showMessageDialog(parent, "Please Select A Shift And Try Again", "", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void completionTickboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completionTickboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_completionTickboxActionPerformed

    private void dateRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateRadioButtonActionPerformed
        dateCombo.setEnabled(true);
        nameTxtFld.setEnabled(false);
    }//GEN-LAST:event_dateRadioButtonActionPerformed

    private void allRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allRadioButtonActionPerformed
        dateCombo.setEnabled(false);
        nameTxtFld.setEnabled(false);
    }//GEN-LAST:event_allRadioButtonActionPerformed

    private void nameRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRadioButtonActionPerformed
        nameTxtFld.setEnabled(true);
        dateCombo.setEnabled(false);
    }//GEN-LAST:event_nameRadioButtonActionPerformed

    private void dateComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateComboKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        {
            lookupBttn.doClick();
        }
    }//GEN-LAST:event_dateComboKeyPressed

    private void nameTxtFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtFldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        {
            lookupBttn.doClick();
        }
    }//GEN-LAST:event_nameTxtFldKeyPressed

    private void lookupBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookupBttnActionPerformed
        loadData();
    }//GEN-LAST:event_lookupBttnActionPerformed

    private void firstLoad()
    {
        LocalDate tempDate = LocalDate.now();
            int count = 0;
            while (count < 70)
            {
                dateCombo.addItem(comFunc.plusDaysFormated(tempDate, count));
                count++;
            }
    }
    
private void loadData()
{
    ResultSet returned;
    String command = null;
    iscShifts.clear();
    if (allRadioButton.isSelected())
    {
        command = "select * from isc";
    }
    else if (dateRadioButton.isSelected())
    {
        command = "select * from isc where shift_date = \'" + comFunc.dateSwitch((String)dateCombo.getSelectedItem()) + "\'";
    }
    else
    {
        command = "select * from isc where staff1 = \'" + nameTxtFld.getText() + "\' or staff2 = \'" + nameTxtFld.getText() +"\' or staff3 = \'" + nameTxtFld.getText() +"\' or staff4 = \'" + nameTxtFld.getText() + "\'";
    }
    
    try
    {
        returned = connection.lookup(command);
        while(returned.next())
        {
            isc tempISC = new isc(returned.getInt("ID"), returned.getDate("shift_Date"), returned.getTime("start_time"), returned.getTime("end_time"), returned.getString("location"), returned.getString("staff1"), returned.getString("staff2"), returned.getString("staff3"), returned.getString("staff4"), returned.getString("onCall"));
            iscShifts.add(tempISC);
        }
        shiftList.setListData(iscShifts.toArray());
        if (!iscShifts.isEmpty())
        {
            shiftList.setSelectedIndex(0);
        }
        
    }
    catch (SQLException ex)
    {
        System.out.println(ex);
        //JOptionPane.showMessageDialog(parent, ex);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton allRadioButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JCheckBox completionTickbox;
    private javax.swing.JComboBox<String> dateCombo;
    private javax.swing.JRadioButton dateRadioButton;
    private javax.swing.JLabel endTimeLabel;
    private javax.swing.JLabel endTimeLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel locationLbl;
    private javax.swing.JButton lookupBttn;
    private javax.swing.ButtonGroup nameButtonGroup;
    private javax.swing.JRadioButton nameRadioButton;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JLabel onCallLbl;
    private javax.swing.JButton removeButton;
    private javax.swing.JList shiftList;
    private javax.swing.JLabel staffLabel1;
    private javax.swing.JLabel staffLabel2;
    private javax.swing.JLabel staffLabel3;
    private javax.swing.JLabel staffLabel4;
    private javax.swing.JLabel startTimeLabel;
    private javax.swing.JLabel startTimeLabel1;
    // End of variables declaration//GEN-END:variables
}
