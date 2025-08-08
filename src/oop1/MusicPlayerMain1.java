package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // music player start
        isOn = true;
        System.out.println( "music player start");

        // volume up
        volume++;
        System.out.println( "volume up : " + volume );

        // volume up
        volume++;
        System.out.println( "volume up : " + volume );

        // volume down
        volume--;
        System.out.println( "volume down : " + volume );

        // music player status
        System.out.println( "music player status");
        if(isOn) {
            System.out.println( "music player is on");
        } else {
            System.out.println( "music player is off");
        }

        // music player stop
        isOn = false;
        System.out.println( "music player stop");
    }
}
