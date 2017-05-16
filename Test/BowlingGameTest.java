import static org.junit.Assert.*;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Sara on 15/05/2017.
 */
public class BowlingGameTest extends TestCase{
    public void testGutterGame() throws Exception {
        Game g = new Game();
        for (int i=0; i<20; i++)
            g.roll(0);
    }
}