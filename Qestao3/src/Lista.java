import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;


    public Lista(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adicionar(T elemento) {
        if(tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public void limpar() {
        if(tamanho > 0) {
            this.tamanho = 0;
        }
    }



    @Override
    public String toString() {

        StringBuffer s = new StringBuffer();
        s.append("[");
        
        for(int i=0; i < tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(",");
        }

        if(tamanho > 0) {
            s.append(elementos[tamanho - 1]);

        }
        s.append("]");
        return s.toString();
    }
}
