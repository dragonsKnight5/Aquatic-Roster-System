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
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import static java.time.temporal.TemporalAdjusters.next;
import java.util.ArrayList;
import org.jopendocument.dom.spreadsheet.Sheet;
/**
 *
 * @author james
 */
public class lgExport extends javax.swing.JDialog 
{
    main parent;
    dbConnection connection;
    commonFunctions comFunc;
    ArrayList<lifeguards> guardShifts = new ArrayList<lifeguards>();
    String defaultSUP = "SARA WIGHTMAN";
    LocalTime openTime = LocalTime.of(5, 00);
    LocalTime twoPm = LocalTime.of(14, 00);
    LocalTime satSunOpenTime = LocalTime.of(6, 00);
    LocalTime satSunClose = LocalTime.of(19, 00);
    LocalTime monThursClose = LocalTime.of(20, 30);
    LocalTime onePm = LocalTime.of(13,00);
    LocalTime elevenThirty = LocalTime.of(11, 30);
    LocalTime eightThirty = LocalTime.of(8, 30);
    LocalTime threePm = LocalTime.of(15, 00);
    LocalTime fourPm = LocalTime.of(16, 00);
    LocalTime fivePm = LocalTime.of(17, 00);
    LocalTime tenThirty = LocalTime.of(10, 30);
    LocalTime twelveThirty = LocalTime.of(12, 30);
    LocalTime sevenPm = LocalTime.of(19, 00);
    
    private final String tuesdayDay = "AT1";
    private final String tuesdayMonth = "AV1";
    private final String tuesdayYear = "AX1";
    
    private final String wednesdayDay = "BG1";
    private final String wednesdayMonth = "BI1";
    private final String wednesdayYear = "BK1";
    
    private final String thursdayDay = "G60";
    private final String thursdayMonth = "I60";
    private final String thursdayYear = "K60";
    
