import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
	
	@Test
	void max() {
		int[] arr1 = {5, 2, 8, 1, 9};
		assertEquals(9, ArrayTools.max(arr1));
		
		int[] arr2 = {5, 2, 8, 1, 0};
		assertEquals(8, ArrayTools.max(arr2));
		
		int[] arr3 = {5, 2, 8, 1, -9};
		assertEquals(8, ArrayTools.max(arr3));
		
		int[] arr4 = {-5, -2, -8, -1, -9};
		assertEquals(-1, ArrayTools.max(arr4));
		
		int[] arr5 = {1, 1, 1, 1, 1};
		assertEquals(1, ArrayTools.max(arr5));
		
		int[] arr6 = {1, 2, 3, 4, 5};
		assertEquals(5, ArrayTools.max(arr6));
		
		int[] arr7 = {-1, -2, -3, -4, -5};
		assertEquals(-1, ArrayTools.max(arr7));
		
		int[] arr8 = {0};
		assertEquals(0, ArrayTools.max(arr8));
		
		int[] arr9 = {};
		assertThrows(IllegalArgumentException.class, () -> ArrayTools.max(arr9));
		
		int[] arr10 = null;
		assertThrows(NullPointerException.class, () -> ArrayTools.max(arr10));
	}
	
	@Test
	void min() {
		int[] arr1 = {5, 2, 8, 1, 9};
		assertEquals(1, ArrayTools.min(arr1));
		
		int[] arr2 = {5, 2, 8, 1, 0};
		assertEquals(0, ArrayTools.min(arr2));
		
		int[] arr3 = {5, 2, 8, 1, -9};
		assertEquals(-9, ArrayTools.min(arr3));
		
		int[] arr4 = {-5, -2, -8, -1, -9};
		assertEquals(-9, ArrayTools.min(arr4));
		
		int[] arr5 = {1, 1, 1, 1, 1};
		assertEquals(1, ArrayTools.min(arr5));
		
		int[] arr6 = {1, 2, 3, 4, 5};
		assertEquals(1, ArrayTools.min(arr6));
		
		int[] arr7 = {-1, -2, -3, -4, -5};
		assertEquals(-5, ArrayTools.min(arr7));
		
		int[] arr8 = {0};
		assertEquals(0, ArrayTools.min(arr8));
		
		int[] arr9 = {};
		assertThrows(IllegalArgumentException.class, () -> ArrayTools.min(arr9));
		
		int[] arr10 = null;
		assertThrows(NullPointerException.class, () -> ArrayTools.min(arr10));
	}
	
	@Test
	void avg() {
		// The delta is to prevent rounding errors
		double delta = 0.001;
		int[] arr1 = {5, 2, 8, 1, 9};
		assertEquals(5.0, ArrayTools.avg(arr1), delta);
		
		int[] arr2 = {5, 2, 8, 1, 0};
		assertEquals(3.2, ArrayTools.avg(arr2), delta);
		
		int[] arr3 = {5, 2, 8, 1, -9};
		assertEquals(1.4, ArrayTools.avg(arr3), delta);
		
		int[] arr4 = {-5, -2, -8, -1, -9};
		assertEquals(-5.0, ArrayTools.avg(arr4), delta);
		
		int[] arr5 = {1, 1, 1, 1, 1};
		assertEquals(1.0, ArrayTools.avg(arr5), delta);
		
		int[] arr6 = {1, 2, 3, 4, 5};
		assertEquals(3.0, ArrayTools.avg(arr6), delta);
		
		int[] arr7 = {-1, -2, -3, -4, -5};
		assertEquals(-3.0, ArrayTools.avg(arr7), delta);
		
		int[] arr8 = {0};
		assertEquals(0.0, ArrayTools.avg(arr8), delta);
		
		int[] arr9 = {};
		assertThrows(IllegalArgumentException.class, () -> ArrayTools.avg(arr9));
		
		int[] arr10 = null;
		assertThrows(NullPointerException.class, () -> ArrayTools.avg(arr10));
	}
	
	@Test
	void sum() {
		int[] arr1 = {5, 2, 8, 1, 9};
		assertEquals(25, ArrayTools.sum(arr1));
		
		int[] arr2 = {5, 2, 8, 1, 0};
		assertEquals(16, ArrayTools.sum(arr2));
		
		int[] arr3 = {5, 2, 8, 1, -9};
		assertEquals(7, ArrayTools.sum(arr3));
		
		int[] arr4 = {-5, -2, -8, -1, -9};
		assertEquals(-25, ArrayTools.sum(arr4));
		
		int[] arr5 = {1, 1, 1, 1, 1};
		assertEquals(5, ArrayTools.sum(arr5));
		
		int[] arr6 = {1, 2, 3, 4, 5};
		assertEquals(15, ArrayTools.sum(arr6));
		
		int[] arr7 = {-1, -2, -3, -4, -5};
		assertEquals(-15, ArrayTools.sum(arr7));
		
		int[] arr8 = {0};
		assertEquals(0, ArrayTools.sum(arr8));
		
		int[] arr9 = {};
		assertThrows(IllegalArgumentException.class, () -> ArrayTools.sum(arr9));
		
		int[] arr10 = null;
		assertThrows(NullPointerException.class, () -> ArrayTools.sum(arr10));
	}
	
	@Test
	void range() {
		int[] arr1 = {5, 2, 8, 1, 9};
		assertEquals(8, ArrayTools.range(arr1));
		
		int[] arr2 = {5, 2, 8, 1, 0};
		assertEquals(8, ArrayTools.range(arr2));
		
		int[] arr3 = {5, 2, 8, 1, -9};
		assertEquals(17, ArrayTools.range(arr3));
		
		int[] arr4 = {-5, -2, -8, -1, -9};
		assertEquals(8, ArrayTools.range(arr4));
		
		int[] arr5 = {1, 1, 1, 1, 1};
		assertEquals(0, ArrayTools.range(arr5));
		
		int[] arr6 = {1, 2, 3, 4, 5};
		assertEquals(4, ArrayTools.range(arr6));
		
		int[] arr7 = {-1, -2, -3, -4, -5};
		assertEquals(4, ArrayTools.range(arr7));
		
		int[] arr8 = {0};
		assertEquals(0, ArrayTools.range(arr8));
		
		int[] arr9 = {};
		assertThrows(IllegalArgumentException.class, () -> ArrayTools.range(arr9));
		
		int[] arr10 = null;
		assertThrows(NullPointerException.class, () -> ArrayTools.range(arr10));
	}
}