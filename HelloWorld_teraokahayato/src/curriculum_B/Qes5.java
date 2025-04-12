package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		
		System.out.println("課題5\n");

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 20; j++) {

				System.out.print(String.format(" %03d * %03d = %03d", j, i, j * i));

				if (i != 10) System.out.print(" || ");
			}
			System.out.println();
		}
	}
}
