class A 
{
	int a=100;
	public void demo(){
		System.out.println("demo()....!!");
}
	{
		System.out.println("IB-A");
	}
}
	class B extends A
	{
int b=20;
	public void final1(){
		System.out.println("final()....!!");
}
	{
		System.out.println("IB-B");
	}
	public static void main(Strring[] args){
		B b1=new B();
		b1.demo();
		b1.a;
		b1.final1();
b1.b;
	}

	}
