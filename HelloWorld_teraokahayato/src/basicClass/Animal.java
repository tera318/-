package basicClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
		Dog inu = new Dog("犬");
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		Dog kazu = new Dog(16);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		Calendar cl = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		
		System.out.println(sdf.format(cl.getTime()));
		
	}
}