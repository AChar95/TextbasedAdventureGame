import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.qa.infiniteSwamp.Compass;
import com.qa.infiniteSwamp.FakeTreasure;

public class SwampTest {

	@Test
	public void compassTestOne() {
		Compass compass = new Compass();
		assertEquals("Compass error", "No movement", compass.nearestTreasure(0, 0));
	}

	@Test
	public void compassTestTwo() {
		Compass compass = new Compass();
		assertEquals("Compass error", "movement", compass.nearestTreasure(1, 1));
	}
}


	