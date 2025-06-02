package menseki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import menseki1.Menseki1;

public class Menseki {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String intext = scanner.nextLine();
		
		boolean narabi = true;
		
		if (intext.contains("(降順)")) {
			narabi = false;
			intext = intext.replace("(降順)","");
			} else if (intext.contains("昇順")) {
				narabi = true;
				intext = intext.replace("(昇順)","");
			}
		
		
		String No[] = intext.split(",");
		
		List<Integer> numbers = new ArrayList<>();
		for (String n : No) {		
			numbers.add(Integer.parseInt(n.trim()));
		}
		
		
		if (narabi) {
			Collections.sort(numbers);
		} else {
			Collections.sort(numbers, Collections.reverseOrder());
			
		}
		
		Menseki1 Men1 = new Menseki1();
		
		for (int no : numbers) {
			Men1.printData(no);
	
		}
		
		scanner.close();
	
	}

}
