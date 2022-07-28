
public class arithmaticException {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=0;
		int []d= {34,57,98};
		try {
		
		c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handel succecfully");
			
		}
		
		System.out.println("result is"+c);
	}

}
