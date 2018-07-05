import games.Game;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class Bookmaker {

    private Set<Game> games;

    public Bookmaker() {
        games = new HashSet<>();
    }

    public void listGames() {
        System.out.println("Games to choose:");
        Iterator<Game> it = games.iterator();
        while(it.hasNext()){
            Game g = it.next();
            System.out.println(g.getClass().getSimpleName());
        }
    }

    public void postResults() {
        System.out.println("Bookmaker: Posting results:");
        for (Game g : games) {
            g.notifyAllDevices();
        }
    }

    public void addGame(Game g) {
        System.out.println("New game: " + g.getClass().getSimpleName() + " added.");
        games.add(g);
    }
}
