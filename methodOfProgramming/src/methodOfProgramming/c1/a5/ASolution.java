package methodOfProgramming.c1.a5;

/*
 * palindrome，指一个顺着读和反过来读都一样的字符串，比如madam、我爱我，这样的短句在智力性、
 * 趣味性和艺术性上都颇有特色，中国历史上还有很多有趣的回文诗。
 * 那么，我们的第一个问题就是：判断一个字串是否是回文？
 */

public abstract class ASolution {
	protected String input;

	protected ASolution(String input) {
		this.input = input;
	}

	public abstract boolean resolve();
}
