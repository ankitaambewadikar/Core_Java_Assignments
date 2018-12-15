package television;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnitForIncreaseVolume {

	@Test
	public void test() {
		Television volume = new Television(true);
		volume.initilizeCurrentVolume(1);
		int volumeIncreased = volume.getIncreaseVolume();
		assertEquals(2,volume.getIncreaseVolume());
		
	}
	@Test
	public void testOne() {
		
		Television volume = new Television(true);
		System.out.println(volume.initilizeCurrentVolume(2));
		int volumeIncreasedOne = volume.getIncreaseVolume();
		assertEquals(3,volume.getIncreaseVolume());
		
	}
	

}
