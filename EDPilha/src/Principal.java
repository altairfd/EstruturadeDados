public class Principal {
    
    public static void main(String[] args) {
        
        Pilha<String> pilha = new Pilha<>(3);
        System.out.println("Pilha");
        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");
        pilha.empilhar("D");
        pilha.empilhar("E");
        pilha.empilhar("F");
        System.out.println(pilha.topo());
        System.out.println("O elemento removido é: " + " da pilha foi: " + pilha.desempilhar());
        System.out.println(pilha.topo());
        pilha.empilhar("Z");
        System.out.println(pilha);
    }
}
