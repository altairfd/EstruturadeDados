public class Main {
    public static void main(String[] args) {
        ListaDuplaMenteLigada lista = new ListaDuplaMenteLigada();
        No novoElemento = new No("A", null, null);
        lista.adicionar(novoElemento);
        lista.adicionar(new No("B", null, null));
        lista.adicionar(new No("C", null, null));
        lista.adicionar(new No("D", null, null));
        novoElemento = new No("E", null, null);
        lista.print();

    }
}
