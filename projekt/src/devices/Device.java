package devices;

import java.util.Set;
import java.util.HashSet;
import games.Game;

public abstract class Device{

    Set<Game> gamesNotified;

    public Device(){
        this.gamesNotified = new HashSet<>();
    }

    public void addGameNotification(Game g){
        System.out.println("Device: " + this.getClass().getSimpleName() + " added notifications to game: " + g.getClass().getSimpleName() + ".");
        gamesNotified.add(g);
    }

    public abstract void notify(int result, Game game);
    public abstract void register(Game g);
    public abstract void unregister(Game g);

}