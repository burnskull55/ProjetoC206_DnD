/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Model;

import br.inatel.proj.View.TelaControleMesa;

/**
 *
 * @author burns
 */
public class Mesa {
    private String nome;
    public TelaControleMesa tela = new TelaControleMesa();

    public Mesa() {
        
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TelaControleMesa getTela() {
        return tela;
    }

    public void setTela(TelaControleMesa tela) {
        this.tela = tela;
    }
    
    
}
