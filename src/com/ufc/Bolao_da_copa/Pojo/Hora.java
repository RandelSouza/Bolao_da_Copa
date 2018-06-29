package com.ufc.Bolao_da_copa.Pojo;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author randel
 */
// Classe Hora. Contém o método lerHora que recupera a hora atual do sistema e seta de forma formatada
// em uma variável String denominada hora. 
public class Hora {
   
    private String hora;                                                  // String que receberá a hora atual do sistema.
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss"); // Formata em hora:minuto:segundo Ex: 07:46:45.
    Date horaAtual;                                                       // Variável do tipo Date que buscará a hora atual do sistema.

    // Método lerHora. A variável horaAtual recebe uma nova Date, com isso a hora atual do sistema será atribuída a ela.
    public void lerHora(){
        horaAtual = new Date();                                           // Atribuição de uma nova Date a variável horaAtual.
        setHora(simpleDateFormat.format(horaAtual));                      // Setando a horaAtual de forma formarada dentro da Variável hora através de setHora.                                                                         
    }                                                                     
    
    // Recupera a hora. 
     public String getHora() {
        return hora;
    }

   // Atribuí uma hora.
    public void setHora(String hora) {
        this.hora = hora;
    }
}
