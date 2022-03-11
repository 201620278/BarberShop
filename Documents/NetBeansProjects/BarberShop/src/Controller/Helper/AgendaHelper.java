/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cicer
 */
public class AgendaHelper implements IHelper {

    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {

        DefaultTableModel tableModel = (DefaultTableModel) view.getTblAgendamento().getModel();
        tableModel.setNumRows(0);

        //Percorrer a lista preenchendo o tableModel 
        for (Agendamento agendamento : agendamentos) {

            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });

        }

    }

    public void obterCliente(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getCboNomeCliente().getModel();
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
        }
    }

    public void obterServico(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getCboServicoCliente().getModel();
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    }

    public Cliente obterCliente() {
        return (Cliente) view.getCboNomeCliente().getSelectedItem();
    }

    public Servico obterServico() {
        return (Servico) view.getCboServicoCliente().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getTxtValor().setText(valor + "");
    }

    @Override
    public Agendamento obterModelo() {
        String idString = view.getTxtObservacao().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = AgendaHelper.this.obterCliente();
        Servico servico = AgendaHelper.this.obterServico();
        String valorString = view.getTxtValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getTxtData().getText();
        String hora =  view.getTxtHora().getText();
        String datahora = data + " " + hora;
        String observacao = view.getTxtObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, datahora,observacao);
        return agendamento;
    }

    @Override
    public void limparTela() {
       view.getTxtIdCliente().setText("0");
       view.getTxtData().setText("");
       view.getTxtHora().setText("");
       view.getTxtObservacao().setText("");
    }

}
