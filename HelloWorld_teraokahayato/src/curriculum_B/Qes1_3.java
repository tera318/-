package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args){

		// 問題1
		
		// Scannerクラスのインスタンスを作成
		Scanner scanner = new Scanner(System.in);

		/*****************************
		 * [概要]コンソール入力を受け取る
		 * [詳細]コンソールに入力された文字を取得する
		 */
		
		System.out.println("「名前を入力してください」");
		System.out.println();
		String neme = scanner.next();
		
		// 入力された文字列の数を取得
		int kazu = neme.length();
		System.out.println();

		// 取得した数値を元にユーザー名の文字数を制限してコンソールに出力
		if(kazu > 10) {
			System.out.println("「名前を10文字以内にしてください」");

		} else if(kazu < 0) {
			System.out.println("「名前を入力してください」");

		} else {
			System.out.println("「ユーザー名" + neme + "を登録しました」");

		}
	}
}