/*==============================================
  ■■■ 자바의 기본 프로그래밍 ■■■
  - 실수형 데이터타입 정밀도 테스트
===============================================*/


public class Test020
{
	public static void main(String[] args)
	{
		// ○ 주요 변수 선언
		float a = 0;
		double b = 0;
		
		

		// ○ 연산 및 처리
		for (int i=1; i<=100000; i++ ) // 만번 반복
		{
			a+=100000;
			b+=100000;
		}
		




		// ○ 결과 출력
		System.out.println("float : "+ (a/100000));
		System.out.println("double :"+ (b/100000));