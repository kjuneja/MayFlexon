package excercises;

import java.util.Arrays;

public class Anagram {
	
	
	public void anagramMeth(String s1, String s2) {
		
		char[] ch = s1.toCharArray();
		char[] ch1 = s2.toCharArray();
		
		int length1 = ch.length;
		int length2 = ch1.length;
		int count =0;
		
		/*
		 * for (int i = 0; i<ch.length; i++) { System.out.print(" "+ ch[i]); }
		 * 
		 * for (int i = 0; i<ch1.length; i++) { System.out.print(" "+ch1[i]); }
		 */
		
		
		
		if(length1 != length2) {
			System.out.println("It is not a anagram");
		}
		
		else {
			Arrays.sort(ch);
			Arrays.sort(ch1);
			//System.out.println(ch);
			//System.out.println(ch1);
			for (int i =0; i<length1; i++) {
				System.out.println(ch[i]+" "+ch1[i]);
				if(ch[i] != ch1[i]) {
					
					//System.out.println("It is not a anagram");
					count++;
					
				}
				else {
					
					//System.out.println("It is anagram");
					
					
				}
			}
			if(count>0) {
				System.out.println("It is not a anagram");
				
			}
			else {
				System.out.println("It is anagram");
			}
		}
		System.out.println(count);
		
	}
	
	
	public static void main(String[] args) {
		
		Anagram obj = new Anagram();
		obj.anagramMeth("hello", "lhoee");
		
		
	}

}
