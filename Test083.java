/*=========================
  ■■■ 배열 ■■■
  - 배열의 기본적인 활용
==========================*/
//○과제
//사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
//입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현한다.
//단, 배열을 활용하여 구현할 수 있도록 한다.

//실행 예)
//입력할 데이터의 갯수 : 10
//데이터 입력(공백 구분) : 45 92 75 13 2 65 25 63 90 17  
//>>가장 큰 수 -> 92
//계속하려면 아무 키나 누르세요....


import java.util.Scanner;

public class Test083
{
	public static void main(String[] args)
	{

		Scanner sc =new Scanner(System.in);

		int n=0;
		int max=0;

		System.out.print("입력할 데이터의 갯수 :  ");
		n=sc.nextInt();

		int[]num = new int [n];

		for (int i=0;i<n ;i++ )
		{
			System.out.print("데이터 입력(공백 구분) : ");
			num[i]=sc.nextInt();
		}
		
		for (; ; )
		{
			if (num[i]>max)
			{
				max = num[i];
			}
		}




	}
}