package hello3;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int score = scan.nextInt();
		scan.close();
		
		if(score >=90) {
			System.out.print("A");
			
			
			if(score >=95) {
				System.out.print("+");
			}
			
			else {
				System.out.print("-");
			}
			
		}
		
		if(score >=80) {
			System.out.print("B");
			
			
			if(score >=85) {
				System.out.print("+");
			}
			
			
			else { 
				System.out.print("-");
			}
		}
}
}
