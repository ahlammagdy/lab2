/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig.pkg2.pkg2;
import java.util.Scanner;

public class Assig22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adress adress=new Adress(21,"minia","egypt");
        Subject student=new Subject("arabic",324,2);
        
        student student1=new student("Ahlam",333,3.1,adress,student);
        
        student1.setStudentData("ahlam", 333, 3.7, adress, student);
        student1.getStudentData();
        
    }
    
}
