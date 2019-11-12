/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Model;

import br.inatel.proj.View.TelaControleMesa;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author burns
 */
public class Mesa implements Serializable, Comparable<Mesa>{
    
    //public TelaControleMesa tela = new TelaControleMesa();
    private String nome;
    private ArrayList<Character> characters = new ArrayList();
    private ArrayList<Monstro> monstros = new ArrayList();
    private ArrayList<Npc> npcs = new ArrayList();
    
    public Mesa() {
        
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public int compareTo(Mesa o) {
       return  this.getNome().compareTo(o.getNome());
    }
    
    
}
