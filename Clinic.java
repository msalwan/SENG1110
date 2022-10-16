    // Authors: Mark Salwan 
// Description: This program is a Vet Clinic database which records up to two Doctors and four Pets.
//     Details: This is the main Class which contains the majority of the methods for the 
//              programs functionality. It extends the Doctor subclass. 

import java.util.*;


public class Clinic extends Doctor 
{

    static Scanner console = new Scanner(System.in);
    static int option;
    private Doctor doctor1=null, doctor2=null;
    private Pet pet1=null, pet2=null, pet3=null, pet4=null;
    

    String newName;            // the name of the doctor.
    String newSpecialisation;  // the doctors specialisation.
    
    String newPetType;         // the type of the pet. It can be only “cat” or “dog”.
    String newPetSize;         // the size of the pet. It can be only “small”, “medium” or “large”.
    String newPetName;         // the name of the pet. 
    double newPetWeight;       // the weight of the pet.
    int newPetAge;             // the age of the pet.
    String newPetDoctor;       // the doctor assigned to the pet
    
    String deleteDoctor;
    String deletePet; 
    
    
    // Main method that controls flow of program
    private void run() 
    {
        chooseOption();
    }
    
    
    // Add a new Clinic
    public static void main(String[] args)
    {
            Clinic clinic = new Clinic();
            clinic.run();
    }
   
    
    // User interface
    public int chooseOption()
    {
        do {
           System.out.println("Welcome to the Vet Clinic Database. Please select an option:");
           System.out.println("-----------------------------------------------------------");
           System.out.println("New Doctor(1)");
           System.out.println("New Pet(2)");
           System.out.println("Delete Doctor(3)");
           System.out.println("Delete Pet(4)");
           System.out.println("List of Doctors(5)");
           System.out.println("List of Pets(6)");
           System.out.println("List of Pets assigned to a specific Doctor(7)");
           System.out.println("Assign a Doctor to a Pet(8)");
           System.out.println("Analyse a Pet(9)");
           System.out.println("Exit(0)");
           System.out.println("-----------------------------------------------------------");
           option = console.nextInt();
           
           switch(option)
            {
            case 1: System.out.println("Option 1 has been selected");
                    addDoctor();
                    break;
            case 2: System.out.println("Option 2 has been selected");
                    addPet();
                    break;
            case 3: System.out.println("Option 3 has been selected");
                    deleteDoctor();
                    break;
            case 4: System.out.println("Option 4 has been selected");
                    deletePet ();
                    break;
            case 5: System.out.println("Option 5 has been selected");
                    doctorList();
                    break;
            case 6: System.out.println("Option 6 has been selected");
                    petList();
                    break;
            case 7: System.out.println("Option 7 has been selected");
                    assignedPets();
                    break;
            case 8: System.out.println("Option 8 has been selected");
                    assignDocToPet();
                    break;
            case 9: System.out.println("Option 9 has been selected");
                    petAnalysis();
                    break;
            case 0: break;
            default: System.out.println("invalid option");
            }
        }
        while(option!=0);
        
        return (option);
    }
    
    
    // Add a new doctor (1)
    public void addDoctor()
    {
        
        if (doctor1==null  || doctor2==null)
        {
            Doctor doctor = new Doctor();
            
            System.out.print("Doctor: ");
            System.out.print("Name: "); 
            newName = console.next();
            
            
            // Check existing name for Doctor 1
            if (doctor1 != null ) 
            {
                while (newName.equals(doctor1.getName()))
                {
                    System.out.print("This name is already in the system, Input a new name: "); 
                    newName = console.next();
                }
            }
            
            // Check existing name for Doctor 2
            if (doctor2 != null) 
            {
                while (newName.equals(doctor2.getName()))
                {
                    System.out.print("This name is already in the system, Input a new name: "); 
                    newName = console.next();
                }
            }
            
            
            
            System.out.print("Specialisation: ");
            newSpecialisation = console.next();
            
            // Check if specialisation is dog or cat
            while ( !(newSpecialisation.equals("dog") || newSpecialisation.equals("cat"))) 
            {
                System.out.print("Input the Specialisation of either dog or cat: ");
                newSpecialisation = console.next();
            }
          
            
            // Allocates inputs to Doctor 1 if its empty
            if (doctor1==null)
            {
                doctor1=doctor;
                doctor1.setName(newName);
                doctor1.setSpecialisation(newSpecialisation);
                System.out.println("Doctor 1 has been entered successfully");
                System.out.println("----------------------------------------");
                System.out.println("----------------------------------------");
                System.out.println("");
            }
            
            // Allocates inputs to Doctor 2 if its empty
            else if (doctor2 ==null)
            {
                doctor2=doctor;
                doctor2.setName(newName);
                doctor2.setSpecialisation(newSpecialisation);
                System.out.println("Doctor 2 has been entered successfully");
                System.out.println("----------------------------------------");
                System.out.println("----------------------------------------");
                System.out.println("");
            }
        }
        
            // If both Doctor 1 and Doctor 2 are full, theres no more space.
            // Note: the lines: "----" and "", are implemented to space out the output for the user.
            else
            {
                System.out.println("There is no space for a new doctor, the limit has been reached");
                System.out.println("----------------------------------------");
                System.out.println("----------------------------------------");
                System.out.println("");
            }
    }
        
        
        // Add a new pet (2)
    public void addPet()
    {
        if (pet1==null  || pet2==null || pet3==null  || pet4==null)
        {
            Pet pet = new Pet();
            
            System.out.print("Pet: ");
            System.out.print("Name: "); 
            newPetName = console.next();
            
            // Check existing name for Pet 1
            if (pet1 != null ) 
            {
                while (newPetName.equals(pet1.getPetName()))
                {
                    System.out.print("This name is already in the system, Input a new name: "); 
                    newPetName = console.next();
                }
            }
            
            // Check existing name for Pet 2
             if (pet2 != null ) 
             {
                while (newPetName.equals(pet2.getPetName()))
                {
                    System.out.print("This name is already in the system, Input a new name: "); 
                    newPetName = console.next();
                }
            }
            
            // Check existing name for Pet 3
             if (pet3 != null ) 
             {
                while (newPetName.equals(pet3.getPetName()))
                {
                    System.out.print("This name is already in the system, Input a new name: "); 
                    newPetName = console.next();
                }
            }
            
            // Check existing name for Pet 4
             if (pet4 != null ) 
             {
                while (newPetName.equals(pet4.getPetName()))
                {
                    System.out.print("This name is already in the system, Input a new name: "); 
                    newPetName = console.next();
                }
            }
            
            
            System.out.print("Type: "); 
            newPetType = console.next();
            
            // Check if type of pet is dog or cat
            while ( !(newPetType.equals("dog") || newPetType.equals("cat"))) 
            {
                System.out.print("The pet type must be either a dog or cat: ");
                newPetType = console.next();
            }
            
            System.out.print("Size: "); 
            newPetSize = console.next();
            
            // Check if size of pet is small, medium or large
            while ( !(newPetSize.equals("small") || newPetSize.equals("medium") || newPetSize.equals("large"))) 
            {
                System.out.print("The pet size must be either small, medium or large: ");
                newPetSize = console.next();
            }
            
            System.out.print("Weight: "); 
            newPetWeight = console.nextDouble();
            
            // Check if weight of pet is positive and not a zero
            while (newPetWeight<=0) 
            {
                System.out.print("The pet weight must be a positive, non-zero number: ");
                newPetWeight = console.nextDouble();
            }
            
            System.out.print("Age: "); 
            newPetAge = console.nextInt();
            
            // Check if pet age is positive and not a zero
            while (newPetAge<=0) 
            {
                System.out.print("The pet age must be a positive, non-zero number: ");
                newPetAge = console.nextInt();
            }
            
            System.out.print("Assign Doctor: "); 
            newPetDoctor = console.next();
            
            // Allocates inputs to pet 1 if its empty
            if ((pet1 == null ) && (pet2==null) && (pet3==null)  && (pet4==null))
            {
                pet1=pet;
                pet1.setPetName(newPetName);
                pet1.setPetType(newPetType);
                pet1.setPetSize(newPetSize);
                pet1.setPetWeight(newPetWeight);
                pet1.setPetAge(newPetAge);
                pet1.setPetDoctor(newPetDoctor);
                
                System.out.println("Pet 1 has been entered successfully");
                System.out.println("----------------------------------------");
                System.out.println("----------------------------------------");
                System.out.println("");
            }
            
            // Allocates inputs to Pet 2 if its empty
            else if ((pet2==null) && (pet3==null)  && (pet4==null))
            {
                pet2=pet;
                pet2.setPetName(newPetName);
                pet2.setPetType(newPetType);
                pet2.setPetSize(newPetSize);
                pet2.setPetWeight(newPetWeight);
                pet2.setPetAge(newPetAge);
                pet2.setPetDoctor(newPetDoctor);
                
                System.out.println("Pet 2 has been entered successfully");
                System.out.println("----------------------------------------");
                System.out.println("----------------------------------------");
                System.out.println("");
            }
            
            // Allocates inputs to Pet 3 if its empty
            else if ((pet3==null)  && (pet4==null))
            {
                pet3=pet;
                pet3.setPetName(newPetName);
                pet3.setPetType(newPetType);
                pet3.setPetSize(newPetSize);
                pet3.setPetWeight(newPetWeight);
                pet3.setPetAge(newPetAge);
                pet3.setPetDoctor(newPetDoctor);
                
                System.out.println("Pet 3 has been entered successfully");
                System.out.println("----------------------------------------");
                System.out.println("----------------------------------------");
                System.out.println("");
            }
            
            // Allocates inputs to Pet 4 if its empty
            else if (pet4==null)
            {
                pet4=pet; 
                pet4.setPetName(newPetName);
                pet4.setPetType(newPetType);
                pet4.setPetSize(newPetSize);
                pet4.setPetWeight(newPetWeight);
                pet4.setPetAge(newPetAge);
                pet4.setPetDoctor(newPetDoctor);
                
                System.out.println("Pet 4 has been entered successfully");
                System.out.println("----------------------------------------");
                System.out.println("----------------------------------------");
                System.out.println("");
                
            }
            
            // If Pet 1, Pet 2, Pet 3 and Pet 4 are full, theres no more space.
            else 
            {
                System.out.println("no space for a new pet");
            }
            
        }
    }
        
        
    
    
    // Delete a doctor (3)
    public void deleteDoctor()
    {
        // Checks if there is a Doctor 1
        if (doctor1 == null)
        {
            System.out.println("Doctor 1 not present");
        }
        
        // Checks if there is a Doctor 2  
        if (doctor2 == null) 
        {
            System.out.println("Doctor 2 not present");
        }    
        
            System.out.println("Enter the doctor's name to be deleted: "); 
            deleteDoctor = console.next();
        
            
        // Checks the Doctor 1 name and deletes the corresponding Doctor.
        // All the pets assigned to the deleted doctor 1 become assigned to: "No Doctor Assigned". 
        if (deleteDoctor.equals(doctor1.getName()))
        {
            doctor1 = null;
            
            newPetDoctor = "No Doctor Assigned";
            if (pet1 != null) 
            {
                pet1.setPetDoctor(newPetDoctor);
            }
            
            if (pet2 != null) 
            {
                pet2.setPetDoctor(newPetDoctor);
            }
            
            if (pet3 != null) 
            {
                pet3.setPetDoctor(newPetDoctor);
            }
           
            if (pet4 != null) 
            {
                pet4.setPetDoctor(newPetDoctor);
            }
            
            System.out.println("Doctor's name has been deleted ");             
        }
        
        // Checks the Doctor 2 name and deletes the corresponding Doctor.
        // All the pets assigned to the deleted doctor 2 become assigned to: "No Doctor Assigned".
        else if (deleteDoctor.equals(doctor2.getName()))
        {
            doctor2 = null;
            
            newPetDoctor = "No Doctor Assigned";
            
            
            if (pet1 != null) 
            {
                pet1.setPetDoctor(newPetDoctor);
            }
            
            if (pet2 != null) 
            {
                pet2.setPetDoctor(newPetDoctor);
            }
            
            if (pet3 != null) 
            {
                pet3.setPetDoctor(newPetDoctor);
            }
           
            if (pet4 != null) 
            {
                pet4.setPetDoctor(newPetDoctor);
            }
                
            System.out.println("Doctor's name has been deleted "); 
        }
        
        // If the input does not match the doctor in the system, outputs an error message
        else 
        {
            System.out.println("Error: Doctor name does not exist");
        }
    }      

