/*==============================================
  ■■■ 실행 흐름의 컨트롤 (반복문) ■■■
  -   - 반복문(while) 실습
===============================================*/

//○ 과제
//사용자로부터 임의의 정수를 입력받아
//1부터 그 수 까지의 전체 합과, 짝수의 합과, 홀수의 합을
//각각 결과값으로 출력하는 프로그램을 구현한다.

//실행 예)
//임의의 정수 입력 : 276
//>>1~276 까지의 정수의 합 : xxxx
//>>1~276 까지의 짝수의 합 : xxxx
//>>1~276 까지의 홀수의 합 : xxxx


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test052
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		//주요 변수 선언
		int num=1;  //사용자 입력값을 담을 변수
		
		System.out.print("임의의 정수 입력 : ");
		num=Integer.parseInt(br.readLine());

		int sum1=0,sum2=0,sum3=0;  //정수의 합, 짝수의 합, 홀수의 합 을 저장할 변수
		int i = 1;   //입력값을 대상으로 그 만큼 반복할 변수?

		//연산 및 처리
		while (i<=num)  //반복한 변수가 입력값보다 작거나 같을 때까지 반복한다 
		{
			sum1 += i;  //i의 누적합  
			
			if (i%2==0)  //만약 i가 짝수일 경우
			{
				sum2 += i;  //짝수 i의 누적합
			}
			else  //i가 짝수가 아닌 경우
			{
				sum3 += i;  //짝수가 아닌 i값의 누적합
			}

			i++; 
		}

		//결과 출력
		System.out.printf(">>1~%d 까지의 정수의 합 : %d\n",num,sum1);
		System.out.printf(">>1~%d 까지의 짝수의 합 : %d\n",num,sum2);
		System.out.printf(">>1~%d 까지의 홀수의 합 : %d\n",num,sum3);


	
	}
}
// 실행 결과
/*
임의의 정수 입력 : 5
>>1~5 까지의 정수의 합 : 15
>>1~5 까지의 짝수의 합 : 6
>>1~5 까지의 홀수의 합 : 9
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 276
>>1~276 까지의 정수의 합 : 38226
>>1~276 까지의 짝수의 합 : 19182
>>1~276 까지의 홀수의 합 : 19044
계속하려면 아무 키나 누르십시오 . . .

*/