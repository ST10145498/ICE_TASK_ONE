/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_icetask_1;
//imports 

import javax.swing.JOptionPane;


/**
 *
 * @author lab_services_student
 */
class Animal {
    int IDtag;
    String species;

    public Animal(int IDtag, String species) {
        this.IDtag = IDtag;
        this.species = species;
    }

    public void receiveInfo() { // ask user for species 
        species = JOptionPane.showInputDialog(null, "Input the species of the animal:");
    }

    public String getSpecies() {  
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String sendInfo() { //return species and id tag 
        return "IDtag: " + IDtag + "\nSpecies: " + species + "\n";
    }
}