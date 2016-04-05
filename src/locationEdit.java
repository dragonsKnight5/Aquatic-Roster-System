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

/**
 *
 * @author james
 */
public class locationEdit extends javax.swing.JDialog {
    dbConnection connection;
    main parent;
    int ID = 0;
    /**
     * Creates new form userEdit
     */
    public locationEdit(main inParent, dbConnection inConnection) {
        super(inParent,true);
        connection = inConnection;
        parent = inParent;
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList();
        completionCheckbox = new javax.swing.JCheckBox();
        ltsTckbx = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        lifeguardTckbx = new javax.swing.JCheckBox();
        gymTckbx = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        locationTxtbx = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Edit");

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

        userList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        userList.setVisibleRowCount(12);
        userList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                userListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(userList);

        completionCheckbox.setText("Close On Completion");

        jLabel10.setText("Gym:");

        jLabel1.setText("Location:");

        jLabel7.setText("Lifeguard:");

        jLabel9.setText("LTS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(completionCheckbox)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(updateButton)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)
                                .addComponent(jLabel7)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(locationTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lifeguardTckbx, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ltsTckbx, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gymTckbx, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(locationTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lifeguardTckbx)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ltsTckbx)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gymTckbx)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(completionCheckbox))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(updateButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadData()
    {
        String command = "select * from location";
        userList.removeAll();
        ArrayList<locations> myLocations = new ArrayList<locations>();
        myLocations.clear();
        Boolean supervisor = parent.isSupervisor();
        String loggedUser = parent.getUser();

       try
       {
            ResultSet returned = connection.lookup(command);
        
            while (returned.next())
            {
                if (!(returned.getString("location").equalsIgnoreCase("None"))) 
                {
                    locations tempLocation = new locations(returned.getInt("ID"), returned.getString("location"), returned.getBoolean("lifeguard"), returned.getBoolean("lts"), returned.getBoolean("gym"));
                    myLocations.add(tempLocation);
                }
            }
            System.out.println("Convert arraylist to array then put in jList");
            userList.setListData(myLocations.toArray());
            userList.setSelectedIndex(0);
       }
       catch (SQLException ex)
       {
           JOptionPane.showMessageDialog(parent,ex);
       }
       catch (Exception ex)
       {
           JOptionPane.showMessageDialog(parent, ex);
       }
    }
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void userListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_userListValueChanged
        locations selectedLocation = (locations)userList.getSelectedValue();
        ID = selectedLocation.getID();

         locationTxtbx.setText(selectedLocation.getLocation());
        if(selectedLocation.getLTS())
        {
            ltsTckbx.setSelected(true);
        }
        else
        {
            ltsTckbx.setSelected(false);
        }
        
        if(selectedLocation.getGym())
        {
            gymTckbx.setSelected(true);
        }
        else
        {
            gymTckbx.setSelected(false);
        }
        if(selectedLocation.getLifeguard())
        {
            lifeguardTckbx.setSelected(true);
        }
        else
        {
            lifeguardTckbx.setSelected(false);
        }
    }//GEN-LAST:event_userListValueChanged

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        boolean lifeguard = false;
        if(lifeguardTckbx.isSelected())
        {
            lifeguard = true;
        }
        boolean gym = false;
        if(gymTckbx.isSelected())
        {
            gym = true;
        }
        boolean lts = false;
        if(ltsTckbx.isSelected())
        {
            lts = true;
        }
        
        String command = "update location set locations = \"" + locationTxtbx.getText() + "\", lifeguard = " + lifeguard + ", lts = " + lts + ", gym = "
                + gym + " where ID = \"" + ID + "\"";
        if (JOptionPane.showConfirmDialog(parent, "Confirm to continue",
                "",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {
            int status = connection.editUser(command);
            if (status == 1) {
                JOptionPane.showMessageDialog(parent, "Location edited successfully");
                if (completionCheckbox.isSelected()) {
                    dispose();
                }
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JCheckBox completionCheckbox;
    private javax.swing.JCheckBox gymTckbx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox lifeguardTckbx;
    private javax.swing.JTextField locationTxtbx;
    private javax.swing.JCheckBox ltsTckbx;
    private javax.swing.JButton updateButton;
    private javax.swing.JList userList;
    // End of variables declaration//GEN-END:variables
}