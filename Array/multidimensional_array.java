
class MultiDimensionArray{
	public static void main(String [] arg){
		int num[][] = new int [3][];
		for (int i = 0;i<num.length;i++)
			num[i] = new int[5];
		for (int i=0;i<num.length;i++) 
			for (int j=0;j<num[i].length;j++) 
				num[i][j] = i*j;
		for (int i=0;i<num.length;i++){
			for (int j=0;j<num[i].length;j++)
				System.out.print(num[i][j] + "\t");
			System.out.println("\n");
		}
		System.out.println(num[2][2]);
	}	
}
			