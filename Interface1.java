// Example No : 1   Interface to Class.

interface Bank
{
	int balance=1000;
	void withdraw();
	void deposit();
}
class Atm implements Bank
{
	@Override
		public void withdraw(){
		System.out.println("Your bal is withdraw");
}
@Override
	public void deposit(){
	System.out.println("Money is deposited");
      }
	public static void main(String[] args) 
	{
		System.out.println("***** Welcome SBI ATM*****");
		Atm a1=new Atm();
		a1.withdraw();
		a1.deposit();
		System.out.println(Atm.balance);
	}
}


/*------------------------------------OutPut--------------------------------------------------
C:\Users\prash\OneDrive\Desktop\java>javac Interface1.java

C:\Users\prash\OneDrive\Desktop\java>java Atm
***** Welcome SBI ATM*****
Your bal is withdraw
Money is deposited
1000