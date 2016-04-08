import acm.program.ConsoleProgram;


public class Test1 extends ConsoleProgram{
	public void run(){
	char s='G';
	char f='f';
	char d='d';
	f=Character.toUpperCase(f);
	//String str = "Hello";
	//str= str.toUpperCase();
	String st="Hello";
	String st1="world";
	String str=readLine();
	if(st.equals(str)){
		System.out.println("st.equals(str)");
	}
	
	System.out.println(st+" "+st1);
	System.out.println(toLower(s));
	System.out.println(f);
	}
	
	/*static boolean isDigit(char ch){
		return ;
		
	}*/
	
	static char toLowerCase(char ch){
		return ch;
	}

	
	public char toLower(char c){
		char s=c;
		
		if(s>='A'&&s<='Z'){
			return (char) (s-'A'+'a');
		}
		return s;
	}
}
