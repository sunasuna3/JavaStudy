/*==========================================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  -  return
===========================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test066
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int n,s;

		System.out.print("������ ���� �Է�(10 �̻�) : ");
		n=Integer.parseInt(br.readLine());


		if (n<10)
		{
			System.out.println("10 �̻��� ������ �Է��ؾ� �մϴ�~~~");
			return;
		}

		s=0;
		for (int i=1; i<n ; i++ )
			s+=i;

		System.out.println("��� : " + s);

	}
}