    // Delete a pet
    public void deletePet()
    {
        // Checks if there is a Pet 1
        if (pet1 == null)
        {
            System.out.println("Pet 1 not present");
        }
        
        // Checks if there is a Pet 2
        if (pet2 == null) 
        {
            System.out.println("Pet 2 not present");
        }
        
        // Checks if there is a Pet 3
        if (pet3 == null) 
        {
            System.out.println("Pet 3 not present");
        }
        
        // Checks if there is a Pet 4
        if (pet4 == null) 
        {
            System.out.println("Pet 4 not present");
        }
        
            System.out.println("Enter the pets's name to be deleted: "); 
            deletePet = console.next();
        
        // Checks the Pet name and deletes the corresponding Pet    
        if (deletePet.equals(pet1.getPetName()))
        {
            pet1 = null;
            System.out.println("Pet's name has been deleted "); 
        }
        
        else if (deletePet.equals(pet2.getPetName()))
        {
            pet2 = null;
            System.out.println("Pet's name has been deleted "); 
        }
        
        else if (deletePet.equals(pet3.getPetName()))
        {
            pet3 = null;
            System.out.println("Pet's name has been deleted "); 
        }
        
        else if (deletePet.equals(pet4.getPetName()))
        {
            pet4 = null;
            System.out.println("Pet's name has been deleted "); 
        }
        
        // If the input does not match the Pets name, outputs an error message
        else 
        {
            System.out.println("Error: Pet's name does not exist");
        }
    }      
    
