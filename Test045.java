/*==============================================
  ���� ���� �帧�� ��Ʈ�� (�ݺ���) ����
  -   - �ݺ���(while) �ǽ�
===============================================*/

// �ǽ� ����
//1���� 100������ ���� �߿���
//¦���� �հ� Ȧ���� ���� ���� �����Ͽ� ����Ѵ�.
//�׸��� �� ������� ����ϴ� ���α׷��� �����Ѵ�.
//��, �ݺ����� While�ݺ����� ����ϸ�,
//���ǹ��� if ���ǹ��� ����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

//���� ��)
//1���� 100������ ���� ��
//¦���� �� : 2550
//Ȧ���� �� : 2500
//����Ϸ��� �ƹ� Ű�� ��������...

public class Test045
{
	public static void main(String [] args)
	{
		int n = 0;
		int sum1 = 0, sum2 =0;


			while (n<=100)
			{
				if (n%2==0)
				{
				  sum1 = sum1 + n;
				}

				else 
				{
					sum2 = sum2 + n;
				}

				n++;				
			}

		System.out.printf("1���� 100������ ���� ��\n");
		System.out.printf("¦���� �� : %d\n",sum1);
		System.out.printf("Ȧ���� �� : %d\n",sum2);
	}
}
/*
1���� 100������ ���� ��
¦���� �� : 2550
Ȧ���� �� : 2500
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/