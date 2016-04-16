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

import javax.swing.JOptionPane;

/**
 *
 * @author james
 */
public class main extends javax.swing.JFrame {
    dbConnection connection = new dbConnection();
    commonFunctions myCommonFunctions = new commonFunctions();
    Boolean supervisor = false;
    private final String user = "staff";
    private final String password = "dragon";
    private final String address = "192.168.1.209";
    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        startConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        createShiftBtn = new javax.swing.JButton();
        shiftLookupBtn = new javax.swing.JButton();
        createCoverBtn = new javax.swing.JButton();
        lookupCoverBtn = new javax.swing.JButton();
        editShiftBtn = new javax.swing.JButton();
        EditCoverBtn = new javax.swing.JButton();
        removeShiftBtn = new javax.swing.JButton();
        removeCoverBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        guardLookupBtn = new javax.swing.JButton();
        guardShiftCreatorBtn = new javax.swing.JButton();
        guardShiftEditBtn = new javax.swing.JButton();
        guardShiftRemoveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loginMenuItem = new javax.swing.JMenuItem();
        logoutMenuItem = new javax.swing.JMenuItem();
        databaseConnectMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        newStaffMenuItem = new javax.swing.JMenuItem();
        editStaffMenuItem = new javax.swing.JMenuItem();
        removeStaffMenuItem = new javax.swing.JMenuItem();
        addAvailabilityMenuItem = new javax.swing.JMenuItem();
        editAvailabilityMenuItem = new javax.swing.JMenuItem();
        removeAvailabilityMenuItem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        newLocationMenuItem = new javax.swing.JMenuItem();
        editLocationMenuItem = new javax.swing.JMenuItem();
        removeLocationMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Roster System");
        setMaximumSize(new java.awt.Dimension(620, 504));

        jTabbedPane1.setMaximumSize(null);

