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
 ★
 |
 1	2  3  4  5    -> i=0
 2	3  4  5  6	  -> i=1
 3  4  5  6  7	  -> i=2
 4  5  6  7  8	  -> i=3
 5  6  7  8  9	  -> i=4
*/

public class Test087
{
	public static void main(String[] args)
	{
		int [][] arr = new int [5][5];

		/*
		int n=1;

		for (int i=0; i<arr.length ; i++ )  //i ->  0 1 2 3 4
		{
			
			for (int j=0; j<arr[i].length ; j++ ) 
			{
				arr[i][j]=n+j;
			
			}
			n++;
		}
		*/

		int n;

		for (int i=0; i<arr.length ; i++ )  //i ->  0 1 2 3 4
		{
			n=i+1;							//n -> 1 2 3 4 5
			for (int j=0; j<arr[i].length ; j++ ) 
			{
				arr[i][j]=n;
				n++;
			
			}
		}

			
		// 배열의 배열 요소 전체 출력
		for (int i=0;i<arr.length; i++ )
		{
			for (int j=0;j<arr[i].length ;j++ )
			{
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();




	}
}

//실행 결과
/*
 1  2  3  4  5
 2  3  4  5  6
 3  4  5  6  7
 4  5  6  7  8
 5  6  7  8  9

계속하려면 아무 키나 누르십시오 . . .
*/