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
    public double calcularPrecoTotal(){
        double total = 0;
        total+= destino.getTaxaTurismo();
        if (hospedagem != null) {
            total += hospedagem.getpreco();

        }
        if (passagem != null) {
            total += passagem.getpreco();
        }
        if (aluguelCarro != null) {
            total += aluguelCarro.getpreco();
        }
        if (translado != null) {
            total += translado.getpreco();
        }
        return total;
        }
    }

}
