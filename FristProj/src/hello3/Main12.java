package hello3;

public class Main12 {

	public static void main(String[] args) {
		int[] scorese = {9,7,8,9,8};
		
		int sum=0;
		for(int s : scorese) {
			sum +=s;
		}
		
		System.out.println("sum: " +sum);
		
		int sum2 = 0;
		for(int i = 0; i< scorese.length; i++) {
			sum2 += scorese[i];
		}
		System.out.println("sum2 :"+sum2);
		

	}

}
