import java.util.Arrays;

public class Test {
	enum Season {
		WINTER, SPRING, SUMMER, AUTUMN
	}
	 enum Sex {MALE,FEMALE};
	public static void main(String[] args) {
	for(Sex v : Sex.values()){
        System.out.println(" values :"+ v);
	}
	/*public static void main(String[] args) {

		Season season = Season.SPRING;
		String name = "WINTER";
		Season season1 = Season.valueOf(name);
		System.out.println(season1);
		// System.out.println("season.name()="+season.name()+", season.ordinal()="+season.ordinal()+", season.toString()="+season.toString());
	}*/
		/*public static Enum Class[]values(){
			System.out.println(Arrays.toString(Season.values()));

		}*/
	
	
    }
	
	}

/*enum Direction{
	
	UP,DOWN;
	
	public Direction opposite(){
		return this==UP?DOWN:UP;
	}*/
	
