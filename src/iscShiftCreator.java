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

import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.DayOfWeek;
import static java.time.temporal.TemporalAdjusters.next;
/**
 *
 * @author james
 */
public class iscShiftCreator extends javax.swing.JDialog {
    main parent;
    dbConnection connection;
    ArrayList<users> myUsers = new ArrayList<users>();
    commonFunctions comFunc;

    /**
     * Creates new form iscShiftCreator
     */
    public iscShiftCreator(main inParent, dbConnection inConnection, commonFunctions inCommon) {
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

        jLabel1 = new javax.swing.JLabel();
        dateCombo = new javax.swing.JComboBox<>();
        startHourSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        startMinuteSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        endHourSpinner = new javax.swing.JSpinner();
        endMinuteSpinner = new javax.swing.JSpinner();
        staffCombo1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        staffCombo2 = new javax.swing.JComboBox<>();
        staffCombo3 = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        completionTickbox = new javax.swing.JCheckBox();
        locationCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dayCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        availableStaffBttn = new javax.swing.JButton();
        onCallCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        staffCombo4 = new javax.swing.JComboBox<>();
        startTimeLbl = new javax.swing.JLabel();
        endTimeLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ISC Shift Creator");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Week Date:");

        dateCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        dateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateComboActionPerformed(evt);
            }
        });

        startHourSpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        startHourSpinner.setModel(new javax.swing.SpinnerNumberModel(5, 5, 22, 1));
        startHourSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                startHourSpinnerStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Start Time:");

        startMinuteSpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        startMinuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        startMinuteSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                startMinuteSpinnerStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("End Time:");

        endHourSpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        endHourSpinner.setModel(new javax.swing.SpinnerNumberModel(15, 5, 22, 1));
        endHourSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                endHourSpinnerStateChanged(evt);
            }
        });

        endMinuteSpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        endMinuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        endMinuteSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                endMinuteSpinnerStateChanged(evt);
            }
        });

        staffCombo1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Staff:");

        staffCombo2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        staffCombo3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        submitButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        closeButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        completionTickbox.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        completionTickbox.setText("Close On Completion");

        locationCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        locationCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                locationComboItemStateChanged(evt);
            }
        });
        locationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationComboActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setText("Location:");

        dayCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        dayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        dayCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayComboActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setText("Day:");

        availableStaffBttn.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        availableStaffBttn.setText("Get Available Staff");
        availableStaffBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableStaffBttnActionPerformed(evt);
            }
        });

        onCallCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel8.setText("On Call:");

        staffCombo4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        startTimeLbl.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        startTimeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        endTimeLbl.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        endTimeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(133, 133, 133)
                .addComponent(jLabel5)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(locationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(closeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(completionTickbox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(staffCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(186, 186, 186)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(availableStaffBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(staffCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(staffCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(staffCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(onCallCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(startTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(endHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(endMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(30, 30, 30)))
                    .addComponent(endTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(locationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(endTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(startTimeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(availableStaffBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onCallCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(submitButton)
                        .addComponent(closeButton))
                    .addComponent(completionTickbox, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if ((int) endHourSpinner.getValue() <= (int) startHourSpinner.getValue()) 
        {
            JOptionPane.showMessageDialog(parent, "Unable To Proceed\n Finish Time Is Before Start Time");
        } 
        else 
        {
            LocalTime startTime = LocalTime.of((int) startHourSpinner.getValue(), (int) startMinuteSpinner.getValue());
            LocalTime endTime = LocalTime.of((int) endHourSpinner.getValue(), (int) endMinuteSpinner.getValue());

            java.sql.Date selectedDate = comFunc.day2Date((String) dateCombo.getSelectedItem(), (String) dayCombo.getSelectedItem());

            String command = "Insert into isc (Shift_date, start_time, end_time, staff1, staff2, staff3 ,staff4, location, onCall) values (\"" + selectedDate + "\", \"" + startTime + "\", \""
                    + endTime + "\", \"" + staffCombo1.getSelectedItem() + "\", \"" + staffCombo2.getSelectedItem() + "\", \"" + staffCombo3.getSelectedItem()
                    + "\", \"" + staffCombo4.getSelectedItem() + "\", \"" + locationCombo.getSelectedItem() + "\", \"" + onCallCombo.getSelectedItem() + "\")";
            System.out.println(command);

            if (JOptionPane.showConfirmDialog(parent, "Confirm to continue",
                    "",
                    JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) 
            {

                int status = connection.addGuardShift(command);

                if (status == 1) 
                {
                    JOptionPane.showMessageDialog(parent, "Shift Added Successfully");
                    if (completionTickbox.isSelected()) 
                    {
                        dispose();
                    }
                } 
                else 
                {
                    JOptionPane.showMessageDialog(parent, "Unable To Add Shift");
                }
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void dateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateComboActionPerformed

    private void locationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationComboActionPerformed

    private void locationComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_locationComboItemStateChanged
        
    }//GEN-LAST:event_locationComboItemStateChanged

    private void dayComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayComboActionPerformed

    private void availableStaffBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableStaffBttnActionPerformed
        staffCombo1.removeAllItems();
        staffCombo2.removeAllItems();
        staffCombo3.removeAllItems();
        onCallCombo.removeAllItems();
        String shift;
        if ((int)startHourSpinner.getValue() >= 12)
        {
            shift = "Afternoon";
        }
        else
        {
            shift = "Morning";
        }
        
        try {
        java.util.Date myDate = comFunc.dateSwitch((String) dateCombo.getSelectedItem());
        String command = "select username from availability where department = \"ISC\" and location = \'"+ locationCombo.getSelectedItem() + "\' and weekStarting = \'" + myDate + "\' and " + dayCombo.getSelectedItem() 
                + " = \'" + shift + "\'";
        System.out.println(command);

            ResultSet returned = connection.lookup(command);
            while (returned.next()) {
                staffCombo1.addItem(returned.getString("username"));
                staffCombo2.addItem(returned.getString("username"));
                staffCombo3.addItem(returned.getString("username"));
                staffCombo4.addItem(returned.getString("username"));
                onCallCombo.addItem(returned.getString("username"));
            }
            staffCombo2.addItem("None");
            staffCombo3.addItem("None");
            staffCombo4.addItem("None");
            onCallCombo.addItem("None");
            staffCombo2.setSelectedItem("None");
            staffCombo3.setSelectedItem("None");
            staffCombo4.setSelectedItem("None");
            onCallCombo.setSelectedItem("None");
            if (staffCombo1.getItemCount() < 1)
            {
                staffCombo1.addItem("None");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_availableStaffBttnActionPerformed

    private void startHourSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_startHourSpinnerStateChanged
        startTimeLbl.setText(comFunc.timeConvert(LocalTime.of((int)startHourSpinner.getValue(), (int)startMinuteSpinner.getValue())));
    }//GEN-LAST:event_startHourSpinnerStateChanged

    private void startMinuteSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_startMinuteSpinnerStateChanged
        startTimeLbl.setText(comFunc.timeConvert(LocalTime.of((int)startHourSpinner.getValue(), (int)startMinuteSpinner.getValue())));
    }//GEN-LAST:event_startMinuteSpinnerStateChanged

    private void endHourSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_endHourSpinnerStateChanged
        endTimeLbl.setText(comFunc.timeConvert(LocalTime.of((int)endHourSpinner.getValue(), (int)endMinuteSpinner.getValue())));
    }//GEN-LAST:event_endHourSpinnerStateChanged

    private void endMinuteSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_endMinuteSpinnerStateChanged
        endTimeLbl.setText(comFunc.timeConvert(LocalTime.of((int)endHourSpinner.getValue(), (int)endMinuteSpinner.getValue())));
    }//GEN-LAST:event_endMinuteSpinnerStateChanged

    private void loadData()
    {
        ResultSet returned;
        Integer locationCount = 0;
        try {
            returned = connection.iscLocations();
            while (returned.next()) {
                locationCombo.addItem(returned.getString("location"));
                locationCount++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(parent, ex);
        }

        LocalDate date = LocalDate.now();
        LocalDate myDate = date.with(next(DayOfWeek.MONDAY));
        int count = 0;
        while (count < 5) {
            dateCombo.addItem(comFunc.formatDate(myDate));
            count++;
            myDate = myDate.plusDays(7);
        }
        startTimeLbl.setText(comFunc.timeConvert(LocalTime.of((int)startHourSpinner.getValue(), (int)startMinuteSpinner.getValue())));
        endTimeLbl.setText(comFunc.timeConvert(LocalTime.of((int)endHourSpinner.getValue(), (int)endMinuteSpinner.getValue())));
        
        if (locationCount > 2)
            {
                locationCombo.setSelectedIndex(0);
            }
            else
            {
                locationCombo.setSelectedIndex(1);
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton availableStaffBttn;
    private javax.swing.JButton closeButton;
    private javax.swing.JCheckBox completionTickbox;
    private javax.swing.JComboBox<String> dateCombo;
    private javax.swing.JComboBox<String> dayCombo;
    private javax.swing.JSpinner endHourSpinner;
    private javax.swing.JSpinner endMinuteSpinner;
    private javax.swing.JLabel endTimeLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> locationCombo;
    private javax.swing.JComboBox<String> onCallCombo;
    private javax.swing.JComboBox<String> staffCombo1;
    private javax.swing.JComboBox<String> staffCombo2;
    private javax.swing.JComboBox<String> staffCombo3;
    private javax.swing.JComboBox<String> staffCombo4;
    private javax.swing.JSpinner startHourSpinner;
    private javax.swing.JSpinner startMinuteSpinner;
    private javax.swing.JLabel startTimeLbl;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
