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
    private String cLass;
    private int initiative;
    private int speed;
    private int level;
    private int ac;
    private Dice hitDice = new Dice();  
    private int proficiency;
    private Inventario inventario = new Inventario();
     
     
}
