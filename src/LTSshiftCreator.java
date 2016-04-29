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
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james
 */
public class LTSshiftCreator extends javax.swing.JDialog {
    main parent;
    dbConnection connection;
    commonFunctions comFunc;
    /**
     * Creates new form LNSSshiftCreator
     */
    public LTSshiftCreator(main inParent, dbConnection inConnection, commonFunctions inCommon) {
        super(inParent,true);
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
        jLabel3 = new javax.swing.JLabel();
        startMinuteSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        endHourSpinner = new javax.swing.JSpinner();
        endMinuteSpinner = new javax.swing.JSpinner();
        startHourSpinner = new javax.swing.JSpinner();
        staffCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        startDateCombo = new javax.swing.JComboBox<>();
        closeButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        endDateCombo = new javax.swing.JComboBox<>();
        completionTickbox = new javax.swing.JCheckBox();
        dayCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        locationCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LTS Shift Creator");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Start Date");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("Start Time");

        startMinuteSpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        startMinuteSpinner.setModel(new javax.swing.SpinnerNumberModel(30, 0, 59, 1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setText("End Time");

        endHourSpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        endHourSpinner.setModel(new javax.swing.SpinnerNumberModel(15, 8, 19, 1));

        endMinuteSpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        endMinuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        startHourSpinner.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        startHourSpinner.setModel(new javax.swing.SpinnerNumberModel(8, 8, 18, 1));

        staffCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Staff:");

        submitButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        startDateCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        closeButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setText("End Date");

        endDateCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        completionTickbox.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        completionTickbox.setText("Close On Completion");

        dayCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        dayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));
        dayCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dayComboItemStateChanged(evt);
            }
        });
        dayCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayComboActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setText("Day:");

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

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel7.setText("Location:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(closeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(completionTickbox)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(startDateCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(endDateCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dayCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(jLabel6)))
                                .addGap(88, 88, 88)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(submitButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(startHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(startMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(endHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(endMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(74, 74, 74)
                                            .addComponent(jLabel7)
                                            .addGap(60, 60, 60))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(staffCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(62, 62, 62)))
                                            .addComponent(locationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(locationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(staffCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(startHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(startMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(endHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(endMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeButton)
                        .addComponent(completionTickbox))
                    .addComponent(submitButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(7, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadData()
    {
        // Date Setup and handling block
        LocalDate myDate = LocalDate.now();

        int count = 0;
        do {
            if (count < 31)
            {
                startDateCombo.addItem(comFunc.plusDaysFormated(myDate, count));
            }
            endDateCombo.addItem(comFunc.plusDaysFormated(myDate, count));
            
            count ++;
        } while (count <108);
        
        ResultSet returned;
        try
        {
            returned = connection.ltsLocations();
            while(returned.next())
            {
                locationCombo.addItem(returned.getString("location"));
            }
            returned = connection.newGetLTSusers((String)locationCombo.getSelectedItem(), (String)dayCombo.getSelectedItem());
            while(returned.next())
            {
                staffCombo.addItem(returned.getString("username"));
            }
            
            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parent, ex);
        }
    }
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        java.time.LocalTime startTime = java.time.LocalTime.of((int)startHourSpinner.getValue(), (int)startMinuteSpinner.getValue());
        java.time.LocalTime endTime = java.time.LocalTime.of((int)endHourSpinner.getValue(), (int)endMinuteSpinner.getValue());
        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date selectedStartDate = null;
        java.sql.Date selectedEndDate = null;
        String selectedDay = (String)dayCombo.getSelectedItem();
        
        try
        {
            //start date
            String stringDate = (String)startDateCombo.getSelectedItem();
            java.util.Date myDate = myDateFormat.parse(stringDate);
            selectedStartDate = new java.sql.Date(myDate.getTime());
            //end date 
            stringDate = (String)endDateCombo.getSelectedItem();
            myDate = myDateFormat.parse(stringDate);
            selectedEndDate = new java.sql.Date(myDate.getTime());
        }
        catch (ParseException ex)
        {
            System.out.println(ex);
        }
        
        String command = "insert into LTS_Shift (staff, shift_day, start_time, end_time, start_date, end_date, location) values (\""+ staffCombo.getSelectedItem() + "\", \""
                + selectedDay +"\", \"" +startTime + "\", \"" + endTime + "\", \"" + selectedStartDate +"\", \"" + selectedEndDate + "\", \"" + locationCombo.getSelectedItem() + "\")";
        
        if (JOptionPane.showConfirmDialog(parent, "Confirm to continue",
                "",
                JOptionPane.YES_NO_OPTION)
            == JOptionPane.YES_OPTION)
        {
           int status = connection.addLTSshift(command);
        
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
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void dayComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayComboActionPerformed

    private void locationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationComboActionPerformed

    private void locationComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_locationComboItemStateChanged
        staffCombo.removeAllItems();
        try {
            ResultSet returned = connection.newGetLTSusers((String) locationCombo.getSelectedItem(), (String) dayCombo.getSelectedItem());
            while (returned.next()) {
                staffCombo.addItem(returned.getString("username"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_locationComboItemStateChanged

    private void dayComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dayComboItemStateChanged
        locationCombo.setSelectedIndex(0);
    }//GEN-LAST:event_dayComboItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JCheckBox completionTickbox;
    private javax.swing.JComboBox<String> dayCombo;
    private javax.swing.JComboBox<String> endDateCombo;
    private javax.swing.JSpinner endHourSpinner;
    private javax.swing.JSpinner endMinuteSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> locationCombo;
    private javax.swing.JComboBox<String> staffCombo;
    private javax.swing.JComboBox<String> startDateCombo;
    private javax.swing.JSpinner startHourSpinner;
    private javax.swing.JSpinner startMinuteSpinner;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
