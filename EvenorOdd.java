import java.util.Scanner;
class EvenorOdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter aFirst Number : ");
		int num1=sc.nextInt();
		System.out.println("Enter a Second Number : ");
        int num2=sc.nextInt();
		System.out.println("Enter a  Third Number : ");
       int num3=sc.nextInt();
	   if(num1 > num2 && num1>num3)
		{
		   System.out.println( num1+" : Is Gretest Number. ");
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println(num2 +": is Gretest Number. ");
		}
		else
		{
			System.out.println( num3 +":is Gretest Number ");
		}
	}

}