
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import static java.time.temporal.TemporalAdjusters.next;
import org.jopendocument.dom.spreadsheet.Sheet;
import org.jopendocument.dom.spreadsheet.*;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

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
        return myFormat.format(date);
    }
    
    public String formatDate(java.sql.Date date)
    {
        return myDateFormat.format(date);
    }
    
/**    public java.sql.Date formatDateOnly (java.sql.Date inDate)
    {
        return myDateFormat.;
    }**/
    
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
            System.out.println("date switch: " + selectedDate.toString());
        }
        catch (ParseException ex)
        {
            System.out.println(ex);
        }
        return selectedDate;
    }
    
    public java.sql.Date day2Date(String date, String day)
    {
        System.out.println("Date: " + date + " Day: " + day);
        LocalDate tempDate = dateSwitch(date).toLocalDate();
        LocalDate manipDate = null;
        if (day.equalsIgnoreCase("monday"))
        {
            manipDate = tempDate.with(next(DayOfWeek.MONDAY));
            System.out.println("Monday Date: " + manipDate);
        }
        else if (day.equalsIgnoreCase("tuesday"))
        {
            manipDate = tempDate.with(next(DayOfWeek.TUESDAY));
            System.out.println("Tuesday Date: " + manipDate);
        }
        else if (day.equalsIgnoreCase("wednesday"))
        {
            manipDate = tempDate.with(next(DayOfWeek.WEDNESDAY));
            System.out.println("Wednesday Date: " + manipDate);
        }
        else if (day.equalsIgnoreCase("thursday"))
        {
            manipDate = tempDate.with(next(DayOfWeek.THURSDAY));
            System.out.println("Thursday Date: " + manipDate);
        }
        else if (day.equalsIgnoreCase("friday"))
        {
            manipDate = tempDate.with(next(DayOfWeek.FRIDAY));
            System.out.println("Friday Date: " + manipDate);
        }
        else if (day.equalsIgnoreCase("saturday"))
        {
            manipDate = tempDate.with(next(DayOfWeek.SATURDAY));
            System.out.println("Saturday Date: " + manipDate);
        }
        else if (day.equalsIgnoreCase("sunday"))
        {
            manipDate = tempDate.with(next(DayOfWeek.SUNDAY));
            System.out.println("Sunday Date: " + manipDate);
        }
        java.sql.Date returnDate = Date.valueOf(manipDate);
        System.out.println("Return Date: " + manipDate.toString());
        
        return returnDate;
    }
    
    public Sheet loadTemplate(String template)
    {
        Sheet returned = null;
        try
        {
            File loadFile = null;
            if (template.equalsIgnoreCase("roster"))
            {
               loadFile = new File ("rosterTemplate.ods");
            }
            else if (template.equalsIgnoreCase("absent"))
            {
               loadFile = new File ("absentTemplate.ods"); 
            }
           returned = SpreadSheet.createFromFile(loadFile).getSheet(0);
        }
        catch (IOException ex)
        {
            System.out.println(ex);
        }
        System.out.println("File Loaded");
        return returned;
    }
    
    public void saveFile (Sheet saveFile, String fileName)
    {
        try
        {
            String path = setPath();
            File outputFile = new File(path.concat(fileName).concat(".ods"));
            saveFile.getSpreadSheet().saveAs(outputFile);
            JOptionPane.showMessageDialog(null, "File Save Complete");
        }
        catch (IOException ex)
        {
            System.out.println(ex);
        }
    }
    
    private String setPath()
    {
        File defaultPath = new File(System.getProperty("user.home"));
        System.out.println("default path: " + defaultPath);
        JFileChooser folderSelection = new JFileChooser();
        
        folderSelection.setCurrentDirectory(defaultPath);
        folderSelection.setDialogTitle("Save Location");
        folderSelection.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        folderSelection.setAcceptAllFileFilterUsed(false);
        String path = null;
        
        String seperator = System.getProperty("file.separator");

        if (folderSelection.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            path = folderSelection.getSelectedFile().getPath();
        }
        else
        {
            System.out.println("No Selection ");
        }
        path = path.concat(seperator);
        return path;
    }
    
    public String timeConvert (LocalTime time)
    {
        java.sql.Time tempDate = java.sql.Time.valueOf(time);
        SimpleDateFormat timeConvertFormat = new  SimpleDateFormat("hh:mm aa");
        
        return timeConvertFormat.format(tempDate);
    }
}
