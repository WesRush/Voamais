package br.com.voamais.Models;

public class PassagemAerea extends Servico {
    private String companhia;
    private String localizador;
    private boolean idaEvolta;
    private String siglaAeroportoIda;
    private String siglaAeroportoVolta;

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getLocalizador() {
        return localizador;
    }

    public void setLocalizador(String localizador) {
        this.localizador = localizador;
    }

    public PassagemAerea(double preco, String descricao, String companhia, String numeroVoo, boolean idaEVolta, String siglaAeroportoIda, String siglaAeroportoVolta) {
        super(preco, descricao);
        this.companhia = companhia;
        this.localizador = numeroVoo;
        this.idaEvolta = idaEVolta;
        this.siglaAeroportoIda = siglaAeroportoIda;
        this.siglaAeroportoVolta = siglaAeroportoVolta;

    }

    @Override
    public double calcularPreco() {
        if (idaEvolta == true) {
            return preco *2;
        }
        return preco;
    }
    public String exibirResumoPassagemAerea() {
        return "Serviço Aéreo | "+ companhia+ "| Loc: "+ localizador +" | Destinos: "+ siglaAeroportoIda +" - "+ siglaAeroportoVolta+" | Valor: "+calcularPreco() ;
    }
}




