package ch02_데이터와변수;

import java.util.Scanner;

public class Ex14_표준출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x값 입력: ");
		
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
		
		
		System.out.println(x);
		
		System.out.println("y값 입력: ");
		String strY = sc.nextLine();
		int y  = Integer.parseInt(strY);
		
		
		System.out.println(x);
		
		sc.close();
	}

}
