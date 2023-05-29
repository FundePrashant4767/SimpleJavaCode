class Atm
{
	private int balance ;
	int pin;
	long acNo;
		 public  int getpin(int pin)
		{
			 return pin;
		}
		public  void  setpin(int pin)
		{
			if(pin==pin)
			{
				this.pin=pin;
				System.out.println("5000");
			}
			else
			{
				System.out.println("pin can not found");
			}
    }
}
class AtmUser1 extends Atm
{
	 public static void main(String[] args)
	{
		 System.out.println("Welcome from SBI Atm");
		 Atm a1=new Atm();
	a1.setpin(2332);
			// System.out.println(a1.getpin());
		 System.out.println("Thank's for Using SBI Atm");
	}
	}