    private final String fridayDay = "S60";
    private final String fridayMonth = "U60";
    private final String fridayYear = "W60";
    /**
     * Creates new form lgExport
     */
    public lgExport(main inParent, dbConnection inConnection, commonFunctions inCommon) {
        super(inParent,true);
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

        mondayGroup = new javax.swing.ButtonGroup();
        tuesdayGroup = new javax.swing.ButtonGroup();
        wednesdayGroup = new javax.swing.ButtonGroup();
        thursdayGroup = new javax.swing.ButtonGroup();
        fridayGroup = new javax.swing.ButtonGroup();
        dateCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        exportButton = new javax.swing.JButton();
        mondayDefRdBttn = new javax.swing.JRadioButton();
        mondayOtherRdBttn = new javax.swing.JRadioButton();
        supMondayTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        supTextField3 = new javax.swing.JTextField();
        tuesdayDefRdBttn = new javax.swing.JRadioButton();
        wednesdayDefRdBttn = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        supTextField4 = new javax.swing.JTextField();
        supTextField5 = new javax.swing.JTextField();
        fridayDefRdBttn = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        thursdayDefRdBttn = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        supTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton14 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LG Roster Exporter");

        dateCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dateComboItemStateChanged(evt);
            }
        });
        dateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateComboActionPerformed(evt);
            }
        });

        jLabel1.setText("SUP selector:");

        exportButton.setText("Export");
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });

        mondayGroup.add(mondayDefRdBttn);
        mondayDefRdBttn.setSelected(true);
        mondayDefRdBttn.setText("Default");

        mondayGroup.add(mondayOtherRdBttn);
        mondayOtherRdBttn.setText("Other");
        mondayOtherRdBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mondayOtherRdBttnActionPerformed(evt);
            }
        });

        jLabel4.setText("Monday:");

        tuesdayGroup.add(jRadioButton7);
        jRadioButton7.setText("Other");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jLabel5.setText("Tuesday:");

        tuesdayGroup.add(tuesdayDefRdBttn);
        tuesdayDefRdBttn.setSelected(true);
        tuesdayDefRdBttn.setText("Default");

        wednesdayGroup.add(wednesdayDefRdBttn);
        wednesdayDefRdBttn.setSelected(true);
        wednesdayDefRdBttn.setText("Default");

        jLabel6.setText("Friday:");

        wednesdayGroup.add(jRadioButton10);
        jRadioButton10.setText("Other");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        fridayGroup.add(fridayDefRdBttn);
        fridayDefRdBttn.setSelected(true);
        fridayDefRdBttn.setText("Default");

        jLabel7.setText("Wednesday:");

        thursdayGroup.add(thursdayDefRdBttn);
        thursdayDefRdBttn.setSelected(true);
        thursdayDefRdBttn.setText("Default");

        thursdayGroup.add(jRadioButton13);
        jRadioButton13.setText("Other");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        jLabel8.setText("Thursday:");

        fridayGroup.add(jRadioButton14);
        jRadioButton14.setText("Other");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
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
                        .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(wednesdayDefRdBttn)
                                            .addComponent(jRadioButton10))
                                        .addGap(18, 18, 18)
                                        .addComponent(supTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mondayDefRdBttn)
                                            .addComponent(mondayOtherRdBttn))
                                        .addGap(18, 18, 18)
                                        .addComponent(supMondayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tuesdayDefRdBttn)
                                            .addComponent(jRadioButton7))
                                        .addGap(18, 18, 18)
                                        .addComponent(supTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(thursdayDefRdBttn)
                                            .addComponent(jRadioButton13))
                                        .addGap(18, 18, 18)
                                        .addComponent(supTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fridayDefRdBttn)
                                            .addComponent(jRadioButton14))
                                        .addGap(18, 18, 18)
                                        .addComponent(supTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mondayDefRdBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(supMondayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mondayOtherRdBttn)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(thursdayDefRdBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(supTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton13)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel8)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tuesdayDefRdBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(supTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fridayDefRdBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(supTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton14)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wednesdayDefRdBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(supTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void loadData()
    {
        LocalDate myDate = null;
        LocalDate tempDate = LocalDate.now();
        try
        {
            myDate = tempDate.with(next(DayOfWeek.SATURDAY));
            dateCombo.addItem(comFunc.formatDate(myDate));
            dateCombo.addItem(comFunc.plusDaysFormated(myDate, 7));
            dateCombo.addItem(comFunc.plusDaysFormated(myDate, 14));
            dateCombo.addItem(comFunc.plusDaysFormated(myDate, 21));
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        
    }
    private void mondayOtherRdBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mondayOtherRdBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mondayOtherRdBttnActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        Sheet guardSheet = comFunc.loadTemplate("roster");
        LocalDate outDate = (comFunc.dateSwitch((String)dateCombo.getSelectedItem())).toLocalDate();
        System.out.println("Day: " + outDate.getDayOfWeek());
        
        java.sql.Date myDate = comFunc.dateSwitch((String)dateCombo.getSelectedItem());
        java.sql.Date startDate = myDate;
        // write saturday values
        guardSheet = writeSaturday(myDate, guardSheet);
        LocalDate tempDate = myDate.toLocalDate().plusDays(1); //get sunday date
        myDate = java.sql.Date.valueOf(tempDate);
        // write sunday values
        guardSheet = writeSunday(myDate, guardSheet);
        tempDate = myDate.toLocalDate().plusDays(1); //get monday date
        myDate = java.sql.Date.valueOf(tempDate);
        // write monday values
        guardSheet = writeMonday(myDate, guardSheet);
        
        
        if (mondayOtherRdBttn.isSelected())
        {
            guardSheet.getCellAt("AC").setValue(supMondayTextField.getText());
        }
        else
        {
            guardSheet.getCellAt("AC").setValue(defaultSUP);
        }
        String fileName = "roster" + startDate;
        comFunc.saveFile(guardSheet, fileName);
    }//GEN-LAST:event_exportButtonActionPerformed

    private Sheet writeSaturday(java.sql.Date inDate, Sheet inSheet)
    {
        final String saturdayDay = "H1";
        final String saturdayMonth = "J1";
        final String saturdayYear = "L1";
        final String saturdaySPAopen = "B6";
        final String saturdaySPAclose = "C6";
        final String saturdayOpen1130 = "D6";
        final String saturday830100 = "E6";
        final String saturday100500 = "K6";
        final String saturday200close = "L6";
        final String saturdayOncallMorning = "F6";
        final String saturdayOncallAfternoon = "M6";
        String command = "select * from lifeguard where shift_date = \'" + inDate+ "\'";
        System.out.println(command);
        ResultSet result = null;
        try {
            result = connection.lookup(command);
            while (result.next()) {
                lifeguards tempGuard = new lifeguards(result.getInt("ID"), result.getDate("shift_Date"), result.getTime("start_time"), result.getTime("end_time"), result.getString("location"), result.getString("staff1"), result.getString("onCall"));
                guardShifts.add(tempGuard);
            }
            int count = 0;
            while (count <= guardShifts.size())
            {
                System.out.println("count: " + count + " guardShifts: " + guardShifts.size());
                lifeguards tempGuard = guardShifts.get(count);
                if (tempGuard.getStartTime() == satSunOpenTime && tempGuard.getEndTime() == twoPm) // open to 2pm
                {
                    inSheet.getCellAt(saturdaySPAopen).setValue(tempGuard.getStaff1());
                    inSheet.getCellAt(saturdayOncallMorning).setValue(tempGuard.getOnCall());
                    
                    //Add Saturday date
                    LocalDate saturdayDate = tempGuard.getShiftDate().toLocalDate();
                    System.out.println("Saturday Day");
                    inSheet.getCellAt(saturdayDay).setValue(saturdayDate.getDayOfMonth());
                    System.out.println("Saturday Month");
                    inSheet.getCellAt(saturdayMonth).setValue(saturdayDate.getMonthValue());
                    System.out.println("Saturday Year");
                    inSheet.getCellAt(saturdayYear).setValue(saturdayDate.getYear());
                }
                else if (tempGuard.getStartTime() == onePm && tempGuard.getEndTime() == satSunClose) //1pm to close
                {
                    inSheet.getCellAt(saturdaySPAclose).setValue(tempGuard.getStaff1());
                    inSheet.getCellAt(saturdayOncallAfternoon).setValue(tempGuard.getStaff1());
                }
                else if (tempGuard.getStartTime() == satSunOpenTime && tempGuard.getEndTime() == elevenThirty) // open to 11:30 am
                {
                    inSheet.getCellAt(saturdayOpen1130).setValue(tempGuard.getStaff1());
                }
                else if (tempGuard.getStartTime() == eightThirty && tempGuard.getEndTime() == onePm) // 8:30 am to 1 pm
                {
                    inSheet.getCellAt(saturday830100).setValue(tempGuard.getStaff1());
                }
                else if (tempGuard.getStartTime() == eightThirty && tempGuard.getEndTime() == onePm) // 8:30 am to 1 pm
                {
                    inSheet.getCellAt(saturday830100).setValue(tempGuard.getStaff1());
                }
                else if (tempGuard.getStartTime() == onePm && tempGuard.getEndTime() == fivePm) // 1pm to 5 pm
                {
                    inSheet.getCellAt(saturday100500).setValue(tempGuard.getStaff1());
                }
                else if (tempGuard.getStartTime() == twoPm && tempGuard.getEndTime() == satSunClose) // 2 pm to close
                {
                    inSheet.getCellAt(saturday200close).setValue(tempGuard.getStaff1());
                }
                count ++;
            }
        }
        catch (SQLException ex)
        {
            System.out.println(ex);
        }
        return inSheet;
    }
    
    private Sheet writeSunday(java.sql.Date inDate, Sheet inSheet)
    {
        final String sundayDay = "U1";
        final String sundayMonth = "W1";
        final String sundayYear = "Y1";
        final String sundaySPAopen1pm = "O6";
        final String sundaySPA1030Close = "P6";
        final String sundayOpen1030 = "Q6";
        final String sundayMorningOncall = "S6";
        final String sunday1pmClose = "X6";
        final String sundayAfternoonOncall = "Z6";
        
        String command = "select * from lifeguard where shift_date = " + inDate;
        ResultSet result = null;
        try {
            result = connection.lookup(command);
            while (result.next()) {
                lifeguards tempGuard = new lifeguards(result.getInt("ID"), result.getDate("shift_Date"), result.getTime("start_time"), result.getTime("end_time"), result.getString("location"), result.getString("staff1"), result.getString("onCall"));
                guardShifts.add(tempGuard);
            }
            int count = 0;
            while (count <= guardShifts.size())
            {
                lifeguards tempGuard = guardShifts.get(count);
                if (tempGuard.getStartTime() == satSunOpenTime && tempGuard.getEndTime() == onePm) // open to 1pm
                {
                    inSheet.getCellAt(sundaySPAopen1pm).setValue(tempGuard.getStaff1());
                    inSheet.getCellAt(sundayMorningOncall).setValue(tempGuard.getOnCall());
                    
                    //Add Sunday date
                    LocalDate saturdayDate = tempGuard.getShiftDate().toLocalDate();
                    inSheet.getCellAt(sundayDay).setValue(saturdayDate.getDayOfMonth());
                    inSheet.getCellAt(sundayMonth).setValue(saturdayDate.getMonthValue());
                    inSheet.getCellAt(sundayYear).setValue(saturdayDate.getYear());
                }
                else if (tempGuard.getStartTime() == tenThirty && tempGuard.getEndTime() == satSunClose) //10:30am to close
                {
                    inSheet.getCellAt(sundaySPA1030Close).setValue(tempGuard.getStaff1());
                    inSheet.getCellAt(sundayAfternoonOncall).setValue(tempGuard.getStaff1());
                }
                else if (tempGuard.getStartTime() == satSunOpenTime && tempGuard.getEndTime() == tenThirty) // open to 10:30 am
                {
                    inSheet.getCellAt(sundayOpen1030).setValue(tempGuard.getStaff1());
                }
                else if (tempGuard.getStartTime() == onePm && tempGuard.getEndTime() == satSunClose) // 1pm to close
                {
                    inSheet.getCellAt(sunday1pmClose).setValue(tempGuard.getStaff1());
                }
                count ++;
            }
        }
        catch (SQLException ex)
        {
            System.out.println(ex);
        }
        return inSheet;
    }
    
    private Sheet writeMonday(java.sql.Date inDate, Sheet inSheet)
    {
        final String mondayDay = "AH1";
        final String mondayMonth = "AJ1";
        final String mondayYear = "AL1";
        final String mondaySPAopen1pm = "AD6";
        final String mondaySPA1230Close = "AE6";
        final String mondayOpen1230 = "AF6";
        final String mondayMorningOncall = "AH6";
        final String monday1230pm4pmClose = "AJ6";
        final String mondayAfternoonOncall = "AM6";
        final String monday3pm7pm = "AK6";
        
        String command = "select * from lifeguard where shift_date = " + inDate;
        ResultSet result = null;
        try {
            result = connection.lookup(command);
            while (result.next()) {
                lifeguards tempGuard = new lifeguards(result.getInt("ID"), result.getDate("shift_Date"), result.getTime("start_time"), result.getTime("end_time"), result.getString("location"), result.getString("staff1"), result.getString("onCall"));
                guardShifts.add(tempGuard);
            }
            int count = 0;
            while (count <= guardShifts.size())
            {
                lifeguards tempGuard = guardShifts.get(count);
                if (tempGuard.getStartTime() == openTime && tempGuard.getEndTime() == onePm) // open to 1pm
                {
                    inSheet.getCellAt(mondaySPAopen1pm).setValue(tempGuard.getStaff1());
                    inSheet.getCellAt(mondayMorningOncall).setValue(tempGuard.getOnCall());
                    
                    //Add Monday date
                    LocalDate saturdayDate = tempGuard.getShiftDate().toLocalDate();
                    inSheet.getCellAt(mondayDay).setValue(saturdayDate.getDayOfMonth());
                    inSheet.getCellAt(mondayMonth).setValue(saturdayDate.getMonthValue());
                    inSheet.getCellAt(mondayYear).setValue(saturdayDate.getYear());
                }
                else if (tempGuard.getStartTime() == twelveThirty && tempGuard.getEndTime() == monThursClose) //12:30 to close
                {
                    inSheet.getCellAt(mondaySPA1230Close).setValue(tempGuard.getStaff1());
                    inSheet.getCellAt(mondayAfternoonOncall).setValue(tempGuard.getStaff1());
                }
                else if (tempGuard.getStartTime() == openTime && tempGuard.getEndTime() == twelveThirty) // open to 12:30 
                {
                    inSheet.getCellAt(mondayOpen1230).setValue(tempGuard.getStaff1());
                }
                else if (tempGuard.getStartTime() == twelveThirty && tempGuard.getEndTime() == fourPm) // 12:30 to 4
                {
                    inSheet.getCellAt(monday1230pm4pmClose).setValue(tempGuard.getStaff1());
                }
                else if (tempGuard.getStartTime() == threePm && tempGuard.getEndTime() == sevenPm) // 3pm to 7
                {
                    inSheet.getCellAt(monday3pm7pm).setValue(tempGuard.getStaff1());
                }
                else if (tempGuard.getStartTime() == threePm && tempGuard.getEndTime() == monThursClose) // 4pm to close
                {
                    inSheet.getCellAt(monday3pm7pm).setValue(tempGuard.getStaff1());
                }
                count ++;
            }
        }
        catch (SQLException ex)
        {
            System.out.println(ex);
        }
        return inSheet;
    }
    
    private void dateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateComboActionPerformed

    private void dateComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dateComboItemStateChanged

    }//GEN-LAST:event_dateComboItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dateCombo;
    private javax.swing.JButton exportButton;
    private javax.swing.JRadioButton fridayDefRdBttn;
    private javax.swing.ButtonGroup fridayGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton mondayDefRdBttn;
    private javax.swing.ButtonGroup mondayGroup;
    private javax.swing.JRadioButton mondayOtherRdBttn;
    private javax.swing.JTextField supMondayTextField;
    private javax.swing.JTextField supTextField3;
    private javax.swing.JTextField supTextField4;
    private javax.swing.JTextField supTextField5;
    private javax.swing.JTextField supTextField6;
    private javax.swing.JRadioButton thursdayDefRdBttn;
    private javax.swing.ButtonGroup thursdayGroup;
    private javax.swing.JRadioButton tuesdayDefRdBttn;
    private javax.swing.ButtonGroup tuesdayGroup;
    private javax.swing.JRadioButton wednesdayDefRdBttn;
    private javax.swing.ButtonGroup wednesdayGroup;
    // End of variables declaration//GEN-END:variables
}
