/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancodigital;

import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;
import contas.Cliente;

/**
 *
 * @author Vaio
 */

public class BancoDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente clItem = new Cliente();
         clItem.setNome("Tonhão");
         
        Conta cc = new ContaCorrente(clItem);
        Conta cp = new ContaPoupanca(clItem);

       
        cc.depositar(200);
        cc.transferir(0.50, cp);
        cc.imprimirExtrato();
        
        cp.depositar(1.50);
        cp.imprimirExtrato();
        
        
    }
    
}
