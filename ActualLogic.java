package MarvellousString;
import java.util.*;

public class StringX
{
	public String str;   //Create string (str is reference of string)
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter String");
		str=sobj.nextLine();     
	}
	public void Display()
	{
		System.out.println("String is :"+str);
	}
}
class ActualLogic
{
	public static void main(String[] args) 
	{
		StringX sobj=new StringX();
		sobj.Accept();
		sobj.Display();
	}
}