/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog_icetask_1;

//imports 
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class Prog_iceTask_1 {

    /**
     * @param args the command line arguments
     */
   
   public static void main(String[] args) {
        
        /*
        Made use of string builder to show a final report after all information has been entered 
        */
        
        // asking the user to input id tag for bird 
        JOptionPane.showMessageDialog(null,"Please enter the following details for the bird");
        int birdID = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Bird's IDtag:"));
        Bird brd = new Bird(birdID);
        brd.receiveInfo(); // calling method 
        
        // asking user to input reptile id
        JOptionPane.showMessageDialog(null,"Please enter the following details for the reptile");
        int reptileID = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Reptile's IDtag:"));
        Reptile rept = new Reptile(reptileID);
        rept.receiveInfo(); // calling method 

        StringBuilder report = new StringBuilder();// final report to show all info of the bird and chicken 
        report.append("\n***********************\n");// create string builder to create report
        report.append("Final Report:\n\n");
        report.append("Bird's Details:\n");
        report.append(brd.sendInfo()); // append bird information to the report 
        report.append("\n***********************\n\n");
        report.append("Reptile's Details:\n");
        report.append(rept.sendInfo());// append reptile information to a report 

        // the display to show the report of all data 
        JOptionPane.showMessageDialog(null, report.toString());
    }
}
