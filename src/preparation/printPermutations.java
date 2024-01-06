package preparation;

public class printPermutations {
    public static void main(String[] args) {
    	
    	String str ="ABC";
    	
    	printPerms(str,"",0);
    
    }
    private static void printPerms(String str,String perm,int ind) {
    	
    	for(int i=0;i<str.length();i++) {
    		
    		char currStr = str.charAt(i);
    		String newStr= str.substring(0,i)+str.substring(i+1);
    		printPerms(newStr,perm+currStr,ind+1);
    	}
    	if(str.length()==0) {
    		System.out.println(perm);
    	}
    	
    }

}
