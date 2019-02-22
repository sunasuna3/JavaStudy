 /*=============================
 ■■■■ 자바의 개요 및 특징 ■■■
  - 변수와 자료형
  - 키워드 및 식별자
 =======================*/
 
 
 
 public class Test005
 {
	 public static void main(String [] args)
	 {
		 //변수 선언 및 초기화(메모리에 값 할당)
		 int a=10, b=5;

		// 변수 선언
		 int c, d;

		 // 연산 및 처리
		c = a + b;   //a + b의 결과값을 c에 대입해라.
		d = a - b;   //a - b의 결과값을 d에 대입해라.


		//결과 출력
		System.out.println(a + " + " + b + " = " + c);
		//                숫자+문자열+숫자+문자열+숫자
		//-- 자바에서는 서로 다른 자료형의 데이터들끼리도
		//    + 연산이 가능하다.
		//   다른 자료형과 문자열의 + 연산 결과는 문자열.
		//   즉, 문자열 결합 연산자로써 +
		// ====> 10 + 5 = 15

		// 서식 출력용 메소드 -> 서식 옵션(데이터 옵션)
		// printf() / format()
		// JDK 1.5 부터 사용 가능.

		//System.out.printf("○ + ○ = ○");

		//System.out.printf("○  + ○ = ○" ,10, 20, 30);

		//System.out.printf("□ + ○ = ○" ,'A', 20, 30);

		//%d 는 10진수 정수형 출력서식 옵션
		System.out.printf("%d + %d = %d \n ", a, b, c);
		//====> 10 + 5 = 15
	    //----\n 개행

		System.out.printf("%d + %d + %d %n", a, b, c);
		//====> 10 + 5 = 15
	    //----\% 개행


		/* 실행결과
		10 + 5 = 15
	    10 + 5 = 15
	    10 +5 + 15
		계속하려면 아무 키나 누르십시오 . . .
		*/








	 }
 }