
package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {

		System.out.println("課題4\n");

		for (int j = 1; j <= 9; j++) {

			for (int i = 1; i <= 9; i++) {

				System.out.print(String.format(" %02d * %02d = %02d", j, i, j * i));

				if (i != 9) System.out.print(" || ");
			}
			System.out.println();
		}
	}
}
