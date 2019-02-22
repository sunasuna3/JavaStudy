/*==============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  -   - if ~ else 실습
===============================================*/

//과제
//사용자로부터 알파벳 한 문자를 입력받아서 이를 판별하여
//소문자를 입력받았을 경우... 대문자로 변환하고
//대문자를 입력받았을 경우... 소문자로 변환하는
//프로그램을 구현한다.
//단, 입력은 System.in,read() 메소드를 활용할 수 있도록 한다.

//실행 예)
// 알파벳 한 문자 입력 : A
//>>a
//계속하려면 아무 키나 누르세요...

//실행 예)
// 알파벳 한 문자 입력 : c
//>>C
//계속하려면 아무 키나 누르세요...

//실행 예)
// 알파벳 한 문자 입력 : 6
//>> 입력 오류~~~!!
//계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test039
{
	public static void main(String [] args)throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//주요 변수 선언
		int a; 
		char b;
		
		System.out.print("알파벳 한 문자 입력 : ");
		a = System.in.read();


		//65 69  73  79  85  대문자 모음
		//97 101 105 111 117  소문자 모음
		//-32 -32 -32 -32 -32

		if ((a>=65) && (a<=90)) //대문자 알파벳 범위
		{
				b=(char)(a+32);  // 입력받은 것에 32를 더하면 소문자 
				System.out.printf(">>%c\n",b);	//소문자 알파벳 출력			
		}

			else if  ((a>=97) && (a<=122)) //소문자 알파벳 범위
		{
				b=(char)(a-32);  //입력받은 것에 32를 빼면 대문자
				System.out.printf(">>%c\n",b); //대문자 알파벳 출력				
		}
		else   //알파벳을 입력하지 않으면
		{
			System.out.println(">> 입력 오류~!!! ");
		}
	}
}
		
	

/* 실행결과
알파벳 한 문자 입력 : q
>>Q
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : A
>>a
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : 1
>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/



		