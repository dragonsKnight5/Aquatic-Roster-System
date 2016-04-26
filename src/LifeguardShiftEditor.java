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
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.LocalDate;
import java.text.ParseException;
import java.time.DayOfWeek;
import static java.time.temporal.TemporalAdjusters.next;
/**
 *
 * @author james
 */
public class LifeguardShiftEditor extends javax.swing.JDialog {
    main parent;
    dbConnection connection;
    ArrayList<lifeguards> guardShifts = new ArrayList<lifeguards>();
    int ID;
    commonFunctions comFunc;
    /**
     * Creates new form Lifeguard
     */
    public LifeguardShiftEditor(main inParent, dbConnection inConnection, commonFunctions inCommon) {
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
        staffCombo1 = new javax.swing.JComboBox<>();
        staffCombo2 = new javax.swing.JComboBox<>();
        staffCombo3 = new javax.swing.JComboBox<>();
        completionTickbox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        locationCombo = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        onCallCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        shiftCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lifeguard Shift Editor");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Start Time:");

        jLabel5.setText("End Time:");

        jLabel6.setText("Staff:");

        shiftList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                shiftListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(shiftList);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Date:");

        startHourSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        startMinuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        endHourSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        endMinuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        completionTickbox.setText("Close On Completion");

        jLabel2.setText("Location:");

        jLabel3.setText("On Call:");

        shiftCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Afternoon" }));

