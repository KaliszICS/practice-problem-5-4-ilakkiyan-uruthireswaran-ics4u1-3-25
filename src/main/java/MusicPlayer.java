public class MusicPlayer implements Player {
    protected boolean onOff;
    protected String[] musicList;
    protected String currentSong;
    protected int volume;
    protected int currentSongIndex;

    public MusicPlayer(String[] list) {
        this.musicList = list;
        this.volume = 0;
        this.onOff = false;
        this.currentSong = "";
    }

    public void start() {
        if (this.onOff == false) {
            onOff = true;
            currentSong = musicList[0];
            currentSongIndex = 0;
        }
    }

    public void stop() {
        if (this.onOff == true) {
            onOff = false;
            currentSong = "";
        }
    }

    public boolean getOnOff() {
        return onOff;
    }

    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        volume--;
    }

    public int getVolume() {
        return volume;
    }

    public void next() {
        currentSongIndex++;
        currentSong = musicList[currentSongIndex];
    }

    public void previous() {
        currentSongIndex--;
        currentSong = musicList[currentSongIndex];
    }

    public String getCurrentSong() {
        return currentSong;
    }
}
