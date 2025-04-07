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
		baito = 20;

		// 短整数型の変数を初期化
		tan = 300;

		// 整数型の変数を初期化
		i = 4000;

		// 長整数型の変数を初期化
		tyou = 50000;

		// 単精度浮動小数点数型の変数を初期化
		f = 0.5f;

		// 倍精度浮動小数点数型の変数を初期化
		d = 11.5;

		// 文字型の変数を初期化
		moji = 'あ';

		// 文字列型の変数を初期化
		retu = "ソーリー";

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

		
		// 問題5

		String num = " 20 ";
		int num1 = 23;

		// 文字列を数値に変換してからコンソールに出力
		int num2 = Integer.parseInt(num);
		System.out.println("ハローJAVA" + ( num2 + num1));

	}

}



