import acm.program.ConsoleProgram;

public class EffectiveArray extends ConsoleProgram{

	private static final int SENTINEL = -1;
	private static final int MAX_SIZE = 20;

	public void run(){
		int[] mid = new int[MAX_SIZE];
		int numScores = 0;
		while (true) {

			int score = readInt("?");
			if (score == SENTINEL)
				break;
			mid[numScores++] = score;
			println("? mid["+numScores+"]"+"="+score);
			
		}
	}

}