    // List of doctors (5)
    public void doctorList()
    {
        System.out.println("List of Doctors:");
        
        // If there is a doctor 1, outputs the name and specialisation
        if (doctor1 != null)
        {
            System.out.println("Doctor " +doctor1.getName() +": " +doctor1.getSpecialisation() +" Specialist");
        }
        
        // If there is a doctor 2, outputs the name and specialisation
        if (doctor2 != null)
        {
            System.out.println("Doctor " +doctor2.getName() +": " +doctor2.getSpecialisation() +" Specialist");
        }
        
        // If there are no doctors
        if ((doctor1 == null) && (doctor2 == null))
        {
            System.out.println("There are no doctors");
        }
        
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("");
    }
    
    // List of pets (6)
    public void petList()
    {
        System.out.println("List of Pets:");
        
        // If there is a pet 1, outputs the name, type, size, weight, age and assigned doctor
        if (pet1 != null )
        {
            System.out.println("Pet " +pet1.getPetName() +": " +pet1.getPetSize() +" " +pet1.getPetType() +" weighing " +pet1.getPetWeight() +" Kg at " +pet1.getPetAge() +" years old  (Assigned Doctor: " +pet1.getPetDoctor() +")");
        }
        
        // If there is a pet 2, outputs the name, type, size, weight, age and assigned doctor
        if (pet2 != null )
        {
            System.out.println("Pet " +pet2.getPetName() +": " +pet2.getPetSize() +" " +pet2.getPetType() +" weighing " +pet2.getPetWeight() +" Kg at " +pet2.getPetAge() +" years old  (Assigned Doctor: " +pet2.getPetDoctor() +")");
        }
        
        // If there is a pet 3, outputs the name, type, size, weight, age and assigned doctor
        if (pet3 != null )
        {
            System.out.println("Pet " +pet3.getPetName() +": " +pet3.getPetSize() +" " +pet3.getPetType() +" weighing " +pet3.getPetWeight() +" Kg at " +pet3.getPetAge() +" years old  (Assigned Doctor: " +pet3.getPetDoctor() +")");
        }
        
        // If there is a pet 4, outputs the name, type, size, weight, age and assigned doctor
        if (pet4 != null )
        {
            System.out.println("Pet " +pet4.getPetName() +": " +pet4.getPetSize() +" " +pet4.getPetType() +" weighing " +pet4.getPetWeight() +" Kg at " +pet4.getPetAge() +" years old  (Assigned Doctor: " +pet4.getPetDoctor() +")");
        }
        
        // Checks if there are no pets
        if ((pet1 == null) && (pet2 == null) && (pet3 == null) && (pet4 == null))
        {
            System.out.println("There are no Pets");
        }
        
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("");
    } 
    
