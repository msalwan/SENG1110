    // Authors: Mark Salwan 
// Description: This program is a Vet Clinic database which records up to two Doctors and four Pets.
//     Details: This is a subclass which implements the Doctors information of name and specialisation.
//              It extends the Pets subclass.


import java.util.*;

public class Doctor extends Pet 
{
   
    private String name;             // Doctor name
    private String specialisation;   // Doctor specialisation, either dog or cat

    
    
    public Doctor()
    {
        name = "noname";
        specialisation = "none";
    }
        
    public Doctor(String newName, String newSpecialisation)
    {
        name = newName;
        specialisation = newSpecialisation;
    }    
    
    
        // Sets the Doctors name from the keyboard input
    public void setName(String newName)
    {
        //this.
        //newName = newName.replaceAll("\\s+", " ");
        name = newName.toLowerCase();
    }
    // Get the Doctors name and displays it to console
    public String getName()
    {
        return name;
    }
    
    
    // Sets the Doctors specialisation from the keyboard input
    public void setSpecialisation(String newSpecialisation)
    {
        //this.
        specialisation = newSpecialisation;
    }
    // Get the Doctors specialisation and displays it to console
    public String getSpecialisation()
    {
        return specialisation;
    }
    
    
}

    
    
    


    
