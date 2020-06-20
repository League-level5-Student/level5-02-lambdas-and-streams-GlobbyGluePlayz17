package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
		
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println((i+1) + ". " + s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String newS = "";
			for(int i = s.length()-1; i >= 0; i--) {
/*newS, not s */ newS += s.charAt(i);
			}
			s = newS;
			System.out.println(s);
		}, "racecar tacocat zoonooz andthistoconfirm:D");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String newS = "";
			for(int i = 0; i < s.length(); i++) {
				int thelettersdestinytellerifitllbeupperorlowercase = new Random().nextInt(2); //2 not 1
				Character c = s.charAt(i);
				if (Character.isLetter(c)) {
					if (thelettersdestinytellerifitllbeupperorlowercase == 0) {
						newS += Character.toUpperCase(c);
					} else {
						newS += s.charAt(i);
					}
				} else {
					newS += s.charAt(i);
				}
			}
			s = newS;
			System.out.println(s);
		}, "spooky scary skeletons");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String newS = "";
			for(int i = 0; i < s.length(); i++) {
				newS += s.charAt(i) + ".";
			}
			s = newS;
			System.out.println(s);
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
			System.out.println(s);
		}, "Supercalifragilisticexpielidocious");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
