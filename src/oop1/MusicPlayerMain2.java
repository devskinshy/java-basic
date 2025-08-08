package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData player = new MusicPlayerData();

        // music player start
        player.isOn = true;
        System.out.println( "music player start");

        // volume up
        player.volume++;
        System.out.println( "volume up : " + player.volume );

        // volume up
        player.volume++;
        System.out.println( "volume up : " + player.volume );

        // volume down
        player.volume--;
        System.out.println( "volume down : " + player.volume );

        // music player status
        System.out.println( "music player status");
        if(player.isOn) {
            System.out.println( "music player is on");
        } else {
            System.out.println( "music player is off");
        }

        // music player stop
        player.isOn = false;
        System.out.println( "music player stop");
    }
}
