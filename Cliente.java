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
public class Cliente {
    private int agencia;
    private String contaCorrente;
    private String cpf;
    private double saldoCC;
    
    public Cliente () {
        
        
    }
    
    public void sacarContaCorrente(double valor) {
        if(this.saldoCC > valor) {
            this.saldoCC = this.saldoCC - valor;
        }
    }
    public double informarSaldo() {
        return this.saldoCC;
    }
}
