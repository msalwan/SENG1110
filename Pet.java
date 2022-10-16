    // Authors: Mark Salwan (c3324529)
// Description: This program is a Vet Clinic database which records up to two Doctors and four Pets.
//     Details: This is the lowest subclass which implements the Pets information of name, type, size,
//              weight, age and assigned doctor.


import java.util.*;

public class Pet 
{
    private String petName;     // the name of the pet. 
    private String petType;     // the type of the pet. It can be only “cat” or “dog”.
    private String petSize;     // the size of the pet. It can be only “small”, “medium” or “large”.
    private double petWeight;   // the weight of the pet.
    private int petAge;         // the age of the pet.
    private String doctor;      // the doctor of the pet.
    
    
    
    
    public Pet()
    {
        petType = "notype";
        petSize = "nosize";
        petName = "noname";
        petWeight = 0;
        petAge = 0;
        doctor = "none";
    }
        
    public Pet(String newPetType, String newPetSize, String newPetName, double newPetWeight, int newPetAge, String newPetDoctor)
    {
        petType = newPetType;
        petSize = newPetSize;
        petName = newPetName;
        petWeight = newPetWeight;
        petAge = newPetAge;
        doctor = newPetDoctor;
    }    
    

    
    //  Sets the Pets type from the keyboard input
    public void setPetType(String newPetType)
    {
         petType = newPetType;
    }
    // Get the Pets type and displays it to console
    public String getPetType()
    {
        return petType;
    }
    
    
    //  Sets the Pets size from the keyboard input
    public void setPetSize(String newPetSize)
    {
         petSize = newPetSize;
    }
    // Get the Pets size and displays it to console
    public String getPetSize()
    {
        return petSize;
    }
    
    
      // Sets the Pets name from the keyboard input
    public void setPetName(String newPetName)
    {
        petName = newPetName.toLowerCase();
    }
     // Get the Pets name and displays it to console
    public String getPetName()
    {
      return petName;
    }
    
    
    // Sets the Pets weight from the keyboard input
    public void setPetWeight(double newPetWeight)
    {
        petWeight = newPetWeight;
    }
     // Get the Pets weight and displays it to console
    public double getPetWeight()
    {
      return petWeight;
    }
    
    
    // Sets the Pets age from the keyboard input
    public void setPetAge(int newPetAge)
    {
        petAge = newPetAge;
    }
     // Get the Pets age and displays it to console
    public int getPetAge()
    {
      return petAge;
    }
    
    // Sets the Pets Doctor from the keyboard input and available doctors
    public void setPetDoctor(String newPetDoctor)
    {
        doctor = newPetDoctor;
    }
     // Get the Pets age and displays it to console
    public String getPetDoctor()
    {
      return doctor;
    }
}
