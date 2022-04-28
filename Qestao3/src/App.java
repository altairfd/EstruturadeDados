public class App {
    public static void main(String[] args) throws Exception {
        Lista<String> lista1 = new  Lista<>(3);
        lista1.adicionar("A");
        lista1.adicionar("B");
        lista1.adicionar("C");
        System.out.println(lista1);
        System.out.println("----");
        lista1.limpar();
        System.out.println(lista1);
    }
}
