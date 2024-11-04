import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Graph {
    public List<Puntik> puntiky;

    public Graph(List<Puntik> puntiky) {
        this.puntiky = puntiky;
    }

    public void addPuntik(Puntik puntik) {
        puntiky.add(puntik);
    }

    public ArrayList<Puntik> dfs(){
        Stack<Puntik> fronta = new Stack<>();
        ArrayList<Puntik> visited = new ArrayList<>();

        Puntik start = puntiky.get(0);
        fronta.add(start);
        visited.add(start);

        while (!fronta.empty()) {
            Puntik puntik = fronta.pop();

            if (!visited.contains(puntik)) {
                visited.add(puntik);
            }

            for (Puntik neighbor : puntik.getNeighbours()) {
                if (!visited.contains(neighbor)) {
                    fronta.add(neighbor);
                }
            }
        }

        return visited;
    }

}
