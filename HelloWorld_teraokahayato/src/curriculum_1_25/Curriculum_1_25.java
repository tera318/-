package curriculum_1_25;

import java.util.Random;
import java.util.Scanner;

import curriculum_1_25_2.Curriculum_1_25_3;

public class Curriculum_1_25 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		
		Curriculum_1_25_3 c2 = new Curriculum_1_25_3();
		
		c2.setName(name);
		c2.setRandom1(random.nextInt(1000));
		c2.setRandom2(random.nextInt(1000));
		c2.setRandom3(random.nextInt(1000));
		c2.setRandom4(random.nextInt(1000));
		c2.setRandom5(random.nextInt(1000));
		
		c2.Curriculum_1_25_3();
	
		}

}
