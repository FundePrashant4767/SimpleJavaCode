import java.util.Scanner;
class Exception1 
{
	public static void main(String[] args) 
	{
		System.out.println( "Enter a Two Number's :");
		Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
	   int b=sc.nextInt();
		try
		{
			System.out.println(a/b);
	
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmatic Exception Succesfully Handled");
		}
		finally
		{
			System.out.println("THANK YOU");
		}
  }
}
/*--------------------OUTPUT--------------------------------------------------------------------------------
C:\Users\prash\OneDrive\Desktop\java>javac Exception1.java

C:\Users\prash\OneDrive\Desktop\java>java Exception1
Arithmatic Exception Succesfully Handled
THANK YOU  */