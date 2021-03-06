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
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author james
 */
public class LTSshiftRemoveAlt extends javax.swing.JDialog {
    main parent;
    dbConnection connection;
    ArrayList<lts> ltsShifts = new ArrayList<lts>();
    int ID;
    /**
     * Creates new form Lifeguard
     */
    public LTSshiftRemoveAlt(main inParent, dbConnection inConnection) {
        super(inParent, true);
        initComponents();
        parent = inParent;
        connection = inConnection;
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

        closeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        shiftList = new javax.swing.JList();
        removeButton = new javax.swing.JButton();
        completionTickbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LTS Shift Remove");

        closeButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        shiftList.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        shiftList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        shiftList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                shiftListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(shiftList);

        removeButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        completionTickbox.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        completionTickbox.setText("Close On Completion");
        completionTickbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completionTickboxActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(completionTickbox)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(closeButton)
                                .addGap(18, 18, 18)
                                .addComponent(removeButton)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(completionTickbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(removeButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void shiftListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_shiftListValueChanged
        // need to find out if there's another way to deal with null pointer exception problem
        //DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("d/MM/YYYY");
        //String dateString;
        try
        {
            lts selectedShift = (lts)shiftList.getSelectedValue();
            ID = selectedShift.getID();
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_shiftListValueChanged

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
       int shiftListSelection = shiftList.getSelectedIndex();
       
        if (shiftListSelection >= 0)
       {
            if (JOptionPane.showConfirmDialog(parent, "Confirm to continue",
                    "",
                    JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION)
            {
                String command = "delete from LTS_Shift where ID = \'" + ID + "\'";
            
                int status = connection.removeGuardShift(command);
            
                if (status == 1)
                {
                    JOptionPane.showMessageDialog(parent, "Shift Removed");
                    if (completionTickbox.isSelected())
                    {
                        dispose();
                    }
                    else
                    {
                        ltsShifts.clear();
                        loadData();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(parent, "Unable To Remove Shift");
                }
            }
       }
       else
       {
           JOptionPane.showMessageDialog(parent, "Please Select A Shift And Try Again");
       }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void completionTickboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completionTickboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_completionTickboxActionPerformed

private void loadData()
{
    ResultSet returned;
    shiftList.removeAll();
    String command = "select * from LTS_Shift";
    try
    {
        returned = connection.lookup(command);
        while(returned.next())
        {
            lts tempShift = new lts(returned.getInt("ID"), returned.getString("staff"), returned.getString("shift_day"), returned.getString("location"), returned.getTime("start_time"), returned.getTime("end_time"), returned.getDate("start_date"), returned.getDate("end_date"));
            ltsShifts.add(tempShift);
        }
        shiftList.setListData(ltsShifts.toArray());
        if (!ltsShifts.isEmpty())
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
    private javax.swing.JButton closeButton;
    private javax.swing.JCheckBox completionTickbox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeButton;
    private javax.swing.JList shiftList;
    // End of variables declaration//GEN-END:variables
}
