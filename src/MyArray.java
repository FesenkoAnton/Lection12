import acm.program.ConsoleProgram;

public class MyArray extends ConsoleProgram{

	public void run(){
		int[] arr = new int[4];
		readArray(arr);
		Array(arr);
	}

	private void readArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = readInt("?: ");
		}
	}

	private static void Array(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
