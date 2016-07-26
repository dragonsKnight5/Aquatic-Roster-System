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
    private String mondayNote;
    private String tuesday;
    private String tuesdayNote;
    private String wednesday;
    private String wednesdayNote;
    private String thursday;
    private String thursdayNote;
    private String friday;
    private String fridayNote;
    private String saturday;
    private String saturdayNote;
    private String sunday;
    private String sundayNote;
    private String department;
    private String location;
    private java.sql.Date date;
    final private commonFunctions myCommonFunctions = new commonFunctions();
    
    public availability (int inID, String inUsername, String inMonday, String inMondayNote, String inTuesday, String inTuesdayNote, String inWednesday, String inWednesdayNote, String inThursday, String inThursdayNote, String inFriday, String inFridayNote, String inSaturday, String inSaturdayNote, String inSunday, String inSundayNote, String inDepartment, String inLocation, java.sql.Date inDate)
    {
        ID = inID;
        username = inUsername;
        monday = inMonday;
        mondayNote = inMondayNote;
        tuesday = inTuesday;
        tuesdayNote = inTuesdayNote;
        wednesday = inWednesday;
        wednesdayNote = inWednesdayNote;
        thursday = inThursday;
        thursdayNote = inThursdayNote;
        friday = inFriday;
        fridayNote = inFridayNote;
        saturday = inSaturday;
        saturdayNote = inSaturdayNote;
        sunday = inSunday;
        sundayNote = inSundayNote;
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
    
    public String getMondayNote()
    {
        return mondayNote;
    }
    
    public String getTuesday()
    {
        return tuesday;
    }
    
    public String getTuesdayNote()
    {
        return tuesdayNote;
    }
    
    public String getWednesday()
    {
        return wednesday;
    }
    
    public String getWednesdayNote()
    {
        return wednesdayNote;
    }
    
    public String getThursday()
    {
        return thursday;
    }
    
    public String getThursdayNote()
    {
        return thursdayNote;
    }
    
    public String getFriday()
    {
        return friday;
    }
    
    public String getFridayNote()
    {
        return fridayNote;
    }
    
    public String getSaturday()
    {
        return saturday;
    }
    
    public String getSaturdayNote()
    {
        return saturdayNote;
    }
    
    public String getSunday()
    {
        return sunday;
    }
    
    public String getSundayNote()
    {
        return sundayNote;
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
