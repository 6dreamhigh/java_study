package basic;

public class MethodTest {

	public static void main(String[] args) {
		//25, 36의 큰값을 구하시오.
		int big = Math.max(25, 36); //함수의 호출
		System.out.println(big);
		double small = Math.min(25.8, 78.86);
		System.out.println(small);
		// 250을 이진수로 출력하시오.
		String binary = Integer.toBinaryString(250);
		String oct = Integer.toOctalString(250);
		String hexa = Integer.toHexString(250);
		System.out.println("250 2진수 = "+binary);
		System.out.println("250 8진수 = "+oct);
		System.out.println("250 16진수 = "+hexa );
		
	}

}
