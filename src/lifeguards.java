/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.SimpleDateFormat;
import java.time.LocalTime;
/**
 *
 * @author james
 */
public class lifeguards {
 
   private int ID;
    private java.sql.Date shiftDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private String staff1;
    private String staff2;
    private String staff3;
    
    public lifeguards (int inID, java.sql.Date inDate, java.sql.Time inStartTime, java.sql.Time inEndTime, String inStaff1, String inStaff2, String inStaff3)
    {
        ID = inID;
        shiftDate = inDate;
        startTime = timeConvert(inStartTime);
        endTime = timeConvert(inEndTime);
        staff1 = inStaff1;
        staff2 = inStaff2;
        staff3 = inStaff3;
        
    }
    
    public String toString()
    {
        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String formatedDate = myDateFormat.format(shiftDate);
        return formatedDate;
    }
    
    private LocalTime timeConvert(java.sql.Time inTime)
    {
        LocalTime convertTime = inTime.toLocalTime();
        return convertTime;
    }
    
    public Integer getID()
    {
        return ID;
    }
    
    public java.sql.Date getShiftDate()
    {
        return shiftDate;
    }
    
    public LocalTime getStartTime()
    {
        return startTime;
    }
    
    public String getStartTimeString()
    {
                String time = startTime.toString();
                return time;
    }
    
    public LocalTime getEndTime()
    {
        return endTime;
    }
    
    public String getEndTimeString()
    {
        String time = endTime.toString();
        return time;
    }
    
    public String getStaff1()
    {
        return staff1;
    }
    
    public String getStaff2()
    {
        return staff2;
    }
    
    public String getStaff3()
    {
        return staff3;
    }
}
