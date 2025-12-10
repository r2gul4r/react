package ch02_데이터와변수;

public class Ex07_불 {
	/**
	 * alt shift j
	 */
	
	/**
	 * boolean(불)
	 * 1. 참과 거짓을 의미하는 논리 리터럴은 true와 false이다.
	 * 2. 논리 리터럴은 boolean 타입 변수에 대입한다.
	 * 3. boolean 타입 변수는 주로 두 가지 상태값을 저장할 필요가 있을경우 사용되며,
	 * 4. 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는 데 사용된다.
	 */
	public static void main(String[] args) {
		boolean stop = true;
		if (stop) {
			System.out.println("중지합니다");
		} else {
			System.out.println("시작합니다");
		}
		
		int x = 10;
		boolean var1 = (x == 20);
		boolean var2 = (x != 20);
		boolean var3 = (x > 20);
		boolean var4 = (0 < x && x < 20);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
