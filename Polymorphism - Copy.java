class  Animal 
{
	void food(){
		System.out.println("Some Animals Food");
	}
}
class Lion extends Animal
{
	@Override
	void food(){
		System.out.println("Some  Animals");
	}
}
class Fox extends Animal
{
	@Override
	void food(){
		System.out.println("Greps and Plants");
       }
}
class Elephant extends Animal
{
	@Override
	void food(){
		System.out.println("SOme plant and gross");
     }
}
   class TestFood
   {
	public static void main(String[] args) 
	{
	 Fox  e1 =new  Fox();
		e1.food();
	}
}
