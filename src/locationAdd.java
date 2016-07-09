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

/**
 *
 * @author james
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class locationAdd extends javax.swing.JDialog {
    dbConnection connection;
    main parent;
    ArrayList<users> myUsers = new ArrayList<users>();
    /**
     * Creates new form userEdit
     */
    public locationAdd(main inParent, dbConnection inConnection) {
        super(inParent,true);
        connection = inConnection;
        parent = inParent;
        initComponents();
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
        locationTxtbx = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lifeguardTckbx = new javax.swing.JCheckBox();
        submitButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        completionCheckbox = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        ltsTckbx = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        gymTckbx = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        iscTckbx = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Location Add");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Location:");

        locationTxtbx.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel7.setText("Lifeguard:");

        lifeguardTckbx.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        submitButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        closeButton.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        completionCheckbox.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        completionCheckbox.setText("Close On Completion");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel9.setText("LTS:");

        ltsTckbx.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel10.setText("Gym:");

        gymTckbx.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel11.setText("ISC:");

        iscTckbx.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lifeguardTckbx)
                                    .addComponent(ltsTckbx)
                                    .addComponent(gymTckbx)
                                    .addComponent(iscTckbx))
                                .addGap(117, 117, 117))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(locationTxtbx, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(closeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(completionCheckbox)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iscTckbx)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(completionCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(submitButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        System.out.println("Get user variables");
        String location = locationTxtbx.getText();
        Boolean lifeguard = null;
        Boolean lts = null;
        Boolean gym = null;
        Boolean isc = null;
        if (lifeguardTckbx.isSelected())
        {
            lifeguard = true;
        }
        else
        {
            lifeguard = false;
        }
        if (ltsTckbx.isSelected())
        {
            lts = true;
        }
        else
        {
            lts = false;
        }
        if (gymTckbx.isSelected())
        {
            gym = true;
        }
        else
        {
            gym = false;
        }
        if (iscTckbx.isSelected())
        {
            isc = true;
        }
        else
        {
            isc = false;
        }
        
        String command = "insert into location (location, lifeguard, lts, gym, isc) values (\'" + location + "\', "
                + lifeguard + "," + lts + ", " + gym + ", " + isc +")";
        
        System.out.println(command);
        
       if (JOptionPane.showConfirmDialog(parent, "Confirm to continue",
                "",
                JOptionPane.YES_NO_OPTION)
            == JOptionPane.YES_OPTION)
        {
            int result = connection.addLocation(command);
            if (result == 1)
            {
                JOptionPane.showMessageDialog(parent, "Location Added", "", JOptionPane.INFORMATION_MESSAGE);
                if (completionCheckbox.isSelected())
                {
                    dispose();
                }
                else
                {
                    locationTxtbx.setText("");
                    lifeguardTckbx.setSelected(false);
                    ltsTckbx.setSelected(false);
                    gymTckbx.setSelected(false);
                    iscTckbx.setSelected(false);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(parent, "Unable To Add Location", "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JCheckBox completionCheckbox;
    private javax.swing.JCheckBox gymTckbx;
    private javax.swing.JCheckBox iscTckbx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox lifeguardTckbx;
    private javax.swing.JTextField locationTxtbx;
    private javax.swing.JCheckBox ltsTckbx;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
