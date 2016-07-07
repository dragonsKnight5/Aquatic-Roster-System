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

/**
 *
 * @author james
 */
public class users {

    final private int ID;
    private String username;
    private String firstName;
    private String lastName;
    private String department1;
    private String department2;
    private String department3;
    private boolean supervisor;
    private String password;
    private String contactNumber;

    public users(int inID, String inUsername, String inFirstName, String inLastName, String inDepartment1, String inDepartment2, String inDepartment3, boolean inSupervisor, String inPassword, String inContactNumber) 
    {
        ID = inID;
        username = inUsername;
        firstName = inFirstName;
        lastName = inLastName;
        department1 = inDepartment1;
        department2 = inDepartment2;
        department3 = inDepartment3;
        supervisor = inSupervisor;
        password = inPassword;
        contactNumber = inContactNumber;
    }
    
    public String toString()
    {
        String outString = firstName + " " + lastName;
        return outString;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getDepartment1()
    {
        return department1;
    }
    
    public String getDepartment2()
    {
        return department2;
    }
    
    public String getDepartment3()
    {
        return department3;
    }
    
    public Boolean getSupervisor()
    {
        return supervisor;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public int getID()
    {
        return ID;
    }
    public String getContactNumber()
    {
        return contactNumber;
    }
}
