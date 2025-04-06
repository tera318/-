package curriculum_A;



public class Qes1_13 {

	

	
	public static void main(String[] args) {
		
// 問題4

		// バイト型の変数に値を代入
		byte baito = 10;
		// 短整数型の変数に値を代入
		short tan = 100;
		// 整数型の変数に値を代入
		int i = 1000;
		// 長整数型の変数に値を代入
		long tyou = 10000;

		// 単精度浮動小数点数型の変数に値を代入
		float f = 9.5f;
		// 倍精度浮動小数点数型の変数に値を代入
		double d = 10.5;

		// 文字型の変数に値を代入
		char moji = 'a';
		// 文字列型の変数に値を代入
		String retu = "ハロー";

		// ブーリアン型の変数に値を代入
		boolean buu = true;
		
		
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
		
	}

}



