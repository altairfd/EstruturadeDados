package br.edu.testes;

import br.edu.iftm.estruturadedados.classes.Fila;

public class Main {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();
        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.enfileirar("D");
        fila.enfileirar("E");
        fila.enfileirar("F");
        System.out.println("A fila está vazia?" + fila.estaVazia());
        System.out.printf("O tamanho da fila é: %s \n", fila.tamanho());
        System.out.println(fila);
        System.out.println("O Primeiro elemento " + fila.espiar());
        System.out.println("O valor desenfileirado foi:" + fila.desenfileirar());
        System.out.println(fila);
    }
}
