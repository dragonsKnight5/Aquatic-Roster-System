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
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james
 */
public class LTScoverLookup extends javax.swing.JDialog {
    main parent;
    dbConnection connection;
    ArrayList <cover> coverShifts = new ArrayList <cover>();
    commonFunctions comFunc;
    /**
     * Creates new form LNSSshiftLookup
     */
    public LTScoverLookup(main inParent, dbConnection inConnection, commonFunctions inCommon) {
        super(inParent,true);
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

        userButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        coverList = new javax.swing.JList();
        closeButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        coveredLbl = new javax.swing.JLabel();
        locationLbl = new javax.swing.JLabel();
        startTimeLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        endTimeLbl = new javax.swing.JLabel();
        endTimeLbl1 = new javax.swing.JLabel();
        startTimeLbl1 = new javax.swing.JLabel();
        allRadioButton = new javax.swing.JRadioButton();
        nameRadioButton = new javax.swing.JRadioButton();
        nameTxtFld = new javax.swing.JTextField();
        lookupButton = new javax.swing.JButton();
        dateCombo = new javax.swing.JComboBox<>();
        dateRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LTS Cover Lookup");

        coverList.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        coverList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        coverList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                coverListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(coverList);

        closeButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setLabelFor(startTimeLbl);
        jLabel4.setText("Start Time:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setLabelFor(locationLbl);
        jLabel5.setText("End Time:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setLabelFor(coveredLbl);
        jLabel6.setText("Covered By:");

        coveredLbl.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        coveredLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        locationLbl.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        locationLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        startTimeLbl.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        startTimeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Location:");

        endTimeLbl.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        endTimeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        endTimeLbl1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        endTimeLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        startTimeLbl1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        startTimeLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        userButtonGroup.add(allRadioButton);
        allRadioButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        allRadioButton.setSelected(true);
        allRadioButton.setText("All");
        allRadioButton.setEnabled(false);
        allRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allRadioButtonActionPerformed(evt);
            }
        });

        userButtonGroup.add(nameRadioButton);
        nameRadioButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        nameRadioButton.setText("Name");
        nameRadioButton.setEnabled(false);
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

        lookupButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lookupButton.setText("Lookup");
        lookupButton.setEnabled(false);
        lookupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookupButtonActionPerformed(evt);
            }
        });

        dateCombo.setEditable(true);
        dateCombo.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        dateCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dateComboKeyPressed(evt);
            }
        });

        userButtonGroup.add(dateRadioButton);
        dateRadioButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        dateRadioButton.setText("Date");
        dateRadioButton.setEnabled(false);
        dateRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateRadioButtonActionPerformed(evt);
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
                        .addComponent(dateRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(lookupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(endTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(endTimeLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(coveredLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(locationLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(startTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(startTimeLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(allRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startTimeLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endTimeLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(locationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coveredLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allRadioButton)
                    .addComponent(nameRadioButton)
                    .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(lookupButton)
                    .addComponent(dateRadioButton)
                    .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstLoad()
    {
        if (parent.isSupervisor())
        {
            allRadioButton.setEnabled(true);
            nameRadioButton.setEnabled(true);
            lookupButton.setEnabled(true);
            dateRadioButton.setEnabled(true);
            
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
        try
        {
            if (parent.isSupervisor())
            {
                if (allRadioButton.isSelected())
                {
                    command = "select * from LTS_Covers";
                }
                else if (nameRadioButton.isSelected())
                {
                    command = "select * from LTS_Covers where staff = \'" + nameTxtFld.getText() + "\' or cover_for = \'" + nameTxtFld.getText() + "\'";
                }
                else
                {
                    command = "select * from LTS_Covers where cover_date = \'" + comFunc.dateSwitch((String)dateCombo.getSelectedItem()) + "\'";
                }
            }
            else
            {
                command = "select * from LTS_Covers where staff = \'" + parent.getUser() + "\' or cover_for = \'" + parent.getUser() + "\'";
            }
            returned = connection.lookup(command);
            
            coverShifts.clear();
            while(returned.next())
            {
                cover covered = new cover (returned.getInt("ID"), returned.getDate("cover_date"), returned.getTime("start_time"), returned.getTime("end_time"), returned.getString("location"), returned.getString("staff"), returned.getString("cover_for"));
                coverShifts.add(covered);
            }
            coverList.setListData(coverShifts.toArray());
            
            if (!coverShifts.isEmpty())
            {
                coverList.setSelectedIndex(0);
            }
        }
        catch (SQLException ex)
        {
            System.out.println(ex);
            //JOptionPane.showMessageDialog(parent, ex);
        }
    }
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void coverListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_coverListValueChanged
        try
        {
            cover selectedCover = (cover)coverList.getSelectedValue();
            
            startTimeLbl.setText(selectedCover.getStartTime().toString());
            startTimeLbl1.setText(comFunc.timeConvert(selectedCover.getStartTime()));
            endTimeLbl.setText(selectedCover.getEndTime().toString());
            endTimeLbl1.setText(comFunc.timeConvert(selectedCover.getEndTime()));
            coveredLbl.setText(selectedCover.getStaff());
            locationLbl.setText(selectedCover.getLocation());
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_coverListValueChanged

    private void nameRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRadioButtonActionPerformed
        nameTxtFld.setEnabled(true);
    }//GEN-LAST:event_nameRadioButtonActionPerformed

    private void allRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allRadioButtonActionPerformed
        nameTxtFld.setEnabled(false);
    }//GEN-LAST:event_allRadioButtonActionPerformed

    private void lookupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookupButtonActionPerformed
        loadData();
    }//GEN-LAST:event_lookupButtonActionPerformed

    private void dateRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateRadioButtonActionPerformed
        dateCombo.setEnabled(true);
        nameTxtFld.setEnabled(false);
    }//GEN-LAST:event_dateRadioButtonActionPerformed

    private void nameTxtFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtFldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        {
            lookupButton.doClick();
        }
    }//GEN-LAST:event_nameTxtFldKeyPressed

    private void dateComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateComboKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        {
            lookupButton.doClick();
        }
    }//GEN-LAST:event_dateComboKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton allRadioButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JList coverList;
    private javax.swing.JLabel coveredLbl;
    private javax.swing.JComboBox<String> dateCombo;
    private javax.swing.JRadioButton dateRadioButton;
    private javax.swing.JLabel endTimeLbl;
    private javax.swing.JLabel endTimeLbl1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel locationLbl;
    private javax.swing.JButton lookupButton;
    private javax.swing.JRadioButton nameRadioButton;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JLabel startTimeLbl;
    private javax.swing.JLabel startTimeLbl1;
    private javax.swing.ButtonGroup userButtonGroup;
    // End of variables declaration//GEN-END:variables
}
