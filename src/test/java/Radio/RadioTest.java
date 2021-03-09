package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void shouldChangeChanel() {
        Radio radio = new Radio("Nord",10);
        radio.setMinStationNumber(0);
        radio.setStationNumber(11);
        assertEquals(10, radio.getStationNumber());
    }

    @Test
    public void shouldChangeVolume() {
        Radio radio = new Radio(100);
        radio.setMinVolume(0);
        radio.setVolume(11);
        assertEquals(11, radio.getVolume());
    }

    @Test
    public void nextVolume() {
        Radio radio = new Radio(100);
        radio.setMinVolume(0);
        radio.setVolume(10);
        radio.nextVolume();
        assertEquals(11, radio.getVolume());

    }

    @Test
    public void nextVolumeTwo() {
        Radio radio = new Radio(100);
        radio.setMinVolume(0);
        radio.setVolume(100);
        radio.nextVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void prevVolume() {
        Radio radio = new Radio(100);
        radio.setMinVolume(0);
        radio.setVolume(9);
        radio.prevVolume();
        assertEquals(8, radio.getVolume());
    }
    @Test
    public void prevVolumeTwo() {
        Radio radio = new Radio(100);
        radio.setMinVolume(0);
        radio.setVolume(0);
        radio.prevVolume();
        assertEquals(0, radio.getVolume());
    }
    @Test
    public void nextChanel() {
        Radio radio = new Radio("Nord",10);
        radio.setMinStationNumber(0);
        radio.setStationNumber(5);
        radio.nextChanel();
        assertEquals(6, radio.getStationNumber());
    }

    @Test
    public void nextChanelTwo() {
        Radio radio = new Radio("Nord",10);
        radio.setMinStationNumber(0);
        radio.setStationNumber(10);
        radio.nextChanel();
        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void prevChanel() {
        Radio radio = new Radio("Nord",10);
        radio.setMinStationNumber(0);
        radio.setStationNumber(5);
        radio.prevChanel();
        assertEquals(4, radio.getStationNumber());
    }

    @Test
    public void prevChanelTwo() {
        Radio radio = new Radio("Nord",10);
        radio.setMinStationNumber(0);
        radio.setStationNumber(0);
        radio.prevChanel();
        assertEquals(10, radio.getStationNumber());
    }
}





