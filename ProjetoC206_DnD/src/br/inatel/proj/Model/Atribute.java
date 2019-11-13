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
public class Atribute implements Serializable{
    private String score;
    private String  modifier;
    private String save;
    private boolean isPro;
    
    
    
    /*
    public Atribute(int pro) {
        if(this.score >= 8 && this.score <= 9){
            this.modifier = -1;
        }
        if(this.score >= 10 && this.score <= 11){
            this.modifier = 0;          
        }
        if(this.score >= 12 && this.score <= 13){
            this.modifier = 1;          
        }
        if(this.score >= 14 && this.score <= 15){
            this.modifier = 2;            
        }
        if(this.score >= 16 && this.score <= 17){
            this.modifier = 3;           
        }
        if(this.score >= 18 && this.score <= 19){
            this.modifier = 4;           
        }
        if(this.score >= 20){
            this.modifier = 5;           
        }
        if(isPro){
            this.save = this.modifier + pro;
        }
    }

    public Atribute() {
        if(this.score >= 8 && this.score <= 9){
            this.modifier = -1;
        }
        if(this.score >= 10 && this.score <= 11){
            this.modifier = 0;
        }
        if(this.score >= 12 && this.score <= 13){
            this.modifier = 1;
        }
        if(this.score >= 14 && this.score <= 15){
            this.modifier = 2;
        }
        if(this.score >= 16 && this.score <= 17){
            this.modifier = 3; 
        }
        if(this.score >= 18 && this.score <= 19){
            this.modifier = 4;           
        }
        if(this.score >= 20){
            this.modifier = 5;           
        }
        this.save = this.modifier;
    }
    

    */

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getSave() {
        return save;
    }

    public void setSave(String save) {
        this.save = save;
    }

    public boolean isIsPro() {
        return isPro;
    }

    public void setIsPro(boolean isPro) {
        this.isPro = isPro;
    }
    
    
    
    
    
   
    
}
