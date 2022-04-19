import static org.junit.Assert.*;

import org.junit.Test;

public class OtherTests {

	
	
	@Test
	public void compareArrays() {
		int[] n1 = new int[] {1,2,3,4};
		int[] n2 = new int[] {1,2,3,4};
		assertArrayEquals(n1, n2);
	}

}
