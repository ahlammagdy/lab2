/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig.pkg2.pkg1;

public class faculty extends employee {
    
    public int office_hour;
    public String rank;

    public faculty(String office, double salary, Mydate dateHired, String name, String adress, String M_adress, int ph_num ,int office_hour , String rank) {
        super(office, salary, dateHired, name, adress, M_adress, ph_num);
        this.office_hour=office_hour;
        this.rank= rank;
    }

    
    
    
}
