package br.com.voamais.Models;


import java.time.LocalDate;


public class Pacote {
    private  Destino destino;
    private  Cliente cliente;
    private double precoFinal;
    private Hospedagem hospedagem;
    private PassagemAerea passagem;
    private AluguelCarro aluguelCarro;
    private Translado translado;
    private LocalDate dataInicio;
    private  LocalDate dataFim;


    public Pacote(Destino destino, Cliente cliente, double precoFinal, Hospedagem hospedagem, PassagemAerea passagem, AluguelCarro aluguelCarro, Translado translado, LocalDate dataInicio, LocalDate dataFim) {
        this.destino = destino;
        this.cliente = cliente;
        this.precoFinal = precoFinal;
        this.hospedagem = hospedagem;
        this.passagem = passagem;
        this.aluguelCarro = aluguelCarro;
        this.translado = translado;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.precoFinal = calcularPrecoTotal();
    }

    public Destino getDestino() {
        return destino;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public PassagemAerea getPassagem() {
        return passagem;
    }

    public AluguelCarro getAluguelCarro() {
        return aluguelCarro;
    }

    public Translado getTranslado() {
        return translado;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public void setPassagem(PassagemAerea passagem) {
        this.passagem = passagem;
    }

    public void setAluguelCarro(AluguelCarro aluguelCarro) {
        this.aluguelCarro = aluguelCarro;
    }

    public void setTranslado(Translado translado) {
        this.translado = translado;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
    public double calcularPrecoTotal(){
        double total = 0;
        total+= destino.getTaxaTurismo();
        if (hospedagem != null) {
            total += hospedagem.calcularPreco();

        }
        if (passagem != null) {
            total += passagem.calcularPreco();
        }
        if (aluguelCarro != null) {
            total += aluguelCarro.calcularPreco();
        }
        if (translado != null) {
            total += translado.calcularPreco();
        }
        return total;
    }

}


