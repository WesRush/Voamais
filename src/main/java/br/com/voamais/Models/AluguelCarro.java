package br.com.voamais.Models;

import java.time.LocalDate;

public class AluguelCarro extends Servico{
    private String marcaCarro;
    private String modeloCarro;
    private String anoCarro;
    private String placaCarro;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public AluguelCarro(double preco, String descricao, String marcaCarro, String modeloCarro, String anoCarro, String placaCarro, LocalDate dataInicio, LocalDate dataFim) {
        super(preco, descricao);
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.anoCarro = anoCarro;
        this.placaCarro = placaCarro;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(String anoCarro) {
        this.anoCarro = anoCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
    @Override
    public double calcularPreco() {
        long dias = java.time.temporal.ChronoUnit.DAYS.between(dataInicio, dataFim);
        return preco * dias;
    }

}
