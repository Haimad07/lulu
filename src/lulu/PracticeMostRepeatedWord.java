package lulu;

public class PracticeMostRepeatedWord {
	
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};
		
		int min = a[0];
		int max =a [0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a [i]>max) {
				max =a[i];
			}
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
