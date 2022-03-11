/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author cicer
 */
public class Usuario extends Pessoa {

    protected String senha;
    protected String nivelAcessso;

    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario(int id, String nome, char sexo, String dataNascimento,String telefone, String email,String cpf, String senha, String nivelAcesso) {
        super(id, nome, sexo, dataNascimento, telefone, email, cpf);
        this.senha = senha;
        this.nivelAcessso = nivelAcessso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcessso() {
        return nivelAcessso;
    }

    public void setNivelAcessso(String nivelAcessso) {
        this.nivelAcessso = nivelAcessso;
    }

}
