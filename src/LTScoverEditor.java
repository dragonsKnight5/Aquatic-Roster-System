

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.LocalDate;
import java.text.ParseException;
/**
 *
 * @author james
 */
public class LTScoverEditor extends javax.swing.JDialog {
    main parent;
    dbConnection connection;
    ArrayList<cover> coverShifts = new ArrayList<cover>();
    int ID;
    /**
     * Creates new form Lifeguard
     */
    public LTScoverEditor(main inParent, dbConnection inConnection) {
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

        updateButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shiftList = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        dateCombo = new javax.swing.JComboBox<String>();
        startHourSpinner = new javax.swing.JSpinner();
        startMinuteSpinner = new javax.swing.JSpinner();
        endHourSpinner = new javax.swing.JSpinner();
        endMinuteSpinner = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        staffCombo = new javax.swing.JComboBox<String>();
        coverCombo = new javax.swing.JComboBox<String>();
        completionTickbox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LTS Cover Editor");

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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Is Covering For");

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
                        .addComponent(updateButton)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(staffCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jSeparator2))
                                                .addGap(16, 16, 16))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(completionTickbox)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(coverCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(endHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(endMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(startHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(startMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(65, 65, 65))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(dateCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(16, 16, 16))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(startHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(startMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(endHourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(endMinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(staffCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(coverCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(completionTickbox))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(closeButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void shiftListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_shiftListValueChanged
        cover selectedShift = (cover)shiftList.getSelectedValue();
        //Clear previous values from combo boxes
        dateCombo.removeAllItems();
        staffCombo.removeAllItems();
        coverCombo.removeAllItems();
        
        int count = 7;
        
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        Date coverDate = selectedShift.getDate();
        LocalDate selectedDate = coverDate.toLocalDate();
        String dateString = null;
        LocalDate newDate = null;
        ID = selectedShift.getID();
        
        //Date manipulation block
        do
                {
                    newDate = selectedDate.minusDays(count);
                    dateString = myFormat.format(newDate);
                    dateCombo.addItem(dateString);
                    count --;
                } while (count != 0);
      
        do 
                {
                    newDate = selectedDate.plusDays(count);
                    dateString = myFormat.format(newDate);
                    dateCombo.addItem(dateString);
                    count++;
                } while (count != 17);
        
        //set selected date to date provided by database
        dateCombo.setSelectedItem(myFormat.format(selectedDate));
        
        //Settings pushed to screen
        LocalTime startTime = selectedShift.getStartTime();
        LocalTime endTime = selectedShift.getEndTime();
        startHourSpinner.setValue(startTime.getHour());
        startMinuteSpinner.setValue(startTime.getMinute());
        endHourSpinner.setValue(endTime.getHour());
        endMinuteSpinner.setValue(endTime.getMinute());
        
        ResultSet returned;
        returned = connection.getLTSusers();
        try
        {
            while(returned.next())
            {
                staffCombo.addItem(returned.getString("username"));
                coverCombo.addItem(returned.getString("username"));
            }
            staffCombo.addItem("None");
            
            staffCombo.setSelectedItem(selectedShift.getStaff());
            coverCombo.setSelectedItem(selectedShift.getCoverFor());
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parent, ex);
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
            
            String command = "update LTS_Covers set cover_date= \'" + selectedDate + "\', start_time = \'" + startTime + "\', end_time = \'"
                    + endTime + "\', staff = \'" + staffCombo.getSelectedItem() + "\', cover_for = \'" + coverCombo.getSelectedItem() 
                    + "\' where ID = \'" + ID + "\'";
            
            int status = connection.updateShift(command);
            if (status == 1)
            {
                JOptionPane.showMessageDialog(parent, "Cover Update Successfull");
                if (completionTickbox.isSelected())
                {
                    dispose();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(parent, "Unable To Update Cover");
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

private void loadData()
{
    ResultSet returned;
    shiftList.removeAll();
    String command = "select * from LTS_Covers";
    try
    {
        returned = connection.lookup(command);
        while(returned.next())
        {
            cover tempCover = new cover (returned.getInt("ID"), returned.getDate("cover_date"), returned.getTime("start_time"), returned.getTime("end_time"), returned.getString("staff"), returned.getString("cover_for"));
            coverShifts.add(tempCover);
        }
        shiftList.setListData(coverShifts.toArray());
        if (!coverShifts.isEmpty())
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
    private javax.swing.JComboBox<String> coverCombo;
    private javax.swing.JComboBox<String> dateCombo;
    private javax.swing.JSpinner endHourSpinner;
    private javax.swing.JSpinner endMinuteSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JList shiftList;
    private javax.swing.JComboBox<String> staffCombo;
    private javax.swing.JSpinner startHourSpinner;
    private javax.swing.JSpinner startMinuteSpinner;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
