class Minical2
{
  public static int add()  //with return type with argument.
  {
     int a=10;
      int b=20;
      int c=a+b;
       return c;
  }
  public static void sub()
  {
     int a=200;
      int b=0;
      int c=a-b;
	System.out.println(c);
      
  }
  public static int multi()
  {
   int a=20;
   int b=30;
   int c=a*b;
    return c;
  }
   public static int div()
   {
    int a=20;
     int b=20;
      int c=a/b;
      return c;
   }
   public static int mod()
   {
      int a=20;
      int b=30;
      int c=a%b;
      return c;
   }
    public static void main(String[] args)
    {
     char op='+';
     switch(op)
    {
     case '+':
                break;
     case '-':  sub();
               break;
     case '*': multi();
               break;
      case '/': div();
               break;
      case '%': mod();
                break;
    }
  }
}