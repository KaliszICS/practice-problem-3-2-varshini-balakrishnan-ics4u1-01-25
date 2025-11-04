public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int towerOfHanoi (int num) {
		if (num < 3) {
			return -1;
		}
		return (int) Math.pow(2, num) - 1;
	}
}