public class Tap
{
	public static void main(String[] args){
	   divide(42, 45, 34);
	   charge('k');
	   open(3, 4.1f);
	}




	
	static void divide(int numbaer1,int numbaer2)
	{
		System.out.println("two parameters are invoked");
		int returnint=numbaer1/numbaer2;
		System.out.println(returnint);
	}

	
	static void divide(int num1,int num2, int num3)
	{
		System.out.println("three parameters invoked");
		int returnint=num1/num2+num3;
		System.out.println(returnint);
	}

	
	static void charge(boolean value)
	{
	
		System.out.println("boolean  type invoked");
		System.out.println(value);
		
	}

	
	static void charge(char value)
	{
		System.out.println("char type invoked");
		System.out.println(value);
	}

	
	static void open(int firstvalue,float secondvalue)
	{
		System.out.println("int, flaot order is invoked");
		System.out.println(firstvalue);
		System.out.println(secondvalue);
		
	}


	
	static void open(float firstvalue,int secondvalue)
	{
		System.out.println("float,int order is invoked");
		float b =firstvalue - secondvalue;
		System.out.println(b);
	}
}
