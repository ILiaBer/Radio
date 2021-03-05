package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void shouldChangeChanel() {
        Radio radio = new Radio("Nord",12,50,100,0,10,0,true);
        assertEquals(5, radio.getStationNumber());
    }

    @Test
    public void shouldChangeVolume() {
        Radio radio = new Radio("Nord",5,50,100,0,10,0,true);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(11);
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void nextVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(9);
        radio.setMinVolume(0);
        radio.setVolume(10);
        radio.nextVolume();
        assertEquals(9, radio.getVolume());

    }

    @Test
    public void nextVolumeTwo() {
        Radio radio = new Radio();
        radio.setMaxVolume(9);
        radio.setMinVolume(0);
        radio.setVolume(6);
        radio.nextVolume();
        assertEquals(7, radio.getVolume());
    }

    @Test
    public void prevVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(9);
        radio.prevVolume();
        assertEquals(8, radio.getVolume());
    }
    @Test
    public void prevVolumeTwo() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(0);
        radio.prevVolume();
        assertEquals(0, radio.getVolume());
    }
    @Test
    public void nextChanel() {
        Radio radio = new Radio();
        radio.setMaxStationNumber(9);
        radio.setMinStationNumber(0);
        radio.setStationNumber(5);
        radio.nextChanel();
        assertEquals(6, radio.getStationNumber());
    }

    @Test
    public void nextChanelTwo() {
        Radio radio = new Radio();
        radio.setMaxStationNumber(9);
        radio.setMinStationNumber(0);
        radio.setStationNumber(9);
        radio.nextChanel();
        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void prevChanel() {
        Radio radio = new Radio();
        radio.setMaxStationNumber(9);
        radio.setMinStationNumber(0);
        radio.setStationNumber(5);
        radio.prevChanel();
        assertEquals(4, radio.getStationNumber());
    }

    @Test
    public void prevChanelTwo() {
        Radio radio = new Radio();
        radio.setMaxStationNumber(9);
        radio.setMinStationNumber(0);
        radio.setStationNumber(0);
        radio.prevChanel();
        assertEquals(9, radio.getStationNumber());
    }
}





