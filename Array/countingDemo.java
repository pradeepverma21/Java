class ArraySumCount{
	public static void main(String [] a)
	{
		int [] marks = {24,45,66,87,90,66,34,9};
		/*marks[0]=24;
		marks[1]=45;
		marks[2]=66;
		marks[3]=87;
		marks[4]=90;*/
		
		int sum = 0;
		int count = 0; //counting the number of element greater
                      //than 30 in the array
		                 
		for(int i=0; i<marks.length;i++)
	    {
			if(marks[i]>30)
				count++;
			sum = sum+marks[i];
		}
		System.out.println("Number greater than 30 are"+ count);
		System.out.println("The sum of array is "+ sum);
	}
}