import java.util.Set;
import java.util.TreeSet;

import sun.misc.Sort;


public class test {
	
	public test(){}
	
	public boolean uniqueString(String test){
		if (test == null){
			return false;
		}
		int len = test.length();
		Set<Character> uniqueChars = new TreeSet<Character>();
		for (int i=0; i<len; i++){
			uniqueChars.add(test.charAt(i));
		}
		return uniqueChars.size() == len;
	}
	
	public boolean anagramTest(String s1, String s2){
		if (s1.length() != s2.length()){
			return false;
		}
		int charCnt1[] = new int[256];
		int charCnt2[] = new int[256];
		
		for(int i=0; i<256; i++){
			charCnt1[i] = 0;
			charCnt2[i] = 0;
		}
		
		for (int i=0; i<s1.length(); i++){
			charCnt1[s1.charAt(i)]++;
			charCnt2[s2.charAt(i)]++;
		}
		
		for(int i=0; i<256; i++){
			if (charCnt1[i] != charCnt2[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		test t = new test();
		int i = 5/2;
		System.out.println(i);
	}

}
