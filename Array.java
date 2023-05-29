//  Q.1.Write a program to swap given array.?
class Array 
{
	public static void main(String[] args) 
	{
		
		int [] arr={1,3,2,4,3,5,6,4,9,10,0};
		for (int i=0;i<arr.length ;i++ )               //It Pick the number.
		{
			for(int j=i+1 ; j<arr.length ; j++)     //To Compare The Number.
			{
				if(arr[i]>arr[j])
				{
				int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0 ; i<arr.length ; i++)
		{
				System.out.println(arr[i]+" ");
		}

		}
	}

