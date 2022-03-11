public class App {
    public static void main(String[] args) throws Exception {
        try {
            Vetor vetor = new Vetor(5);
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            vetor.adiciona("elemento 4");
            vetor.adiciona("elemento 5");
            vetor.adiciona("elemento 6");
            System.out.println(vetor);
        } catch (Exception e)  {
            e.printStackTrace();
        }
        
    }
}
