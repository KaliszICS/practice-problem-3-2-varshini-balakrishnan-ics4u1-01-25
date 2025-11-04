public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int towerOfHanoi (int num) {
		if (num < 3) {
			return -1;
		}
		if (num ==1) {
			return 3;
		}
		return 2 * towerOfHanoi(num + 1) - 1;
	}
}