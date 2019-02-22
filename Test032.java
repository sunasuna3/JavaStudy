/*==============================================
  ■■■ 실행 흐름의 컨트롤 (제어문) ■■■
  - if ~ else 실습
===============================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int n;

		System.out.print("임의의 정수 입력 : ");

		n=Integer.parseInt(br.readLine());

		/*(X)
		if (n%2 ==0)
		{
			System.out.println(n +  " ->짝수");
		
		}

		else if (n==0)
		{
			System.out.println( n + "-> 영");
		}

		else 
		{
			System.out.println(n + " ->홀수");
		}
		*/


	    /*(X)
		if (n%2!=0)
		{
			System.out.println(n +  " ->홀수");
		
		}

		else if (n%2==0)
		{
			System.out.println( n + "-> 짝수");
		}

		else if(n ==0)
		{
			System.out.println(n + " ->영");
		}
		*/
		
		
		/*(O)
		if (n==0)
		{
			System.out.println(n +  " ->영");
		
		}

		else if (n%2 ==0)
		{
			System.out.println( n + "-> 짝수");
		}

		else 
		{
			System.out.println(n + " ->홀수");
		}


    //짝수, 홀수 , 영 은  짝수보다 영을 먼저 표현해야함
		
		
		*/

		System.out.print("아이스크림 종류 선택 (1.딸기, 2,포도) : " );
		n=Integer.parseInt(br.readLine());

		/*
		if(n==1)
		{
			Systen.out.println("딸기 아이스크림 선택~~!");
		}
		else
		{
			System.out.println("포도 아이스크림 선택~!!");
		}
		*/
		if(n==1)
		{
			System.out.println("딸기 아이스크림 선택~~!");
		}
		else if (n==2)
		
		{
			System.out.println("포도 아이스크림 선택~!!");
		}

		else
		{
			System.out.println("판정 불가~!!!");
		}




    
	}

}
