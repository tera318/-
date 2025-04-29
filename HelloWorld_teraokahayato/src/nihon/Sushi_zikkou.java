package nihon;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import sushi.Sushi_syori;

public class Sushi_zikkou {

	public static void main(String[] args) {
		
		Sushi_syori sushi = new Sushi_syori("こんにちは！ここは日本です！","この寿司はうまい","寿司は和食です");
		System.out.println(sushi.sushi1);
		System.out.println(sushi.sushi2);
		System.out.println(sushi.sushi3);
		Calendar cl = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("今の現在日時はyyyy-MM-dd H:m:sです");
		
		System.out.println(sdf.format(cl.getTime()));
		
	}

}
