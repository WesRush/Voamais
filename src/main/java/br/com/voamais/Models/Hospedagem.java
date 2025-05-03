package br.com.voamais.Models;

import java.time.LocalDate;

public class Hospedagem  extends Servico{
    private String nome;
    private String local;
    private String tipoQuarto;
    private LocalDate checkIn;
    private LocalDate checkOut;


    public Hospedagem(double preco, String descricao, String local, String nome, String tipoQuarto,LocalDate checkIn, LocalDate checkOut) {
        super(preco, descricao);
        this.local = local;
        this.nome = nome;
        this.tipoQuarto = tipoQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public double calcularPreco() {
       long diarias = java.time.temporal.ChronoUnit.DAYS.between(checkIn, checkOut);
       return preco*diarias;
    }
    public String exibirResumoHospedagem() {
        return "Hospedagem | Nome da hospedagem: "+ nome+
                "| Endereço: "+local +" | Tipo de quarto: "+ tipoQuarto +"| Data da reserva - "+checkIn+" // "+checkOut+" | Valor: "+calcularPreco() ;
    }
}
