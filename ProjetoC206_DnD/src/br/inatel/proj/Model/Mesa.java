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
    private String userName;
    private String nome;
    private ArrayList<Chara> characters = new ArrayList();
    private ArrayList<Monstro> monstros = new ArrayList();
    private ArrayList<Npc> npcs = new ArrayList();
    
    public Mesa() {
        
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    public ArrayList<Chara> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Chara> characters) {
        this.characters = characters;
    }

    public ArrayList<Monstro> getMonstros() {
        return monstros;
    }

    public void setMonstros(ArrayList<Monstro> monstros) {
        this.monstros = monstros;
    }

    public ArrayList<Npc> getNpcs() {
        return npcs;
    }

    public void setNpcs(ArrayList<Npc> npcs) {
        this.npcs = npcs;
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
