package abc;
import java.util.*;

public class Maxx {
	public static void main(String[] args) {
		String str ="aaabbbbcccccgh";  		
		// Create a HashMap to store key.vakue pairs.
		Map<Character,Integer>map = new HashMap<>();
		//loop 
		for(int i=0;i<str.length();i++) {
			
			if(map.containsKey(str.charAt(i))==false) {
				map.put(str.charAt(i),1);
			}
			else {
				int oldval = map.get(str.charAt(i));
				map.put(str.charAt(i),oldval+1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
		
		/*int maxVal = -1;
		char maxChar = ' ';
		for(Map.Entry<Character,Integer> data:hmap) {
			if(data.getValue()>maxVal) {
				maxVal = data.getValue();
				maxChar = data.getKey();
			}
		}
		
		System.out.println(maxChar+" "+maxVal);*/
		for(Map.Entry<Character,Integer> data:hmap) {
			
			if(data.getValue()==1) {
				System.out.println(data.getKey());
			}
		}
	}

}
