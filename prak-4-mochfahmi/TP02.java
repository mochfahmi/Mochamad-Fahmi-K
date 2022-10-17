import java.util.Scanner;
public class TP02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner in = new Scanner(System.in);
		int j = in.nextInt();
		if (j > 200000) {

			double a = j * 0.1;
			int b = (int) a;
			double p = j * 0.11;
			double t1 = j + p;
			double t2 = t1 * 0.1;
			double t3 = t1 - t2;
			double p1 = j - a;
			double p3 = p1 * 0.11;

			System.out.println("Transaksi = " + j);
			System.out.println("Total = " + j + " - " + b);
			System.out.println("Ppn 11%" + " = " + p3);
			System.out.println("Total dibayar = " + t3);
		} else {
			double p2 = j * 0.11;
			double t = j + p2;

			System.out.println("Transaksi = " + j);
			System.out.println("Total = " + j);
			System.out.println("Ppn 11%" + " = " + p2);
			System.out.println("Total dibayar = " + t);
		}
	}
}
