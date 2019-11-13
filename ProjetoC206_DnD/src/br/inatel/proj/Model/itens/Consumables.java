/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Model.itens;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author burns
 */
public class Consumables implements Serializable{
    private ArrayList<String> bag = new ArrayList();

    @Override
    public String toString() {
        String aux = null;
        
        for (String string : bag) {
            aux = aux +string+"\n";
        }
        return aux;
    }

   
    
    public ArrayList<String> getBag() {
        return bag;
    }

    public void setBag(ArrayList<String> bag) {
        this.bag = bag;
    }
    
    
    
    
}
