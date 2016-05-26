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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.*;
import javax.swing.JOptionPane;

/**
 *
 * @author james
 */
public class addLtsAvailability extends javax.swing.JDialog {
    main parent;
    dbConnection connection;
    Boolean supervisor;
    commonFunctions comFunc;

    /**
     * Creates new form addAvailability
     */
public addLtsAvailability(main inParent, dbConnection inConnection, Boolean inSupervisor, commonFunctions inCommon) {
        super(inParent, true);
        initComponents();
        parent = inParent;
        connection = inConnection;
        supervisor = inSupervisor;
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
        userCombo = new javax.swing.JComboBox<>();
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
        submitBttn = new javax.swing.JButton();
        closeBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add LTS Availability");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Username:");

        userCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        userCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                userComboItemStateChanged(evt);
            }
        });
        userCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userComboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Department:");

        departmentCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("Location:");

        locationCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setText("Week Starting:");

        dateCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setText("Monday:");

        mondayCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        mondayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Morning", "Afternoon", "Both" }));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setText("Tuesday");

        tuesdayCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        tuesdayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Morning", "Afternoon", "Both" }));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel7.setText("Wednesday:");

        wednesdayCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        wednesdayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Morning", "Afternoon", "Both" }));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel8.setText("Thursday:");

        thursdayCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        thursdayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Morning", "Afternoon", "Both" }));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel9.setText("Friday:");

        fridayCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        fridayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Morning", "Afternoon", "Both" }));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel10.setText("Saturday:");

        saturdayCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        saturdayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Morning", "Afternoon", "Both" }));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel11.setText("Sunday:");

        sundayCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        sundayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Morning", "Afternoon", "Both" }));

        submitBttn.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        submitBttn.setText("Submit Availability");
        submitBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBttnActionPerformed(evt);
            }
        });

        closeBttn.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        closeBttn.setText("Close");
        closeBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(locationCombo, 0, 120, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(departmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(sundayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))))
                    .addGroup(layout.createSequentialGroup()
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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
                                .addComponent(closeBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitBttn)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(departmentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(locationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBttn)
                    .addComponent(closeBttn)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_userComboItemStateChanged
        try
        {
            System.out.println("Remove all items from department combo");
            departmentCombo.removeAllItems();
            ResultSet returned = connection.getDepartments((String) userCombo.getSelectedItem());
            returned.next();

            System.out.println("Adding first department to combo");
            System.out.println("first department: " + returned.getString("department_1"));
            departmentCombo.addItem(returned.getString("department_1"));
            
            System.out.println("Test department 2 value");
            if (!returned.getString("department_2").equalsIgnoreCase("None")) 
            {
                System.out.println("Adding second department to combo");
                departmentCombo.addItem(returned.getString("department_2"));
                System.out.println("second department: " + returned.getString("department_2"));
            }
            
            System.out.println("Test department 3 value");
            if (!returned.getString("department_3").equalsIgnoreCase("None")) 
            {
                System.out.println("Adding third department to combo");
                departmentCombo.addItem(returned.getString("department_3"));
                System.out.println("third department: " + returned.getString("department_3"));
            }
        }
        catch (SQLException ex)
        {
            System.out.println("Something broke\n" + ex);
        }
    }//GEN-LAST:event_userComboItemStateChanged

    private void closeBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBttnActionPerformed
        dispose();
    }//GEN-LAST:event_closeBttnActionPerformed

    private void departmentComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentComboActionPerformed
        
    }//GEN-LAST:event_departmentComboActionPerformed

    private void userComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userComboActionPerformed

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
                        System.out.println(result.getString("location"));
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
                        System.out.println(result.getString("location"));
                        locationCombo.addItem(result.getString("location"));
                    }
                }
            }
            else if(departmentValue.equalsIgnoreCase("isc"))
            {
                result = connection.lifeguardLocations();
                
                while (result.next())
                {
                    if (!result.getString("location").equalsIgnoreCase("None"))
                    {
                        System.out.println(result.getString("location"));
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

    private void submitBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBttnActionPerformed
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
        
        String command = "insert into availability (username, monday, tuesday, wednesday, thursday, friday, saturday, sunday, department, location, weekStarting)"
                + " values (\'" + userCombo.getSelectedItem() + "\', \'" + mondayCombo.getSelectedItem() + "\', \'" + tuesdayCombo.getSelectedItem() + "\', \'" + wednesdayCombo.getSelectedItem()
                + "\', \'" + thursdayCombo.getSelectedItem() + "\', \'" + fridayCombo.getSelectedItem() + "\', \'" + saturdayCombo.getSelectedItem() + "\', \'" + sundayCombo.getSelectedItem() + "\', \'"
                + departmentCombo.getSelectedItem() + "\', \'" + locationCombo.getSelectedItem() + "\', \'"+ selectedDate + "\')";
        //System.out.println(command);
        if (JOptionPane.showConfirmDialog(parent, "Confirm to continue",
                "",
                JOptionPane.YES_NO_OPTION)
            == JOptionPane.YES_OPTION)
        {
            int status = connection.newAvailability(command);
            
            if (status == 1)
            {
                JOptionPane.showMessageDialog(parent, "Availability Added");
            }
            else
            {
                JOptionPane.showMessageDialog(parent, "Unable To Add Availability");
            }
        }
        
    }//GEN-LAST:event_submitBttnActionPerformed

    private void loadData ()
    {
        ResultSet returned = connection.getUsers();
        try
        {
            while(returned.next())
            {
                if (supervisor)
                {
                    userCombo.addItem(returned.getString("username"));
                }
                else if ((returned.getString("username")).equalsIgnoreCase(parent.getUser()))
                {
                    userCombo.addItem(returned.getString("username"));
                }
            }
            LocalDate date = LocalDate.now();
            LocalDate myDate = date.with(next(DayOfWeek.MONDAY));
            int count = 0;
            while (count < 5)
            {;
                String dateString = comFunc.formatDate(date);
                dateCombo.addItem(dateString);
                count++;
                myDate = myDate.plusDays(7);
            }
        }
        catch (SQLException ex)
        {
            System.out.println("Something broke\n" + ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBttn;
    private javax.swing.JComboBox<String> dateCombo;
    private javax.swing.JComboBox<String> departmentCombo;
    private javax.swing.JComboBox<String> fridayCombo;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> locationCombo;
    private javax.swing.JComboBox<String> mondayCombo;
    private javax.swing.JComboBox<String> saturdayCombo;
    private javax.swing.JButton submitBttn;
    private javax.swing.JComboBox<String> sundayCombo;
    private javax.swing.JComboBox<String> thursdayCombo;
    private javax.swing.JComboBox<String> tuesdayCombo;
    private javax.swing.JComboBox<String> userCombo;
    private javax.swing.JComboBox<String> wednesdayCombo;
    // End of variables declaration//GEN-END:variables
}
