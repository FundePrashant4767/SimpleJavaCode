class Gretest
{
  public static String check(int a,int b,int c)
  {
   if(a>b && a>c)
    {
     return a+" is Greater";
    }
   else if(b>a && b>c)
    {
      return b+"is Greater";
     }
     else
     {
       return c+ "is Greater";
     }
    }
     public static void main(String[] args)
     {
      System.out.println(check(11,23,54));
     }
   }