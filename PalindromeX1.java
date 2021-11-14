import java.util.*;

class StringX
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
class Marvellous extends StringX
{
	public boolean CheckPalindrome()
	{
		char Arr[]=str.toCharArray();
		int iStart=0,iEnd=Arr.length-1;
		char temp;
		while(iStart<iEnd)
		{
			temp=Arr[iStart];
			Arr[iStart]=Arr[iEnd];
			Arr[iEnd]=temp;

			iStart++;
			iEnd--;
		}
		String newstr=new String(Arr);
		boolean bRet=newstr.equalsIgnoreCase(str);

		return bRet;
	}
}
class PalindromeX1
{
	public static void main(String[] args) 
	{
		Marvellous mobj=new Marvellous();
		int iRet=0;

		mobj.Accept();
		mobj.Display();

		boolean bRet;
		bRet=mobj.CheckPalindrome();
		if(bRet==true)
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}

	}
}