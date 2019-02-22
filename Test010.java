/*==============================================
  ■■■ 변수와 자료형 ■■■
  - 퀴즈
   사전에 부여된 반지름 정보를 통해
   원의 넓이와 둘레를 구하는 프로그램을 작성한다.
    －반지름 : 10
=============================================*/
// 문제 인식 및 분석
// 원의 넓이 = 반지름 * 반지름 * 3.14
// 원의 둘레 = 반지름 * 2 * 3.14


//실행 예)
// 넓이 : xxxxxxx
// 둘레 : xxxxxxx
// 계속하려면 아무 키나 누르세요...

public class Test010
{
	public static void main(String [] args)
	{
 /* 내가 풀이한것
		// 주요 변수 선언

		int a = 10;
        double b = 3.14;
		

		double q1, q2;

		// 연산 및 처리
		
		q1 = a*a*b;
		q2 = 2*a*b;


		// 결과 출력

		System.out.println(" 넓이 : " + q1);
		System.out.println(" 둘레 : " + q2);

// 실행결과
 넓이 : 314.0
 둘레 : 62.800000000000004
계속하려면 아무 키나 누르십시오 . . .
*/


//강사님 풀이

      // 주요 변수 선언
		int r =10;   //---반지름
		final double PI = 3.141592;  //--원주율
		//※ 키워드 final : 변수의 상수화~~!!!
		double area, lenght;   //--넓이, 둘레

		

		// 연산 및 처리
		
		area = r * r * PI;
		lenght = r * 2 * PI;



		// 결과 출력

		System.out.println(" 넓이 : " + area);
		System.out.println(" 둘레 : " + lenght);


	}
}

/*실행 결과
 넓이 : 314.1592
 둘레 : 62.83184
계속하려면 아무 키나 누르십시오 . . .
*/
