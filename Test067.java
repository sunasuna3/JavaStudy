/*==========================================================
  ■■■ 메소드 재귀호출 (재귀 메소드) ■■■
===========================================================*/

public class Test067
{
	public static void main(String[] args) 
	{
		showHi(3);  //hi를 3번 출력하기 위해서 


	}

	public static void showHi(int cnt)  
	{
		
		System.out.println("Hi~~!!!");
		

		if (cnt==1)
		{
			return;
		}

		showHi(--cnt);   ///cnt-- 지금 당장 x 다음번에   따라서 cnt-- 일때 3이 무한루프   
		
	
	}

}