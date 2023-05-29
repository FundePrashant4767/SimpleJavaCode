class  Armstrong
{
	public static void main(String[] args) 
	{
		int a=153;
		int temp=a;
		int sum=0;
		int rev;
			while(temp>0)
		{
			int res=temp%10;
			rev = temp/10;
			int p=res*res*res;
			sum=sum+res;
			
		}
		if(sum==a)
		{
				System.out.println("the "+a+" is armstrong number");
		}
		else
		{
				System.out.println("the "+a+" is not armstrong");
		}
	}
}
