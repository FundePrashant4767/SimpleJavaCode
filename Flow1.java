class Primemini
{
  String property="Head of cabinate";
 }
 class Vprecident extends Primemini
 {
   String presure="Head of primemini";
  }
  class Precident extends Primemini
  {
  String power="Head of country";
  }
 class Flow
  {
    public static void main(String[] args)
     {
	 
      System.out.println("main starts");
	Precident t1=new Precident();
      
	  System.out.println(t1.property);
      System.out.println(t1.presure);
       System.out.println(t1.power);
       

       System.out.println("THANK YOU MAIN ENDS");
     }
  }