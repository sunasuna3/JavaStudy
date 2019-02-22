/*==============================================
  ■■■ 실행 흐름의 컨트롤 (반복문) ■■■
  -   - 반복문(while) 실습
===============================================*/

//실행 예)
//연산 결과 : xxxxxx


//1*2*3*4*.....10




public class Test049
{
	public static void main(String [] args)
	{
	/*
		int a=1,sum=1;


		while (a <=10)
		{
			sum *= a;
			a++;
		}

		System.out.printf("연산 결과 : %d\n", sum);
		*/

		int n=0,result=1;   //check~!!!!
							//누적곱을 담을 변수 ... 1로 초기화~!!!!
		while (n<10)
		{
			n++;
			result *= n;    //누적곱 연산

		}
		System.out.printf("연산 결과 : %d\n", result);
	}
}
/*
연산 결과 : 3628800
계속하려면 아무 키나 누르십시오 . . .
*/
