package ch02_데이터와변수;

/**
 * 실수 타입
 * 1. float		4byte _ 32bit > 1.4x10의-45승 ~ 3.4x10의 38승 > 7자리
 * 2. double	8byte _ 64bit > 15자리
 * 
 * 
 * 
 * 
 * 참고: 
 * 		부호(signed: +,-) + 가수(mantissa) + 지수(exponent)
 * 		1bit				8bit				32bit
 * 		1bit				11bit				52bit
 * 		0 -> + 
 * 		1 -> - 
 */
public class Ex06_실수 {

	// main 쓰고 ctrl+space 
	public static void main(String[] args) {
		//정밀도 확인
		// float 리터럴 끝에
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		
	}

}
