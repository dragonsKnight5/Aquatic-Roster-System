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
