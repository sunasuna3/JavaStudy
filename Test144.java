/*===============================
���� ����(Exception) ó������
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
			System.out.print("�̸� �Է�[���� :Ctrl+z] : ");

			while ((str=br.readLine()) != null)
			{
				data[n++]=str;
				System.out.print("�̸� �Է�[���� :Ctrl+z] : ");
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("���ܹ߻�~!!!!");
			System.out.println(" getMessag : "+e.getMessage());
			System.out.println(" toString : "+e.toString());
			System.out.println(" printStackTrace");
			e.printStackTrace();
		}

		catch (IOException e)
		{
			System.out.println(e.toString());  //exception�� ������ �ִ�  toString
		}

		System.out.println("�Էµ� ����..");
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
�̸� �Է�[���� :Ctrl+z] : ȫ�浿
�̸� �Է�[���� :Ctrl+z] : ��浿
�̸� �Է�[���� :Ctrl+z] : �ֱ浿
�̸� �Է�[���� :Ctrl+z] : �ڱ浿
���ܹ߻�~!!!!
 getMessag : 3
 toString : java.lang.ArrayIndexOutOfBoundsException: 3
 printStackTrace
java.lang.ArrayIndexOutOfBoundsException: 3
        at Test144.proc(Test144.java:26)
        at Test144.main(Test144.java:61)
�Էµ� ����..
ȫ�浿
��浿
�ֱ浿
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
