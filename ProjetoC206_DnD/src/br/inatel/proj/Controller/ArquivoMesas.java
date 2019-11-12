/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Controller;

import br.inatel.proj.Model.Actor;
import br.inatel.proj.Model.Mesa;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author burns
 * @since 11/11/19
 * @version 1.0
 * classe que controla o arquivo para salvar os objetos mesa
 */
public class ArquivoMesas implements Serializable{
    private final String autor;

    public String getAutor() {
        return autor;
    }
    
    
    public ArquivoMesas(String autor) {
        this.autor = autor;
        try {
            OutputStream os = new FileOutputStream(this.autor+"Mesas.txt", true);
        } catch (FileNotFoundException e) {
        }
    }
    
    public void salvarArquivo(ArrayList<Mesa> mesa){
        try {
            //salvando em um arquivo
            OutputStream os = new FileOutputStream(this.autor+"Mesas.txt", false);
            ObjectOutputStream osw = new ObjectOutputStream(os);
            osw.writeObject(mesa);

            //fechando o arquivo
            osw.close();
            os.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public ArrayList<Mesa> ler() {

        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<Mesa> mesas = new ArrayList<>();

        try {
            fin = new FileInputStream(this.autor+"Mesas.txt");
            in = new ObjectInputStream(fin);

            mesas = (ArrayList<Mesa>) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return mesas;
    }
}
