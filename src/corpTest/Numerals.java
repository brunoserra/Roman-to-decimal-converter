package corpTest;

import java.util.Hashtable;
import javax.management.RuntimeErrorException;

public class Numerals {
	
	private Hashtable<Character, Integer> numerals = new Hashtable<Character, Integer>();
	
	public Numerals() {
		numerals.put('i',1);
	    numerals.put('x',10);
	    numerals.put('c',100);
	    numerals.put('m',1000);
	    numerals.put('v',5);
	    numerals.put('l',50);
	    numerals.put('d',500);
	}
	
	public int converter(String letters) {
		
		int decimal = 0;
		int previous_value = 0;
		
		for (int i = letters.length()-1; i >= 0; i--) {
			int current_value = 0;
			
			try {
				current_value = numerals.get(letters.toLowerCase().charAt(i));
			} catch (Exception e) {
				throw new RuntimeErrorException(null, "Letra inválida encontrada");
			}
		
			if (current_value < previous_value) {
				decimal = decimal - current_value;
			} else {
				decimal = decimal + current_value;
			}
			
			previous_value = current_value;
		}
		
		return decimal;
	}
}
