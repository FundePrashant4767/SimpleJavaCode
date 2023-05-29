class Atm
{
	private int balance ;
		 public  int getbalance()
		{
			 return balance;
		}
		public  void  setbalance(int balance)
		{
			if(balance>0)
			{
				this.balance=balance;
			}
			else
			{
				System.out.println("Balance can not found");
			}
    }
}
class AtmUser
{
	 public static void main(String[] args)
	{
		 System.out.println("Welcome from SBI Atm");
		 Atm a1=new Atm();
		 a1.setbalance(1230);
			 System.out.println(a1.getbalance());
		 System.out.println("Thank's for Using SBI Atm");
	}
	}