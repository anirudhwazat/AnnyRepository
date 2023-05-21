package NumberPrograms;

public class prime2 {

	public static void main(String[] args) {

		int count = 0;
		int start = 1;
		int end = 10;

		while (start <= end) {
			if (start == 1) {
				count++;
			} else {

				for (int i = 2; i <= start / 2; i++) {
					if (start % i == 0) {
						count++;
					}
				}
				if (count == 0) {
					System.out.println("prime");
				} else {
					System.out.println("not prime");
				}
			}
		}
	}
}
