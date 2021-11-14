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
	public int CountVowels()
	{
		char Arr[]=str.toCharArray();
		int iCnt=0,i=0;
		for(i=0;i<Arr.length;i++)
		{
			if((Arr[i]=='a')||(Arr[i]=='e')||(Arr[i]=='i')||(Arr[i]=='o')||(Arr[i]=='u'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}
class CountVowels
{
	public static void main(String[] args) 
	{
		Marvellous mobj=new Marvellous();
		int iRet=0;

		mobj.Accept();
		mobj.Display();

		iRet=mobj.CountVowels();
		System.out.println("Number of vowels are :"+iRet);

	}
}