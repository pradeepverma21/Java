class EvenOddCount{
	public static void main(String [] args){
		int [] age = {22,45,5,77,890,46,47};
		int count_even=0;
		int count_odd =0;
		for(int i=0;i<age.length; i++){
			if(i%2==0){
			count_even++;
			}
			else{
				count_odd++;
			}
		}
		System.out.println("Even number in array are:" + count_even);
		System.out.println("Odd number in array are:" + count_odd);

	}
}

				
		