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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.LocalDate;
/**
 *
 * @author james
 */
public class LTScoverEditor extends javax.swing.JDialog {
    main parent;
    dbConnection connection;
    ArrayList<cover> coverShifts = new ArrayList<cover>();
    commonFunctions comFunc;
    int ID;
    /**
     * Creates new form Lifeguard
     */
    public LTScoverEditor(main inParent, dbConnection inConnection,  commonFunctions inCommon) {
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

        namebuttonGroup = new javax.swing.ButtonGroup();
        updateButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shiftList = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        dateCombo = new javax.swing.JComboBox<>();
        startHourSpinner = new javax.swing.JSpinner();
        startMinuteSpinner = new javax.swing.JSpinner();
        endHourSpinner = new javax.swing.JSpinner();
        endMinuteSpinner = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        staffCombo = new javax.swing.JComboBox<>();
        coverCombo = new javax.swing.JComboBox<>();
        completionTickbox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        locationCombo = new javax.swing.JComboBox<>();
        startTimeLbl = new javax.swing.JLabel();
        endTimeLbl = new javax.swing.JLabel();
        allRadioButton = new javax.swing.JRadioButton();
        nameRadioButton = new javax.swing.JRadioButton();
        nameTxtFld = new javax.swing.JTextField();
        lookupButton = new javax.swing.JButton();
        dateRadioButton = new javax.swing.JRadioButton();
        dateSearchCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LTS Cover Editor");

        updateButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        closeButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setText("Start Time:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setText("End Time:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setText("Staff:");

        shiftList.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        shiftList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        shiftList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                shiftListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(shiftList);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Date:");

        dateCombo.setEditable(true);
        dateCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        startHourSpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        startHourSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        startHourSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                startHourSpinnerStateChanged(evt);
            }
        });

        startMinuteSpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        startMinuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        startMinuteSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                startMinuteSpinnerStateChanged(evt);
            }
        });

        endHourSpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        endHourSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
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

        staffCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        coverCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        completionTickbox.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        completionTickbox.setText("Close On Completion");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Is Covering For");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("Location:");

        locationCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        startTimeLbl.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        endTimeLbl.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        namebuttonGroup.add(allRadioButton);
        allRadioButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        allRadioButton.setSelected(true);
        allRadioButton.setText("All");
        allRadioButton.setEnabled(false);
        allRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allRadioButtonActionPerformed(evt);
            }
        });

        namebuttonGroup.add(nameRadioButton);
        nameRadioButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        nameRadioButton.setText("Name");
        nameRadioButton.setEnabled(false);
        nameRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameRadioButtonActionPerformed(evt);
            }
        });

        nameTxtFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameTxtFld.setEnabled(false);
        nameTxtFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTxtFldKeyReleased(evt);
            }
        });

        lookupButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lookupButton.setText("Lookup");
        lookupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookupButtonActionPerformed(evt);
            }
        });
        lookupButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lookupButtonKeyPressed(evt);
            }
        });

        namebuttonGroup.add(dateRadioButton);
        dateRadioButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        dateRadioButton.setText("Date");
        dateRadioButton.setEnabled(false);
        dateRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateRadioButtonActionPerformed(evt);
            }
        });

        dateSearchCombo.setEditable(true);
        dateSearchCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        dateSearchCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dateSearchComboKeyReleased(evt);
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
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(allRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateSearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(locationCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(staffCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(coverCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(endHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(startMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(startTimeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(endMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(endTimeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(completionTickbox)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lookupButton, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(closeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(allRadioButton)
                                    .addComponent(nameRadioButton)
                                    .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(locationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(staffCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(coverCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(startTimeLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(startHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(startMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(endHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(endMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(endTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel5)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(completionTickbox)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateRadioButton)
                            .addComponent(dateSearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(closeButton)
                    .addComponent(lookupButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void shiftListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_shiftListValueChanged
        cover selectedShift = (cover)shiftList.getSelectedValue();
        //Clear previous values from combo boxes
        dateCombo.removeAllItems();
        staffCombo.removeAllItems();
        coverCombo.removeAllItems();
        locationCombo.removeAllItems();
        
        int count = 7;
        Date coverDate = selectedShift.getDate();
        LocalDate selectedDate = coverDate.toLocalDate();
        ID = selectedShift.getID();
        
        
        //Date manipulation block
        do
                {
                    dateCombo.addItem(comFunc.minusDaysFormated(selectedDate, count));
                    count --;
                } while (count != 0);
      
        do 
                {
                    dateCombo.addItem(comFunc.plusDaysFormated(selectedDate, count));
                    count++;
                } while (count != 17);
        
        //set selected date to date provided by database
        dateCombo.setSelectedItem(comFunc.formatDate(selectedDate));
        
        //Settings pushed to screen
        LocalTime startTime = selectedShift.getStartTime();
        LocalTime endTime = selectedShift.getEndTime();
        startHourSpinner.setValue(startTime.getHour());
        startMinuteSpinner.setValue(startTime.getMinute());
        endHourSpinner.setValue(endTime.getHour());
        endMinuteSpinner.setValue(endTime.getMinute());
        
        ResultSet returned;
        try
        {
            // user block 1
            returned = connection.getLTSusers();
            while(returned.next())
            {
                staffCombo.addItem(returned.getString("username"));
                //coverCombo.addItem(returned.getString("username"));
            }
            staffCombo.addItem("None");
            staffCombo.setSelectedItem(selectedShift.getStaff());
            
            // location block 
            returned = connection.ltsLocations();
            while(returned.next())
            {
                locationCombo.addItem(returned.getString("location"));
            }
            locationCombo.setSelectedItem(selectedShift.getLocation());
            
            // user block 2
            String day =((((selectedShift.getDate()).toLocalDate()).getDayOfWeek()).toString()).toLowerCase();
            returned = connection.newGetLTSusers((String)locationCombo.getSelectedItem(), day);
            while(returned.next())
            {
                //staffCombo.addItem(returned.getString("username"));
                coverCombo.addItem(returned.getString("username"));
            }
            coverCombo.setSelectedItem(selectedShift.getCoverFor());
        }
        catch (SQLException ex)
        {
            System.out.println(ex);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_shiftListValueChanged

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if ((int) endHourSpinner.getValue() <= (int) startHourSpinner.getValue()) 
        {
            JOptionPane.showMessageDialog(parent, "Unable To Proceed\n Finish Time Is Before Start Time");
        }
        else if (JOptionPane.showConfirmDialog(parent, "Confirm to continue",
                "",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) 
        {
            LocalTime startTime = LocalTime.of((int) startHourSpinner.getValue(), (int) startMinuteSpinner.getValue());
            LocalTime endTime = LocalTime.of((int) endHourSpinner.getValue(), (int) endMinuteSpinner.getValue());
            java.sql.Date selectedDate = null;
            selectedDate = comFunc.dateSwitch((String) dateCombo.getSelectedItem());

            String command = "update LTS_Covers set cover_date= \'" + selectedDate + "\', start_time = \'" + startTime + "\', end_time = \'"
                    + endTime + "\', location = \'" + locationCombo.getSelectedItem() + "\', staff = \'" + staffCombo.getSelectedItem() + "\', cover_for = \'" + coverCombo.getSelectedItem()
                    + "\' where ID = \'" + ID + "\'";

            int status = connection.updateShift(command);
            if (status == 1) {
                JOptionPane.showMessageDialog(parent, "Cover Update Successfull");
                if (completionTickbox.isSelected()) 
                {
                    dispose();
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(parent, "Unable To Update Cover");
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

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

    private void nameRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRadioButtonActionPerformed
        nameTxtFld.setEnabled(true);
        dateSearchCombo.setEnabled(false);
    }//GEN-LAST:event_nameRadioButtonActionPerformed

    private void allRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allRadioButtonActionPerformed
        nameTxtFld.setEnabled(false);
        dateSearchCombo.setEnabled(false);
    }//GEN-LAST:event_allRadioButtonActionPerformed

    private void lookupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookupButtonActionPerformed
        loadData();
    }//GEN-LAST:event_lookupButtonActionPerformed

    private void dateRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateRadioButtonActionPerformed
        dateSearchCombo.setEnabled(true);
        nameTxtFld.setEnabled(false);
    }//GEN-LAST:event_dateRadioButtonActionPerformed

    private void lookupButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lookupButtonKeyPressed
        
    }//GEN-LAST:event_lookupButtonKeyPressed

    private void dateSearchComboKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateSearchComboKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        {
            lookupButton.doClick();
        }
    }//GEN-LAST:event_dateSearchComboKeyReleased

    private void nameTxtFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtFldKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        {
            lookupButton.doClick();
        }
    }//GEN-LAST:event_nameTxtFldKeyReleased

    private void firstLoad()
    {
        if (parent.isSupervisor())
        {
            nameRadioButton.setEnabled(true);
            allRadioButton.setEnabled(true);
            lookupButton.setEnabled(true);
            
            LocalDate tempDate = LocalDate.now();
             int count = 0;
            while (count < 70) 
            {
                dateCombo.addItem(comFunc.plusDaysFormated(tempDate, count));
                count++;
            }
        }
    }
    
private void loadData()
{
    ResultSet returned;
    String command = null;
    coverShifts.clear();
    if (parent.isSupervisor())
    {
        if (allRadioButton.isSelected())
        {
            command = "select * from LTS_Covers";
        }
        else if (nameRadioButton.isSelected())
        {
            command = "select * from LTS_Covers where staff = " + nameTxtFld.getText() + "\' or cover_for = \'" + nameTxtFld.getText() + "\'";
        }
        else
        {
            command = "select * from LTS_Covers where cover_date = \'" + comFunc.dateSwitch((String)dateCombo.getSelectedItem()) + "\'";
        }
    }
    else
    {
        command = "select * from LTS_Covers where staff = " + parent.getUser() + "\' or cover_for = \'" + parent.getUser() + "\'";
    }
    
    try
    {
        returned = connection.lookup(command);
        while(returned.next())
        {
            cover tempCover = new cover (returned.getInt("ID"), returned.getDate("cover_date"), returned.getTime("start_time"), returned.getTime("end_time"), returned.getString("location"), returned.getString("staff"), returned.getString("cover_for"));
            coverShifts.add(tempCover);
        }
        returned = connection.ltsLocations();
        while(returned.next())
        {
            locationCombo.addItem(returned.getString("location"));
         }
            
        shiftList.setListData(coverShifts.toArray());
        if (!coverShifts.isEmpty())
        {
            shiftList.setSelectedIndex(0);
        }

    }
    catch (SQLException ex)
    {
        JOptionPane.showMessageDialog(parent, ex);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton allRadioButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JCheckBox completionTickbox;
    private javax.swing.JComboBox<String> coverCombo;
    private javax.swing.JComboBox<String> dateCombo;
    private javax.swing.JRadioButton dateRadioButton;
    private javax.swing.JComboBox<String> dateSearchCombo;
    private javax.swing.JSpinner endHourSpinner;
    private javax.swing.JSpinner endMinuteSpinner;
    private javax.swing.JLabel endTimeLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> locationCombo;
    private javax.swing.JButton lookupButton;
    private javax.swing.JRadioButton nameRadioButton;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.ButtonGroup namebuttonGroup;
    private javax.swing.JList shiftList;
    private javax.swing.JComboBox<String> staffCombo;
    private javax.swing.JSpinner startHourSpinner;
    private javax.swing.JSpinner startMinuteSpinner;
    private javax.swing.JLabel startTimeLbl;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
