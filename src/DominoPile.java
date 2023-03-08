import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DominoPile {
    ArrayList<Domino> pile;

    public DominoPile(ArrayList<Domino> pile) {
        this.pile = pile;
    }

    public DominoPile() {}

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void setPile(ArrayList<Domino> pile) {
        this.pile = pile;
    }

    public void newStack6()
    {
        pile = new ArrayList<>();

        for (int i = 0; i < 6 + 1; i++)
        {
            for (int j = i; j < 7; j++)
            {
                pile.add(new Domino(i, j));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(pile);
    }
}
