class ArrayForEachDemo{
	public static void main(String [] a){
		int [] age = {10,20,30,40,50};
		//accesing element using for loop
		
		for(int i=0; i<age.length;i++)
			System.out.println(age[i]);
			
		//accesing element using for each loop
		for(int ele:age)
			System.out.println(ele);
	}
}
