package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void on() {
        isOn = true;
        System.out.println( "music player start");
    }

    void off() {
        isOn = false;
        System.out.println( "music player stop");
    }

    void volumeUp() {
        volume++;
        System.out.println( "volume up : " + volume );
    }

    void volumeDown() {
        volume--;
        System.out.println( "volume down : " + volume );
    }

    void showStatus() {
        System.out.println( "music player status");
        if(isOn) {
            System.out.println( "music player is on");
        } else {
            System.out.println( "music player is off");
        }
    }
}
