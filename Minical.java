class Minical
{
  public static void add()
  {
   int a=10;
   int b=20;
   System.out.println(a+b);
  }
  public static void sub()
  {
   int a=20;
    int b=30;
   System.out.println(a-b);
  }
  public static void multi()
  {
   int a=100;
   int b=200;
   System.out.println(a*b);
  }
   public static void div()
   {
    int a=20;
    int b=20;
    System.out.println(a/b);
   }
   public static void mod()
   {
    int a=10;
     int b=40;
    System.out.println(a%b);
   }
    public static void main(String[] args)
    {
     char op='*';
     switch(op)
    {
     case '+':add();
               break;
     case '-':sub();
               break;
     case '*':multi();
              break;
      case '/':div();
              break;
      case '%':mod();
               break;
    }
  }
}