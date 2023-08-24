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
class Bird extends Animal {  //sub class that extends animal 

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }
    int colour;

    public Bird(int IDtag) {
        super(IDtag, "");
    }

    @Override
    public void receiveInfo() {
        super.receiveInfo(); // call parent method so you can get the species info 

        // asking user for feather colour 
        String input = JOptionPane.showInputDialog(null,
                "Please enter the feather colour of the bird:\n"
                        + "1: grey\n"
                        + "2: white\n"
                        + "3: black");

        colour = Integer.parseInt(input);
    }

    @Override
    public String sendInfo() {
        return super.sendInfo() + "Feather Colour: " + getColourName(colour) + "\n";
    }

    private String getColourName(int colour) {
        switch (colour) {
            case 1:
                return "grey";
            case 2:
                return "white";
            case 3:
                return "black";
            default:  // if variable is not one of the given colours we output variable unknown
                return "Variable is unkown";
        }
    }
}
