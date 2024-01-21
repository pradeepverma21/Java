class CheckPrime{
	// Creating function that can check prime number 
	public static boolean isPrime(int n){
		boolean flag = true;
		for (int i=2;i<(int)n/2;i++){
			if (n%i==0){
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	
	public static void main(String [] arga){
		int num =135;
		
		if (isPrime(num))
			System.out.println(num + " is not prime");
		else
		    System.out.println(num + "is prime");
		int num1 = 2343421;
		if (isPrime(num1))
			System.out.println(num1 + " is not prime");
		else
		    System.out.println(num1 + " is prime");
		
	}
}

		
	