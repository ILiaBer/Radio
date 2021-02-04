package Radio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldChangeChanel (){
        Radio radio= new Radio();
        assertEquals(0,radio.getStationNumber());
        radio.setMaxStationNumber(9);
        radio.setMinStationNumber(0);
        radio.setStationNumber();
        assertEquals(9,radio.getStationNumber());

    }

}