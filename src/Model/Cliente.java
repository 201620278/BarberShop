/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author cicer
 */
public class Cliente extends Pessoa{
    
    private String Endereço;
    private String cep;

    public Cliente(String Endereço, String cep, int id, String nome, char sexo, String dataNascimento, String telefone, String email, String cpf) {
        super(id, nome, sexo, dataNascimento, telefone, email, cpf);
        this.Endereço = Endereço;
        this.cep = cep;
    }

    public Cliente(int id, String nome,String Endereço, String cep) {
        super(id, nome);
        this.Endereço = Endereço;
        this.cep = cep;
    }
     
    
    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    
       
}
