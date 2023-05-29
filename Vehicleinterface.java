// Example : 2 Interface to Interface:

interface Vehicle
{
	void start();
	void stop();
}
interface Car extends  Vehicle
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
		Nano c1=new Nano();
		c1.start();
		c1.honk();
		c1.stop();
	}
}

/*----------------------------------------OUTPUT-----------------------------------------------------------------

C:\Users\prash\OneDrive\Desktop\java>javac Vehicleinterface.java

C:\Users\prash\OneDrive\Desktop\java>java CarDriver
***** Welcome SBI ATM*****
Car Is Started
pommm  pommm pommm
Car is Stop
