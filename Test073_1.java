/*=======================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스 설계 실습
========================================*/

//○ 실습 문제
//사용자로부터 임의의 두 정수와 연산자를 입력받아
//사칙 연산을 수행하는 프로그램을 구현한다.
//단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

//실행 예)
//임의의 두 정수 입력 (공백 구분) : 10 5
//임의의 연산자 입력(+ - * /) : +
//>>10 + 5 =15
//계속하려면 아무 키나 누르세요....
 
import java.util.Scanner;
import java.io.IOException;

class Hap
{
	int a,b;
	int ch;

	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력 (공백 구분) : ");
		a=sc.nextInt();
		b=sc.nextInt();

		System.out.print("임의의 연산자 입력(+ - * /) :");
		ch=System.in.read();
		
	}

	int result()
	{
		int result =0;

		if (ch=='+')
		{
			result = a + b;
		}
		else if (ch=='-')
		{
			result = a - b;
		}
		else if (ch== '*')
		{
			result = a *b;
		}
		else
			result = a / b;

		return result;
	}

	void print(int re)
	{
		System.out.printf("%d %c %d  =  %d\n",a,ch,b,re);
	}


}


public class Test073_1
{
	public static void main(String[] args) throws IOException
	{
		Hap ob = new Hap();

		ob.input();

		int re = ob.result();

		ob.print(re);

	}
}

