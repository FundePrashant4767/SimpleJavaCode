//with return type with argument.
class Minical1
{
  public static void add(int a,int b)  //with return type with argument.
  {
      System.out.println(a+b);
  }
  public static void sub(int a,int b)
  {
      System.out.println(a-b);
  }
  public static void multi(int a,int b)
  {
   
   System.out.println(a*b);
  }
   public static void div(int a,int b)
   {
    
    System.out.println(a/b);
   }
   public static void mod(int a,int b)
   {
        System.out.println(a%b);
   }
    public static void main(String[] args)
    {
     char op='/';
     switch(op)
    {
     case '+':add(15,30);
               break;
     case '-':sub(25,25);
               break;
     case '*':multi(100,300);
              break;
      case '/':div(10000,300);
              break;
      case '%':mod(1000000,2000000);
               break;
    }
  }
}