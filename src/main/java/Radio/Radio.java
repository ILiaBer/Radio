package Radio;

public class Radio {
    String fm;
    int stationNumber;
    int volume;
    private int maxVolume;
    private int minVolume;
    private int maxStationNumber;
    private int minStationNumber;
    boolean on;

    public String getFm() {
        return fm;
    }

    public void setFm(String FM) {
        this.fm = fm;
    }

    public void nextChanel() {
        if (stationNumber < maxStationNumber) {
            stationNumber++; }
        else {
            stationNumber = minStationNumber;
        }
    }

    public void prevChanel() {
        if (stationNumber > minStationNumber) {
            stationNumber--;
        }
        else {
            stationNumber = maxStationNumber;
        }
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber > maxStationNumber) {
            return;
        }
        if (stationNumber < minStationNumber) {
            return;
        }
        this.stationNumber = stationNumber;

    }

    public void nextVolume() {
        if (volume < maxVolume) {
            volume++;
        } else {
            volume = maxVolume;
        }
    }

    public void prevVolume() {
        if (volume > minVolume) {
            volume--;
        } else {
            volume = minVolume;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {

        if (volume > maxVolume) {
            this.volume = maxVolume;
            return;
        }
        if (volume < minVolume) {
            return;
        }
        this.volume = volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public void setMaxStationNumber(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public void setMinStationNumber(int minStationNumber) {
        this.minStationNumber = minStationNumber;
    }


}
