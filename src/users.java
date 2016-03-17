/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    public users(int inID, String inUsername, String inFirstName, String inLastName, String inDepartment1, String inDepartment2, String inDepartment3, boolean inSupervisor, String inPassword) 
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
}
