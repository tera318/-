package curriculum_1_25_2;

public class Curriculum_1_25_3 extends Curriculum_1_25_2 {

	public void Curriculum_1_25_3() {
				
		System.out.println("こんにちは 「" + super.getName() + "」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + super.getRandom1());
		System.out.println("MP：" + super.getRandom2());
		System.out.println("攻撃力：" + super.getRandom3());
		System.out.println("素早さ：" + super.getRandom4());
		System.out.println("防御力：" + super.getRandom5() + "\n");
		System.out.println("さあ冒険に出かけよう！");
		
	}

}
