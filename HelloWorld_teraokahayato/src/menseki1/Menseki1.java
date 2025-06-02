package menseki1;

import java.util.HashMap;
import java.util.Map;

public class Menseki1 {

    private Map<Integer, String[]> dataMap = new HashMap<>();

    public Menseki1() {
        dataMap.put(0, new String[]{"北海道", "札幌市", "83424"});
        dataMap.put(1, new String[]{"青森県", "青森市", "9646"});
        dataMap.put(2, new String[]{"岩手県", "盛岡市", "15275"});
        dataMap.put(3, new String[]{"宮城県", "仙台市", "7282"});
        dataMap.put(4, new String[]{"秋田県", "秋田市", "11638"});
        dataMap.put(5, new String[]{"山形県", "山形市", "9323"});
        dataMap.put(6, new String[]{"福島県", "福島市", "13784"});
        dataMap.put(7, new String[]{"茨城県", "水戸市", "6097"});
        dataMap.put(8, new String[]{"栃木県", "宇都宮市", "6408"});
        dataMap.put(9, new String[]{"群馬県", "前橋市", "6362"});
        dataMap.put(10, new String[]{"埼玉県", "さいたま市", "3798"});
    }

    public void printData(int no) {
        if (dataMap.containsKey(no)) {
            String[] info = dataMap.get(no);
            System.out.println("都道府県名：" + info[0]);
            System.out.println("県庁所在地：" + info[1]);
            System.out.println("面積：" + Double.parseDouble(info[2]) + "km2");
            System.out.println();
        } else {
            System.out.println("番号 " + no + " に該当するデータがありません。");
        }
    }
}
