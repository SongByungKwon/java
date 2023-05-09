package hello5;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		for(int i=0;i<num.length;i++) {
			num[i]= sc.nextInt();
			System.out.printf("%d",num[i]);
			if(i<4) {
				System.out.print(", ");
				}
		}
		sc.close();
		

	}

}
