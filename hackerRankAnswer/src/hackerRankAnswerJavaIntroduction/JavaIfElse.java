package hackerRankAnswerJavaIntroduction;
import java.util.Scanner;

public class JavaIfElse {
	public class Solution {



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        boolean impar = N % 2 != 0;
	        boolean par = N % 2 == 0;
	        
	        if(impar){
	            System.out.println("Weird");    
	        }
	            if((par)&&(N >= 2)&&(N <=5)){
	                System.out.println("Not Weird");
	            }
	                if((par)&&(N >= 6)&&(N <=20)){
	                    System.out.println("Weird");
	                    
	                }
	                    if(par && N > 20){
	                        System.out.println("Not Weird");
	                        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	                        scanner.close();
	                        
	                    }
	            
	            
	        }
	        
	    }

}
