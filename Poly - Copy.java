class  Animal 
{
	void food(){
		System.out.println("Some Animals Food");
	}
}
class Hebivoers extends Animal
{
	@Override
	void food(){
		System.out.println("Some  Animals");
	}
}
class Omnivers extends Animal
{
@Override
	void food(){
		System.out.println("Greps and Plants");
       }
}
class Carnivores extends Animal
{
	void food(){
		System.out.println("SOme plant and gross");
     }
public static void main(String[] args)
	{
	  Omnivers c1= new Omnivers ();
	  c1.food();
	}
}