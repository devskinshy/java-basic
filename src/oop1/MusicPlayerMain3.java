package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData player = new MusicPlayerData();

        // music player start
        on(player);

        // volume up
        volumeUp(player);

        // volume up
        volumeUp(player);

        // volume down
        volumeDown(player);

        // music player status
        showStatus(player);

        // music player stop
        off(player);
    }

    static void on(MusicPlayerData player) {
        player.isOn = true;
        System.out.println( "music player start");
    }

    static void off(MusicPlayerData player) {
        player.isOn = false;
        System.out.println( "music player stop");
    }

    static void volumeUp(MusicPlayerData player) {
        player.volume++;
        System.out.println( "volume up : " + player.volume );
    }

    static void volumeDown(MusicPlayerData player) {
        player.volume--;
        System.out.println( "volume down : " + player.volume );
    }

    static void showStatus(MusicPlayerData player) {
        System.out.println( "music player status");
        if(player.isOn) {
            System.out.println( "music player is on");
        } else {
            System.out.println( "music player is off");
        }
    }
}
