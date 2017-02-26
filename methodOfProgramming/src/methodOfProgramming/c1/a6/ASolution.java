package methodOfProgramming.c1.a6;

/*
 * 题目描述:
 * 给定一个字符串，求它的最长回文子串的长度。
 * 
 * 分析与解法:
 * 最容易想到的办法是枚举所有的子串，分别判断其是否为回文。
 * 这个思路初看起来是正确的，但却做了很多无用功，如果一个长的子串包含另一个短一些的子串，
 * 那么对子串的回文判断其实是不需要的。
 */
public abstract class ASolution {
	protected String input;
	
	protected ASolution(String input) {
		this.input = input;
	}
	
	public abstract String resolve();
}