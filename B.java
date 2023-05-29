class  A 
{
	static int a=10;
	public static void demo(){
		System.out.println("demo()-");
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		demo();
	}
}
	class B extends A
	{
		static int b=20;
		public static void self(){
      System.out.println("self()-");
	}
	public static void main(String[] args)
		{
		  System.out.println(b);
		  self();
		  demo();
		}
	}

