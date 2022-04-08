package br.edu.testes;

import br.edu.iftm.estruturadedados.classes.classes.FilaComPrioridade;
import br.edu.iftm.estruturadedados.classes.classes.Pacientes;

public class MainPrioridade {
    public static void main(String[] args) {
        FilaComPrioridade<Pacientes> fila = new FilaComPrioridade<>();

        fila.enfileirar(new Pacientes("A", 2));
        fila.enfileirar(new Pacientes("B", 1));
        fila.enfileirar(new Pacientes("D", 1));
        fila.enfileirar(new Pacientes("C", 3));
        fila.enfileirar(new Pacientes("F", 2));
        System.out.println(fila);

    }
}
