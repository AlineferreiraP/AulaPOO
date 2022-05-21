/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Aline Ferreira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente clienteA = new Cliente();
        Cliente clienteB = new Cliente();
        
       double saldoA = clienteA.informarSaldo();
        System.out.println(saldoA);
    }
    
}
