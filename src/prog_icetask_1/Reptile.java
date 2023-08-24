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
class Reptile extends Animal {  // sub class for reptile and extends animal 

    public double getBloodTemp() {
        return bloodTemp;
    }

    public void setBloodTemp(double bloodTemp) {
        this.bloodTemp = bloodTemp;
    }
    double bloodTemp;

    public Reptile(int IDtag) {
        super(IDtag, "");
    }

    @Override
    public void receiveInfo() {
        super.receiveInfo();// call parent method to get species info 

        String input = JOptionPane.showInputDialog(null, "Enter the blood temperature of the reptile:");
        bloodTemp = Double.parseDouble(input);
    }

    @Override
    public String sendInfo() {
        return super.sendInfo() + "Blood Temperature: " + bloodTemp + " " +"°"+ "C" +"\n";
    }
}