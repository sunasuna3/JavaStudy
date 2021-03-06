/*==========================================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  -  반복문(for문) 실습
  -  별찍기 실습
===========================================================*/

//○과제
//다음과 같은 내용이 출력될 수 있도록
//반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

/*

    *
   **
  ***
 ****
*****

*/

public class Test060
{
	public static void main(String[] args) 
	{
		int a; //줄 변수
		int b; //공백 변수
		int c; // * 변수
							
		for (a=1; a<=5; a++)        // a= 1                      /  a=2						 /  a=3									
		{
			for (b=4; b>=a ; b-- )   //1->4, 1->3, 1->2, 1->1    /  2->4, 2->3, 2->2         /  3->4, 3->3
			{
				System.out.print(" ");  //=> 4번 반복				 /  => 3번 반복				/ => 2번 반복 
			}
																																		//....a가 5까지 반복
			for (c=1;c<=a ;c++ )		 //1 -> 1				/ 2->1 , 2->2              / 3->1 , 3->2 , 3->3   
			{
				System.out.print("*");  //> 1번 반복				/  => 2번 반복				/  => 3번 반복
			}

			System.out.println(); // 개행							 / 개행                       / 개행 
		}

    }
}
// 실행 결과
/*
    *
   **
  ***
 ****
*****
계속하려면 아무 키나 누르십시오 . . .
*/
