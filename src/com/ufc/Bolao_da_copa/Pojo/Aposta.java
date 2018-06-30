package com.ufc.Bolao_da_copa.Pojo;
/**
 *
 * @author randel
 */
public class Aposta {  
     
    private Integer uid;                          // Identificador do usuário.
    private Integer palpite_gols_time_visitante;  // Guardará o palpite de gols para o time visitante.
    private Integer palpite_gols_time_casa;       // Guardará o palpite de gols para o time da casa.
    private boolean empate;                       // Valor boleano. Não esta sendo usado.
    private Integer pontos_usuario;               // Ainda não esta sendo utilizado.
    private int pid;                              // Identificador da partida.
    private int aid;                              // Identificador da aposta.
    private String pesquisa;                      // Guarda a pesquisa.

    // Obtem a pesquisa.
    public String getPesquisa() {
        return pesquisa;
    }
     
    // Atribui a pesquisa.
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    // Obtem o identificador da aposta.
    public int getAid() {
        return aid;
    }

    // Atribui o identificador da aposta.
    public void setAid(int aid) {
        this.aid = aid;
    }
    
    // Obtem o identificador da partida.
    public int getPid() {
        return pid;
    }

    // Atribui o identificador da partida.
    public void setPid(int pid) {
        this.pid = pid;
    }
    
    // Obtem o identificador do usuário.
    public Integer getUid() {
        return uid;
    }

    // Atribui o identificador do usuário.
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    // Obtem o palpite de gols do time Visitante.
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
