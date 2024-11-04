import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Puntik puntikA = new Puntik("a");
        Puntik puntikB = new Puntik("b");
        Puntik puntikC = new Puntik("c");

        puntikA.addNeighbour(puntikB);
        puntikB.addNeighbour(puntikA);
        puntikC.addNeighbour(puntikB);
        puntikB.addNeighbour(puntikC);

        ArrayList<Puntik> list = new ArrayList<>();

        list.add(puntikA);
        list.add(puntikB);

        Graph graph = new Graph(list);

        graph.addPuntik(puntikC);

        for (int i = 0; i < graph.puntiky.size(); i++) {
            Puntik puntik = graph.puntiky.get(i);

            System.out.println("nazev puntiku: " + puntik);

            for (int j = 0; j < puntik.getNeighbours().size(); j++) {
                System.out.println("-- Sousedím s " + puntik.getNeighbours().get(j));
            }

        }

        ArrayList<Puntik> result = graph.dfs();

        for (Puntik puntik : result) {
            System.out.println(puntik);
        }

    }
}
