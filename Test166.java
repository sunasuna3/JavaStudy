/*==================================
■■■ 자바의 기본 입출력(I/O)■■■
==================================*/


import java.io.IOException;

public class Test166
{
	public static void main(String[] args) throws IOException
		{
		int data;
		char ch;

		System.out.println("문자열 입력(종료 : ctrl+z) : ");
	
		// read(): InputStream  클래스의 대표적 메소드 (-> 바이트 스트림)
		while ((data=System.in.read() ) != -1)
		{
			ch=(char)data;

			//print() : 문자 스트림
			//System.out.print(ch);  //--한글 깨짐

			//--==>
			/*
			문자열 입력(종료 : ctrl+z) :
			abcd
			abcd
			1234
			1234
			가나다라
			°¡³ª´?¶?
			^Z
			계속하려면 아무 키나 누르십시오 . . .
			*/
			//write() : OutputStream 클래스의 대표적 메소드 (-> 바이트 스트림)
			System.out.write(ch);
			//--==>
			/*
			문자열 입력(종료 : ctrl+z) :
			abcd
			abcd
			1234
			1234
			가나다라
			가나다라
			^Z
			계속하려면 아무 키나 누르십시오 . . .
			*/
		}


	}
}