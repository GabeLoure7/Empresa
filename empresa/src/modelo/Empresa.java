/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Empresa {
    private     Integer codigo;
    private String nome_fantasma;
    private String razao_social;

    public  Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome_fantasma() {
        return nome_fantasma;
    }

    public void setNome_fantasma(String nome_fantasma) {
        this.nome_fantasma = nome_fantasma;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    @Override
    public String toString() {
        return "Modelo{" + "razao_social=" + razao_social + '}';
    }
    
}
