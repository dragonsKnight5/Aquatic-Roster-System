
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalAdjusters.*;

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
import static java.time.temporal.TemporalAdjusters.next;
//import java.time.LocalTime;

/**
 *
 * @author james
 */
public class commonFunctions {
    private DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/YYYY");
    private SimpleDateFormat myDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    public String formatDate(LocalDate date)
    {
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String dateString = myFormat.format(date);
        return dateString;
    }
    
    public String plusDaysFormated(LocalDate date, int days)
    {
        date = date.plusDays(days);
        return formatDate(date);
    }
    
    public String minusDaysFormated(LocalDate date, int days)
    {
        date = date.minusDays(days);
        return formatDate(date);
    }
    
    public java.sql.Date dateSwitch(String date)
    {
        java.sql.Date selectedDate = null;
        try
        {
            java.util.Date myDate = myDateFormat.parse(date);
            selectedDate = new java.sql.Date(myDate.getTime());
        }
        catch (ParseException ex)
        {
            System.out.println(ex);
        }
        return selectedDate;
    }
    
    public java.sql.Date day2Date(String date, String day)
    {
        LocalDate tempDate = dateSwitch(date).toLocalDate();
        LocalDate manipDate = null;
        if (day.equalsIgnoreCase("monday"))
        {
            manipDate = tempDate.with(next(DayOfWeek.MONDAY));
        }
        else if (day.equalsIgnoreCase("tuesday"))
        {
            manipDate = tempDate.with(next(DayOfWeek.TUESDAY));
        }
        else if (day.equalsIgnoreCase("wednesday"))
        {
            manipDate = tempDate.with(next(DayOfWeek.WEDNESDAY));
        }
        else if (day.equalsIgnoreCase("thursday"))
        {
            manipDate = tempDate.with(next(DayOfWeek.THURSDAY));
        }
        else if (day.equalsIgnoreCase("friday"))
        {
            manipDate = tempDate.with(next(DayOfWeek.FRIDAY));
        }
        else if (day.equalsIgnoreCase("saturday"))
        {
            manipDate = tempDate.with(next(DayOfWeek.SATURDAY));
        }
        else if (day.equalsIgnoreCase("sunday"))
        {
            manipDate = tempDate.with(next(DayOfWeek.SUNDAY));
        }
        
        
        return dateSwitch(manipDate.toString());
    }
    
}