        jButton1.setText("Refresh Listed Users");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(closeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(completionTickbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(staffCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(staffCombo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(staffCombo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(endHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(endMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dateCombo, 0, 177, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(startMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                            .addComponent(onCallCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(shiftCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(locationCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2))
                            .addComponent(locationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(startHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(endHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shiftCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(staffCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(staffCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(staffCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(onCallCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(closeButton)
                    .addComponent(completionTickbox)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void shiftListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_shiftListValueChanged
        try {
            lifeguards selectedShift = (lifeguards) shiftList.getSelectedValue();
            //Clear previous values from combo boxes
            dateCombo.removeAllItems();
            staffCombo1.removeAllItems();
            staffCombo2.removeAllItems();
            staffCombo3.removeAllItems();
            onCallCombo.removeAllItems();

            int count = 3;

            DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/YYYY");
            
            LocalDate shiftDate = selectedShift.getShiftDate().toLocalDate();
            //LocalDate selectedDate = shiftDate.toLocalDate();
            System.out.println("Shift Date: " + shiftDate.toString());
            //String dateString = null;
            //LocalDate newDate = null;
            ID = selectedShift.getID();

            //Date manipulation block
            System.out.println("Starting minus date manipulation");
            //String temp = null;
            do {
                //newDate = selectedDate.minusDays(count);
                //dateString = myFormat.format(newDate);
                //dateString = comFunc.formatDate(newDate);
                dateCombo.addItem(comFunc.minusDaysFormated(shiftDate, count));
                count--;
            } while (count != 0);

            dateCombo.addItem(comFunc.formatDate(shiftDate));
            
            System.out.println("Starting plus date manipulation");
            do {
                count++;
                dateCombo.addItem(comFunc.plusDaysFormated(shiftDate, count));
            } while (count != 17);

            dateCombo.setSelectedItem(comFunc.formatDate(shiftDate));

            //Settings pushed to screen
            LocalTime startTime = selectedShift.getStartTime();
            LocalTime endTime = selectedShift.getEndTime();
            startHourSpinner.setValue(startTime.getHour());
            startMinuteSpinner.setValue(startTime.getMinute());
            endHourSpinner.setValue(endTime.getHour());
            endMinuteSpinner.setValue(endTime.getMinute());
            
            java.sql.Date lookupDate;
            String day = shiftDate.getDayOfWeek().toString();
            if ((shiftDate.getDayOfWeek().toString()).equalsIgnoreCase("monday"))
            {
                lookupDate = selectedShift.getShiftDate();
            }
            else
            {
                LocalDate tempDate = shiftDate.with(next(DayOfWeek.MONDAY));
                tempDate = tempDate.minusDays(7);
                lookupDate = Date.valueOf(tempDate);
            }
            
            ResultSet returned;
            String command = "select username from availability where weekStarting = \'" + lookupDate + "\' and department = \'Lifeguard\' and (" 
                    + day + " = both";
            
            returned = connection.getLifeguardUsers();
            while (returned.next()) {
                staffCombo1.addItem(returned.getString("username"));
                staffCombo2.addItem(returned.getString("username"));
                staffCombo3.addItem(returned.getString("username"));
                onCallCombo.addItem(returned.getString("username"));
            }
            staffCombo2.addItem("None");
            staffCombo3.addItem("None");
            onCallCombo.addItem("None");

            staffCombo1.setSelectedItem(selectedShift.getStaff1());
            staffCombo2.setSelectedItem(selectedShift.getStaff2());
            staffCombo3.setSelectedItem(selectedShift.getStaff3());
            onCallCombo.setSelectedItem(selectedShift.getOnCall());
            locationCombo.setSelectedItem(selectedShift.getLocation());
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_shiftListValueChanged

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (JOptionPane.showConfirmDialog(parent, "Confirm to continue",
                "",
                JOptionPane.YES_NO_OPTION)
            == JOptionPane.YES_OPTION)
        {
            LocalTime startTime = LocalTime.of((int)startHourSpinner.getValue(), (int)startMinuteSpinner.getValue());
            LocalTime endTime = LocalTime.of((int)endHourSpinner.getValue(), (int)endMinuteSpinner.getValue());
            SimpleDateFormat myDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date selectedDate = null;
            
            try
            {
                java.util.Date myDate = myDateFormat.parse((String)dateCombo.getSelectedItem());
                selectedDate = new java.sql.Date(myDate.getTime());
            }
            catch (ParseException ex)
            {
                System.out.println(ex);
            }
            
            
            String command = "update lifeguard set shift_date= \'" + selectedDate + "\', start_time = \'" + startTime + "\', end_time = \'"
                    + endTime + "\', staff1 = \'" + staffCombo1.getSelectedItem() + "\', staff2 = \'" +staffCombo2.getSelectedItem() + "\', staff3 = \'" 
                    + staffCombo3.getSelectedItem() + "\', location = \'" + locationCombo.getSelectedItem() + "\', onCall = \'" + onCallCombo.getSelectedItem() 
                    + "\' where ID = \'" + ID + "\'";
            
            int status = connection.updateShift(command);
            if (status == 1)
            {
                JOptionPane.showMessageDialog(parent, "Shift Update Successfull");
                if (completionTickbox.isSelected())
                {
                    dispose();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(parent, "Unable To Update Shift");
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

private void loadData()
{
    ResultSet returned;
    shiftList.removeAll();
    String command = "select * from lifeguard";
    try
    {
        returned = connection.lookup(command);
        while(returned.next())
        {
            lifeguards tempGuard = new lifeguards(returned.getInt("ID"), returned.getDate("shift_Date"), returned.getTime("start_time"), returned.getTime("end_time"), returned.getString("location"), returned.getString("staff1"), returned.getString("staff2"), returned.getString("staff3"), returned.getString("onCall"));
            guardShifts.add(tempGuard);
        }
        shiftList.setListData(guardShifts.toArray());
//        if (!guardShifts.isEmpty())
//        {
//            shiftList.setSelectedIndex(0);
//        }
        returned = connection.lifeguardLocations();
        while(returned.next())
        {
            locationCombo.addItem(returned.getString("location"));
        }
    }
    catch (SQLException ex)
    {
        System.out.println(ex);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JCheckBox completionTickbox;
    private javax.swing.JComboBox<String> dateCombo;
    private javax.swing.JSpinner endHourSpinner;
    private javax.swing.JSpinner endMinuteSpinner;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> locationCombo;
    private javax.swing.JComboBox<String> onCallCombo;
    private javax.swing.JComboBox<String> shiftCombo;
    private javax.swing.JList shiftList;
    private javax.swing.JComboBox<String> staffCombo1;
    private javax.swing.JComboBox<String> staffCombo2;
    private javax.swing.JComboBox<String> staffCombo3;
    private javax.swing.JSpinner startHourSpinner;
    private javax.swing.JSpinner startMinuteSpinner;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
