package methodOfProgramming.c2.a1;

/*
 * Find the Kth smallest number
 */
public abstract class ASolution {
	protected int[] input;
	
	public ASolution(int[] input) {
		this.input = input;
	}

	public abstract int resolve(int k);
}
