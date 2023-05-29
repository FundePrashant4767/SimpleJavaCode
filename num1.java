import java.util.Scanner;
class  Number1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number:");
		int a =sc.nextInt();
		int res=a*a;
		if(a==res)
		{
			System.out.println(res+"Number is same as result");
		}
		else
		{
			System.out.println(a+"Num is not same as result");
		}

	}
}