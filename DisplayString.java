import java.util.*;

class DisplayString
{
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);

		String str;
		System.out.println("Enter your name");
		str=sobj.nextLine();

		System.out.println("Hello :"+str);

	}
}