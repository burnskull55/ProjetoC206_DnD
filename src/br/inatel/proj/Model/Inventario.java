/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.proj.Model;

import br.inatel.proj.Model.itens.Arma;
import br.inatel.proj.Model.itens.Consumables;
import br.inatel.proj.Model.itens.Pack;

/**
 *
 * @author burns
 */
class Inventario {
    private Pack pack = new Pack();
    private Consumables consumables = new Consumables();
    private Arma arma = new Arma();
    
}