        createShiftBtn.setText("Create Shift");
        createShiftBtn.setEnabled(false);
        createShiftBtn.setMaximumSize(null);
        createShiftBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createShiftBtnActionPerformed(evt);
            }
        });

        shiftLookupBtn.setText("Lookup Shift");
        shiftLookupBtn.setEnabled(false);
        shiftLookupBtn.setMaximumSize(null);
        shiftLookupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftLookupBtnActionPerformed(evt);
            }
        });

        createCoverBtn.setText("Create Cover");
        createCoverBtn.setEnabled(false);
        createCoverBtn.setMaximumSize(null);
        createCoverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCoverBtnActionPerformed(evt);
            }
        });

        lookupCoverBtn.setText("Lookup Cover");
        lookupCoverBtn.setEnabled(false);
        lookupCoverBtn.setMaximumSize(null);
        lookupCoverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookupCoverBtnActionPerformed(evt);
            }
        });

        editShiftBtn.setText("Edit Shift");
        editShiftBtn.setEnabled(false);
        editShiftBtn.setMaximumSize(null);
        editShiftBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editShiftBtnActionPerformed(evt);
            }
        });

        EditCoverBtn.setText("Edit Cover");
        EditCoverBtn.setEnabled(false);
        EditCoverBtn.setMaximumSize(null);
        EditCoverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCoverBtnActionPerformed(evt);
            }
        });

        removeShiftBtn.setText("Remove Shift");
        removeShiftBtn.setEnabled(false);
        removeShiftBtn.setMaximumSize(null);
        removeShiftBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeShiftBtnActionPerformed(evt);
            }
        });

        removeCoverBtn.setText("Remove Cover");
        removeCoverBtn.setEnabled(false);
        removeCoverBtn.setMaximumSize(null);
        removeCoverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCoverBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createShiftBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editShiftBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shiftLookupBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeShiftBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createCoverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lookupCoverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(EditCoverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeCoverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createShiftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createCoverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shiftLookupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lookupCoverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editShiftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditCoverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeShiftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeCoverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LTS", jPanel1);

        guardLookupBtn.setText("Lookup Shift");
        guardLookupBtn.setEnabled(false);
        guardLookupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardLookupBtnActionPerformed(evt);
            }
        });

        guardShiftCreatorBtn.setText("Create Shift");
        guardShiftCreatorBtn.setEnabled(false);
        guardShiftCreatorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardShiftCreatorBtnActionPerformed(evt);
            }
        });

        guardShiftEditBtn.setText("Edit Shift");
        guardShiftEditBtn.setEnabled(false);
        guardShiftEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardShiftEditBtnActionPerformed(evt);
            }
        });

        guardShiftRemoveBtn.setText("Remove Shift");
        guardShiftRemoveBtn.setEnabled(false);
        guardShiftRemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardShiftRemoveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guardShiftEditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guardLookupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardShiftCreatorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guardShiftRemoveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardLookupBtn)
                    .addComponent(guardShiftCreatorBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardShiftEditBtn)
                    .addComponent(guardShiftRemoveBtn))
                .addGap(0, 86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lifeguards", jPanel2);

        jLabel1.setText("Logged In As:");
        jLabel1.setMaximumSize(null);

        userLabel.setText("No One");
        userLabel.setMaximumSize(null);

        jMenu1.setText("System");

        loginMenuItem.setText("Login");
        loginMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loginMenuItem);

        logoutMenuItem.setText("Logout");
        logoutMenuItem.setEnabled(false);
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(logoutMenuItem);

        databaseConnectMenuItem.setText("Connect To Database");
        databaseConnectMenuItem.setEnabled(false);
        databaseConnectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseConnectMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(databaseConnectMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Staff");

        newStaffMenuItem.setText("New Staff");
        newStaffMenuItem.setEnabled(false);
        newStaffMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStaffMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(newStaffMenuItem);

        editStaffMenuItem.setText("Edit Staff");
        editStaffMenuItem.setEnabled(false);
        editStaffMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStaffMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(editStaffMenuItem);

        removeStaffMenuItem.setText("Remove Staff");
        removeStaffMenuItem.setEnabled(false);
        removeStaffMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStaffMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(removeStaffMenuItem);

        addAvailabilityMenuItem.setText("Add Availability");
        addAvailabilityMenuItem.setEnabled(false);
        addAvailabilityMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAvailabilityMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(addAvailabilityMenuItem);

        editAvailabilityMenuItem.setText("Edit Availability");
        editAvailabilityMenuItem.setEnabled(false);
        editAvailabilityMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAvailabilityMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(editAvailabilityMenuItem);

        removeAvailabilityMenuItem.setText("Remove Availability");
        removeAvailabilityMenuItem.setEnabled(false);
        removeAvailabilityMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAvailabilityMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(removeAvailabilityMenuItem);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Location");

        newLocationMenuItem.setText("New Location");
        newLocationMenuItem.setEnabled(false);
        newLocationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLocationMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(newLocationMenuItem);

        editLocationMenuItem.setText("Edit Location");
        editLocationMenuItem.setEnabled(false);
        editLocationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLocationMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(editLocationMenuItem);

        removeLocationMenuItem.setText("Remove Location");
        removeLocationMenuItem.setEnabled(false);
        removeLocationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeLocationMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(removeLocationMenuItem);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("About");

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(aboutMenuItem);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startConnection()
    {        
        //Connect to database using restricted user
        connection.newConnect(user, password, address);
        
        //check if connected
        Boolean isConnected = connection.isConnected;
        
        //Display message depending on whether connected or not
        if(isConnected)
        {
            System.out.println("Connected to database");
        }
        else
        {
            System.out.println("Unable to connect to database at this time");
            databaseConnectMenuItem.setEnabled(true);
            loginMenuItem.setEnabled(false);
        }
    }
    
    public void loggedInUser(String user)
    {
        userLabel.setText(user);
    }
    
    public void adminConfig()
    {
        newStaffMenuItem.setEnabled(true);
        removeStaffMenuItem.setEnabled(true);
        createShiftBtn.setEnabled(true);
        createCoverBtn.setEnabled(true);
        guardShiftCreatorBtn.setEnabled(true);
        guardShiftEditBtn.setEnabled(true);
        guardShiftRemoveBtn.setEnabled(true);
        editShiftBtn.setEnabled(true);
        removeShiftBtn.setEnabled(true);
        EditCoverBtn.setEnabled(true);
        removeCoverBtn.setEnabled(true);
        newLocationMenuItem.setEnabled(true);
        editLocationMenuItem.setEnabled(true);
        removeLocationMenuItem.setEnabled(true);
        supervisor = true;
        userConfig();
    }
    
    public void userConfig ()
    {
        loginMenuItem.setEnabled(false);
        logoutMenuItem.setEnabled(true);
        editStaffMenuItem.setEnabled(true);
        guardLookupBtn.setEnabled(true);
        shiftLookupBtn.setEnabled(true);
        lookupCoverBtn.setEnabled(true);
        addAvailabilityMenuItem.setEnabled(true);
        editAvailabilityMenuItem.setEnabled(true);
        removeAvailabilityMenuItem.setEnabled(true);
    }
    
    private void removeStaffMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStaffMenuItemActionPerformed
        userRemoval removeUser = new userRemoval(this, connection);
    }//GEN-LAST:event_removeStaffMenuItemActionPerformed

    private void shiftLookupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftLookupBtnActionPerformed
         LTSshiftLookup  ltsShiftlookup = new LTSshiftLookup(this, connection);
    }//GEN-LAST:event_shiftLookupBtnActionPerformed

    private void createShiftBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createShiftBtnActionPerformed
        LTSshiftCreator  ltsShiftcreate = new LTSshiftCreator(this, connection);
    }//GEN-LAST:event_createShiftBtnActionPerformed

    private void lookupCoverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookupCoverBtnActionPerformed
        LTScoverLookup  ltsCoverLookup = new LTScoverLookup (this, connection);
    }//GEN-LAST:event_lookupCoverBtnActionPerformed

    private void createCoverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCoverBtnActionPerformed
        LTScoverCreator shiftCover = new LTScoverCreator(this, connection, myCommonFunctions);
    }//GEN-LAST:event_createCoverBtnActionPerformed

    private void guardLookupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardLookupBtnActionPerformed
        LifeguardShiftLookup lifeguardLookup = new LifeguardShiftLookup(this, connection);
    }//GEN-LAST:event_guardLookupBtnActionPerformed

    private void guardShiftCreatorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardShiftCreatorBtnActionPerformed
        LifeguardShiftCreator guardShiftCreator = new LifeguardShiftCreator(this, connection);
    }//GEN-LAST:event_guardShiftCreatorBtnActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        if(connection.isConnected)
        {
            System.out.println("Close connection to database");
            connection.close();
        }
        else
        {
            System.out.println("No connection to database, moving on");
        }
        System.out.println("Close program");
        dispose();
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void loginMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuItemActionPerformed
        login userLogin = new login(this, connection);
    }//GEN-LAST:event_loginMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        JOptionPane.showMessageDialog(null, "Version 0.8");
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void newStaffMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStaffMenuItemActionPerformed
        userAdd addUser = new userAdd(this, connection);
    }//GEN-LAST:event_newStaffMenuItemActionPerformed

    private void databaseConnectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseConnectMenuItemActionPerformed
        //Connect to database using restricted user
        connection.newConnect(user, password, address);
        
        //check if connected
        Boolean isConnected = connection.isConnected;
        
        //Display message depending on whether connected or not
        if(isConnected)
        {
            System.out.println("Connected to database");
            databaseConnectMenuItem.setEnabled(false);
            loginMenuItem.setEnabled(true);
        }
        else
        {
            System.out.println("Unable to connect to database at this time");
            databaseConnectMenuItem.setEnabled(true);
        }
    }//GEN-LAST:event_databaseConnectMenuItemActionPerformed

    public String getUser()
    {
        String user = userLabel.getText();
        return user;
    }
    
    public Boolean isSupervisor()
    {
        return supervisor;
    }
    
    private void editStaffMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStaffMenuItemActionPerformed
        userEdit editUser = new userEdit(this, connection);
    }//GEN-LAST:event_editStaffMenuItemActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        loginMenuItem.setEnabled(true);
        logoutMenuItem.setEnabled(false);
        editStaffMenuItem.setEnabled(false);
        guardLookupBtn.setEnabled(false);
        shiftLookupBtn.setEnabled(false);
        lookupCoverBtn.setEnabled(false);
        newStaffMenuItem.setEnabled(false);
        removeStaffMenuItem.setEnabled(false);
        createShiftBtn.setEnabled(false);
        createCoverBtn.setEnabled(false);
        guardShiftCreatorBtn.setEnabled(false);
        guardShiftEditBtn.setEnabled(false);
        guardShiftRemoveBtn.setEnabled(false);
        editShiftBtn.setEnabled(false);
        removeShiftBtn.setEnabled(false);
        EditCoverBtn.setEnabled(false);
        removeCoverBtn.setEnabled(false);
        supervisor = false;
        userLabel.setText("No One");
        newLocationMenuItem.setEnabled(false);
        editLocationMenuItem.setEnabled(false);
        removeLocationMenuItem.setEnabled(false);
        addAvailabilityMenuItem.setEnabled(false);
        editAvailabilityMenuItem.setEnabled(false);
        removeAvailabilityMenuItem.setEnabled(false);
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void guardShiftEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardShiftEditBtnActionPerformed
        LifeguardShiftEditor editShift = new LifeguardShiftEditor(this, connection);
    }//GEN-LAST:event_guardShiftEditBtnActionPerformed

    private void guardShiftRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardShiftRemoveBtnActionPerformed
        LifeguardShiftRemove guardRemove = new LifeguardShiftRemove(this, connection);
    }//GEN-LAST:event_guardShiftRemoveBtnActionPerformed

    private void editShiftBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editShiftBtnActionPerformed
        LTSshiftEditor ltsEdit = new LTSshiftEditor(this, connection);
    }//GEN-LAST:event_editShiftBtnActionPerformed

    private void removeShiftBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeShiftBtnActionPerformed
        LTSshiftRemove ltsRemove = new LTSshiftRemove(this, connection);
    }//GEN-LAST:event_removeShiftBtnActionPerformed

    private void EditCoverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCoverBtnActionPerformed
        LTScoverEditor editCover = new LTScoverEditor(this, connection);
    }//GEN-LAST:event_EditCoverBtnActionPerformed

    private void removeCoverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCoverBtnActionPerformed
        LTScoverRemove removeCover = new LTScoverRemove(this, connection);
    }//GEN-LAST:event_removeCoverBtnActionPerformed

    private void newLocationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLocationMenuItemActionPerformed
        locationAdd newLocation = new locationAdd(this, connection);
    }//GEN-LAST:event_newLocationMenuItemActionPerformed

    private void editLocationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLocationMenuItemActionPerformed
        locationEdit adjustLocation = new locationEdit(this, connection);
    }//GEN-LAST:event_editLocationMenuItemActionPerformed

    private void removeLocationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeLocationMenuItemActionPerformed
        locationRemoval destroyLocation = new locationRemoval(this, connection);
    }//GEN-LAST:event_removeLocationMenuItemActionPerformed

    private void addAvailabilityMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAvailabilityMenuItemActionPerformed
        addAvailability newAvailability = new addAvailability(this, connection, supervisor);
    }//GEN-LAST:event_addAvailabilityMenuItemActionPerformed

    private void editAvailabilityMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAvailabilityMenuItemActionPerformed
        editAvailability availabilityEdit = new editAvailability(this, connection, supervisor);
    }//GEN-LAST:event_editAvailabilityMenuItemActionPerformed

    private void removeAvailabilityMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAvailabilityMenuItemActionPerformed
        removeAvailability availabilityRemoval = new removeAvailability(this, connection, supervisor);
    }//GEN-LAST:event_removeAvailabilityMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditCoverBtn;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem addAvailabilityMenuItem;
    private javax.swing.JButton createCoverBtn;
    private javax.swing.JButton createShiftBtn;
    private javax.swing.JMenuItem databaseConnectMenuItem;
    private javax.swing.JMenuItem editAvailabilityMenuItem;
    private javax.swing.JMenuItem editLocationMenuItem;
    private javax.swing.JButton editShiftBtn;
    private javax.swing.JMenuItem editStaffMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JButton guardLookupBtn;
    private javax.swing.JButton guardShiftCreatorBtn;
    private javax.swing.JButton guardShiftEditBtn;
    private javax.swing.JButton guardShiftRemoveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem loginMenuItem;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JButton lookupCoverBtn;
    private javax.swing.JMenuItem newLocationMenuItem;
    private javax.swing.JMenuItem newStaffMenuItem;
    private javax.swing.JMenuItem removeAvailabilityMenuItem;
    private javax.swing.JButton removeCoverBtn;
    private javax.swing.JMenuItem removeLocationMenuItem;
    private javax.swing.JButton removeShiftBtn;
    private javax.swing.JMenuItem removeStaffMenuItem;
    private javax.swing.JButton shiftLookupBtn;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
