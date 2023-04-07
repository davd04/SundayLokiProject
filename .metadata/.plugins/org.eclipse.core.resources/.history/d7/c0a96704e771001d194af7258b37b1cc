package com.upskill.Java_Assignments;

public class Java_assignment3_q6 {

	public static void main(String[] args) {
		int vowels = 0;
		int consonants = 0;
		int digits = 0;
		int tabs = 0;
		int blank = 0;
		char s = '\0';
		String str ="A quick brown fox jumps over the lazy dog";
		
		for (int i=0; i < str.length(); i++){
			s = str.charAt(i);
			if (Character.toString(s).toLowerCase().matches("[aeiou]") == true) {
				vowels++;
			} else if (Character.toString(s).toLowerCase().matches("\\d") == true){
				digits++;
			}else if (Character.toString(s).toLowerCase().matches("\\t") == true){
				tabs++;
			} else if (Character.toString(s).toLowerCase().matches("\\s") == true){
				blank++;
			} else {
				consonants++;
			}
		}
		
		System.out.println("Number of vowels; " + vowels);
		System.out.println("Numbers of consonants: " + consonants);
		System.out.println("Numbers of digits: " + digits);
		System.out.println("Numbers of tabs: " + tabs);
		System.out.println("Numbers of blanks: " + blank);
		

	}

}
