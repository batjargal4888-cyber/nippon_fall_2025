public class MusicPlayer implements Playable {
    private String songName;

    public MusicPlayer(String songName) {
        this.songName = songName;
    }

    @Override
    public void play() {
        System.out.println("Music player is playing: " + songName);
    }

    @Override
    public void pause() {
        System.out.println("Music player paused: " + songName);
    }

    @Override
    public void stop() {
        System.out.println("Music player stopped playing: " + songName);
    }
}
