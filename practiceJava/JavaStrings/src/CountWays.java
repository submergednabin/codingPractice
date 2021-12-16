
public class CountWays {

	public static void main(String[] args) {
		
		 
	      System.out.println(countWays(2));
	      System.out.println(countWays(5));
	}
	
	public static int countWays(int n) {
		if ( n == 0)
            return 1;
        else if (n < 0)
            return 0;
 
        else
            return countWays(n - 1) + countWays(n - 2);
          
        
       
    }
 

}
