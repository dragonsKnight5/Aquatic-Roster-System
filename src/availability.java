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
import java.time.LocalDate;
/**
 *
 * @author james
 */
public class availability 
{
    private int ID;
    private String username;
    private String monday;
    private String tuesday;
    private String wednesday;
    private String thursday;
    private String friday;
    private String saturday;
    private String sunday;
    private String department;
    private String location;
    private java.sql.Date date;
    final private commonFunctions myCommonFunctions = new commonFunctions();
    
    public availability (int inID, String inUsername, String inMonday, String inTuesday, String inWednesday, String inThursday, String inFriday, String inSaturday, String inSunday, String inDepartment, String inLocation, java.sql.Date inDate)
    {
        ID = inID;
        username = inUsername;
        monday = inMonday;
        tuesday = inTuesday;
        wednesday = inWednesday;
        thursday = inThursday;
        friday = inFriday;
        saturday = inSaturday;
        sunday = inSunday;
        department = inDepartment;
        location = inLocation;
        date = inDate;
    }
    
    public int getID()
    {
        return ID;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getMonday()
    {
        return monday;
    }
    
    public String getTuesday()
    {
        return tuesday;
    }
    
    public String getWednesday()
    {
        return wednesday;
    }
    
    public String getThursday()
    {
        return thursday;
    }
    
    public String getFriday()
    {
        return friday;
    }
    
    public String getSaturday()
    {
        return saturday;
    }
    
    public String getSunday()
    {
        return sunday;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public java.sql.Date getWeekStarting()
    {
        return date;
    }
    
    public String toString()
    {
        LocalDate tempDate = date.toLocalDate();
        return username + " " + myCommonFunctions.formatDate(tempDate);
    }
}
