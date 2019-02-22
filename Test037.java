/*==============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  -   - if ~ else 실습
===============================================*/
//실습 문제
//사용자로부터 임의의 정수를 입력받아
//작은 수에서 큰 수 순으로 출력하는 프로그램을 작성한다.
//단, 입력 데이터를 한번에 처리할 수 있도록 구성하며
// xor 연산자를 활용하여 스왑 처리 할수 있도록 한다.

//실행 예)
//임의의 세 정수 입력 (공백 구분) : 4 73 8

// >> 정렬 결과 : 4 8 73
// 계속하려면 아무 키나 누르세요...


import java.util.Scanner;

public class Test037
{
	public static void main(String [] args)
		{

			int a,b,c;

			Scanner sc = new Scanner(System.in);
	
			System.out.print("임의의 세 정수 입력 (공백 구분) : ");

			a= sc.nextInt();
			b= sc.nextInt();
			c= sc.nextInt();
		

			if(a>b)
			{
				a= a^b;
				b= b^a;
				a=a^b;
			}
			if(b>c)
			{
				b=b^c;
				c=c^b;
				b=b^c;
			}
			if(a>b)
			{
				a= a^b;
				b= b^a;
				a=a^b;
			}

			System.out.printf(" >> 정렬 결과 : %d %d %d\n" ,a,b,c);

		}
}
/* 실행결과
임의의 세 정수 입력 (공백 구분) : 77 1 22
 >> 정렬 결과 : 1 22 77
계속하려면 아무 키나 누르십시오 . . .
*/
