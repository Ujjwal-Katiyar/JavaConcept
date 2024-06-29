package Java8.JavaStreams;

interface predicatee
{
	public static final int flag=12;
	
	public abstract void test();
	
}

public class Streams {
	public static void print()
	{
		System.out.println("Thsi us the tes resting ");
	}

	public static void main(String[] args) {
		System.out.println("This is the main method");
		sum(Streams::print);
		
		
		
	}
	
	public static void sum(predicatee p ){
		p.test();
	}
}
