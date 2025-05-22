public class VideoPlayer implements Player{
    protected boolean onOff;
    protected String video;
    protected int currentTime;
    protected int volume;

    public VideoPlayer(String s) {
        this.video = s;
        this.volume = 0;
        this.onOff = false;
        this.currentTime = 0;
    }

    public void start() {
        if (this.onOff == false) {
            onOff = true;
        }
    }

    public void stop() {
        if (this.onOff == true) {
            onOff = false;
        }
    }

    public boolean getOnOff() {
        return onOff;
    }

    public void volumeUp() {
        volume += 5;
    }

    public void volumeDown() {
        volume -= 5;
    }

    public int getVolume() {
        return volume;
    }

    public void fastForward() {
        currentTime += 5;
    }

    public void rewind() {
        currentTime -= 5;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
