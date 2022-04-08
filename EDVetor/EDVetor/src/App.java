import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.event.ListDataEvent;

public class App {
    public static void main(String[] args) {
        
        try {
            
            //List <Contato> lista = new ArrayList<>();
            LinkedList<Contato> listaEncadeada = new LinkedList<>();
        
            /*Lista<Contato> lista = new Lista<>(3);
            Lista<String> lista2 = new Lista<>(10);
            Lista<Integer> lista3 = new Lista<>(10);*/
			Contato c1 = new Contato("c1", "111-1111", "c1@email.com.br");
			Contato c2 = new Contato("c2", "222-2222", "c2@email.com.br");
			Contato c3 = new Contato("c3", "333-3333", "c3@email.com.br");
            Contato c4 = new Contato("c4", "123-5555", "c4@email.com");
            Contato c5 = new Contato("c5", "1595-555", "c5@email.com");
/*             lista.adiciona(c1);
			lista.adiciona(c2);
			lista.adiciona(c3);
            lista2.adiciona("A");
            lista3.adiciona(10);
            System.out.println(lista); */


        	/*VetorObjeto vetor = new VetorObjeto(3);
			Contato c1 = new Contato("c1", "111-1111", "c1@email.com.br");
			Contato c2 = new Contato("c2", "222-2222", "c2@email.com.br");
			Contato c3 = new Contato("c3", "333-3333", "c3@email.com.br");
			vetor.adiciona(c1);
			vetor.adiciona(c2);
			vetor.adiciona(c3);
			System.out.println(vetor);
			/*vetor.adiciona(2);
			vetor.adiciona(3);
			vetor.adiciona(5);
			vetor.adiciona(0, 1);
			vetor.adiciona(3, 4);
			System.out.println(vetor);
			vetor.remover(0);
			vetor.remover(2);
			System.out.println(vetor);*/
			//System.out.println(vetor.busca(2));
			//System.out.println(vetor.busca("E"));
 /*            lista.add(c1);
            lista.add(c2);
            lista.add(0, c3);
            System.out.println("Tamanho: " + lista.size()); */

            listaEncadeada.add(c1);
            listaEncadeada.add(c3);
            listaEncadeada.add(1, c2);
            listaEncadeada.addFirst(c4);
            listaEncadeada.addLast(c5);
            System.out.println(listaEncadeada.contains(c3));
            System.out.println(listaEncadeada.get(1));
            listaEncadeada.remove();
            System.out.println("-");
            System.out.println(listaEncadeada);
            System.out.println(listaEncadeada.contains(c5
            ));


		} catch (Exception e) {			
			e.printStackTrace();
		}
        
    }
}
