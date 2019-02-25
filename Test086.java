/*=========================
  ■■■ 배열 ■■■
  - 배열의 배열(2차원 배열)
==========================*/

//○ 실습 문제
//배열의 배열(다차원 배열)을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//실행 예)
/*
 1	2  3  4  5
 6	7  8  9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/

public class Test086
{
	public static void main(String[] args)
	{
		//배열의 배열 선언 + 메모리 할당
		int[][]arr=new int [5][5];

		//초기화
		int n =1;
		for (int i=0;i<arr.length; i++ )  //i -> 0 1 2 3 4 (5회 반복)
		{
			for (int j=0;j<arr[i].length ;j++ ) //j->0 1 2 3 4(5회 반복)
			{
				arr[i][j] = n;
				n++;
			}
		}
		
		// 배열의 배열 요소 전체 출력
		for (int i=0;i<arr.length; i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%3d ",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();



	}
}

//실행 결과
/*
  1   2   3   4   5
  6   7   8   9  10
 11  12  13  14  15
 16  17  18  19  20
 21  22  23  24  25

계속하려면 아무 키나 누르십시오 . . .


*/