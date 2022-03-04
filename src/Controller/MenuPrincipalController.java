/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Agendamento;
import View.MenuPrincipal;

/**
 *
 * @author cicer
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaAgendamento(){
        Agendamento agendamento = new Agendamento();
        agendamento.setVisible(true);
    }
    
    
}
