package devices;

import games.Game;

public class IOSDevice extends Device {

    public void register(Game g) {
        g.register(this);
        System.out.println("IOS device registered in " + g.getClass().getSimpleName() + " game.");
    }

    public void unregister(Game g) {
        g.unregister(this);
        System.out.println("IOS device unregistered from " + g.getClass().getSimpleName() + " game.");
    }

    public void notify(int result, Game game) {
        if (gamesNotified.contains(game)) {
            System.out.println("Game: " + game.getClass().getSimpleName() + ", result: " + result + " from IOS device.");
        }
    }
}