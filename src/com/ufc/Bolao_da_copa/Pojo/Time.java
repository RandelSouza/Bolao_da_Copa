/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufc.Bolao_da_copa.Pojo;
/**
 *
 * @author randel
 */
public class Time {           
    private String tnome;
    private String nome_tecnico;
    private String pesquisa;    
    private int id;
    private byte[] imagem;    
    
    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    public String getTnome() {
        return tnome;
    }

    public void setTnome(String tnome) {
        this.tnome = tnome;
    }

    public String getNome_tecnico() {
        return nome_tecnico;
    }

    public void setNome_tecnico(String nome_tecnico) {
        this.nome_tecnico = nome_tecnico;
    }
}
