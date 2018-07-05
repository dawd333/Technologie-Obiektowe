import devices.AndroidDevice;
import devices.BBerryDevice;
import devices.IOSDevice;
import devices.WinPhoneDevice;
import games.Lottery;
import games.Minilottery;

public class Main {
    public static void main (String[] args) {
        Bookmaker bookmaker = new Bookmaker();
        Lottery lottery = new Lottery();
        Minilottery minilottery = new Minilottery();
        bookmaker.addGame(lottery);
        bookmaker.addGame(minilottery);
        bookmaker.listGames();
        AndroidDevice androidDevice = new AndroidDevice();
        androidDevice.register(lottery);
        androidDevice.register(minilottery);
        androidDevice.addGameNotification(lottery);
        androidDevice.addGameNotification(minilottery);
        IOSDevice iosDevice = new IOSDevice();
        iosDevice.register(minilottery);
        iosDevice.addGameNotification(minilottery);
        bookmaker.postResults();
        BBerryDevice bBerryDevice = new BBerryDevice();
        bBerryDevice.register(minilottery);
        bBerryDevice.register(lottery);
        WinPhoneDevice winPhoneDevice = new WinPhoneDevice();
        winPhoneDevice.register(minilottery);
        winPhoneDevice.register(lottery);
        winPhoneDevice.addGameNotification(lottery);
        bookmaker.postResults();
        androidDevice.unregister(lottery);
        bookmaker.postResults();
    }
}