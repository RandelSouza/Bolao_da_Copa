package com.ufc.Bolao_da_copa.Pojo;
/**
 *
 * @author randel
 */
public class Aposta {  
     
    private Integer uid;                          // Identificador do usuário.
    private Integer palpite_gols_time_visitante;
    private Integer palpite_gols_time_casa;
    private boolean empate;
    private Integer pontos_usuario;
    private int pid;
    private int aid;
    private String pesquisa;

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
    
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
    
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPalpite_gols_time_visitante() {
        return palpite_gols_time_visitante;
    }

    public void setPalpite_gols_time_visitante(Integer palpite_gols_time_visitante) {
        this.palpite_gols_time_visitante = palpite_gols_time_visitante;
    }

    public Integer getPalpite_gols_time_casa() {
        return palpite_gols_time_casa;
    }

    public void setPalpite_gols_time_casa(Integer palpite_gols_time_casa) {
        this.palpite_gols_time_casa = palpite_gols_time_casa;
    }

    public boolean isEmpate() {
        return empate;
    }

    public void setEmpate(boolean empate) {
        this.empate = empate;
    }

    public Integer getPontos_usuario() {
        return pontos_usuario;
    }

    public void setPontos_usuario(Integer pontos_usuario) {
        this.pontos_usuario = pontos_usuario;
    }
}
