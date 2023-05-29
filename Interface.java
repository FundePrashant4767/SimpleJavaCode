interface Bank
{
	void withdrowl();
	void credit();
	void bal();
} 
interface Atm extends Bank
{
	void debit();
}
interface Atm1 extends Atm
{
	void Mg();
}
class Atmuser implements  Atm1
{
	@Override
		public void withdrowl(){
		System.out.println("Cash is Withdrow");
	}
	@Override
		public void credit(){
		System.out.println("Your Account has been Credited");
	}
	@Override
		public void bal(){
		System.out.println("Your balance is 1000000000000000");
	}
	@Override
		public void debit(){
		System.out.println("Your Account has been debited");
       }
	   @Override
		   public void Mg(){
		     System.out.println("******Thank you All Users******");
	   }
	public static void main(String[] args) 
	{
		System.out.println("***** Welcome SBI *****");
		Atmuser a1=new Atmuser();
		a1.withdrowl();
		a1.credit();
		a1.bal();
		a1.debit();
		a1.Mg();
	}
}
