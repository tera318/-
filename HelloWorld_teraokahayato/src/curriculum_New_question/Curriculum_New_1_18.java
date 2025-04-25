package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	
	public static void moji(String h,int s) {
		System.out.print("\n" + h + s);
	}
	
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	
	public static void tasu(int x, int y) {
		int a = x * y;
		System.out.println("\n" + a);
	}
	
		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	
	public static void hairetu(int b2[]) {
		
		for (int c : b2) {
			System.out.println("\n" + c);
		}
	}
			
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	
	public static void tasu(double t , double y) {
		System.out.println("\n" + (t + y));
	}
	
		
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	
	public static int[] kakunou(int r) {
		Random random = new Random();
		int[] h1 = new int[r];
				
		for(int i = 0; i < r; i++) {
			
			h1[i] = random.nextInt(100) + 1;
						
		}
		for (int h2 : h1) {
		System.out.println("\n" + h2);
		
		
		}	
		return h1;
	}
	

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	
	public static double heikin(int[] h1) {
		int sum = 0;
		for (int h2 : h1) {
			    sum += h2;
		}
		double average = (double) sum / h1.length;
		System.out.printf("\n%.2f",average);
		
		return average;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	
	public static boolean owari(double average) {
		
		if(average >= 50) {
			return true;

		} else {
			return false;
			
		}
	}
	

	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		moji("Hello JavaSE ",11);
		
		tasu(3,5);
		
		int[] b2 = {10,20,30,40};
		hairetu(b2);
		
		tasu(4.2,5.9);
		
		int[] h1 = kakunou(5);
	
		double average = heikin(h1);
	
		boolean h4 = owari(average);
		System.out.println("\n" + h4);
	}
}