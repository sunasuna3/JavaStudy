
/*==============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if�� �ǽ�
===============================================*/
//�ǽ�����
//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������ ¦������ Ȧ������ �Ǻ��Ͽ�
//����� ����ϴ� ���α׷��� �����Ѵ�.
//��,BufferedReader�� readLine() �޼ҵ带 ���� �Է¹��� �� �ֵ��� ó���ϰ�
//���� if���� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

//���� ��
//������ ���� �Է� : 37
//37 -> Ȧ���Դϴ�.
//����Ϸ��� �ƹ� Ű��....

//������ ���� �Է� : 26
//26->¦���Դϴ�.
//����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		System.out.print("������ ���� �Է� :");
		String strDate = br.readLine();

		int num = Integer.parseInt(strDate);

		//int num =Integer.parseInt(br.readLine);
	
		//
		if ( num%2 ==0)
		{
			System.out.printf("%d  ->  ¦���Դϴ�.\n",num);
		}
		
		if (num%2!=0)
		{
			System.out.printf("%d -> Ȧ���Դϴ�.\n",num);
		}

	}
}