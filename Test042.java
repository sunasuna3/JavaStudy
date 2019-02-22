/*==============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  -   - switch 문 실습
===============================================*/

//실습 문제
//사용자로부터 임의의 두 정수와 연산자를 입력받아
//해당 연산의 처리 결과를 출력하는 프로그램을 구현한다.
//단, switch 문의 활용하여 처리할 수 있도록 하며
//연산 결과는 편의상 정수 형태로 처리하도록 한다.

//실행 예)
//첫 번째 정수 입력 : 10
//두 번째 정수 입력 : 10
//연산자 입력(+ - * /) : +

//>> 10+28 = 38
//계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test042
{
	public static void main(String [] args)throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


		//내가 푼 내용
		/*
		int num1,num2;
		
		char ch;

		System.out.print("첫 번째 정수 입력 : ");
		num1=Integer.parseInt(br.readLine());
 
 		System.out.print("두 번째 정수 입력 : ");
		num2=Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		ch = (char)System.in.read();

		
		switch (ch)
		{
		case '+' : System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));break;		
		case '-' : System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));break;			
		case '*' : System.out.printf("%d * %d = %d\n",num1,num2,(num1*num2));break;		
		case '/' : System.out.printf("%d / %d = %d\n",num1,num2,(num1/num2));break;		
		default : System.out.println("입력 오류~!!!");break;		
		}
		

		switch (ch)
		{
		case 43 : System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));break;		
		case 45 : System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));break;			
		case 42 : System.out.printf("%d * %d = %d\n",num1,num2,(num1*num2));break;		
		case 47 : System.out.printf("%d / %d = %d\n",num1,num2,(num1/num2));break;		
		default : System.out.println("입력 오류~!!!");break;	
		
		}
		*/

		//같이 푼 내용

		int a,b, result;
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a=Integer.parseInt(br.readLine());
 
 		System.out.print("두 번째 정수 입력 : ");
		b=Integer.parseInt(br.readLine());

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		switch (op)
		{  // case 상수1  => 상수만 쓸 수 있었는데 JDK1.5 이상부터 캐릭터형도 캐릭터형도 사용 가능 
		case '+' : result = a+b;break;
		case '-' : result = a-b;break;
		case '*' : result = a*b;break;
		case '/' : result = a/b;break;			
		default : return;    //-- 메소드 종료 -> return 키워드를 품고있는 main() 메소드를 종료 -> 프로그램의 종료
		}

		//※ return : 1.값의 반환
		//			  2.메소드 종료

		System.out.println();
		System.out.printf(">> %d %c %d =%d\n",a,op,b,result);





		


	}
}
/* 실행 결과
첫 번째 정수 입력 : 1
두 번째 정수 입력 : 2
연산자 입력(+ - * /) : +

>> 1 + 2 =3
계속하려면 아무 키나 누르십시오 . . .



*/