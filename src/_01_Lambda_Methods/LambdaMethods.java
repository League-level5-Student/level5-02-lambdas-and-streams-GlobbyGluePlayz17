package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
		
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
//		printCustomMessage((s)->{
//			for(int i = 0; i < 10; i++) {
//				System.out.println(s);
//			}
//		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String newS = "";
			for(int i = s.length()-1; i >= 0; i--) {
				s += s.charAt(i);
			}
			s = newS;
		}, "racecar tacocat zoonooz");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			int thelettersdestinytellerifitllbeupperorlowercase = new Random().nextInt(1);
			String newS = "";
			for(int i = 0; i < s.length(); i++) {
				Character c = s.charAt(i);
				if (Character.isLetter(c)) {
					if (thelettersdestinytellerifitllbeupperorlowercase == 0) {
						newS += Character.toUpperCase(c);
					} else {
						newS += s.charAt(i);
					}
				}
			}
			s = newS;
		}, "spooky scary skeletons");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String newS = "";
			for(int i = 0; i < s.length(); i++) {
				newS += s.charAt(i) + ".";
			}
			s = newS;
		}, "TODAYS title");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String newS = "";
			for(int i = 0; i < s.length(); i++) {
				if (!(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')) {
					newS += s.charAt(i);
				}
			}
			s = newS;
		}, "Supercalifragilisticexpielidocious");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
