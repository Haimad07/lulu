 package lulu;

import java.util.Scanner;
public class FirstLetterUpperCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Sentence:");
		
		String sentence = sc.nextLine();
		
		String words[]=sentence.split("\\s+");
		
		String result[]= new String[words.length];
		
		
		
		for(int i=0;i<words.length;i++) {
			
			result[i] =words[i].substring(0,1).toUpperCase()+words[i].substring(1); 
		}
	    
		System.out.println(String.join(" ", result));
		
	    
	}
}
