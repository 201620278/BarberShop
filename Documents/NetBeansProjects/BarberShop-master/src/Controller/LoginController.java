/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author cicer
 */
public class LoginController {

    private final Login view;
    private LoginHelper Helper;

    public LoginController(Login view) {
        this.view = view;
        this.Helper = new LoginHelper(view);
    }
    
    public void logar(){
       Usuario usuario = Helper.obterModelo();
       
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
       
       if(usuarioAutenticado != null){
           //direciona para o menu principal
           MenuPrincipal menu = new MenuPrincipal();
           menu.setVisible(true);
           this.view.dispose();
       }else{
           view.exibeMensagem("Usuario ou senha inválida");
       }
        
    }
    
    
    
    public void fizTarefa() {
        System.out.println("Busquei os dados no banco de dados");
        this.view.exibeMensagem("O fiz tarefa foi executado");
    }
    
    
    
}
