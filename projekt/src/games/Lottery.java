package games;

public class Lottery extends Game {

    public Lottery(){
        super();
    }

    protected void play(){
        result = super.users.size();
    }
}