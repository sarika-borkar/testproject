
public class outofboundexcp {

	public static void main(String[]args) {
		int arr[]= new int [3];
		arr[0]=34;
		arr[1]=57;
		arr[2]=43;
		try {
			arr[3]=40;
		}
		catch(ArithmeticException e) {
			System.out.println("arithmatic exception handel");
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("array out of bound exception handel");
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
