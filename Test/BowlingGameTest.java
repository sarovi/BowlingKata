import static org.junit.Assert.*;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Sara on 15/05/2017.
 */
public class BowlingGameTest extends TestCase{

    private Game g;

    @Before
    protected void setUp() throws Exception {
        g = new Game();
    }

    @Test
    public void testGutterGame() throws Exception {
        int n = 20;
        int pins = 0;
        rollMany(n, pins);
        assertEquals(0, g.score());
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }

    @Test
    public void testAllOnes() throws Exception {
        for (int i = 0; i < 20; i++)
            g.roll(1);
        assertEquals(20, g.score());
    }

}