class Methodoverloading
{
  public static int add(int a,int b)
  {
    System.out.println(a+b);
    return a+b;
   }
    public static void main(String[] args)
    {
      System.out.println(add(10,20));
     }
     public static double add(double a,double b)
     {
      return a+b;
     }
   }