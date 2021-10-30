class AbstractDemo
{
	public static void main(String[] args) 
	{
		//Demo obj=new Demo();     //Error
		Demo obj;    //Allowed
		obj=new Hello();     //Upcasting
		obj.fun();  //fun of Hello
		obj.gun();  //gun of Demo
		obj.sun();  //sun of Hello

		System.out.println(obj.i);  //Demo of i  //10
		System.out.println(obj.j);  //Demo of j  //20
	}
}
abstract class Demo
{
	public int i,j;
	public Demo()
	{
		System.out.println("Inside Constructor of Demo");
		i=10;
		j=20;
	}
	public void fun()
	{
		System.out.println("Inside fun of Demo");
	}
	public void gun()
	{
		System.out.println("Inside gun of Demo");
	}
	public abstract void sun();   //In c++ there is Virtual void sun()=0;
}

class Hello extends Demo
{
	public int x,y;
	public Hello()
	{
		System.out.println("Inside Constructor of Hello");
		x=10;
		y=20;
	}

	public void fun()      //Overriding
	{
		System.out.println("Inside fun of Hello");
	}
	public void sun()      //Defination
	{
		System.out.println("Inside sun of Hello");
	}
}