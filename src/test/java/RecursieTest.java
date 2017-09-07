import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursieTest {
    private Recursie recursie;

    @Before
    public void setUp() throws Exception {
        recursie = new Recursie();
    }

    @Test
    public void testRecusieFaculiteitNietRecursief() {
        int expected = 5*4*3*2;
        int result = recursie.faculteit_niet_recursief(5);
        assertEquals(expected, result);
    }

    @Test
    public void testRecusieFaculiteitRecursief() {
        int expected = 5*4*3*2;
        int result = recursie.faculteit_recursief(5);
        assertEquals(expected, result);
    }

    @Test
    public void testRecusieSomNietRecursief() {
        int expected = 5+4+3+2+1;
        int result = recursie.som_niet_recursief(5);
        assertEquals(expected, result);
    }

    @Test
    public void testRecusieSomRecursief() {
        int expected = 5+4+3+2+1;
        int result = recursie.som_recursief(5);
        assertEquals(expected, result);
    }
}