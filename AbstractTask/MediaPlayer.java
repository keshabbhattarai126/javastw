interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class MediaPlay {
    void play() {
        System.out.println("Playing media...");
    }

    void pause() {
        System.out.println("Media paused.");
    }

    void stop() {
        System.out.println("Media stopped.");
    }
}

class VideoPlayer extends MediaPlay implements Playlist {
    public void rewind() {
        System.out.println("Rewinding video...");
    }

    public void fastForward() {
        System.out.println("Fast forwarding video...");
    }

    public void addSong(String song) {
        System.out.println("Song added: " + song);
    }

    public void removeSong(String song) {
        System.out.println("Song removed: " + song);
    }
}

public class MediaPlayer {
    public static void main(String[] args) {
        VideoPlayer player = new VideoPlayer();
        player.play();
        player.pause();
        player.rewind();
        player.addSong("Song 1");
    }
}
