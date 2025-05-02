package br.com.voamais.Models;

public abstract class Servico {
    protected double preco;
    protected String descricao;

    public Servico(double preco, String descricao) {
        this.preco = preco;
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double calcularPreco(){
        return preco;
    }
}
