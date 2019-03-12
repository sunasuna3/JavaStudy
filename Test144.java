/*===============================
■■■ 예외(Exception) 처리■■■
================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test144
{
	private String[] data =new String[3];

	public void proc() //throws IOException;
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n =0;
		
		try
		{
			System.out.print("이름 입력[종료 :Ctrl+z] : ");

			while ((str=br.readLine()) != null)
			{
				data[n++]=str;
				System.out.print("이름 입력[종료 :Ctrl+z] : ");
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("예외발생~!!!!");
			System.out.println(" getMessag : "+e.getMessage());
			System.out.println(" toString : "+e.toString());
			System.out.println(" printStackTrace");
			e.printStackTrace();
		}

		catch (IOException e)
		{
			System.out.println(e.toString());  //exception이 가지고 있는  toString
		}

		System.out.println("입력된 내용..");
		for (String s :data )
		{
			if (s !=null)
			{
				System.out.println(s);
			}
		}


	}


	public static void main(String[] args)  //throws IOException
	{
		Test144 ob = new Test144();
		ob.proc();

	}
}

/*
이름 입력[종료 :Ctrl+z] : 홍길동
이름 입력[종료 :Ctrl+z] : 고길동
이름 입력[종료 :Ctrl+z] : 최길동
이름 입력[종료 :Ctrl+z] : 박길동
예외발생~!!!!
 getMessag : 3
 toString : java.lang.ArrayIndexOutOfBoundsException: 3
 printStackTrace
java.lang.ArrayIndexOutOfBoundsException: 3
        at Test144.proc(Test144.java:26)
        at Test144.main(Test144.java:61)
입력된 내용..
홍길동
고길동
최길동
계속하려면 아무 키나 누르십시오 . . .
*/
