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

import java.text.SimpleDateFormat;
import java.time.LocalTime;
/**
 *
 * @author james
 */
public class isc {
 
    private int ID;
    private java.sql.Date shiftDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private String location;
    private String staff1;
    private String staff2;
    private String staff3;
    private String staff4;
    private String onCall;
    
    public isc (int inID, java.sql.Date inDate, java.sql.Time inStartTime, java.sql.Time inEndTime, String inLocation, String inStaff1, String inStaff2, String inStaff3, String inStaff4, String inOnCall)
    {
        ID = inID;
        shiftDate = inDate;
        startTime = timeConvert(inStartTime);
        endTime = timeConvert(inEndTime);
        location = inLocation;
        staff1 = inStaff1;
        staff2 = inStaff2;
        staff3 = inStaff3;
        staff4 = inStaff4;
        onCall = inOnCall;
    }
    
    public String toString()
    {
        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String formatedDate = myDateFormat.format(shiftDate);
        return formatedDate.concat(", " + timeConvert(startTime) + " - " + timeConvert(endTime));
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
                return startTime.toString();
    }
    
    public LocalTime getEndTime()
    {
        return endTime;
    }
    
    public String getEndTimeString()
    {
        return endTime.toString();
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

    public String getStaff4()
    {
        return staff4;
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public String getOnCall()
    {
        return onCall;
    }
    
    public String timeConvert (LocalTime time)
    {
        java.sql.Time tempDate = java.sql.Time.valueOf(time);
        SimpleDateFormat timeConvertFormat = new  SimpleDateFormat("hh:mm aa");
        
        return timeConvertFormat.format(tempDate);
    }
}
