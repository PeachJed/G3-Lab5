/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comycompany.g3.lab5;

/**
 *
 * @author user
 */
public class Person {
    
    // Install variables
    private String name;
    private String address;
    
    // Constructor
    
    public Person (String name, String address) {
        
        this.name = name;
        this.address = address;
        
    }
    
    // Accessor Method
    
    public String getName () {
        
        return name;
    }
    
    public String getAddress () {
            
        return address;    
}
    
// Mutator Method 

public void setAddress (String address) {
    
    this.address = address;
}
 
    public String toString () {
    
    return String.format("Person[name=%s, address=%s]", name, address);
}
}