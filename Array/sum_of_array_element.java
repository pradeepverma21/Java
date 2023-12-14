class ArraySum{
	public static void main(String [] a)
	{
		int [] marks = new int[5];
		marks[0]=24;
		marks[1]=45;
		marks[2]=66;
		marks[3]=87;
		marks[4]=90;
		
		int sum = 0;
		
		for(int i=0; i<marks.length;i++)
	    {
			sum = sum+marks[i];
		}
		System.out.println(sum);
	}
}