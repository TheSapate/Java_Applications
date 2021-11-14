import java.util.*;
//import java.String.*;

class StringDemo
{
	public int CountCapital(String str)
	{
		int iCnt=0;

		while(str!='\0')
		{
		    if((str>='A')&&(str<='Z'))
		    {
			    iCnt++;
		    }
		    str++;
	     } 
	     return iCnt; 
	}
}
class CountCapital
{
	public static void main(String[] args) 
	{
		Scanner sobj=new Scanner(System.in);

        System.out.println("Enter String\n");
        String str=sobj.nextLine();

       String s=new String(str);

        //System.out.println("Capital Letters Count is :"+sRet);
	}
}