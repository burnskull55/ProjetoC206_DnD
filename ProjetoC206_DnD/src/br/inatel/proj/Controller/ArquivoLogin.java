/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Controller;

import br.inatel.proj.Model.Actor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author burns
 */
public class ArquivoLogin {
    
    public String nomeArquivo;
    
    public ArquivoLogin(String aux) {
        this.nomeArquivo = aux;
        try {
            OutputStream os = new FileOutputStream(nomeArquivo, true);
        } catch (Exception e) {
        }
    }
    
    public void salvarArquivo(ArrayList<Actor> ator){
        try {
            //salvando em um arquivo
            OutputStream os = new FileOutputStream(nomeArquivo, false);
            ObjectOutputStream osw = new ObjectOutputStream(os);
            osw.writeObject(ator);

            //fechando o arquivo
            osw.close();
            os.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public ArrayList<Actor> ler() {

        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<Actor> atores = new ArrayList<>();

        try {
            fin = new FileInputStream(nomeArquivo);
            in = new ObjectInputStream(fin);

            atores = (ArrayList<Actor>) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return atores;
    }
}
