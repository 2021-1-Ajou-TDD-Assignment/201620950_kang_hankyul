import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BowlingGameTest {
	
	@Test
	public void testGullterGame() {
		Game g = new Game();
		for(int i=0; i<20; i++) {
			g.roll(0);
		}
		assertEquals(0, g.score());
	}
}