    // List of Pets assigned to a specific Doctor (7)
    public void assignedPets()
    {
    // Checks if there are no doctors    
    if (doctor1 == null && doctor2 == null) 
    { 
        System.out.println("No doctors"); 
    }
        
        // Checks if there is a doctor 1 and no doctor 2, followed by if there are pets 1, 2, 3 and 4
       if (doctor1 != null && doctor2 == null)
        {
        System.out.println("Name of Doctor: " +doctor1.getName());
        System.out.println("Assigned Pets: ");
        
        if ( (pet1 != null) && (pet1.getPetDoctor().equals(doctor1.getName())) )
        {
            System.out.println("Pet name: " +pet1.getPetName());
        }
        
        if ( (pet2 != null) && (pet2.getPetDoctor().equals(doctor1.getName())) )
        {
            System.out.println("Pet name: " +pet2.getPetName());
        }
        
        if ( (pet3 != null) && (pet3.getPetDoctor().equals(doctor1.getName())) )
        {
            System.out.println("Pet name: " +pet3.getPetName());
        }
        
        if ( (pet4 != null) && (pet4.getPetDoctor().equals(doctor1.getName())) )
        {
            System.out.println("Pet name: " +pet4.getPetName());
        }
        }
           
        // Checks if there is a doctor 2 and no doctor 1, followed by if there are pets 1, 2, 3 and 4
       if (doctor2 != null && doctor1 == null)
        {
        System.out.println("Name of Doctor: " +doctor2.getName());
        System.out.println("Assigned Pets: ");
        
        if ( (pet1 != null) && (pet1.getPetDoctor().equals(doctor2.getName())) )
        {
            System.out.println("Pet name: " +pet1.getPetName());
        }
        
        if ( (pet2 != null) && (pet2.getPetDoctor().equals(doctor2.getName())) )
        {
            System.out.println("Pet name: " +pet2.getPetName());
        }
        
        if ( (pet3 != null)  && (pet3.getPetDoctor().equals(doctor2.getName())) )
        {
            System.out.println("Pet name: " +pet3.getPetName());
        }
        
        if ( (pet4 != null)  && (pet4.getPetDoctor().equals(doctor2.getName())) )
        {
            System.out.println("Pet name: " +pet4.getPetName());
        }
        } 
        
        //// Checks if there is a doctor 1 and a doctor 2, followed by if there are pets 1, 2, 3 and 4
          if (doctor1 != null && doctor2 != null)
        {
        System.out.println("Name of Doctor: " +doctor1.getName());
        System.out.println("Assigned Pets: ");
        
        if ( (pet1 != null)  && (pet1.getPetDoctor().equals(doctor1.getName())) )
        {
            System.out.println("Pet name: " +pet1.getPetName());
        }
        
        if ( (pet2 != null)  && (pet2.getPetDoctor().equals(doctor1.getName())) )
        {
            System.out.println("Pet name: " +pet2.getPetName());
        }
        
        if ( (pet3 != null)   && (pet3.getPetDoctor().equals(doctor1.getName())) )
        {
            System.out.println("Pet name: " +pet3.getPetName());
        }
        
        if ( (pet4 != null)   && (pet4.getPetDoctor().equals(doctor1.getName())) )
        {
            System.out.println("Pet name: " +pet4.getPetName());
        }
        
        
        
        System.out.println("Name of Doctor: " +doctor2.getName());
        System.out.println("Assigned Pets: ");
        
        if ( (pet1 != null)  && (pet1.getPetDoctor().equals(doctor2.getName())) )
        {
            System.out.println("Pet name: " +pet1.getPetName());
        }
        
        if ( (pet2 != null)  && (pet2.getPetDoctor().equals(doctor2.getName())) )
        {
            System.out.println("Pet name: " +pet2.getPetName());
        }
        
        if ( (pet3 != null)   && (pet3.getPetDoctor().equals(doctor2.getName())) )
        {
            System.out.println("Pet name: " +pet3.getPetName());
        }
        
        if ( (pet4 != null)   && (pet4.getPetDoctor().equals(doctor2.getName())) )
        {
            System.out.println("Pet name: " +pet4.getPetName());
        }
        }
    
   }
   
   
       // Assign a doctor to a pet (8)
    public void assignDocToPet() 
    {
        System.out.print("Enter the pet's Name you wish to assign a Doctor to: ");
        newPetName = console.next();
           
           // Check if the input name is Pet 1
           if ( (pet1 != null)  && (newPetName.equals(pet1.getPetName())) )
           {
               System.out.print("Enter the Doctor's Name you wish to assign: ");
               newPetDoctor = console.next();
               
               // Check if the input name is Doctor 1
               if ( (doctor1 != null)  && (newPetDoctor.equals(doctor1.getName())) )
               {
                   
                   // Check if Pet is already assigned to that doctor
                   if (newPetDoctor.equals(pet1.getPetDoctor())) 
                   {
                      System.out.print("Pet already assigned to that doctor. ");
                      System.out.println("----------------------------------------");
                      System.out.println("----------------------------------------");
                      System.out.println("");
                   }
                   
                   // Check that the doctor has the correct specialisation for the pet
                   if (doctor1.getSpecialisation().equals(pet1.getPetType()))
                   {
                       pet1.setPetDoctor(newPetDoctor);
                   }
                   else
                   {
                      System.out.print("That doctor has the wrong specialisation. ");
                      System.out.println("");
                      System.out.println("");
                   }
                   
                    
               }
               
               // Check if the input name is Doctor 2
               else if ( (doctor2 != null)  && (newPetDoctor.equals(doctor2.getName())) )
               {
                   
                   // Check if Pet is already assigned to that doctor
                   if (newPetDoctor.equals(pet1.getPetDoctor())) 
                   {
                      System.out.print("Pet already assigned to that doctor. ");
                      System.out.println("----------------------------------------");
                      System.out.println("----------------------------------------");
                      System.out.println("");
                   }
                   
                   // Check that the doctor has the correct specialisation for the pet
                   if (doctor2.getSpecialisation().equals(pet1.getPetType()))
                   {
                       pet1.setPetDoctor(newPetDoctor);
                   }
                   
                   else
                   {
                      System.out.print("That doctor has the wrong specialisation. ");
                      System.out.println("");
                      System.out.println("");
                   }
               }
               
               else
               {
                   System.out.print("Doctor does not exist. Please re-enter: ");
                   newPetDoctor = console.next(); 
               }
               
               
               
           }
           
           // Check if the input name is Pet 2
           else if ( (pet2 != null)  && (newPetName.equals(pet2.getPetName())) )
           {
               System.out.print("Enter the Doctor's Name you wish to assign: ");
               newPetDoctor = console.next();
               
               // Check if the input name is Doctor 1
               if ( (doctor1 != null)  && (newPetDoctor.equals(doctor1.getName())) )
               {
                   
                   // Check if Pet is already assigned to that doctor
                   if (newPetDoctor.equals(pet2.getPetDoctor())) 
                   {
                      System.out.print("Pet already assigned to that doctor. ");
                      System.out.println("----------------------------------------");
                      System.out.println("----------------------------------------");
                      System.out.println("");
                   }
                   
                   // Check that the doctor has the correct specialisation for the pet
                   if (doctor1.getSpecialisation().equals(pet2.getPetType()))
                   {
                       pet2.setPetDoctor(newPetDoctor);
                   }
                   
                   else
                   {
                      System.out.print("That doctor has the wrong specialisation. ");
                      System.out.println("");
                      System.out.println("");
                   }
               }
               
               // Check if the input name is Doctor 2
               else if ( (doctor2 != null)  && (newPetDoctor.equals(doctor2.getName())) )
               {
                   
                   // Check if Pet is already assigned to that doctor
                   if (newPetDoctor.equals(pet2.getPetDoctor())) 
                   {
                      System.out.print("Pet already assigned to that doctor. ");
                      System.out.println("----------------------------------------");
                      System.out.println("----------------------------------------");
                      System.out.println("");
                   }
                   
                   // Check that the doctor has the correct specialisation for the pet
                   if (doctor2.getSpecialisation().equals(pet2.getPetType()))
                   {
                       pet2.setPetDoctor(newPetDoctor);
                   }
                   
                   else
                   {
                      System.out.print("That doctor has the wrong specialisation. ");
                      System.out.println("");
                      System.out.println("");
                   }
               }
               
               else
               {
                   System.out.print("Doctor does not exist. Please re-enter: ");
                   newPetDoctor = console.next(); 
               }
               
               
           }
           
           // Check if the input name is Pet 3
           else if ( (pet3 != null)  && (newPetName.equals(pet3.getPetName())) )
           {
               System.out.print("Enter the Doctor's Name you wish to assign: ");
               newPetDoctor = console.next();
               
               // Check if the input name is Doctor 1
               if ( (doctor1 != null)  && (newPetDoctor.equals(doctor1.getName())) )
               {
                   
                   // Check if Pet is already assigned to that doctor
                   if (newPetDoctor.equals(pet3.getPetDoctor())) 
                   {
                      System.out.print("Pet already assigned to that doctor. ");
                      System.out.println("----------------------------------------");
                      System.out.println("----------------------------------------");
                      System.out.println("");
                   }
                   
                   // Check that the doctor has the correct specialisation for the pet
                   if (doctor1.getSpecialisation().equals(pet3.getPetType()))
                   {
                       pet3.setPetDoctor(newPetDoctor);
                   }
                   
                   else
                   {
                      System.out.print("That doctor has the wrong specialisation. ");
                      System.out.println("");
                      System.out.println("");
                   }
    
               }
               
               // Check if the input name is Doctor 2
               else if ( (doctor2 != null)  && (newPetDoctor.equals(doctor2.getName())) )
               {
                   
                   // Check if Pet is already assigned to that doctor
                   if (newPetDoctor.equals(pet3.getPetDoctor())) 
                   {
                      System.out.print("Pet already assigned to that doctor. ");
                      System.out.println("----------------------------------------");
                      System.out.println("----------------------------------------");
                      System.out.println("");
                   }
                   
                   // Check that the doctor has the correct specialisation for the pet
                   if (doctor2.getSpecialisation().equals(pet3.getPetType()))
                   {
                       pet3.setPetDoctor(newPetDoctor);
                   }
                   
                   else
                   {
                      System.out.print("That doctor has the wrong specialisation. ");
                      System.out.println("");
                      System.out.println("");
                   }
            
               }
               
               else
               {
                   System.out.print("Doctor does not exist. Please re-enter: ");
                   newPetDoctor = console.next(); 
               }
               
               
           }
           
           // Check if the input name is Pet 4
           else if ( (pet4 != null)  && (newPetName.equals(pet4.getPetName())) )
           {
               System.out.print("Enter the Doctor's Name you wish to assign: ");
               newPetDoctor = console.next();
               
               // Check if the input name is Doctor 1
               if ( (doctor1 != null)  && (newPetDoctor.equals(doctor1.getName())) )
               {
                   
                   // Check if Pet is already assigned to that doctor
                   if (newPetDoctor.equals(pet4.getPetDoctor())) 
                   {
                      System.out.print("Pet already assigned to that doctor. ");
                      System.out.println("----------------------------------------");
                      System.out.println("----------------------------------------");
                      System.out.println("");
                   }
                   
                   // Check that the doctor has the correct specialisation for the pet
                   if (doctor1.getSpecialisation().equals(pet4.getPetType()))
                   {
                       pet4.setPetDoctor(newPetDoctor);
                   }
                   
                   else
                   {
                      System.out.print("That doctor has the wrong specialisation. ");
                      System.out.println("");
                      System.out.println("");
                   }
                 
               }
               
               // Check if the input name is Doctor 2
               else if ( (doctor2 != null)  && (newPetDoctor.equals(doctor2.getName())) )
               {
                   
                   // Check if Pet is already assigned to that doctor
                   if (newPetDoctor.equals(pet4.getPetDoctor())) 
                   {
                      System.out.print("Pet already assigned to that doctor. ");
                      System.out.println("----------------------------------------");
                      System.out.println("----------------------------------------");
                      System.out.println(""); 
                   }
                   
                   // Check that the doctor has the correct specialisation for the pet
                   if (doctor2.getSpecialisation().equals(pet4.getPetType()))
                   {
                       pet4.setPetDoctor(newPetDoctor);
                   }
                   
                   else
                   {
                      System.out.print("That doctor has the wrong specialisation. ");
                      System.out.println("");
                      System.out.println("");
                   }
                
               }
               
               else
               {
                   System.out.print("Doctor does not exist. Please re-enter: ");
                   newPetDoctor = console.next(); 
               }
               
               
           }
           
           else
           {
               
               System.out.print("There is no pet with that name in the system. Please re-enter: ");
               newPetName = console.next();
           }
        
    }
       
    
   // Analyse a pet (9)
    public void petAnalysis()
   {
        System.out.println("Pet Analysis");
         // Analysis of weight if Pet 1 is a dog
        if(pet1 != null && (pet1.getPetType()).equals("dog")) 
        {
            if(((pet1.getPetSize()).equals("small") && (pet1.getPetWeight()) > 6)||((pet1.getPetSize()).equals("medium") && (pet1.getPetWeight()) > 9)|| 
            ((pet1.getPetSize()).equals("large") && (pet1.getPetWeight()) > 12))
            {
                System.out.println("Pet 1 is overweight");
            }
        }
        
         // Analysis of weight if Pet 1 is a cat   
        if (pet1 != null && (pet1.getPetType()).equals("cat")) 
        {
            if(((pet1.getPetSize()).equals("small") && (pet1.getPetWeight()) > 4)||((pet1.getPetSize()).equals("medium") && (pet1.getPetWeight()) > 6)|| 
            ((pet1.getPetSize()).equals("large") && (pet1.getPetWeight()) > 8))
            {
                System.out.println("Pet 1 is overweight");
            }   
        }
         
        // Analysis of weight if Pet 2 is a dog
        if(pet2 != null && (pet2.getPetType()).equals("dog")) 
        {
            if(((pet2.getPetSize()).equals("small") && (pet2.getPetWeight()) > 6)||((pet2.getPetSize()).equals("medium") && (pet2.getPetWeight()) > 9)|| 
            ((pet2.getPetSize()).equals("large") && (pet2.getPetWeight()) > 12))
            {
                System.out.println("Pet 2 is overweight");
            }
        }
        
         // Analysis of weight if Pet 2 is a cat   
        if (pet2 != null && (pet2.getPetType()).equals("cat")) 
        {
            if(((pet2.getPetSize()).equals("small") && (pet2.getPetWeight()) > 4)||((pet2.getPetSize()).equals("medium") && (pet2.getPetWeight()) > 6)|| 
            ((pet2.getPetSize()).equals("large") && (pet2.getPetWeight()) > 8))
            {
                System.out.println("Pet 2 is overweight");
            }
        }
        
        // Analysis of weight if Pet 3 is a dog
        if(pet3 != null && (pet3.getPetType()).equals("dog")) 
        {
            if(((pet3.getPetSize()).equals("small") && (pet3.getPetWeight()) > 6)||((pet3.getPetSize()).equals("medium") && (pet3.getPetWeight()) > 9)|| 
            ((pet3.getPetSize()).equals("large") && (pet3.getPetWeight()) > 12))
            {
                System.out.println("Pet 3 is overweight");
            }
        }
        
        // Analysis of weight if Pet 3 is a cat
        if (pet3 != null && (pet3.getPetType()).equals("cat")) 
        {
            if(((pet3.getPetSize()).equals("small") && (pet3.getPetWeight()) > 4)||((pet3.getPetSize()).equals("medium") && (pet3.getPetWeight()) > 6)|| 
            ((pet3.getPetSize()).equals("large") && (pet3.getPetWeight()) > 8))
            {
                System.out.println("Pet 3 is overweight");
            }
        }
        
        // Analysis of weight if Pet 4 is a dog
        if(pet4 != null && (pet4.getPetType()).equals("dog")) 
        {
            if(((pet4.getPetSize()).equals("small") && (pet4.getPetWeight()) > 6)||((pet4.getPetSize()).equals("medium") && (pet4.getPetWeight()) > 9)|| 
            ((pet4.getPetSize()).equals("large") && (pet4.getPetWeight()) > 12))
            {
                System.out.println("Pet 4 is overweight");
            }
        }
        
        // Analysis of weight if Pet 4 is a cat
        if (pet4 != null && (pet4.getPetType()).equals("cat")) 
        {
            if(((pet4.getPetSize()).equals("small") && (pet4.getPetWeight()) > 4)||((pet4.getPetSize()).equals("medium") && (pet4.getPetWeight()) > 6)|| 
            ((pet4.getPetSize()).equals("large") && (pet4.getPetWeight()) > 8))
            {
                System.out.println("Pet 4 is overweight");
            }
        }
    }
}

          
        
   
