/*==============================================
  ���� ���� �帧�� ��Ʈ�� (�ݺ���) ����
  -   - �ݺ���(while) �ǽ�
===============================================*/

//�۽ǽ� ����
//����ڷκ��� ������ �� ������ �Է¹޾�
//���� �� ���� ū �� ������ ���� ���Ͽ�
//����� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��
//ù ��° ���� �Է� :10
//�� ��° ���� �Է� : 20
//>>10~20������ �� : xxxxxx
//����Ϸ��� �ƹ� Ű��.................

//ù ��° ���� �Է� :10
//�� ��° ���� �Է� : 2
//>>2~10������ �� : xxxxxx
//����Ϸ��� �ƹ� Ű��.................

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test051
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int a=0,b=0;
		int c;

		System.out.print("ù ��° ���� �Է� : " );
		a=Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : " );
		b=Integer.parseInt(br.readLine());
		
		int i;
		int sum=0;

		if (a>b)
		{
				a=a^b;
				b=b^a;
				a=a^b;
		}
		
		i= a;  // --------------�̰�1!!!!!!!!!!!!!!!!!!!!!!��������
		while (i<=b)
		{
			sum += i;
			i++;
		}
		System.out.printf(">>%d~%d������ �� :%d\n",a,b,sum);

		


/*
		//���� Ǭ ����
		//�ֿ� ���� ����
		int n, su1, su2, result=0;
		//��������, ù ��° �Է°�, �� ��° �Է°�, �����(������ ������)

		//���� �� ó��
		// - ����ڿ��� �ȳ��޼��� ��� �� �Է°� ��Ƴ���
		System.out.print("ù ��° ���� �Է� : " );
		su1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : " );
		su2 = Integer.parseInt(br.readLine());
		
		//-������ ���꿡 ���� �ռ�
		// �Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		// ��, su1�� su2 ���� Ŭ ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��

		if (su1>su2)
		{
			//�� ���� �ڸ� �ٲ�
			su1 = su1^su2;
			su2 = su2^su1;
			su1 = su1^su2;

		}
		//�ݺ����� �����ϱ� ��
		//���� ���� ���� �����صд�.
		//(�� ���� ���� ��� �������� �ʿ��� ���̸�...
		// ������ ������ ���� ���� ��� �ݺ����� �����ϴ� ����
		//�� ���� ��� ���� ���̱� ����....
		
		n = su1;

		while (n<=su2)
		{
			result += n;
			n++;
		}

		//��� ���
		System.out.printf(">>%d~%d������ �� :%d\n",su1, su2, result);

		*/

		}
}
//���� ���
/*

ù ��° ���� �Է� : 1
�� ��° ���� �Է� : 3
>>1~3������ �� :6
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 3
�� ��° ���� �Է� : 1
>>1~3������ �� :6
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/