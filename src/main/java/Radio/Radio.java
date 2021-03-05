package Radio;

import lombok.Data;

@Data

public class Radio {
    String fm;
    int stationNumber = 10;
    int volume = 50;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxStationNumber = 10;
    private int minStationNumber = 10;
    boolean on;

    public Radio(String fm, int stationNumber, int volume, int maxVolume, int minVolume, int maxStationNumber, int minStationNumber, boolean on) {
        this.fm = fm;
        this.stationNumber = stationNumber;
        this.volume = volume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.maxStationNumber = maxStationNumber;
        this.minStationNumber = minStationNumber;
        this.on = on;
    }

    public Radio() {
    }


    public void nextChanel() {
        if (stationNumber < maxStationNumber) {
            stationNumber++;
        } else {
            stationNumber = minStationNumber;
        }
    }

    public void prevChanel() {
        if (stationNumber > minStationNumber) {
            stationNumber--;
        } else {
            stationNumber = maxStationNumber;
        }
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
}




