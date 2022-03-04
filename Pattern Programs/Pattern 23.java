// Print the following Pattern

I/P : 5
O/P : 
			*	
		*	*	
	*	*	*	
*	*	*	*	



public class MyClass {
    
       
      
       public static void main(String args[]) {
          int stars = 1;
          int space = 3;
          int n = 5;
          for(int i = 1; i < n; i++)
          {
              for(int j = 1; j <= space; j++)
              {
                  System.out.print("\t");
              }
              for(int j = 1; j <= stars; j++)
              {
                  System.out.print("*\t");
                  
              }
              stars++;
              space--;
              System.out.println();
          }
          
        
           
       
       
     
    
    }
}