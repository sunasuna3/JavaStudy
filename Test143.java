/*===============================
���� ����(Exception) ó������
================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143
{		
	private String[] data = new String[3];

	public void proc() throws IOException//(str=br.readLine()) !=null) �̰� ������ ����ó��
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n=0;

		System.out.print("�̸� �Է�[���� : Ctrl+z] : ");
		
		while ((str=br.readLine()) !=null)
		{
			data[n++]=str;
			System.out.print("�̸� �Է�[���� : Ctrl+z] : ");
		}
		System.out.print("�Էµ� ����... ");
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
�̸� �Է�[���� : Ctrl+z] : ȫ�浿
�̸� �Է�[���� : Ctrl+z] : ��浿
�̸� �Է�[���� : Ctrl+z] : �ֱ浿
�̸� �Է�[���� : Ctrl+z] : ^Z
�Էµ� ����... ȫ�浿
��浿
�ֱ浿
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
�̸� �Է�[���� : Ctrl+z] : ȫ�浿
�̸� �Է�[���� : Ctrl+z] : ��浿
�̸� �Է�[���� : Ctrl+z] : �ֱ浿
�̸� �Է�[���� : Ctrl+z] : �ڱ浿
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at Test143.proc(Test143.java:24)
        at Test143.main(Test143.java:42)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/