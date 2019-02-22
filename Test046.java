/*==============================================
  ■■■ 실행 흐름의 컨트롤 (반복문) ■■■
  -   - 반복문(while) 실습
===============================================*/

//실행 예)
//1부터 100까지의 정수의 합 :5050
//1부터 100까지의 짝수의 합 :2550
//1부터 100까지의 홀수의 합 :2550
//계속하려면 아무 키나 누르세요...

public class Test046
{
	public static void main(String [] args)
	{
	/*	int a =0;
		int sum1 =0, sum2 =0, sum3=0;

		while (a<=100)
		{
			sum1 =sum1+a;

			if (a%2==0)
			{
				sum2 = a+ sum2;
			}
			else  
			{
				sum3 = sum3 +a;
			}

			a++;

		}
		*/

		// 주요 변수 선언
		int n = 1, sum=0,even=0,add=0;
		//int sum=even=add;
		//sum=even=add=0
		

		//연산 및 처리(반복문 구성)
		while (n<=100)
		{
			sum += n;

			if (n%2==0)
			{
				even += n;
			}
			else
				add += n;

			n++;
		}

		//결과 출력
		System.out.println("1부터 100까지의 정수의 합 : " + sum );
		System.out.printf("1부터 100까지의 짝수의 합 : %d \n",even);	
		System.out.printf("1부터 100까지의 홀수의 합 : %d \n",add);	

	}
}

/* 실행 결과
1부터 100까지의 정수의 합 : 5050
1부터 100까지의 짝수의 합 : 2550
1부터 100까지의 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .

*/