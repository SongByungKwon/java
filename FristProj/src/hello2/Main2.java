package hello2;

public class Main2 {

	public static void main(String[] args) {
		int x=5;
		int y=8;
		int result1= ++x + 10;//먼저 증가 되고 실행
		int result2= y++ + 10;//실행 후 증가 되는
		
		System.out.println("x :"+x);
		System.out.println("y :"+y);
		
		int z = ++x + y++;
		System.out.println("x :"+x);
		System.out.println("y :"+y);
		System.out.println("z :"+z);
		
		System.out.println("result1 :"+result1);
		System.out.println("result2 :"+result2);
		

	}
	

}
