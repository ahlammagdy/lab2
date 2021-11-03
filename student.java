/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig.pkg2.pkg2;

public class student {
    
    public String name;
    private int studentID;
    public double studentGPA;
    public Adress adress;
    public Subject subject;

    public student(String name, int studentID, double studentGPA, Adress adress, Subject subject) {
        this.name = name;
        this.studentID = studentID;
        this.studentGPA = studentGPA;
        this.adress = adress;
        this.subject = subject;
       
    }
    public void setStudentData(String name, int studentID, double studentGPA, Adress adress, Subject subject)
    {
        this.name=name;
        this.studentID=studentID;
        this.studentGPA=studentGPA;
        this.adress=adress;
        this.subject=subject;
    }
    public void getStudentData()
    {
        System.out.println("the student data is  ");
        System.out.print("the name     :  "+name);
        System.out.print("\nthe ID     :  "+studentID);
        System.out.print("\nthe GPA    :  "+studentGPA);
        System.out.print("\nthe subjects  : the sbject ID "+subject.subjectID+"    the subject name "+subject.subjectName+"    the subject hours "+subject.subjectHours);
        System.out.print("\nthe adress :    the country "+adress.country+"    the city "+adress.city+"    the street number "+adress.streetNO);
        
    }
    
}
