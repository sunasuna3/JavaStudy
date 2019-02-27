/*====================
  ■■■ 배열 ■■■
  - 배열의 복사
=====================*/ 

// ○ 실습 문제
// 임의의 배열(a,b)에 들어있는 숫자들의 합집합을 출력하는 프로그램을 구현한다.
// 단, 중복이 제거된 상태의 합집합을 출력할 수 있도로 한다.
//또한, 배열 복사 개념을 적용시켜 처리할 수 있도록 한다.

//ex)임의의 두 배열
//int[] a ={2, 3, 7, 10, 11}
//int[] b ={3, 6, 10, 14}

//실행 예)
//첫 번째 배열 요소를 입력하세요(공백 구분) :
//두 번째 배열 요소를 입력하세요(공백 구분) :
//2 3 7 10 11 6 14
//계속하려면 아무 키나 누르세요...


import jav.util.Scanner;

public class Test099
{

	int n1,n2;

	public static void main(String[] args)
	{
		int[] a ={2, 3, 7, 10, 11};
		int[] b ={3, 6, 10, 14};





	public static int[] copyArray(int[] os)
	{
		//매개변수로 넘겨받는 배열
		// 즉, 원본 배열 만큼의 배열방(메모리 공간)을 확보한
		//복사할 배열방을 생성하겠다.
		int[] temp = new int[os.length];

		
		//각각의 원본 배열(os)에 담겨있는 요소들을 복사 배열(temp)에 담아내기
		for (int i=0; i<os.length; i++ ) //os.length == temp.length
		{
			temp[i] = os[i];


		}
		return temp;
	}
}