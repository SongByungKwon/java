//package hello3;
//
//public class Main10 {
//
//	public static void main(String[] args) {
//		int sum=0;
//		for(int i=1; i<=10;i++) {
//			
//			
//			sum=sum+i;
//		}
//		System.out.println("sum ="+sum);
//	}
//
//}

package hello3;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);

		for(int i=1; i<=10;i++) {
			System.out.println("값을 넣으세요");
			int o= sc.nextInt();
			sum=sum+o;
		}
		sc.close();
		System.out.println("sum ="+sum);
	}

}
