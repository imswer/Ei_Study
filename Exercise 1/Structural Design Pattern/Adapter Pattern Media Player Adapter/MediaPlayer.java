// Media Player Interface
interface MediaPlayer {
    void play(String fileName);
}

// Concrete Media Players
class MP3Player implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}

class MP4Player implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
}

class AVIPlayer implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing AVI file: " + fileName);
    }
}

// Adapter class
class MediaAdapter implements MediaPlayer {
    MediaPlayer mediaPlayer;

    public MediaAdapter(String mediaType) {
        switch (mediaType.toLowerCase()) {
            case "mp3":
                mediaPlayer = new MP3Player();
                break;
            case "mp4":
                mediaPlayer = new MP4Player();
                break;
            case "avi":
                mediaPlayer = new AVIPlayer();
                break;
        }
    }

    @Override
    public void play(String fileName) {
        mediaPlayer.play(fileName);
    }
}

// Main Class
public class AdapterPattern {
    public static void main(String[] args) {
        MediaAdapter mp3Adapter = new MediaAdapter("mp3");
        mp3Adapter.play("song.mp3");

        MediaAdapter mp4Adapter = new MediaAdapter("mp4");
        mp4Adapter.play("video.mp4");

        MediaAdapter aviAdapter = new MediaAdapter("avi");
        aviAdapter.play("movie.avi");
    }
}
