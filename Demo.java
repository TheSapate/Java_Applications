import java.util.*;

class StringX
{
	public String str;

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
	public int CountCapital()
	{
		char Arr[]=str.toCharArray();

		int iCnt=0,i=0;
		for(i=0;i<Arr.length;i++)
		{
			if((Arr[i]>='A')&&(Arr[i]<='Z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		Marvellous mobj=new Marvellous();

		mobj.Accept();
		mobj.Display();

		int iRet=0;
		iRet=mobj.CountCapital();

		System.out.println("Count is :"+iRet);
	}
}