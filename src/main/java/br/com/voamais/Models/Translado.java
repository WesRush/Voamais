package br.com.voamais.Models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Translado extends Servico {
    private LocalDate dataSaida;
    private LocalTime horaPartida;
    private String localEspera;

    public Translado(double preco, String descricao, String localEspera,LocalTime horaPartida,LocalDate dataSaida) {
        super(preco, descricao);
        this.dataSaida = dataSaida;
        this.horaPartida = horaPartida;
        this.localEspera = localEspera;

    }

    public String getLocalEspera() {
        return localEspera;
    }

    public void setLocalEspera(String localEspera) {
        this.localEspera = localEspera;
    }

    public LocalTime getHoraPartida() {
        return horaPartida;
    }


    public LocalDate getDataSaida() {
        return dataSaida;
    }


    @Override
    public double calcularPreco() {
        return preco;
    }
    public String exibirResumoTranslado(){
        return "Serviço translado | Local de espera: " + localEspera +" | "+ "Data: "+ dataSaida +" | "+ "Hora de partida: " + horaPartida+ "| Valor: "+calcularPreco();
    }

}
