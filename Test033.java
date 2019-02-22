
//과제(2019-02-18)
//사용자로부터 임의의 연도를 입력받아
//입력받은 연도가 윤년인지 평년인지 판별하여
//결과를 출력하는 프로그램을 구현한다.
//단, if~else 조건문 활용할 수 있도록 한다.

//실행 예)
//임의의 연도 입력 : 2000
//2000-> 윤년
//계속하려면 아무 키나..

//임의의 연도 입력 : 2012
//2012-> 윤년
//계속하려면 아무 키나...

//임의의 연도 입력 : 2018
//2018 -> 평년
//계속하려면 아무 키나...

//임의의 연도 입력 : 2019
//2019 ->평년
//계속하려면 아무 키나...

//※ 윤년의 판별 조건
//연도가 4의 배수이면서 100의 배수가 아니거나
//400의 배수이면 윤년
//그렇지 않으면 평년

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//주요 변수 선언

		int n; // 입력 받을 연도를 저장하는 곳
		String result; // 평년인지 윤년인지 저장하는 곳

		//연산 및 처리
		System.out.print("임의의 연도 입력 : ");
		n=Integer.parseInt(br.readLine());
	

		if ((n%4==0) && (n%100!=0))  //-- 연도가 4의 배수이면서 100의 배수가 아니면 윤년
		{
			result = "윤년";
		}

		else 
		{
			result = "평년";
		}

		if (n%400 == 0)  //-- 400의 배수이면 윤년
		{
			result = "윤년";
		}


		//결과 출력

		System.out.printf("%d -> %s\n",n,result);
	}
}

/* 실행 결과

임의의 연도 입력 : 2000
2000 -> 윤년
계속하려면 아무 키나 누르십시오 . . .


임의의 연도 입력 : 2012
2012 -> 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2018
2018 -> 평년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2019
2019 -> 평년
계속하려면 아무 키나 누르십시오 . . .

*/
