class ArrayDemo01{
	public static void main(String [] a){
		int age[];
		age = new int[5];
		age[0] = 23;
		age[1] = 34;
	    age[2] = 25;
		age[3] = 47;
		age[4] = 21;
		
		for(int i=0; i<age.length; i++)
		{
			System.out.println(age[i]);
		}
	}
}