import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/05/2017.
 */
public class HabTest {

    private Hab hab;

    @Before
    public void before() {
        Hab hab = new Hab("Capricorn One", 100);
    }

    @Test
    public void habHasName() {
        assertEquals("Capricorn One", hab.getHabName());
    }


}