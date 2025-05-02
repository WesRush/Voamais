package br.com.voamais.Models;

import java.util.UUID;

public class Cliente {
    private String nomeCliente;
    private String cpf;
    private boolean vip;
    private int qtdPessoasMaiorIdade;
    private int qtdPessoasMenorIdade;
    private final String id = UUID.randomUUID().toString();



    public Cliente(String nome, String cpf, boolean vip, int qtdPessoasMaiorIdade, int getQtdPessoasMenorIdade) {
        this.nomeCliente = nome;
        this.cpf = cpf;
        this.vip = vip;
        this.qtdPessoasMaiorIdade = qtdPessoasMaiorIdade;
        this.qtdPessoasMenorIdade = getQtdPessoasMenorIdade;
    }

    public Cliente(String nomeCliente, String number, boolean vip) {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        }else {
            throw new IllegalArgumentException("CPF inválido. Deve contre 11 dígitos numéricos");
        }
    }
    public int getTotalViajantes() {
        return qtdPessoasMaiorIdade + qtdPessoasMenorIdade;
    }


    public String getNome() {
        return nomeCliente;
    }

    public void setNome(String nome) {
        this.nomeCliente = nome;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getQtdPessoasMaiorIdade() {
        return qtdPessoasMaiorIdade;
    }

    public void setQtdPessoasMaiorIdade(int qtdPessoasMaiorIdade) {
        this.qtdPessoasMaiorIdade = qtdPessoasMaiorIdade;
    }

    public int getQtdPessoasMenorIdade() {
        return qtdPessoasMenorIdade;
    }

    public void setQtdPessoasMenorIdade(int qtdPessoasMenorIdade) {
        this.qtdPessoasMenorIdade = qtdPessoasMenorIdade;
    }
    public String exibirResumoCliente() {
        return "Cliente: " + nomeCliente + " | CPF: " + cpf + " | VIP: " + (vip ? "Sim" : "Não") +
                " | Adultos: " + qtdPessoasMaiorIdade + " | Crianças: " + qtdPessoasMenorIdade;
    }

}
