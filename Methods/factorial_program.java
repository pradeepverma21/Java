class FactorialDemo{
	static int fact(int n){
		if(n==1)
			return n;
		else
			return n*fact(n-1);
	}
	public static void main(String [] args){
		int num = 10;
		System.out.println("Factorial of "+num+" is " + fact(num));
		
	}
}