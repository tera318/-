package curriculum_A;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Qes1_13 {

	

	
	public static void main(String[] args) {
 		
		// 問題1

		// バイト型の変数を宣言
		byte baito;

		// 短整数型の変数を宣言
		short tan;

		// 整数型の変数を宣言
		int i;

		// 長整数型の変数を宣言
		long tyou;

		// 単精度浮動小数点数型の変数を宣言
		float f;

		// 倍精度浮動小数点数型の変数を宣言
		double d;

		// 文字型の変数を宣言
		char moji;

		// 文字列型の変数を宣言
		String retu;

		// ブーリアン型の変数を宣言
		boolean buu;


		// 問題2

		// バイト型の変数を初期化
		baito = 0;

		// 短整数型の変数を初期化
		tan = 0;

		// 整数型の変数を初期化
		i = 0;

		// 長整数型の変数を初期化
		tyou = 0L;

		// 単精度浮動小数点数型の変数を初期化
		f = 0.0f;

		// 倍精度浮動小数点数型の変数を初期化
		d = 0.0d;

		// 文字型の変数を初期化
		moji = '\u0000';

		// 文字列型の変数を初期化
		retu = null;

		// ブーリアン型の変数を初期化
		buu = false;


		// 問題3

		// バイト型の変数を代入
		baito = 10;

		// 短整数型の変数を代入
		tan = 100;

		// 整数型の変数を代入
		i = 1000;

		// 長整数型の変数を代入
		tyou = 10000;

		// 単精度浮動小数点数型の変数を代入
		f = 9.5f;

		// 倍精度浮動小数点数型の変数を代入
		d = 10.5;

		// 文字型の変数を代入
		moji = 'a';

		// 文字列型の変数を代入
		retu = "ハロー";

		// ブーリアン型の変数を代入
		buu = true;


		// 問題4

		// 整数型を足してコンソールに出力
		System.out.println( tan + i + tyou);

		// バイト型を足してコンソールに出力
		System.out.println( baito + baito);

		// 文字型、文字列型、ブーリアン型を合わせてコンソールに出力
		System.out.println( moji + retu + buu );

		// 整数に変換し、数字をすべて足してコンソールに出力
		int in = (int) ((baito + tan + i + tyou + f + d));
		System.out.println( in);

		// 小数点以外の数字をすべてかけてコンソールに出力
		System.out.println( baito * tan * i * tyou);

		// 10.5割る100をしてコンソールに出力
		System.out.println( d / tan);

		// 10引く100をしてコンソールに出力
		System.out.println( baito - tan);
		
		// 改行
		System.out.println("");

		
		// 問題5

		String num = "20";
		int num1 = 23;

		// 文字列を数値に変換してからコンソールに出力
		int num2 = Integer.parseInt(num);
		System.out.println("ハローJAVA" + ( num2 + num1));
		
		// 改行
		System.out.println("");
		
		// 問題6
		
		// 情報をローカル変数に代入
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		
		// 変数を使ってコンソールに出力
		System.out.println("「初めまして" + name + "です」");
		
		System.out.println("「年齢は" + age + "歳です」");
		
		System.out.println("「身長は" + height + "cmです」");
		
		System.out.println("「体重は" + weight + "kgです」");
		
		System.out.println("「好きな食べ物は" + food + "です」");
		
		// 改行
		System.out.println("");
				
		
		//問題7
		
		// BMIの計算式をresultに代入
		double result = weight / (height * height) * 10000;
		
		/* BigDecimalクラスで小数点以下の計算
		 * RoundingMode.HALF_UPで四捨五入をして
		 * コンソールに出力
		 */
		BigDecimal bmi = new BigDecimal(result);
		bmi = bmi.setScale(1, RoundingMode.HALF_UP);
		System.out.println("「BMIは" + bmi + "です」");
		
		// 改行
		System.out.println("");
		
		
		// 問題8
		
		// 変数を再代入
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		
		// 再代入した変数でコンソールに出力
		System.out.println("「初めまして" + name + "です」");
		
		System.out.println("「年齢は" + age + "歳です」");
		
		System.out.println("「身長は" + height + "cmです」");
		
		System.out.println("「体重は" + weight + "kgです」");
		
		System.out.println("「好きな食べ物は" + food + "です」");
		
		double result1 = weight / (height * height) * 10000;
		BigDecimal bmi1 = new BigDecimal(result1);
		bmi1 = bmi1.setScale(1, RoundingMode.HALF_UP);
		System.out.println("「BMIは" + bmi1 + "です」");
		
		
		// 改行
		System.out.println("");
		
		
		// 問題9
		
		// 変数を*2で自己代入
		age *= 2;
		height *= 2;
		weight *= 2;
		
		
		// 自己代入した変数をコンソールに出力
		System.out.println("「初めまして" + name + "です」");
		
		System.out.println("「年齢は" + age + "歳です」");
		
		System.out.println("「身長は" + height + "cmです」");
		
		System.out.println("「体重は" + weight + "kgです」");
		
		System.out.println("「好きな食べ物は" + food + "です」");
		
		double result2 = weight / (height * height) * 10000;
		BigDecimal bmi2 = new BigDecimal(result2);
		bmi2 = bmi2.setScale(2, RoundingMode.HALF_UP);
		System.out.println("「BMIは" + bmi2 + "です」");
		
		// 改行
		System.out.println("");
		
		
		// 問題10
		
		// 年齢を24歳に再代入
		age = 24;
		
		// 25歳以上ならtrueを表示
		System.out.println(age >= 25);
		
		// 改行
		System.out.println("");
		
		
		// 問題11
		
		// 身長と体重の数値を再代入
		height = 168.5;
		weight = 64.2;
		
		// 数値を文字列へ変換
		String a3 = String.valueOf(age);
		String h3 = String.valueOf(height);
		String w3 = String.valueOf(weight);
				
		// 変換した文字列を結合
		String str1 = a3.concat(h3).concat(w3);
		
		// 結合した文字列をコンソールに出力
		System.out.println(str1);
		
		// 改行
		System.out.println("");
		
		
		// 問題12
		
		// 文字列型の年齢と身長を整数型に変換してコンソールに出力
		int a4 = Integer.valueOf(a3);
		double h4 = Double.valueOf(h3);
		
		System.out.println(a4);
		System.out.println(h4);

		// 改行
		System.out.println("");
		
		
		// 問題13
		
		// 年齢が25もしくは身長が160以上ならtrueをコンソールに出力
		System.out.println(a4 >= 25 || h4 >= 160);
		
	}
}



