import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayToolsTest {
	private final int[] arr1 = {5, 2, 8, 1, 9};
	private final int[] arr2 = {5, 2, 8, 1, 0};
	private final int[] arr3 = {5, 2, 8, 1, -9};
	private final int[] arr4 = {-5, -2, -8, -1, -9};
	private final int[] arr5 = {1, 1, 1, 1, 1};
	private final int[] arr6 = {1, 2, 3, 4, 5};
	private final int[] arr7 = {-1, -2, -3, -4, -5};
	private final int[] arr8 = {0};
	private final int[] arr9 = {};
	private final int[] arr10 = null;
	
	@Test
	public void testMax() {
		assertEquals(9, ArrayTools.max(arr1));
		assertEquals(8, ArrayTools.max(arr2));
		assertEquals(8, ArrayTools.max(arr3));
		assertEquals(-1, ArrayTools.max(arr4));
		assertEquals(1, ArrayTools.max(arr5));
		assertEquals(5, ArrayTools.max(arr6));
		assertEquals(-1, ArrayTools.max(arr7));
		assertEquals(0, ArrayTools.max(arr8));
		assertThrows(IllegalArgumentException.class, () -> ArrayTools.max(arr9));
		assertThrows(NullPointerException.class, () -> ArrayTools.max(arr10));
	}
	
	@Test
	public void testMin() {
		assertEquals(1, ArrayTools.min(arr1));
		assertEquals(0, ArrayTools.min(arr2));
		assertEquals(-9, ArrayTools.min(arr3));
		assertEquals(-9, ArrayTools.min(arr4));
		assertEquals(1, ArrayTools.min(arr5));
		assertEquals(1, ArrayTools.min(arr6));
		assertEquals(-5, ArrayTools.min(arr7));
		assertEquals(0, ArrayTools.min(arr8));
		assertThrows(IllegalArgumentException.class, () -> ArrayTools.min(arr9));
		assertThrows(NullPointerException.class, () -> ArrayTools.min(arr10));
	}
	
	@Test
	public void testAvg() {
		assertEquals(5.0, ArrayTools.avg(arr1), 0.001);
		assertEquals(3.2, ArrayTools.avg(arr2), 0.001);
		assertEquals(1.4, ArrayTools.avg(arr3), 0.001);
		assertEquals(-5.0, ArrayTools.avg(arr4), 0.001);
		assertEquals(1.0, ArrayTools.avg(arr5), 0.001);
		assertEquals(3.0, ArrayTools.avg(arr6), 0.001);
		assertEquals(-3.0, ArrayTools.avg(arr7), 0.001);
		assertEquals(0.0, ArrayTools.avg(arr8), 0.001);
		assertThrows(IllegalArgumentException.class, () -> ArrayTools.avg(arr9));
		assertThrows(NullPointerException.class, () -> ArrayTools.avg(arr10));
	}
	
	@Test
	public void testSum() {
		assertEquals(25, ArrayTools.sum(arr1));
		assertEquals(16, ArrayTools.sum(arr2));
		assertEquals(7, ArrayTools.sum(arr3));
		assertEquals(-25, ArrayTools.sum(arr4));
		assertEquals(5, ArrayTools.sum(arr5));
		assertEquals(15, ArrayTools.sum(arr6));
		assertEquals(-15, ArrayTools.sum(arr7));
		assertEquals(0, ArrayTools.sum(arr8));
		assertThrows(IllegalArgumentException.class, () -> ArrayTools.sum(arr9));
		assertThrows(NullPointerException.class, () -> ArrayTools.sum(arr10));
	}
	
	@Test
	public void testRange() {
		assertEquals(8, ArrayTools.range(arr1));
		assertEquals(8, ArrayTools.range(arr2));
		assertEquals(17, ArrayTools.range(arr3));
		assertEquals(8, ArrayTools.range(arr4));
		assertEquals(0, ArrayTools.range(arr5));
		assertEquals(4, ArrayTools.range(arr6));
		assertEquals(4, ArrayTools.range(arr7));
		assertEquals(0, ArrayTools.range(arr8));
		assertThrows(IllegalArgumentException.class, () -> ArrayTools.range(arr9));
		assertThrows(NullPointerException.class, () -> ArrayTools.range(arr10));
	}
}