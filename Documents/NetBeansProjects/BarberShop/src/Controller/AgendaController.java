/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cicer
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        
        // Busca uma lida com os agendamento no banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        // Exibir essa lista na view
        helper.preencherTabela(agendamentos);
    }
    public void atualizCliente(){  
    //pegar os objetos cliente no banco de dados
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
    // Exibir os clinete no comboBox Cliente
        helper.obterCliente(clientes);
    }
    
    public void atualizaServico(){
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        helper.obterServico(servicos);
    } 
    
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    public void agendar(){
        try {
            Agendamento agendamento = helper.obterModelo();
            new AgendamentoDAO().insert(agendamento);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
//Busca um objeto Agendamento da tela
        
        //Salva esse mesmo Objeto no bcanco de dados
        
        
        //Atualizando a tabela
        atualizaTabela();
        helper.limparTela();
        
    }
}
