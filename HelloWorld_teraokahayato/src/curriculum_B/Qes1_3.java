package curriculum_B;

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
		}
	}
}

