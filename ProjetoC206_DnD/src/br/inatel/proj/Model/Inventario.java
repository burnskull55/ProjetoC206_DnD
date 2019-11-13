/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Model;

import br.inatel.proj.Model.itens.Arma;
import br.inatel.proj.Model.itens.Consumables;
import br.inatel.proj.Model.itens.Pack;
import java.io.Serializable;

/**
 *
 * @author burns
 */
public class Inventario implements Serializable{
    private Pack pack = new Pack();
    private Consumables consumables = new Consumables();
    private Arma arma = new Arma();
    private String inv;
    

    @Override
    public String toString() {
        return "Inventario: \n"
                + arma.toString() + consumables.toString();
    }

    public String getInv() {
        return inv;
    }

    public void setInv(String inv) {
        this.inv = inv;
    }
    
    
    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }

    public Consumables getConsumables() {
        return consumables;
    }

    public void setConsumables(Consumables consumables) {
        this.consumables = consumables;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    
    
    
}
