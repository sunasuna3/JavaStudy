/*=======================================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스 설계 실습
========================================*/

//○실습 문제
//사용자로부터 임의의 정수를 입력받아
//1부터 입력받은 수 까지의 합을 연산하여
//결과값을 출력하는 프로그램을 구현한다.

//단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
//또한, 입력 처리 과정에서 BurrefedReader 의 readLine()을 사용하며,
//입력 데이터가 1보다 작거나 1000보다 큰 경우
//다시 입력받을 수 있는 처리를 포함하여 프로그램을 구성할 수 있도록 한다.

//실행 예)
//임의의 정수 입력(1~1000) : 1002
//임의의 정수 입력(1~1000) : -20
//임의의 정수 입력(1~1000) : 100
//>>1~100까지의 합 : 5050
//계속하랴면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Test072_1
{
	int n;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.print("임의의 정수 입력 : ");
		n=Integer.parseInt(br.readLine());		
	}

	int nsum()
	{
		int i=1 ,result=0;
		while (i<=n)
		{
			result += i;
			i++;		
		}
		return result;
	}

	void print(int result)
	{
		System.out.printf(">>1~%d까지의 합 : %d\n",n,result );
	}

}

public class Test072_1a
{
	public static void main(String [] args) throws IOException
	{

		TTest072_1 ob = new Test072_1();


		while (true)
		{
			ob.input();

			if (ob.n>=1 && ob.n<=1000)
			{
				break;
			}
		}

		int sum = ob.nsum();

		ob.print(sum);


	}
}