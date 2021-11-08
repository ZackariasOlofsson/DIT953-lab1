import org.junit.Test;

import java.awt.*;

public class TestSaab {
    NySaab saab = new NySaab();

    //public TestSaab() { this.saab = new NySaab();
    //}

    @Test
    public void testGetDoor(){ assert saab.getNrDoors() == 2;}

    @Test
    public void testGetColor() { assert saab.getColor().equals(Color.red);}

}
