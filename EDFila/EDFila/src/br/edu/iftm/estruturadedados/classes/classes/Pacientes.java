package br.edu.iftm.estruturadedados.classes.classes;

public class Pacientes implements Comparable<Pacientes>{

    private String nome;
    private int prioridade;
    
    public Pacientes(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Pacientes o){
        if(this.prioridade > o.getPrioridade()){
            return 1;
        }else if (this.prioridade < o.getPrioridade()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Pacientes [Paciente =" + nome + ", prioridade =" + prioridade + "]";
    }
    
}