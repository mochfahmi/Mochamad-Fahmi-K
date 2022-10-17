import java.util.Scanner;
public class TP01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if (a % 6 < 1) {
			System.out.println("Kelipatan enam");
		} else {
			System.out.println("Bukan kelipatan enam");
		}
	}
}
