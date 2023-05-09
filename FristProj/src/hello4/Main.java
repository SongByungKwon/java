package hello4;

public class Main {

	public static void main(String[] args) {
		String strVr1 = "JBEdu";
		String strVr2 = "JBEdu";
		
		if(strVr1 == strVr2){
			System.out.println("참조가 같음");
		}else {
			
			System.out.println("참조가 다름");
		}

		if(strVr1.equals (strVr2)){
			System.out.println("두 문자열이 같음");
		}
		
		String strVr3 = new String ("JBEdu");
		String strVr4 =  ("JBEdu");
		
		if(strVr3 == strVr4){
			System.out.println("참조가 같음");
		}else {
			
			System.out.println("참조가 다름");
		}
		
		if(strVr3.equals (strVr4)){
			System.out.println("두 문자열이 같음");
		}
		
		
	}

}
