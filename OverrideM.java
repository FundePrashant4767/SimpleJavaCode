class  Vehicale
{
	void Start(){
		                  System.out.println("vehicale started");
	                   }
	void Stop(){
		                 System.out.println("vehicle stoped");
	}
}
class SuperCar extends Vehicale
{
	@Override
		void Start(){
		                      System.out.println("SuperCar Started ");
	                        }
							void ShiftGears(){
								                 System.out.println("Geare Shifted");
							}

public static void main(String[] args)
{
	System.out.println("Main Starts");
	SuperCar  sc1=new SuperCar();
	sc1.Start();
	sc1.ShiftGears();
	sc1.Stop();
	System.out.println("Main Ends");
    }
}

