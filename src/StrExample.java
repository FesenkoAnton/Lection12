

import acm.program.*;

public class StrExample extends ConsoleProgram{

	public void run(){
		String str = readLine("введіть стрічку: ");
		String rev = reverseString(str);
		println(rev);
	}

	private String reverseString(String str) {
		String result = "";
		for (int i = 0; i<str.length();i++)
			result = str.charAt(i)+result;
		return result;
	}
}
