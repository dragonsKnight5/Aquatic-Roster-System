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

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author james
 */
public class editAvailability extends javax.swing.JDialog {
    main parent;
    dbConnection connection;
    Boolean supervisor;
    ArrayList<availability> availList = new ArrayList<availability>();
    int ID;

    /**
     * Creates new form addAvailability
     */
public editAvailability(main inParent, dbConnection inConnection, Boolean inSupervisor) {
        super(inParent, true);
        initComponents();
        parent = inParent;
        connection = inConnection;
        supervisor = inSupervisor;
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

        jLabel2 = new javax.swing.JLabel();
        departmentCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        locationCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        dateCombo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        mondayCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tuesdayCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        wednesdayCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        thursdayCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        fridayCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        saturdayCombo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        sundayCombo = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        updateBttn = new javax.swing.JButton();
        closeBttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        availabilityList = new javax.swing.JList();
        completionTckbx = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Availability");

        jLabel2.setText("Department:");

        departmentCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departmentComboItemStateChanged(evt);
            }
        });
        departmentCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentComboActionPerformed(evt);
            }
        });

        jLabel3.setText("Location:");

        jLabel4.setText("Week Starting:");

        jLabel5.setText("Monday:");

        mondayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Morning", "Afternoon", "Both" }));

        jLabel6.setText("Tuesday");

        tuesdayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Morning", "Afternoon", "Both" }));

        jLabel7.setText("Wednesday:");

        wednesdayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Morning", "Afternoon", "Both" }));

        jLabel8.setText("Thursday:");

        thursdayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Morning", "Afternoon", "Both" }));

        jLabel9.setText("Friday:");

        fridayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Morning", "Afternoon", "Both" }));

        jLabel10.setText("Saturday:");

        saturdayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Morning", "Afternoon", "Both" }));

        jLabel11.setText("Sunday:");

        sundayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Morning", "Afternoon", "Both" }));

        updateBttn.setText("Update Availability");
        updateBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBttnActionPerformed(evt);
            }
        });

        closeBttn.setText("Close");
        closeBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBttnActionPerformed(evt);
            }
        });

        availabilityList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                availabilityListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(availabilityList);

        completionTckbx.setText("Close On Completion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(12, 12, 12)
                                        .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(departmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(locationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(50, 50, 50)
                                            .addComponent(fridayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(39, 39, 39)
                                            .addComponent(mondayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(wednesdayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(thursdayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(tuesdayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(saturdayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(146, 146, 146)
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(sundayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(93, 93, 93)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(closeBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(completionTckbx)
                        .addGap(18, 18, 18)
                        .addComponent(updateBttn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(departmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(locationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(mondayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(tuesdayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(wednesdayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(thursdayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(fridayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(saturdayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(sundayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeBttn)
                    .addComponent(updateBttn)
                    .addComponent(completionTckbx))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBttnActionPerformed
        dispose();
    }//GEN-LAST:event_closeBttnActionPerformed

    private void departmentComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentComboActionPerformed
        
    }//GEN-LAST:event_departmentComboActionPerformed

    private void departmentComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departmentComboItemStateChanged
        String comboValue = (String)departmentCombo.getSelectedItem();
        locationCombo.removeAllItems();
        String departmentValue = (String)departmentCombo.getSelectedItem();
        ResultSet result = null;
        try
        {
            if (departmentValue.equalsIgnoreCase("lts"))
            {
                result = connection.ltsLocations();
                
                while (result.next())
                {
                    if (!result.getString("location").equalsIgnoreCase("None"))
                    {
                        //System.out.println(result.getString("location"));
                        locationCombo.addItem(result.getString("location"));
                    }
                }
            }
            else if(departmentValue.equalsIgnoreCase("lifeguard"))
            {
                result = connection.lifeguardLocations();
                
                while (result.next())
                {
                    if (!result.getString("location").equalsIgnoreCase("None"))
                    {
                        //System.out.println(result.getString("location"));
                        locationCombo.addItem(result.getString("location"));
                    }
                }
            }
        }
        catch (SQLException ex)
        {
            System.out.println("Something Broke\n" + ex);
        }
        catch (Exception ex)
        {
            System.out.println("Something Broke\n" + ex);
        }
    }//GEN-LAST:event_departmentComboItemStateChanged

    private void updateBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBttnActionPerformed
        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date selectedDate = null;

        try {
            java.util.Date myDate = myDateFormat.parse((String) dateCombo.getSelectedItem());
            selectedDate = new java.sql.Date(myDate.getTime());
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        
        String command = "update availability set department = \'" + departmentCombo.getSelectedItem() + "\', location = \'" + locationCombo.getSelectedItem()
                + "\', weekStarting = \'" + selectedDate + "\', monday = \'" + mondayCombo.getSelectedItem() + "\', tuesday = \'" + tuesdayCombo.getSelectedItem()
                + "\', wednesday = \'" + wednesdayCombo.getSelectedItem() + "\', thursday = \'" + thursdayCombo.getSelectedItem() + "\', friday = \'" 
                + fridayCombo.getSelectedItem() + "\', saturday = \'" + saturdayCombo.getSelectedItem() + "\', sunday = \'" + sundayCombo.getSelectedItem() 
                + "\' where ID = \'" + ID + "\'";
        int status = connection.updateShift(command);
            if (status == 1)
            {
                JOptionPane.showMessageDialog(parent, "Availability Update Successfull");
                if (completionTckbx.isSelected())
                {
                    dispose();
                }
                else
                {
                    loadData();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(parent, "Unable To Update Availability");
            }
    }//GEN-LAST:event_updateBttnActionPerformed

    private void availabilityListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_availabilityListValueChanged
        try
        {
            availability selectedAvailability = (availability)availabilityList.getSelectedValue();
            departmentCombo.setSelectedItem(selectedAvailability.getDepartment());
            locationCombo.setSelectedItem(selectedAvailability.getLocation());
            ID = selectedAvailability.getID();
        
            // date manipulation block
            dateCombo.removeAllItems();
            DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/YYYY");
            Date availDate = selectedAvailability.getWeekStarting();
            LocalDate selectedDate = availDate.toLocalDate();
            String dateString = null;
            LocalDate newDate = null;
            int count = 14;
            do
                {
                    newDate = selectedDate.minusDays(count);
                    dateString = myFormat.format(newDate);
                    dateCombo.addItem(dateString);
                    count = count - 7;
                } while (count != 0);
            do 
                {
                    newDate = selectedDate.plusDays(count);
                    dateString = myFormat.format(newDate);
                    dateCombo.addItem(dateString);
                    count = count + 7;
                } while (count != 21);
            dateString = myFormat.format(selectedDate);
            dateCombo.setSelectedItem(dateString);

            String tempDay = selectedAvailability.getMonday();
            mondayCombo.setSelectedItem(tempDay);
            tempDay = selectedAvailability.getTuesday();
            tuesdayCombo.setSelectedItem(tempDay);
            tempDay = selectedAvailability.getWednesday();
            wednesdayCombo.setSelectedItem(tempDay);
            tempDay = selectedAvailability.getThursday();
            thursdayCombo.setSelectedItem(tempDay);
            tempDay = selectedAvailability.getFriday();
            fridayCombo.setSelectedItem(tempDay);
            tempDay = selectedAvailability.getSaturday();
            saturdayCombo.setSelectedItem(tempDay);
            tempDay = selectedAvailability.getSunday();
            sundayCombo.setSelectedItem(tempDay);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_availabilityListValueChanged

    private void loadData ()
    {
        availList.clear();
        availabilityList.setListData(availList.toArray());
        String command = null;
        if (supervisor)
        {
            command = "select * from availability";
        }
        else
        {
            command = "select * from availability where username = \'" + parent.getUser() + "\'";
        }
        
        try
        {
            ResultSet returned = connection.lookup(command);
            
            while (returned.next())
            {
                // add availability entries to list
                availability tempAvailability = new availability(returned.getInt("ID"), returned.getString("username"), returned.getString("monday"), returned.getString("tuesday"), returned.getString("wednesday"), returned.getString("thursday"), returned.getString("friday"), returned.getString("saturday"), returned.getString("sunday"), returned.getString("department"), returned.getString("location"), returned.getDate("weekStarting"));
                availList.add(tempAvailability);
            }
            availabilityList.setListData(availList.toArray());
            
            //decide what departments to add to department combo
            if(parent.isSupervisor())
            {
                departmentCombo.addItem("LTS");
                departmentCombo.addItem("Lifeguard");
                departmentCombo.addItem("Gym");
                departmentCombo.addItem("ISC");
            }
            else
            {
                command = "select department_1, department_2, department_3 from users where username = \'" + parent.getUser() + "\'";
                returned = connection.lookup(command);
                returned.next();
                
                command = "select location from location where";
                if (!returned.getString("department_1").equalsIgnoreCase("none"))
                {
                    departmentCombo.addItem(returned.getString("department_1"));
                    command.concat(" " + returned.getString("department_1") + " = true");
                }
                if (!returned.getString("department_2").equalsIgnoreCase("none"))
                {
                    departmentCombo.addItem(returned.getString("department_2"));
                    command.concat(" or " + returned.getString(" department_2") + " = true");
                }
                if (!returned.getString("department_3").equalsIgnoreCase("none"))
                {
                    departmentCombo.addItem(returned.getString("department_3"));
                    command.concat(" or " + returned.getString(" department_3") + " = true");
                }
                
                // decide what locations to include
                returned = connection.lookup(command);
                while (returned.next())
                {
                    locationCombo.addItem(returned.getString("location"));
                }
            }
        }
        catch (SQLException ex)
        {
            System.out.println(ex);
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList availabilityList;
    private javax.swing.JButton closeBttn;
    private javax.swing.JCheckBox completionTckbx;
    private javax.swing.JComboBox<String> dateCombo;
    private javax.swing.JComboBox<String> departmentCombo;
    private javax.swing.JComboBox<String> fridayCombo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> locationCombo;
    private javax.swing.JComboBox<String> mondayCombo;
    private javax.swing.JComboBox<String> saturdayCombo;
    private javax.swing.JComboBox<String> sundayCombo;
    private javax.swing.JComboBox<String> thursdayCombo;
    private javax.swing.JComboBox<String> tuesdayCombo;
    private javax.swing.JButton updateBttn;
    private javax.swing.JComboBox<String> wednesdayCombo;
    // End of variables declaration//GEN-END:variables
}