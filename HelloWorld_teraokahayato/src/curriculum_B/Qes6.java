package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String intext = scanner.nextLine();
		String name[] = intext.split("、");
		Boolean ran1 = true;
		int ran2 = 0;


		for(String text:name) {
			int ran = random.nextInt(11);

			switch(text) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + ran + "です\n");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + ran + "です\n");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + ran + "です\n");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + ran + "です\n");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + ran + "です\n");
				break;
			case "テレビ":
			case "ディスプレイ":
				System.out.println(ran1 ? text + "の残り台数は" + ran + "です\n" : text + "の残り台数は" + (11 - ran2) + "です\n");
				ran1 = false;
				ran2 = ran;
				break;
			default:
				System.out.println("『 " + text + " 』は指定の商品ではありません\n");
			}
		}
		scanner.close();
	}
}

