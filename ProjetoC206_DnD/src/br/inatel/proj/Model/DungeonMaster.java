/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author burns
 * @since  11/11/19
 * @version 1.0
 */
public class DungeonMaster implements Serializable{
    
    private String userName;
    private String password;
    private ArrayList<Mesa> mesas = new ArrayList();

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }
    
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
