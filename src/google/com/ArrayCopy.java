class ArrayCopy
{
	public static void main(String args[])
	{
		int array1[]={1,2,3,4,5,6,7,8,9,10};
     	int array2[]={0,0,0,0,0,0,0,0,0,0};
     	System.arraycopy(array1,0,array2,1,5);
     	System.out.print("array2:");
     	for(int i=0;i<array2.length;i++)
        	System.out.print(array2[i]+" ");
	}
}
