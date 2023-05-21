package NumberPrograms;

public class Armstrong {

	public static void main(String[] args) {

		int num = 153;
		int temp = num;
		int x = num;
		int sum = 0;
		int digit = 0;
		int mul = 1;
		while (temp > 0) {
			digit++;
			temp = temp / 10;

		}
		while (x > 0) {
			int last = x % 10;
			mul = 1;
		}
		for (int i = 1; i <= digit; i++) {
			mul = mul * digit;

		}
		sum = sum + mul;

		if (num == sum) {

			System.out.println("armstrong number");

		}

	}
}