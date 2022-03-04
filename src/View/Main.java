/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import Model.Agendamento;
import javax.swing.JOptionPane;

/**
 *
 * @author cicer
 */
public class Main {
    public static void main(String[] args){
    
    String nome = "Diego";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "corte e Barba", 35);
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        
        Cliente cliente = new Cliente(1, "Diego", "rua teste", "63031590");
        System.out.println(cliente.getNome());
        
        //Usuario user = new Usuario(1, "Beatriz", "123", "medio");
        //System.out.println(user.getNome());
        
        
      Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "05/03/2020 09:30");
        JOptionPane.showMessageDialog(null, agendamento.getCliente().getNome());
      System.out.println(agendamento.getCliente().getNome());
    
    }
    
}
