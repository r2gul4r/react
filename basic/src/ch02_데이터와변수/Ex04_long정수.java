package ch02_데이터와변수;

/**
 * 정수의 타입 
 * 1. byte 1byte 
 * 2. short 2byte 
 * 3. int 4byte 
 * 4. long 8byte 
 * 5. char 2byte
 */

public class Ex04_long정수 {

	public static void main(String[] args) {
		// alt+shift+a: 다중편집상태에서 shift+방향키
		
		long var1 = -128;
		long var2 = -30;
		long var3 = 0;
		long var4 = 30;
		long var5 = 127;
//		byte var6 = 128; //에러? 허용범위 초과
		// Type mismatch  
		
		// 출력
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		

	}

}
