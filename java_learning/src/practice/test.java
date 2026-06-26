package practice;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class test {
 public static void main(String[] args) {
    
     int n = 7;
     for(int i = 1; i <= n; i++){
    	 
         for(int j = 1; j <= n; j++)
         {
             if((i == 1 && j > 1 && j < n-1)||
            		 
            		 (i == n-1 && j > 1 && j < n-1 )||
            		 (j == 1 && i > 1 && i < n-1)||
            		 (j == n-1 && i > 1 && i < n-1)||
            		 (i == j && i>=n/2))
             {
                 System.out.print("* ");
             }else{
                 System.out.print("  ");
             }
         }System.out.println();
     }
 }
}