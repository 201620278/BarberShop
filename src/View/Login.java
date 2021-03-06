/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LoginController;
import Model.DAO.Banco;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author tiago
 */
public class Login extends javax.swing.JFrame {

    private final LoginController Controller;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        Controller = new LoginController(this);
        Banco.inicia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonEntrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        LabelSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        LabelUsuario = new javax.swing.JLabel();
        LabelTituloLogin = new javax.swing.JLabel();
        LabelPainelFundo = new javax.swing.JLabel();
        LabelLoginFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonEntrar.setBackground(new java.awt.Color(164, 152, 152));
        ButtonEntrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ButtonEntrar.setText("Entrar");
        ButtonEntrar.setActionCommand("ButtonEntrar");
        ButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 220, 40));

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 260, 40));

        LabelSenha.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        LabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        LabelSenha.setText("Senha");
        getContentPane().add(LabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 60, -1));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 260, 40));

        LabelUsuario.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        LabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsuario.setText("Usuario");
        getContentPane().add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 70, -1));

        LabelTituloLogin.setFont(new java.awt.Font("Courier 10 Pitch", 1, 36)); // NOI18N
        LabelTituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        LabelTituloLogin.setText("Login");
        getContentPane().add(LabelTituloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        LabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/painel-login.png"))); // NOI18N
        getContentPane().add(LabelPainelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 310, 310));

        LabelLoginFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Logo.jpg"))); // NOI18N
        getContentPane().add(LabelLoginFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarActionPerformed
        // TODO add your handling code here:
        this.Controller.logar();
    }//GEN-LAST:event_ButtonEntrarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEntrar;
    private javax.swing.JLabel LabelLoginFundo;
    private javax.swing.JLabel LabelPainelFundo;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelTituloLogin;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public JPasswordField getTextSenha() {
        return txtSenha;
    }

    public void setTextSenha(JPasswordField TextSenha) {
        this.txtSenha = TextSenha;
    }

    public JTextField getTextUsuario() {
        return txtUsuario;
    }

    public void setTextUsuario(JTextField TextUsuario) {
        this.txtUsuario = TextUsuario;
    }
    
    
    
}
