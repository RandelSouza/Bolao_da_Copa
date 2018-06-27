/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufc.Bolao_da_copa.Pojo;
import java.util.Date;

/**
 *
 * @author randel
 */
public class Partida {

    private Integer qtd_gols_time_visitante;
    private Integer qtd_gols_time_casa;
    private String estadio;
    private Date data_partida;
    private String hora;
    private Integer time_casa;
    private String pesquisa;
    private Integer Id;
    
    private Integer time_visitante;
    
       public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }    
    
    public Integer getQtd_gols_time_visitante() {
        return qtd_gols_time_visitante;
    }

    public void setQtd_gols_time_visitante(Integer qtd_gols_time_visitante) {
        this.qtd_gols_time_visitante = qtd_gols_time_visitante;
    }

    public Integer getQtd_gols_time_casa() {
        return qtd_gols_time_casa;
    }

    public void setQtd_gols_time_casa(Integer qtd_gols_time_casa) {
        this.qtd_gols_time_casa = qtd_gols_time_casa;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Date getData_partida() {
        return data_partida;
    }

    public void setData_partida(Date data_partida) {
        this.data_partida = data_partida;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Integer getTime_casa() {
        return time_casa;
    }

    public void setTime_casa(Integer time_casa) {
        this.time_casa = time_casa;
    }

    public Integer getTime_visitante() {
        return time_visitante;
    }

    public void setTime_visitante(Integer time_visitante) {
        this.time_visitante = time_visitante;
    }
}
