package Assignment_1;

import java.util.Scanner;

public class IsSquare {
	
	static int isSquare(int n) {
		
		for(int i=0;i<=n;i++) {
			
			if(i*i==n) {
				return 1;
			}
		}
		return 0;	
		}
		
public static void main(String args[]) {
		int n,num;
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter number ");
		n= sc.nextInt();
		 num = isSquare(n);
	    if(num ==1) {
		System.out.println("It is a square number " );
	}else {
		System.out.println("It is not a square number " );	
	}
	    sc.close();
}

}
