package br.com.voamais;

import br.com.voamais.Models.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Destino destino = new Destino(
                "Fernando de Noronha",
                "Brasil",
                "Pernambuco",
                true,
                true,
                true,
                600
        );


        Cliente cliente = new Cliente("João da Silva",
                "12345678901",
                true,
                1,
                0);


        Hospedagem hospedagem = new Hospedagem(
                1200.0, "Pousada com vista para o mar",
                "Centro", "Pousada do Sol",
                "Single",
                LocalDate.of(2025, 6, 10) ,
                LocalDate.of(2025, 6, 15) );

        PassagemAerea passagem = new PassagemAerea(
                4300.90,
                "Ida e volta",
                "Azul Linhas Aéreas",
                "AZ123",
                true,
                "SSA",
                "FEN");


        AluguelCarro aluguel = new AluguelCarro(
                600.0,
                "Carro popular com ar condicionado",
                "Fiat",
                "Uno",
                "2021",
                "ABC-1234",
                LocalDate.of(2025, 6, 10),
                LocalDate.of(2025, 6, 15)
        );

        Translado translado = new Translado(150.0,
                "Translado do aeroporto até a pousada",
                "Aeroporto saída B" ,LocalTime.of(14,50),
                LocalDate.of(2025,06,10));

        Pacote pacote = new Pacote(
                destino,
                cliente,
                0,
                hospedagem,
                passagem,
                aluguel,
                translado, LocalDate.of(2025, 6, 10),
                LocalDate.of(2025, 6, 15));


        System.out.println("--------------- Resumo do Pacote ------------------------------------------------");
        System.out.println(cliente.exibirResumoCliente());
        System.out.println("-------------Serviços inclusos----------------------------------------------------");
        System.out.println(destino.exibirResumoDestino());
        System.out.println(passagem.exibirResumoPassagemAerea());
        System.out.println(translado.exibirResumoTranslado());
        System.out.println(aluguel.exibirResumoAluguelCarro());
        System.out.println(hospedagem.exibirResumoHospedagem());

        System.out.println(pacote.exibirPrecoFinal());

    }
}
