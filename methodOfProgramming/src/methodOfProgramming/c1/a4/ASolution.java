package methodOfProgramming.c1.a4;

/*
 * 输入一个由数字组成的字符串，把它转换成整数并输出。例如：输入字符串"123"，输出整数123。
 * 给定函数原型int StrToInt(const char *str) ，实现字符串转换成整数的功能，不能使用库函数atoi。
 */
public abstract class ASolution {
	protected char[] input;

	public ASolution(String input) {
		this.input = input.toCharArray();
	}

	abstract int resolve();
}
