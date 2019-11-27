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
public abstract class Actor implements Serializable,Comparable<Actor>{

    protected String nome;
    protected String race;
    protected String nivel;
    protected String backGround;
    protected String alignment;
    protected String hp;
    protected String initiative;

    
}
