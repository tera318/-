package curriculum_A;



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
		retu = "null";

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
				

	}

}



