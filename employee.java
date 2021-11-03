/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig.pkg2.pkg1;


public class employee extends Person {
    
    public String office;
    public double salary;
    public Mydate dateHired;

    public employee(String office, double salary, Mydate dateHired, String name, String adress, String M_adress, int ph_num) {
        super(name, adress, M_adress, ph_num);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
   
}
