package br.com.voamais.Models;

public class PassagemAerea extends Servico{
    private  String companhia;
    private String numeroVoo;
    private boolean idaEvolta;

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public PassagemAerea(double preco, String descricao, String companhia, String numeroVoo, boolean idaEVolta) {
        super(preco, descricao);
        this.companhia = companhia;
        this.numeroVoo = numeroVoo;
        this.idaEvolta = idaEVolta;

    }

    @Override
    public double calcularPreco() {
        return preco;
    }

}
