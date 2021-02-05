package Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldChangeChanel() {
        Radio radio = new Radio();
        assertEquals(0, radio.getStationNumber());
        radio.setMaxStationNumber(9);
        radio.setMinStationNumber(0);
        radio.setStationNumber(9);
        assertEquals(9, radio.getStationNumber());
    }

    @Test
    public void shouldChangeVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getVolume());
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(11);
        assertEquals(10, radio.getVolume());


    }


}