package menseki;

import java.util.Scanner;

import menseki1.Menseki1;

public class Menseki {

	public static void main(String[] args) {
		
		Menseki1 Men1 = new Menseki1();
		Scanner scanner = new Scanner(System.in);
		String intext = scanner.nextLine();
		String No[] = intext.split(",");
		
		
		for (int i = 0; i > No.length; i++) {
			String no = No[i];
			Men1.Number(no);
		}
		
//		
//		System.out.println("都道府県名：" + T);
//		System.out.println("県庁所在地：" + S);
//		System.out.println("面積：" + M + "km2");
		
	}

}
