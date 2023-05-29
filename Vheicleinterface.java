interface Vehicle
{
	void start();
	void stop();
}
interface Car implements  Vehicle
{
	void honk();
}
class Nano implements Car
{
	@Override
		public void start(){
		System.out.println("Car Is Started");
	}
	@Override
		public void stop(){
		System.out.println("Car is Stop");
	}
	@Override
		public void honk(){
		System.out.println("pommm  pommm pommm");
	}
}
class CarDriver
{
	public static void main(String[] args) 
	{
		System.out.println("***** Welcome SBI ATM*****");
		CarDriver c1=new CarDriver();
		c1.start();
		c1.honk();
		c1.stop();
	}
}
