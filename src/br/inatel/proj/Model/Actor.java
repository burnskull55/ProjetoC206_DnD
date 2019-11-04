/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Model;

import br.inatel.proj.Model.atributos.Strength;
import br.inatel.proj.Model.atributos.Dexterity;
import br.inatel.proj.Model.atributos.Constitution;
import br.inatel.proj.Model.atributos.Inteligence;
import br.inatel.proj.Model.atributos.Wisdom;
import br.inatel.proj.Model.atributos.Charisma;


/**
 *
 * @author burns
 */
public abstract class Actor {
    protected String nome;
    protected String race;
    protected String backGround;
    protected String alignment;
    protected int hp;
    protected Strength str = new Strength();
    protected Dexterity dex = new Dexterity();
    protected Constitution con = new Constitution();
    protected Inteligence iNt = new Inteligence();
    protected Wisdom wis = new Wisdom();
    protected Charisma cHar = new Charisma();
            
}
