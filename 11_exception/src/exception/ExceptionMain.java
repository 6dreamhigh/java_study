package exception;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		if(args.length >= 2) {
			System.out.println(args[0]);
			System.out.println(args[1]);
		}
		System.out.println();
		try {
			int num1 = Integer.parseInt(args[0]);//문자열이 args[0]에 들어감
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 입력");
			int num2 = sc.nextInt();
			System.out.println(num1+ "/"+ num2+ " = "+(num1/ num2));
			
		}catch(NumberFormatException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			e.printStackTrace();//에러에 대한 메세지를 순서대로 찍음
		
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			e.printStackTrace();
		}finally {
			System.out.println("error가 있건 없건 무조건 실행");
		}
				
	}

}
