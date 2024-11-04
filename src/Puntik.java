import java.util.ArrayList;
import java.util.List;

public class Puntik {

    private final List<Puntik> neighbours = new ArrayList<>();
    private final String name;

    public Puntik(String name) {
        this.name = name;
    }

    public List<Puntik> getNeighbours(){
        return neighbours;
    }

    @Override
    public String toString(){
        return name;
    }

    public void addNeighbour(Puntik neighbour) {
        neighbours.add(neighbour);
    }
}
