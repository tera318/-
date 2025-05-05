package object;

import java.util.Scanner;

public class Object {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String intext = scanner.nextLine();
		String name[] = intext.split(",");
		
		for(String animalname : name) {
			String[] data = animalname.split(":");
			if (data.length != 3) {				
				continue;
			}
			
			String Animalname = data[0];
			String Animallength = data[1];
			String Animalspeed = data[2];
			String gakumei;
			
			
			switch (Animalname) {
			case "ライオン": 
				gakumei = "パンテラ レオ";
				break;
			
			case "ゾウ": 
				gakumei = "ロキソドンタ・サイクロティス";
				break;
			
			
			case "パンダ":
				gakumei = "アイルロポダ・メラノレウカ";
				break;
			
			case "チンパンジー": 
				gakumei = "パン・トゥログロディテス";
				break;
				
			case "シマウマ":
				gakumei = "チャップマンシマウマ";
				break;
			
			case "インコ": 
				gakumei = "不明";
				break;
			default:
				gakumei = "不明";
				break;
			}
			
			System.out.println();
			System.out.println("動物名：" + Animalname);
			System.out.println("体長：" + Animallength + "m");
			System.out.println("速度：" + Animalspeed + "km/h");
			System.out.println("学名：" + gakumei);			
			}
		scanner.close();
	}

}
