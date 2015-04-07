public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int digit = digitNum(x);
		while (digit > 0) {
			int pow = (int) Math.pow(10, digit - 1);
			if (x / pow != x % 10)
				return false;
			x = (x % pow) / 10;
			digit -= 2;
		}
		return true;
	}

	private int digitNum(int x) {
		int i = 0;
		for (; x > 0; i++) {
			x = x / 10;
		}
		return i;
	}

	public static void main(String[] args) {
		PalindromeNumber pm = new PalindromeNumber();
		System.out.print(pm.isPalindrome(1000021));
	}
}
