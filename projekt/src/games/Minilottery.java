package games;

public class Minilottery extends Game {

    public Minilottery(){
        super();
    }

    protected void play(){
        result = super.users.size();
    }
}