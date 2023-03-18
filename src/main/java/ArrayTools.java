public class ArrayTools {
	private static final String nullPtrExceptionStr = "Array cannot be null";
	private static final String illegalArgExceptionStr = "Array cannot be empty";
	public static int max(int[] a) {
		if (a == null) {
			throw new NullPointerException(nullPtrExceptionStr);
		}
		if (a.length == 0) {
			throw new IllegalArgumentException(illegalArgExceptionStr);
		}
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static int min(int[] a) {
		if (a == null) {
			throw new NullPointerException(nullPtrExceptionStr);
		}
		if (a.length == 0) {
			throw new IllegalArgumentException(illegalArgExceptionStr);
		}
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	
	public static double avg(int[] a) {
		if (a == null) {
			throw new NullPointerException(nullPtrExceptionStr);
		}
		if (a.length == 0) {
			throw new IllegalArgumentException(illegalArgExceptionStr);
		}
		int sum = 0;
		for (int j : a) {
			sum += j;
		}
		return (double) sum / a.length;
	}
	
	public static int sum(int[] a) {
		if (a == null) {
			throw new NullPointerException(nullPtrExceptionStr);
		}
		if (a.length == 0) {
			throw new IllegalArgumentException(illegalArgExceptionStr);
		}
		int sum = 0;
		for (int j : a) {
			sum += j;
		}
		return sum;
	}
	
	public static int range(int[] a) {
		if (a == null) {
			throw new NullPointerException(nullPtrExceptionStr);
		}
		if (a.length == 0) {
			throw new IllegalArgumentException(illegalArgExceptionStr);
		}
		int max = max(a);
		int min = min(a);
		return max - min;
	}
}
