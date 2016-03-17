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
public class cover {
    private int ID;
    private java.sql.Date coverDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private String staff;
    private String coverFor;
    
    public cover (int inID, java.sql.Date inCoverDate, java.sql.Time inStartTime, java.sql.Time inEndTime, String inStaff, String inCoverFor)
    {
        ID = inID;
        coverDate = inCoverDate;
        startTime = timeConvert(inStartTime);
        endTime = timeConvert(inEndTime);
        staff = inStaff;
        coverFor = inCoverFor;
    }
    
    private LocalTime timeConvert(java.sql.Time inTime)
    {
        LocalTime convertTime = inTime.toLocalTime();
        return convertTime;
    }
    
    public int getID ()
    {
        return ID;
    }
    
    public java.sql.Date getDate()
    {
        return coverDate;
    }
    
    public LocalTime getStartTime()
    {
        return startTime;
    }
    
    public LocalTime getEndTime()
    {
        return endTime;
    }
    
    public String getStaff()
    {
        return staff;
    }
    
    public String getCoverFor()
    {
        return coverFor;
    }
    
    public String toString()
    {
        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String formatedDate = myDateFormat.format(coverDate);
        String coverReturned = formatedDate;
        coverReturned = coverReturned.concat(", " + coverFor);
        return coverReturned;
    }
}
