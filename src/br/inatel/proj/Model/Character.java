/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Model;

/**
 *
 * @author burns
 */
public class Character extends Actor{
    private String classe;
    private int initiative;
    private int speed;
    private int level;
    private int ac;
    private int proficiency;
    private int goldP;
    private int copperP;
    private int silverP;
    private Dice hitDice = new Dice();
    private Inventario inventario = new Inventario();
    private Grimorio spellbook = new Grimorio();
}
