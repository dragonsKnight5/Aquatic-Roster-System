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

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author james
 */
public class dbConnection
{
    private Connection conn;
    private String sql;
    private PreparedStatement ps1 = null;
    String table = null;
    Boolean isConnected = false;
    
    public dbConnection ()
    {
        
    }
    
    public void newConnect(String username, String password, String address)
    {
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://"+address+"/staff?user="+username+"&password="+password);
           isConnected = true;
        }
        catch (SQLException ex)
        {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Connection Failed,\nEither no database is available or login credentials are incorrect");
            isConnected = false;
        }
    }
    
    public Boolean connected()
    {
        return isConnected;
    }
    
     public void close()
    {
        try
        {
            conn.close();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage() + ex.getSQLState() + ex.getErrorCode());
        }
    }
     
     public Integer addLTSshift (String command)
     {
         Integer status = null;
         status = addUser(command);
         return status;
     }
     
          public Integer addGuardShift (String command)
     {
         Integer status = null;
         status = addUser(command);
         return status;
     }
     
     public int updateShift (String command)
     {
         int status = addUser(command);
         return status;
     }
     
     public int addCover (String command)
     {
         int status = addUser(command);
         return status;
     }
          
     public int addUser(String addCommand)
     {
         int count = 0;
         
         try
         {
             ps1 = conn.prepareStatement(addCommand);
             count = ps1.executeUpdate();
         }
         catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, addCommand + ex.getMessage() + ex.getSQLState() + ex.getErrorCode());
        }
        return count;
     }
     
     public Integer editUser(String command)
     {
         int count = 0;
         
         try
         {
             ps1 = conn.prepareStatement(command);
             count = ps1.executeUpdate();
         }
         catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, command + ex.getMessage() + ex.getSQLState() + ex.getErrorCode());
        }
        return count;
     }
     
     public int removeGuardShift(String command)
     {
         int status;
         status = removeUser(command);
         return status;
     }
     
     public Integer removeUser(String command)
     {
         int count = 0;
         
         try
         {
             ps1 = conn.prepareStatement(command);
             count = ps1.executeUpdate();
         }
         catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, command + ex.getMessage() + ex.getSQLState() + ex.getErrorCode());
        }
        return count;
     }
     
     public ResultSet lookup(String command)
     {
         ResultSet lookup = null;
         
         try
         {
             ps1 = conn.prepareStatement(command);
             lookup = ps1.executeQuery();
         }
         catch (SQLException ex)
         {
             JOptionPane.showMessageDialog(null, ex.getMessage() + ex.getSQLState() + ex.getErrorCode());
         }
         return lookup;
     }
     
     public ResultSet getUsers()
     {
         ResultSet users = null;
         sql = "select username from users";
         try
         {
             ps1 = conn.prepareStatement(sql);
             users = ps1.executeQuery();
         }
         catch (SQLException ex)
         {
            JOptionPane.showMessageDialog(null, ex);
         }
         return users;
     }
     
     public ResultSet getLifeguardUsers()
     {
         ResultSet users = null;
         sql = "select username from users where department_1 = \'Lifeguard\' or department_2 = \'Lifeguard\' or department_3 = \'Lifeguard\'";
         try
         {
             ps1 = conn.prepareStatement(sql);
             users = ps1.executeQuery();
         }
         catch (SQLException ex)
         {
            JOptionPane.showMessageDialog(null, ex);
         }
         return users;
     }
     
     public ResultSet getLTSusers()
     {
         ResultSet users = null;
         sql = "select username from users where department_1 = \'LTS\' or department_2 = \'LTS\' or department_3 = \'LTS\'";
         try
         {
             ps1 = conn.prepareStatement(sql);
             users = ps1.executeQuery();
         }
         catch (SQLException ex)
         {
            JOptionPane.showMessageDialog(null, ex);
         }
         return users;
     }
}
