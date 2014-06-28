/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.App;

import br.edu.ifes.control.CalculaImposto;
import br.edu.ifes.model.IsentoTaxa;
/**
 *
 * @author Henrique
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculaImposto calcImposto; 
        calcImposto = new CalculaImposto(new IsentoTaxa(), 33.3);
    }
    
}
