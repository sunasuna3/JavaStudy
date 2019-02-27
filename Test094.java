/*===============================
  ■■■ 클래스와 인스턴스 ■■■
  - 클래스와 인스턴스 활용
================================*/

//○실습 문제
//1~3 사이의 정수 형태의 난수를 발생시켜
//가위,바위,보 게임 프로그램을 구현한다.
//단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
//또한, 배열을 활용하여 처리할 수 있도록 한다.

//기준 데이터 -> 1: 가위, 2:바위, 3:보

//실행 예)
// 1: 가위, 2:바위, 3:보 중 입력(1~3) : 4
// 1: 가위, 2:바위, 3:보 중 입력(1~3) : -12
// 1: 가위, 2:바위, 3:보 중 입력(1~3) : 2
// - 유저   : 바위
// - 컴퓨터 : 보
// >> 승부최종결과 : 컴퓨터가 이겼습니다.
//계속하려면 아무 키나 누르세요....

import java.util.Scanner;
import java.util.Random;

class Test
{
	int num;
	int k;

	String [] arr ={"가위","바위","보"};
	
	void input()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1: 가위, 2:바위, 3:보 중 입력(1~3) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>3);
		--num;
		
		
	}

	void nan()
	{
		Random rd =new Random();
		
		

		k = rd.nextInt(3);

	}

	void print()
	{
		
		System.out.println("- 유저 : " + arr[num]);
		System.out.println("- 컴퓨터 :" + arr[k]);



		if ((num==0 && k==2) || (num==1 && k==0) || (num==2 && k==1)) 
		
			System.out.print(">> 승부최종결과 : 유저가 이겼습니다.");
		
		
		if ((num==2 && k==0) || (num==0 && k==1) || (num==1 && k==2)) 
		
			System.out.print(">> 승부최종결과 : 컴퓨터가 이겼습니다.");
		
		if (num==k)
		
			System.out.print(">> 승부최종결과 : 비겼습니다.");
		

	}
}



	//0 -> 2 
	//1 -> 0
	//2 -> 1 

	// 2->0
	// 0->1
	// 1->2

	




public class Test094
{
	public static void main(String[] args)
	{
		Test ob = new Test();

		ob.input();
		ob.nan();
		ob.print();

	}
}