class Primemini
{
  String property="Head of cabinate";
 }
 class Vprecident extends Primemini
 {
   String right="Head of Primemini";
  }
  class Precident extends Vprecident
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
       System.out.println(t1.right);
       System.out.println(t1.power);
       

       System.out.println("THANK YOU MAIN ENDS");
     }
  }


----------------output---------------------------------


C:\Users\prash\OneDrive\Desktop\java>javac Flow.java

C:\Users\prash\OneDrive\Desktop\java>java Flow
main starts
Head of cabinate
Head of Primemini
Head of country
THANK YOU MAIN ENDS.