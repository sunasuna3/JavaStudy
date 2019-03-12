/*===============================
■■■ 예외(Exception) 처리■■■
================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143
{		
	private String[] data = new String[3];

	public void proc() throws IOException//(str=br.readLine()) !=null) 이거 때문에 예외처리
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n=0;

		System.out.print("이름 입력[종료 : Ctrl+z] : ");
		
		while ((str=br.readLine()) !=null)
		{
			data[n++]=str;
			System.out.print("이름 입력[종료 : Ctrl+z] : ");
		}
		System.out.print("입력된 내용... ");
		for (String s : data )
		{
			if (s!=null)
			{
				System.out.println(s);
			}
		}
	}



	public static void main(String[] args) throws IOException // ob.proc();
	{
		Test143 ob =new Test143();
		ob.proc();

	}
}

/*
이름 입력[종료 : Ctrl+z] : 홍길동
이름 입력[종료 : Ctrl+z] : 고길동
이름 입력[종료 : Ctrl+z] : 최길동
이름 입력[종료 : Ctrl+z] : ^Z
입력된 내용... 홍길동
고길동
최길동
계속하려면 아무 키나 누르십시오 . . .
*/

/*
이름 입력[종료 : Ctrl+z] : 홍길동
이름 입력[종료 : Ctrl+z] : 고길동
이름 입력[종료 : Ctrl+z] : 최길동
이름 입력[종료 : Ctrl+z] : 박길동
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at Test143.proc(Test143.java:24)
        at Test143.main(Test143.java:42)
계속하려면 아무 키나 누르십시오 . . .


*/