class Merge
{
	public static void main(String[] args)
	{
		 int [ ] arr ={1,2,3};
		 int [ ] arr1 ={1,2,4};
		 int [ ]  res=new int [arr.length +arr1.length];
		  for(int i=0;i<arr.length;i++)
		{
			  arr [i] =arr1 [i];
		}
		for(int i=0;i< arr1.length ; i++)
		{
			res [1+arr.length] =arr1[i];
		}
	}

}