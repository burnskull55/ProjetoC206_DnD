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
public class Npc extends Actor {

    private String notas;

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

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
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

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String showNpc() {
        String aux = "Npc: " + nome + "\n"
                + "Race: " + race + "\n"
                + "Nivel: " + nivel + "\n"
                + "Total HP: " + hp + "\n"
                + "Antecedentes: " + backGround + "\n"
                + "Alignment: " + alignment + "\n";

        return aux;

    }

    @Override
    public int compareTo(Actor o) {
        if (Integer.parseInt(this.initiative) == Integer.parseInt(o.initiative)) {
            return 0;
        } else if (Integer.parseInt(this.initiative) > Integer.parseInt(o.initiative)) {
            return 1;
        } else {
            return -1;
        }
    }

}
