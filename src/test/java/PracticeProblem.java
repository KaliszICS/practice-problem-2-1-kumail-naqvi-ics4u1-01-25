public class PracticeProblem {

	public static void main(String args[]) {

	}
	
	public static int find(int[] array, int number) {
		if (array == null) return -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) return i;
		}
		return -1;
	}

	public static int findLast(String[] array, String string) {
		if (array == null) return -1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (string == null ? array[i] == null : string.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}

	public static int findSecond(char[] array, char character) {
		if (array == null) return -1;
		int count = 0;
		int firstIndex = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == character) {
				count++;
				if (count == 1) firstIndex = i;
				if (count == 2) return i; 
			}
		}
		return (count == 1) ? firstIndex : -1;
	}

	}
