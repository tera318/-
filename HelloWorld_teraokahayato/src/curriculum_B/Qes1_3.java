package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		// 問題1

		// Scannerクラスのインスタンスを作成
		Scanner scanner = new Scanner(System.in);

		/*****************************
		 * [概要]コンソール入力を受け取る
		 * [詳細]コンソールに入力された文字を取得する
		 *****************************/

		System.out.println("「名前を入力してください」");
		System.out.println();
		String name = scanner.nextLine();

		// nullチェック & 空文字チェック
		if (name == null || name.trim().isEmpty()) {
			System.out.println("「名前を入力してください」");


			// 問題2

			// 半角英数字チェック
		} else if (!name.matches("^[a-zA-Z0-9]+$")) {
			System.out.println("「半角英数字のみで名前を入力してください」");

			// 10文字以上の入力された際の処理
		} else if (name.length() > 10) {
			System.out.println("「名前を10文字以内にしてください」");

			// 正常な文字列が入力された際の処理
		} else {
			System.out.println("「ユーザー名" + name + "を登録しました」");
			jankengame(name);
		}		

	}

	// 問題3

	public static void jankengame(String name) {

		Random random = new Random();
		int count = 0;
		boolean user1Wins = false;


		while(!user1Wins) {

			int name1 = random.nextInt(3);
			int name2 = random.nextInt(3);
			count++;

			System.out.println(name + "の手は" + handToString(name1));
			System.out.println("相手の手は"  + handToString(name2));

				if (judge(name1, name2) == 1) {
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					user1Wins = true;
					
				} else if (judge(name1, name2) == -1) {
					System.out.println("ユーザー2の勝ち！");
					
				} else {
					System.out.println("DRAW あいこ もう一回しましょう！");
				}

				System.out.println(name + "勝つまでにかかった合計回数は" + count + "回です");

			}
		}


	public static int judge(int name1, int name2) {
		if (name1 == name2) {
			return 0;
			
		} else if ((name1 == 0 && name2 == 1) || 
				(name1 == 1 && name2 == 2) || 
				(name1 == 2 && name2 == 0)) {
			return 1;
			
		} else {
			return -1;
			
		}
	}


	public static String handToString(int hand) {
		switch (hand) {
		
		case 0: return "グー";
		case 1: return "チョキ";
		case 2: return "パー";
		default: return "不明";
		}
	}
}

