package br.com.voamais.Models;

public class Destino {
    private String nome;
    private String pais;
    private String descricao;
    private double taxaTurismo;

    public Destino(String nome, String pais, String descricao, boolean possuiTranslado, boolean possuiHospedagem, boolean possuiAluguelCarro, double taxaTurismo) {
        this.nome = nome;
        this.pais = pais;
        this.descricao = descricao;
        this.taxaTurismo = taxaTurismo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public double getTaxaTurismo() {
        return taxaTurismo;
    }

    public void setTaxaTurismo(double taxaTurismo) {
        this.taxaTurismo = taxaTurismo;
    }
    public String exibirResumoDestino() {
        return "Destino: " + nome + ", " + pais + " | " + descricao +
                " | Taxa turismo: R$" + taxaTurismo;
    }
}
