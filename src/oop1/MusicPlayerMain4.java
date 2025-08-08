package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // music player start
        player.on();

        // volume up
        player.volumeUp();

        // volume up
        player.volumeUp();

        // volume down
        player.volumeDown();

        // music player status
        player.showStatus();

        // music player stop
        player.off();
    }

}
