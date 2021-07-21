package fa.training.assignment3;


public class FindMaximum {
	public void sort(Integer[] list) {
		int firstMax, secondMax;

		if (list[0] > list[1]) {
			firstMax = list[0];
			secondMax = list[1];
		} else {
			firstMax = list[1];
			secondMax = list[0];
		}

		for (int i = 2; i < list.length; i++) {
			if (list[i] >= firstMax) {
				secondMax = firstMax;
				firstMax = list[i];
			} else if (list[i] > secondMax) {
				secondMax = list[i];
			}
		}

		System.out.println(firstMax + "," + secondMax);

	}

	public static void main(String[] args) {
		FindMaximum maximum = new FindMaximum();

		Integer arr[] = { 15, 10, 33, 4, 5, 69, 3, 4, 6 };

		maximum.sort(arr);
	}

}
