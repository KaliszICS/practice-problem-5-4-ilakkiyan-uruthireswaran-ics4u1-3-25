public class RadioPlayer implements Player{
    protected boolean onOff;
    protected double[] stationList;
    protected int volume;
    protected double station;
    protected int stationIndex;

    public RadioPlayer(double[] list) {
        this.stationList = list;
        this.volume = 0;
        this.onOff = false;
        this.station = 0;
    }

    public void start() {
        if (this.onOff == false) {
            onOff = true;
            station = stationList[0];
            stationIndex = 0;
        }
    }

    public void stop() {
        if (this.onOff == true) {
            onOff = false;
            station = 0;
        }
    }

    public boolean getOnOff() {
        return onOff;
    }

    public void volumeUp() {
        volume += 2;
    }

    public void volumeDown() {
        volume -= 2;
    }

    public int getVolume() {
        return volume;
    }

    public void next() {
        stationIndex++;
        station = stationList[stationIndex];
    }

    public void previous() {
        stationIndex--;
        station = stationList[stationIndex];
    }

    public double getStation() {
        return station;
    }
}
