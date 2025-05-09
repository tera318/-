package menseki1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Menseki1 {
	
	public Menseki1() {
	
	Map<Integer,String> map = new HashMap<>();
	map.put(0,"北海道:札幌市:83424");
	map.put(1, "青森県:青森市:9646");
	map.put(2, "岩手県:盛岡市:15275");
	map.put(3, "宮城県:仙台市:7282");
	map.put(4, "秋田県:秋田市:11638");
	map.put(5, "山形県:山形市:9323");
	map.put(6, "福島県:福島市:13784");
	map.put(7, "茨城県:水戸市:6097");
	map.put(8, "栃木県:宇都宮市:6408");
	map.put(9, "群馬県:前橋市:6362");
	map.put(10, "埼玉県:さいたま市:3798");
		
	for (String val : map.values()) {
		String[] mapdata = val.split(":");
		if (mapdata.length != 11);
		System.out.println(Arrays.toString(mapdata));
		continue;
		}
	}
		
	
	public void Number(String no) {
		
		System.out.println(no);
		
//		
//		for (String Data : Map) {
//			String[] data = Data.split(",");
//			if (data.length != 3) {
//				
//			String T = data[0];
//			String S = data[1];
//			String M = data[2];
//				
			}
		
	}

	