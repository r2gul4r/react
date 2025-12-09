package ch01_시작하기;

/**
 * 문서 주석(javadoc): alt_shift+j
 * @author 작성자명
 * 기능: Hello
 * 작성일: 25.12.09
 */

public class Ex01Hello {
	/*
	 * 여러줄 주석: 영역 선택 후 ctrl+shift+/
	 */
	
	// 문자: char
	// 문자열: String
	// 정수: byte, shirt, int, long
	// 실수: float, double
	// 불: boolean
	// 배열: []
	// 접근제한자: static void main(데이터타입 인자)
	// - 프로그램의 시작점
	public static void main(String[] args) {
		// ctrl+N: 새 문서
		// alt+방향키: 줄 위치 이동
		// ctrl+M: 코드뷰 최대화
		
		// ctrl+space: 자동완성
		// ctrl+F11: 실행
		// ctrl+i(선택영역) 또는 ctrl+shift+F: 자동 정렬
		// alt+shift+Y: 줄바꿈(토글)
		
		// '문자': 문자 1자 -> 예) 'A', 'a', '가'
		// "문자열"
		// 객체.메서드(인자)
		System.out.println("Hello, Java");
	}

}
