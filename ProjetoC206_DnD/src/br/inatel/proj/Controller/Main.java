/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Controller;

import br.inatel.proj.View.Login;
import br.inatel.proj.View.TelaMesas;

/**
 *
 * @author burns
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //chamando a tela principal e segue o baile
     try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        Login l = new Login();
        l.setVisible(true);
        
        
        
        //TODO LIST
        //TODO - MODELING 
        /*
        1-inventario
        2-dice methods . not needed
        3-Character methods
        4-monster methods
        5-npc methods
        6-class modeling 
        7-TODO
        //criar a funçao de criar um personagem , que vai colocar todas as partes do char 
        criar a funçao de add char , que vai permitir o imput manual de cada aspecto do char
        
        */
    }
    
}
