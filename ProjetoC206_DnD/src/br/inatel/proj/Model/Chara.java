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
public class Chara extends Actor implements Serializable, Comparable<Chara> {

    private String classe;
    private String initiative;
    private String speed;
    private String level;
    private String ac;
    private String proficiency;

    private String goldP;
    private String copperP;
    private String silverP;

    private Atribute str = new Atribute();
    private Atribute dex = new Atribute();
    private Atribute con = new Atribute();
    private Atribute iNt = new Atribute();
    private Atribute wis = new Atribute();
    private Atribute cha = new Atribute();

    private Inventario inventario = new Inventario();
    private Grimorio spellbook = new Grimorio();
    private String notas;

    public String showChar() {
        String aux = "Char: " + nome + "\n"
                + "Race: " + race + "\n"
                + "Class: " + classe + "\n"
                + "Level: " + level + "\n"
                + "Background: " + backGround + "\n"
                + "Alignment: " + alignment + "\n"
                + "Total HP: " + hp + "\n";
        return aux;
    }

    public String showCombat() {
        String aux = "Iniciative: " + initiative + "\n"
                + "Speed: " + speed + "\n"
                + "Armor Class: " + ac + "\n"
                + "Proficiency: " + proficiency + "\n";
        return aux;
    }

    public String showAtributos() {
        String aux = "str: " + str + "\n"
                + "dex: " + dex + "\n"
                + "con: " + con + "\n"
                + "int: " + iNt + "\n"
                + "wis: " + wis + "\n"
                + "cha: " + cha + "\n";
        return aux;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getBackGround() {
        return backGround;
    }

    public void setBackGround(String backGround) {
        this.backGround = backGround;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getHp() {
        return hp;
    }

    //get and set
    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getInitiative() {
        return initiative;
    }

    public void setInitiative(String initiative) {
        this.initiative = initiative;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public String getGoldP() {
        return goldP;
    }

    public void setGoldP(String goldP) {
        this.goldP = goldP;
    }

    public String getCopperP() {
        return copperP;
    }

    public void setCopperP(String copperP) {
        this.copperP = copperP;
    }

    public String getSilverP() {
        return silverP;
    }

    public void setSilverP(String silverP) {
        this.silverP = silverP;
    }

    public Atribute getStr() {
        return str;
    }

    public void setStr(Atribute str) {
        this.str = str;
    }

    public Atribute getDex() {
        return dex;
    }

    public void setDex(Atribute dex) {
        this.dex = dex;
    }

    public Atribute getCon() {
        return con;
    }

    public void setCon(Atribute con) {
        this.con = con;
    }

    public Atribute getiNt() {
        return iNt;
    }

    public void setiNt(Atribute iNt) {
        this.iNt = iNt;
    }

    public Atribute getWis() {
        return wis;
    }

    public void setWis(Atribute wis) {
        this.wis = wis;
    }

    public Atribute getCha() {
        return cha;
    }

    public void setCha(Atribute cha) {
        this.cha = cha;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Grimorio getSpellbook() {
        return spellbook;
    }

    public void setSpellbook(Grimorio spellbook) {
        this.spellbook = spellbook;
    }

    @Override
    public int compareTo(Chara o) {
        return this.getClasse().compareTo(o.getClasse());
    }

}
