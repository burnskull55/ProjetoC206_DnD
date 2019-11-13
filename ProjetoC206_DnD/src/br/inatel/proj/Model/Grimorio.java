/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Model;

import java.io.Serializable;

/**
 *
 * @author burns
 */
public class Grimorio implements Serializable{
    private String spellAtk;
    private String spellDc;
    private String Spells;

    public String getSpellAtk() {
        return spellAtk;
    }

    public void setSpellAtk(String spellAtk) {
        this.spellAtk = spellAtk;
    }

    public String getSpellDc() {
        return spellDc;
    }

    public void setSpellDc(String spellDc) {
        this.spellDc = spellDc;
    }

    public String getSpells() {
        return Spells;
    }

    public void setSpells(String Spells) {
        this.Spells = Spells;
    }

   
    
    
}
