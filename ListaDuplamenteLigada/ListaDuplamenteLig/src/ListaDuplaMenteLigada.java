public class ListaDuplaMenteLigada {

    private No cabeca;
    private No cauda;

    // Adiciona no final da lista
    public void adicionar(No novoElemento) {
        if(this.cabeca == null) {
            this.cabeca = novoElemento;
            this.cauda = this.cabeca;
        }else {
            this.cauda.setProx(novoElemento);
            novoElemento.setAnt(this.cauda);
            this.cauda = novoElemento;
        }
    }

    // Mostrar conteudo da lista
    public void print() {
        No aux = this.cabeca;
        No fim = null;
        //imrpimir o incio e o fim
        while (aux != null) {
            String dado = aux.getDado();
            System.out.print(dado + "->" );
            fim = aux;
            aux = aux.getProx();
        }
        System.out.print("FIM\n\n");
        aux = fim;
        while (aux != null) {
            String dado = aux.getDado();
            System.out.print(dado + "->");
            aux = aux.getAnt();
        }
        System.out.print("Inicio\n\n");
    }
}
