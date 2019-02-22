/*==============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else 실습
===============================================*/

//실습 문제
//임의의 두 정수와 연산자를 입력받아
//해당 연산자의 처리 결과를 출력하는 프로그램을 작성한다.
//단, if 조건문을 활용하여 처리할 수 있도록 하며,
//연산 결과는 편의상 정수 형태로 처리될 수 있도록 한다.

//실행 예)
//첫 번째 정수 입력 : 10
//두 번째 정수 입력 : 14
//연산자 입력 (+ - * /) : +

// >>10+14 = 24
// 계속하려면 아무 키나...

//첫 번째 정수 입력 : 5
//두 번째 정수 입력 : 3
//연산자 입력 (+ - * /) : /

// >>5 / 3 = 1
// 계속하려면 아무 키나...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test034
{
	public static void main(String [] args) throws IOException
	{
		/* 나
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2, tot;
		char a;

		System.out.print("첫 번째 정수 입력 :");
		num1= Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 :");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력 (+ - * /) :");
		 a =(char)br.read();

		 

		if (a == '+')
		{
			tot =num1 + num2;
				
		}
		else if (a == '-' )
		{
			tot = num1 - num2;
				
		}
		else if (a == '*')
		{
			tot = num1 * num2;
				
		}
		else 
		{
			tot = num1 / num2;
				
		}
		

		System.out.printf(">>%d %c %d = %d\n",num1,a,num2,tot);

	
		*/

		//방식 ①
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a,b;
		char op;
		

		System.out.print("첫 번째 정수 입력 : ");
		a=Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b=Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 (+ - * /) :");
		//op=Integer.parseInt(br.readLine());   -X
		//op = br.readLine();					-x
		op = (char)System.in.read();  //자동형변환에 위배로 char로

		//"1234" -> Integer.parseInt(); ->1234
		//"abcd" -> Integer.parseInt(); -> X  
		//숫자 모양을 문자형으로 바꿔주는것


		if (op == '+')
		{
			System.out.printf("\n>> %d + %d =%d\n" ,a,b,(a+b));
		}
		else if( op =='-')
		{
			System.out.printf("\n>>%d - %d = %d\n" ,a,b,(a-b));
		}
		else if( op =='*')
		{
			System.out.printf("\n>>%d * %d = %d\n" ,a,b,(a*b));
		}
		else if( op =='/')
		{
			System.out.printf("\n>>%d / %d = %d\n" ,a,b,(a/b));
		}
		else
		{
			System.out.printf("입력 과정에 오류가 존재합니다.");
		}
		*/

	
		//방식②
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a,b,op;

		System.out.print("첫 번째 정수 입력 : ");
		a=Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b=Integer.parseInt(br.readLine());


		System.out.print("연산자 입력(+ - * /) : ");
		op=System.in.read();

		System.out.println("op : " + op);
		// --> + 43
		// --> - 45
		// --> * 42
		// --> / 47

		if (op == 43) //+
		{
			System.out.printf("\n>> %d + %d =%d\n" ,a,b,(a+b));
		}
		else if( op ==45) //-
		{
			System.out.printf("\n>>%d - %d = %d\n" ,a,b,(a-b));
		}
		else if( op ==42) // *
		{
			System.out.printf("\n>>%d * %d = %d\n" ,a,b,(a*b));
		}
		else if( op ==47) // /
		{
			System.out.printf("\n>>%d / %d = %d\n" ,a,b,(a/b));
		}
		else
		{
			System.out.printf("입력 과정에 오류가 존재합니다.");
			
		}
		*/

		//방식③

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a,b, result=0; 
		char op;
		

		System.out.print("첫 번째 정수 입력 : ");
		a=Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b=Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 (+ - * /) :");
		//op=Integer.parseInt(br.readLine());   -X
		//op = br.readLine();					-x
		op = (char)System.in.read();  //자동형변환에 위배로 char로

		//"1234" -> Integer.parseInt(); ->1234
		//"abcd" -> Integer.parseInt(); -> X  
		//숫자 모양을 문자형으로 바꿔주는것


		if (op == '+')
		{
			result = a + b;
		}
		else if( op =='-')
		{
			result = a - b;
		}
		else if( op =='*')
		{
			result = a * b;
		}
		else if( op =='/')
		{
			result = a / b;
		}



		System.out.printf(">>%d %c %d = %d\n",a,op,b,result);

	}
}
/* 실행 결과
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 10
연산자 입력 (+ - * /) :+
>>5 + 10 = 15
계속하려면 아무 키나 누르십시오 . . .

*/