package q0000;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("안녕하세요");
				break;
			case 2:
				System.out.println("반가워요");
				break;
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
			if (i < 2) {
				break;
			}

		}
		sc.close();

	}

}
