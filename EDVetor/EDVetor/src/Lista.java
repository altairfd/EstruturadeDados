import java.lang.reflect.Array;

public class Lista<T> {
    
    private T[] elementos;
    private int tamanho;
    

    public Lista(int capacidade){
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    } 

    public boolean adiciona(T elemento) {
        this.aumentarTamanho();
        if(tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    } 

    public int tamanho() {
        return tamanho;
    }

    public Object buscar(int posicao) throws IllegalAccessException {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Posição invalida");
        }
        return elementos[posicao]; 
    }

    public int buscar(T elemento) {
        for(int i = 0; i < tamanho; i++) {
            if(elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean adicionar(int posicao, T elemento) throws IllegalAccessException {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Posçao invalida");
        }
        
        this.aumentarTamanho();

        for(int i = tamanho-1; i>= posicao; i--) {
            elementos[i+1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
        return true;
    }

    public void remover(int posicao) throws IllegalAccessException {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Posçao invalida");
        }

        for(int i = posicao; i < tamanho-1; i++) {
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }

    private void aumentarTamanho() {
        if(tamanho == elementos.length) {
            T[] elementosNovos = (T[]) new Object[elementos.length+2]; {
                for(int i= 0; i < elementos.length; i++) {
                    elementosNovos[i] = elementos[i];
                }
                elementos = elementosNovos;
            }
           
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
