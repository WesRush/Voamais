package br.com.voamais.Models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Translado extends Servico {
    private LocalDate dataSaida;
    private LocalTime horaPartida;
    private String localEspera;

    public Translado(double preco, String descricao, String localEspera) {
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

    public void setHoraPartida(LocalTime horaPartida) {
        this.horaPartida = horaPartida;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }
    @Override
    public double calcularPreco() {
        return preco;
    }
    public String exibirResumoTranslado(){
        return "Local de espera: " + localEspera +" | "+ "Data "+ dataSaida +" | "+ "Hora de partida: " + horaPartida;
    }

}
