/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petadoption;

import java.util.Date;

/**
 *
 * @author Saeed
 */
public class DailyActivity {
    int ID;
    int petID;
    Date date ;
    int count;
    
    public int getID(){
        return this.ID;
    }
    public int getPetID(){
        return this.petID;
    }
    public Date getDate(){
        return this.date;
    }
    public int getTotActivities(){
        return this.count;
}
}

