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
public class lts {
 
    private int ID;
    private String staff;
    private LocalTime startTime;
    private LocalTime endTime;
    private java.sql.Date startDate;
    private java.sql.Date endDate;
    private String day;
    private String location;

    public lts(int inID, String inStaff, String inDay, String inLocation,java.sql.Time inStartTime, java.sql.Time inEndTime, java.sql.Date inStartDate, java.sql.Date inEndDate)
    {
        ID = inID;
        staff = inStaff;
        day = inDay;
        startTime = timeConvert(inStartTime);
        endTime = timeConvert(inEndTime);
        startDate = inStartDate;
        endDate = inEndDate;
        location = inLocation;
    }
    
    public String getStartTimeString()
    {
        String stringStartTime = startTime.toString();
        return stringStartTime;
    }
    
    public String getStartDateString()
    {
        String date = startDate.toString();
        return date;
    }
    
    public String getEndDateString()
    {
        String date = endDate.toString();
        return date;
    }
    
    public String getEndTimeString()
    {
        String stringEndTime = endTime.toString();
        return stringEndTime;
    }
    
    public String toString()
    {
        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String toReturn = (staff.concat(", Shift Day: ")).concat(day);
        return toReturn;
    }
    
    private LocalTime timeConvert(java.sql.Time inTime)
    {
        LocalTime convertTime = inTime.toLocalTime();
        return convertTime;
    }
    
    public int getID()
    {
        return ID;
    }
    
    public String getStaff()
    {
        return staff;
    }
    
    public String getDay()
    {
        return day;
    }
    
    public LocalTime getStartTime()
    {
        return startTime;
    }
    
    public LocalTime getEndTime()
    {
        return endTime;
    }
    
    public java.sql.Date getStartDate()
    {
        return startDate;
    }
    
    public java.sql.Date getEndDate()
    {
        return endDate;
    }
    
    public String getLocation()
    {
        return location;
    }
}
