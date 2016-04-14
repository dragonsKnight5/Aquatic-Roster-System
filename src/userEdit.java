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
public class userEdit extends javax.swing.JDialog {
    dbConnection connection;
    main parent;
    int ID = 0;
    /**
     * Creates new form userEdit
     */
    public userEdit(main inParent, dbConnection inConnection) {
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

        jLabel1 = new javax.swing.JLabel();
        usernameTextbox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lastNameTextbox = new javax.swing.JTextField();
        supervisorCheckBox = new javax.swing.JCheckBox();
        passwordTxt = new javax.swing.JPasswordField();
        updateButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userList = new javax.swing.JList();
        department1Combo = new javax.swing.JComboBox<>();
        department2Combo = new javax.swing.JComboBox<>();
        department3Combo = new javax.swing.JComboBox<>();
        completionCheckbox = new javax.swing.JCheckBox();
        firstNameTxtbx = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Edit");

        jLabel1.setText("username:");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Department 1:");

        jLabel5.setText("Department 2:");

        jLabel6.setText("Department 3:");

        jLabel7.setText("Supervisor:");

        jLabel8.setText("Password:");

        passwordTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordTxt.setName("password");

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

        department1Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LTS", "Lifeguard" }));

        department2Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "LTS", "Lifeguard" }));

        department3Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "LTS", "Lifeguard" }));

        completionCheckbox.setText("Close On Completion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(completionCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameTextbox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firstNameTxtbx, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(department1Combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastNameTextbox, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(45, 45, 45)
                        .addComponent(passwordTxt))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(supervisorCheckBox)
                            .addComponent(department2Combo, 0, 203, Short.MAX_VALUE)
                            .addComponent(department3Combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(usernameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lastNameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(department1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(department2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(department3Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(supervisorCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(updateButton)
                    .addComponent(completionCheckbox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadData()
    {
        String command = "select * from users";
        userList.removeAll();
        ArrayList<users> myUsers = new ArrayList<users>();
        myUsers.clear();
        Boolean supervisor = parent.isSupervisor();
        String loggedUser = parent.getUser();

       try
       {
            ResultSet returned = connection.lookup(command);
        
            System.out.println("Create user object and add to arraylist");
            while (returned.next())
            {
                if (supervisor)
                {
                    users tempUser = new users(returned.getInt("ID"), returned.getString("username"), returned.getString("first_name"), returned.getString("last_name"), returned.getString("department_1"), returned.getString("department_2"), returned.getString("department_3"), returned.getBoolean("supervisor"), returned.getString("password"));
                    myUsers.add(tempUser);
                }
                else
                {
                    if ((returned.getString("username")).equalsIgnoreCase(loggedUser))
                    {
                        users tempUser = new users(returned.getInt("ID"), returned.getString("username"), returned.getString("first_name"), returned.getString("last_name"), returned.getString("department_1"), returned.getString("department_2"), returned.getString("department_3"), returned.getBoolean("supervisor"), returned.getString("password"));
                        myUsers.add(tempUser);
                    }
                }
            }
            System.out.println("Convert arraylist to array then put in jList");
            userList.setListData(myUsers.toArray());
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
        users selectedUser = (users)userList.getSelectedValue();
        ID = selectedUser.getID();
        usernameTextbox.setText(selectedUser.getUsername());
        firstNameTxtbx.setText(selectedUser.getFirstName());
        lastNameTextbox.setText(selectedUser.getLastName());
        department1Combo.setSelectedItem(selectedUser.getDepartment1());
        department2Combo.setSelectedItem(selectedUser.getDepartment2());
        department3Combo.setSelectedItem(selectedUser.getDepartment3());
        passwordTxt.setText(selectedUser.getPassword());
         
        if(selectedUser.getSupervisor())
        {
            supervisorCheckBox.setSelected(true);
        }
        else
        {
            supervisorCheckBox.setSelected(false);
        }
        
    }//GEN-LAST:event_userListValueChanged

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String department2 = null;
        if (((String)department2Combo.getSelectedItem()).equalsIgnoreCase("none"))
        {
            department2 = "null";
        }
        String department3 = null;
        if (((String)department3Combo.getSelectedItem()).equalsIgnoreCase("none"))
        {
            department3 = "null";
        }
        Boolean supervisor = null;
        if (supervisorCheckBox.isSelected())
        {
            supervisor = true;
        }
        else
        {
            supervisor = false;
        }
        String password = new String(passwordTxt.getPassword());
        
        String command = "UPDATE users SET username = \"" + usernameTextbox.getText() + "\", first_name = \"" + firstNameTxtbx.getText() + "\", last_name = \"" + lastNameTextbox.getText()
                + "\", department_1 = \"" + (String)department1Combo.getSelectedItem() + "\", department_2 = \"" + department2 + "\", department_3 = \"" + department3 + "\", supervisor = " + supervisor 
                + ", password = \"" + password + "\" where id = \"" + ID + "\"";
        if (JOptionPane.showConfirmDialog(parent, "Confirm to continue",
                "",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {
            int status = connection.editUser(command);
            if (status == 1) {
                JOptionPane.showMessageDialog(parent, "User edited successfully");
                if (completionCheckbox.isSelected()) {
                    dispose();
                }
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JCheckBox completionCheckbox;
    private javax.swing.JComboBox<String> department1Combo;
    private javax.swing.JComboBox<String> department2Combo;
    private javax.swing.JComboBox<String> department3Combo;
    private javax.swing.JTextField firstNameTxtbx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTextbox;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JCheckBox supervisorCheckBox;
    private javax.swing.JButton updateButton;
    private javax.swing.JList userList;
    private javax.swing.JTextField usernameTextbox;
    // End of variables declaration//GEN-END:variables
}
