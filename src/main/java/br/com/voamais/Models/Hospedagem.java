package br.com.voamais.Models;

public class Hospedagem  extends Servico{
    private String nome;
    private String local;

    public Hospedagem(double preco, String descricao, String local, String nome) {
        super(preco, descricao);
        this.local = local;
        this.nome = nome;
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
        return preco;
    }
}
