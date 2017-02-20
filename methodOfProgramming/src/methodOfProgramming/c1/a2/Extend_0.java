package methodOfProgramming.c1.a2;

public class Extend_0 {
	/*
	 * Brother string: have same characters with same amount of each characters, but order could be different.
	 * How to decide two strings are brother strings?
	 */
	
	public static boolean isBrother(String s1, String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1 != len2){
			return false;
		}
		
		char[] s1Chars = s1.toCharArray();
		char[] s2Chars = s2.toCharArray();
		int[] signature1 = new int[26];
		int[] signature2 = new int[26];
		
		for(char c1 : s1Chars){
			signature1[c1 - 'A']++;
		}
		
		for(char c2 : s2Chars){
			signature2[c2 - 'A']++;
		}
		
		for(int i = 0; i < 26; i++){
			if(signature1[i] != signature2[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		String s1 = "ASDF";
		String s2 = "FDSAA";
		System.out.println(isBrother(s1, s2));
	}
}
