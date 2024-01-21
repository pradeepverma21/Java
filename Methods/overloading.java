import java.lang.Math;

class FunctionOverloadingDemo{
	// Creating an overloading function for area
	public static void main(String [] args){
		int radius = 5;
		int lenght = 4, width = 7;
		int a = 4, b = 5, c = 6;
		
		System.out.println("The area of circle is "+ area(radius));
		System.out.println("The area of rectangle is "+ area(lenght, width));
		System.out.println("The area of circle is "+ area(a,b,c));
	}
	
	static float area(int r){
		return r*r;
	}
	static float area(int x, int y){
		return x*y;
	}
	static float area(int p, int q, int t){
		float s = (float)(p+q+t)/2.0f;
		return (float)Math.sqrt(s*(s-p)*(s-q)*(s-t));
	}
}

		

		