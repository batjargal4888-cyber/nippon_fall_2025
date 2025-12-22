public class VideoPlayer implements Playable {
    private String videoName;

    public VideoPlayer(String videoName) {
        this.videoName = videoName;
    }

    @Override
    public void play() {
        System.out.println("Video player started playing: " + videoName);
    }

    @Override
    public void pause() {
        System.out.println("Video player paused: " + videoName);
    }

    @Override
    public void stop() {
        System.out.println("Video player stopped playing: " + videoName);
    }
    
}
