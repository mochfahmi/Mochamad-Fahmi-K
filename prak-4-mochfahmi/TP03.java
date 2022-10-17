import java.util.Scanner;
public class TP03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner in = new Scanner(System.in);
		int D = in.nextInt();
		int R = in.nextInt();
		int I = in.nextInt();

		if (I > R && I > D && D < R) {
			System.out.println("Idar");

		} else if (I > R && I > D && R < D) {
			System.out.println("Idar");
			
		} else if (R > I && R > D && D < I) {
			System.out.println("Radi");
			
		} else if (R > I && R > D && I < D) {
			System.out.println("Radi");

		} else if (D > I && D > R && R < I) {
			System.out.println("Dira");

		} else if (D > I && D > R && I < R) {
			System.out.println("Dira");

		} else if (D == R || R == I || I == D) {
			System.out.println(" Tidak boleh menggunakan angka yang sama");
		}
	}
}
