package oopsPrograms;

interface Playable {
    void play();  // Abstract method (no body)
    void pause();
}

interface flyable{
    void fly();
}

interface Drivable{
    void drive();
}

class FlyingCar implements flyable, Drivable{
    @Override
    public void fly() {
        System.out.println("flying car takes off.");
    }

    @Override
    public void drive() {
        System.out.println("Flying drives on road.");
    }
}

class MusicPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Music playing");
    }

    @Override
    public void pause() {
        System.out.println("Music Paused");
    }
}

public class InterfaceJava {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.play();
        mp.pause();

        FlyingCar fc = new FlyingCar();
        fc.drive();
        fc.fly();

    }
}

//MusicPlayer must implement all methods of Playable.

//Interface acts as a guarantee that the class has these methods.