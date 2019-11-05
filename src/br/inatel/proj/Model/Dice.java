/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Model;

import java.util.Random;

/**
 *
 * @author burns
 */
public class Dice {
    private int sides;
    private Random rand = new Random();
    
    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
    
    public int roll(){
        return rand.nextInt(sides);
    }
    
    
}
