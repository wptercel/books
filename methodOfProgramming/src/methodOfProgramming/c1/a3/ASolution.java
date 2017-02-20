package methodOfProgramming.c1.a3;
/*
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 
 * 例如输入字符串abc，则输出由字符a、b、c 所能排列出来的所有字符串
 * 
 * abca、acb、bac、bca、cab 和 cba。ss
 */

import java.util.ArrayList;
import java.util.List;

public abstract class ASolution {
	protected List<String> resultHolder;
	protected char[] candidates;
	
	public ASolution(String input){
		resultHolder = new ArrayList<String>();
		candidates = input.toCharArray();
	}

	abstract List<String> resolve();
}
