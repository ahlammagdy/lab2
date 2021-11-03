/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig.pkg2.pkg1;

public class staff extends employee {
    
    public String title;

    public staff(String office, double salary, Mydate dateHired, String name, String adress, String M_adress, int ph_num , String title) {
        super(office, salary, dateHired, name, adress, M_adress, ph_num);
        this.title=title;
    }
}
