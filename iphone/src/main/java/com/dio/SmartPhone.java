package com.dio;

public class SmartPhone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Testando o Iphone como reprodutor musical
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        //Testando o Iphone como aparelho Telefônico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Testando o Iphone como navegador de internet
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();
    }
}
