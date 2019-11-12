/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Controller;

import br.inatel.proj.Model.Actor;
import br.inatel.proj.Model.DungeonMaster;
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
    
    public ArquivoLogin() {
        try {
            OutputStream os = new FileOutputStream("login.txt", true);
        } catch (Exception e) {
        }
    }
    
    public void salvarArquivo(ArrayList<DungeonMaster> dm){
        try {
            //salvando em um arquivo
            OutputStream os = new FileOutputStream("login.txt", false);
            ObjectOutputStream osw = new ObjectOutputStream(os);
            osw.writeObject(dm);

            //fechando o arquivo
            osw.close();
            os.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public ArrayList<DungeonMaster> ler() {

        FileInputStream fin;
        ObjectInputStream in;
        ArrayList<DungeonMaster> dms = new ArrayList<>();

        try {
            fin = new FileInputStream("login.txt");
            in = new ObjectInputStream(fin);

            dms = (ArrayList<DungeonMaster>) in.readObject();

            in.close();
            fin.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return dms;
    }
}
