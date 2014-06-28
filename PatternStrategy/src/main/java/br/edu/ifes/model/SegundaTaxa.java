/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.model;

/**
 *
 * @author Henrique
 */
public class SegundaTaxa implements InterfaceCalculoImposto{

    @Override
    public void valorBrutoImposto(double valor) {
        System.out.println("Tributado, sua renda: $"+valor);
    }
    
}
