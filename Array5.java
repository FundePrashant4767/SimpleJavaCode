//CHECCK GIVEN NUMBER IS PRESENT OR NOT ?.

class Array5 
{
	public static void main(String[] args) 
	{
		int [] arr={1,2,3,4,5,6,7};
		int a=77;
		boolean flag=false;
		 for(int i=0;i<arr.length;i++)
		{
			 if(arr [i] == a)
			{
				 flag=true;
			}
        }
		if(flag)
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not a Present");
		}
	}
}

/*-------------------------------OUTPUT-----------------------------------------------------------

C:\Users\prash\OneDrive\Desktop\java>javac Array5.java

C:\Users\prash\OneDrive\Desktop\java>java Array5
Not a Present





