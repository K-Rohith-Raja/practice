package jdbc1;

public class Ananymous_class {

	public static void main(String[] args)
	{
	  A a =new A()
			  {
		  		public void method1()
		  		{
		  			System.out.println("im in ananymous interface");
		  			
		  		}
			  };
			  a.method1();
			  System.out.println(a.getClass().getName());
	}

}
interface A
{
	public void method1();
}