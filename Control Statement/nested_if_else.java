class NestedIfElse{
      public static void main(String [] args){
		  int marks = 50;
		  
		  if (marks<40){
			  System.out.println("Your are fail");
		  }
		  else{
			  System.out.println("You are pass");
			  if (marks>70){
				  System.out.println("With Distinction");
			  }
			  else if(marks>60){
				  System.out.println("first class");
			  }
			  else{
				  System.out.println("second class");
			  }
		  }
	  }
}

