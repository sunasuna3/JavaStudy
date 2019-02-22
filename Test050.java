/*==============================================
  ■■■ 실행 흐름의 컨트롤 (반복문) ■■■
  -   - 반복문(while) 실습
===============================================*/

//실습 문제
//사용자로부터 임의의 정수를 입력받아
//입력받은 정수가 소수인지 아닌지를 판별하여
//결과를 출력하는 프로그램을 구현한다.

//실행 예)
//임의의 정수 입력 : 10
//10 -> 소수 아님
//계속하려면 아무 키나...

//임의의 정수 입력 : 11
//1 -> 소수 아님
//계속하려면 아무 키나...


//※ 소수 : 1또는 자기자신의 값 이외의 어떤 수로도 나눌 수 없는 값.

// 2 5 7 11 13 17 19 23 27 29 31 


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test050
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

/*
		int n; //입력 받을 정수
		System.out.print("임의의 정수 입력 : ");
		n=Integer.parseInt(br.readLine());

		String result = "소수";

		if (n==1)
		{
			result = "소수 아님";
		}
		else
		{
			int i=2;
			while (i<n)
			{
				if (n%i==0)
				{
					result = "소수아님";
				}
				i++;
			}
		}
		System.out.println(result);
*/

		//주요 변수 선언 및 초기화
		int num;    //사용자 입력값을 담을 변수

		//연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num=Integer.parseInt(br.readLine());

		int n=2;     //--사용자의 입력값을 대상으로
					//   나눗셈 연산을 수행할 변수(1씩 증가 예정)

		boolean flag=true;   //--소수다~!!! (check~~~!!!)
		
		while (n<num)
		{
			if (num%n==0)
			{
				flag=false;  //--소수 아니다~1!!
				break;
			}

			n++;
		}

		//결과 출력(출력 전에 수행해야 할 추가 확인 -> 1인지 여부에 대한 확인)
		//소수 && 1이 아니다
		//->최종적인 결론으로 소수다
		//그렇지 않으면 
		//->최종적인 결론으로 소수 아니다.

		if (flag && num!=1)
			System.out.printf("%d -> 소수~!!!\n",num);
		else
			System.out.printf("%d -> 소수아님~~!!!\n",num);



	}
}
	
