class Conditionalop1
{
  public static void main(String[] args)
  {
    int a=10;
     int b=100;
      int c =10000;
    int result1=(a>b) ? a:b;
    int result2=(result1>c) ? result1:c;
   System.out.println(result2+"is greater");
  }
}