
/*==============================================
  ���� ������(Operator) ����
  - ���� ������ == ���ǿ�����
===============================================*/

// �� �ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������, �������� 0 ���� �����Ͽ�
// ����� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ��, �Է� �����ʹ� BufferedReader �� readLine()�� ���� �Ѱܹ��� �� �ֵ��� �Ѵ�.
// ����, ���� ������(���� ������)�� Ȱ���Ͽ� ����� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : -12
// -12 �� ����
// ����Ϸ��� �ƹ�Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�ֿ� ���� ����
		int n;
		String strResult;

		//���� �� ó��

		System.out.print("������ ���� �Է� :");
		n = Integer.parseInt(br.readLine());

		//strResult = n>0 ? "���" : (n<0 ? "����" : "��");
				/*
		n �� 0 ���� ũ�� �� true �� ���
						 �� false�� n�� 0���� �۴� �� true �� ����
						 						   �� false �� 0

		*/
		strResult = n==0 ? "��" : (n>0 ? "���" : "����");
		

		//��� ���
		System.out.printf("%d �� %s\n",n,strResult);

	}
}




// ���� ���
/*
������ ���� �Է� : 10
 10 �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 0
 0 �� ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : -10
 -10 �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/