public class ListaLigada {
    private No cabeca;
    private No cauda;

    //metodo que adiciona no final da lista
    public void adicionar(No novoElemento) {
        if (cabeca == null) {
            this.cabeca = novoElemento;
            this.cauda = cabeca;
        } else {
            cauda.setProx(novoElemento);
            cauda = novoElemento;
        }
    }

    public void imprimir() {
        No aux = cabeca;
        while(aux != null) {
            System.out.print(aux.getDado() + " -> ");
            aux = aux.getProx();
        }
        System.out.println("Fim\n\n");
    }
}
