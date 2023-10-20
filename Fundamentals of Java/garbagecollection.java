class GarbageCollectionMethod{
      public void finalize(){
	  System.out.println("Object Destroyed");
	  }
	  public static void main(String [] args){
	       GarbageCollectionMethod gcd1 = new GarbageCollectionMethod();
		   GarbageCollectionMethod gcd2= new GarbageCollectionMethod();
		     
		    gcd1 = null;
			gcd2 = null;
		
		     System.out.println("Object Assigned Null");
			 
			 System.gc();
			 
			}
			}
			