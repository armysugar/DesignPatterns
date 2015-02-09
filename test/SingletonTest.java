import static org.junit.Assert.*;

import org.junit.Test;


public class SingletonTest {
	Singleton first = Singleton.getInstance(3);
	Singleton second = Singleton.getInstance(4);
	
	@Test
	public void test() {
//		fail("Not yet implemented");
		assertEquals(first, second);
		assertEquals(second.data, 3);
		assertNotEquals(first.data, 4);
	}
	
	
}
