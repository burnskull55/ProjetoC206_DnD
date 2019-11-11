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
    
    private Atribute str = new Atribute();
    private Atribute dex = new Atribute();
    private Atribute con = new Atribute();
    private Atribute iNt = new Atribute();
    private Atribute wis = new Atribute();
    private Atribute cha = new Atribute();
    private Dice hitDice = new Dice();
    private Inventario inventario = new Inventario();
    private Grimorio spellbook = new Grimorio();

   
    public String showChar() {
        String aux = "Char: "+nome+"\n"
                + "Race: "+race+"\n"
                + "Class: "+classe+"\n"
                + "Level: "+level+"\n"
                + "Background: "+backGround+"\n"
                + "Alignment: "+alignment+"\n"
                + "Total HP: "+hp+"\n";
        return aux;
    }
    public String showCombat(){
        String aux = "Iniciative: "+initiative+"\n"
                + "Speed: "+speed+"\n"
                + "Armor Class: "+ac+"\n"
                + "Proficiency: "+proficiency+"\n";
        return aux;
    }
    public String showAtributos(){
        String aux = "str: "+str+"\n"
                + "dex: "+dex+"\n"
                + "con: "+con+"\n"
                + "int: "+iNt+"\n"
                + "wis: "+wis+"\n"
                + "cha: "+cha+"\n";
        return aux;
    }
    
    
    
    
    //get and set
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getProficiency() {
        return proficiency;
    }

    public void setProficiency(int proficiency) {
        this.proficiency = proficiency;
    }

    public int getGoldP() {
        return goldP;
    }

    public void setGoldP(int goldP) {
        this.goldP = goldP;
    }

    public int getCopperP() {
        return copperP;
    }

    public void setCopperP(int copperP) {
        this.copperP = copperP;
    }

    public int getSilverP() {
        return silverP;
    }

    public void setSilverP(int silverP) {
        this.silverP = silverP;
    }

    public Atribute getStr() {
        return str;
    }

    public void setStr(Atribute Str) {
        this.str = Str;
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

    public Dice getHitDice() {
        return hitDice;
    }

    public void setHitDice(Dice hitDice) {
        this.hitDice = hitDice;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    
}
