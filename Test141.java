/*==================================
■■■ 자바의 주요(중요) 클래스■■■
- Random 클래스
===================================*/
/*
○ java.util.Random 클래스는

	여러 형태의 난수를 발생시켜 제공하는 클래스이다.
	Math 클래스의 정적 메소드인 random() 메소드도 난수를 제공하는 메소드이지만
	0.0~1.0  사이의 실수 형태만 발생하게 됨로
	필요한 여러 형태의 난수를 마늘어내기 위해서는 추가적인 연산들을 수행해야 한다,
	그래서 자바는 여러 형태의 난수를 발생시켜주는
	전용 클래스인 Random 클래스를 별도로 제공하고 있다.
*/

//로또 번호 생성기 (난수 발생 프로그램)

//프로그램이 실행되면 기본적으로 로또를 5게임 수행하는 프로그램을 구현한다.

//실행 예)
// 2 39 40 41 42 45
// 1 2 8 16 28 42
// 4 9 10 13 14 28
// 20 24 31 33 37 41
// 5 7 8 11 36 40
//계속하려면 아무 키나 누르세요...

import java.util.Random;
import java.util.Arrays;


class Lotto
{
	//배열 변수 선언 및 메모리 할당 -> 로또 번호를 담아둘 배열방
	private int[] num=new int[6];

	//getter
	public int[] getNum()
	{
		return num;
	}

	//6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		int cnt=0;
		Random rd = new Random();
		int n;
		
		jump:
		while (cnt<6) // cnt -> 0 1 2 3 4 5 
		{
			n=rd.nextInt(45)+1;  //45이면 0~44 따라서 +1

			for (int i=0;i<cnt ;i++)
			{
				if (num[i]==n)
				{
					continue jump;
				}
			
			}
			
			num[cnt++] =n;		
		}

		sorting();
	}

	//정렬 메소드
	private void sorting()
	{
		Arrays.sort(num);  //배열 
	}


}


public class Test141
{
	public static void main(String[] args)
	{

		/*
		for (int k=0;k<6; k++ )
		{
			int[]arr=new int[6];
			
			for (int i=0; i<6;i++ )
			{
				boolean flag = false;
				Random rd =new Random();
				int num = rd.nextInt(45)+1;  

				for (int j=0;j<i;j++ )   i=0 j=0 일때는 아래 안함
				{

					if (arr[j]==num)
					{
						flag = true;
					}
				}

				if (flag==false)
				{
					arr[i] = num; 
					System.out.print(arr[i]+ " ");
				}
				else
					i--;
				



			}
			
		System.out.println();
 		}

		*/
		
		//Lotto 클래스 인스턴스 생성
		Lotto lotto = new Lotto();

		//기본 5게임
		
		for (int i=1; i<=5; i++ )
		{
			lotto.start();

			//결과 출력
			for (int n : lotto.getNum() )
			{
				System.out.printf("%4d",n);
			}
			System.out.println();

		}

			
	}
}

//실행 결과
/*
  13  20  22  25  40  44
   5  18  33  34  37  39
   6  11  12  16  20  32
   1  11  21  25  37  45
   5   6   7  20  21  44
계속하려면 아무 키나 누르십시오 . . .
*/
