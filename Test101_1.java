import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test101_1
{
	public static void main(String[] arg)throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		//�Է¹��� �ֹι�ȣ
		String str;

		//�������� �� �迭 ����
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		//							   - check~!!


		//���� ���� �� ������
		int tot=0;

		//����ڿ��� �ȳ� �޼��� ��� �� �ֹι�ȣ �Է¹ޱ�
		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
		str=br.readLine();
		
		if (str.length() !=14)
		{
			System.out.println(">>�Է� ����~!!!!");
			return;
		}
		
		//Ȯ��
		//System.out.println(">>�ڸ��� ����~!!");

		for (int i=0; i<13; i++ )  //i -> 0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			if (i==6)
				continue;

			tot += chk[i] * Integer.parseInt(str.substring(i,(i+1)));
		}

		//--������� �����ϸ� 1 �� 2�� ��� ���� ��Ȳ�̸�
		//	��Ģ�� �°� ���� ������ ������ ����� ��� ���� ����
		//	���� tot�� ����ִ� ���°� �ȴ�.

		int su = 11 - tot % 11;
		
		//Ȯ��
		//System.out.println(su);  //--==> 11
		
		//���� ��� ��� ������ �߰� ���� �ʿ�~!!!
		//-> su�� ���� ���� ����� ���ڸ��� ���� ���
		//	�ֹι�ȣ ������ �ڸ����� ���� �� ���� ��Ȳ
		su =su%10; //su %= 10;

		//--������� �����ϸ� 3�� 4�� ��� ���� ��Ȳ�̸�
		//	���� ���� ����� ���� su�� ����ִ� ��Ȳ�� �ȴ�.

		//���� ��� ���
		if (su == Integer.parseInt(str.substring(13)))
		{
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!!");
		}
		else
		{
			System.out.println(">> �߸��� �ֹι�ȣ~!!!");
		}


	}
}