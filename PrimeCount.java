package Assignment_1;

import java.util.*;

public class PrimeCount {
	static int primeCount (int start, int end) {
		int primeCount = 0;
		int counter;
		
		if ( start <= 1 ) {
			start = 2;
		}
		if ( start > end ) {
			System.out.println("Start must be smaller than end.");
		}
		for (int i=start; i <= end; i++) {
			counter=0;
			for (int j=1; j <= i; j++) {
				if( i % j == 0 ) {
					counter++;
			   }
			}
			if( counter == 2 ) {
				 primeCount++;
			}
		}
		return primeCount;
		}

	
	public static void main(String args[]) {
		int start, end;
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter start number ");
		start= sc.nextInt();
		
		System.out.print("Enter end number ");
		end= sc.nextInt();
		
		
		System.out.println("Number of primes: " + primeCount(start,end));
		sc.close();
	}
	
}
