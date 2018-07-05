package games;

import devices.Device;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public abstract class Game {

    protected int result;

    protected Set<Device> users;

    public Game(){
        this.users = new HashSet<>();
    }

    public void notifyAllDevices(){
        play();
        Iterator<Device> it = users.iterator();
        while(it.hasNext()){
            Device d = it.next();
            d.notify(this.result, this);
        }
    }

    protected abstract void play();

    public void register(Device d){
        this.users.add(d);
    }

    public void unregister(Device d){
        this.users.remove(d);
    }
}