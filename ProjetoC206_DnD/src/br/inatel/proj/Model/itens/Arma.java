/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Model.itens;

import java.io.Serializable;

/**
 *
 * @author burns
 */
public class Arma implements Serializable{

    private String name;
    private int mod;
    private String damage;
    private String damageType;
    private int range;
    private String properties;
    private boolean isMelee;

    @Override
    public String toString() {
        String aux = "Name: " + name + "\n"
                + "Damage: " + "+" + mod + " " + damage + "\n"
                + "Damage Type: " + damageType + "\n"
                + "Properties: " + properties + "\n"
                + "Range: " + range + " feet" + "\n";

        if (isMelee) {
            aux = aux + "Melee \n";
        }

        return aux;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMod() {
        return mod;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public boolean isIsMelee() {
        return isMelee;
    }

    public void setIsMelee(boolean isMelee) {
        this.isMelee = isMelee;
    }

}
