
public class exceptionsameprogram {
	public static void main(String[] args) {
		int a=23;
		int b=0;
		int c=0;
	int arr[]=new int [3];
	arr[0]=34;
	arr[1]=40;
	arr[2]=80;
	try {
		try {
			arr[3]=13;
		}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println("array index out of bound exception handel");
			}
		c=a/b;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmatic exception is handeled");
		//System.out.println(e.getMessage());
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
	
	}
	
	
	}
	}

