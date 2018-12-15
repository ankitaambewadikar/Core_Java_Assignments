package television;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnitForTelevisionCurrentVolume {

	@Test
	public void testForCurrentVolumeOne() {
		
		Television volume = new Television(false);
		
		int currentVolume = volume.getVolume();
		assertEquals(0,currentVolume);
	}

	/*@Test
	public void testForIncreaseVolumeTwo() {
		
		Television volume = new Television(true);
		
		int currentVolume = volume.getIncreaseVolume();
		assertEquals(1,currentVolume);
	}*/
	

}
