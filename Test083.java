/*=========================
  ���� �迭 ����
  - �迭�� �⺻���� Ȱ��
==========================*/
//�۰���
//����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾�
//�Է¹��� �� �߿��� ���� ū ���� ����ϴ� ���α׷��� �����Ѵ�.
//��, �迭�� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

//���� ��)
//�Է��� �������� ���� : 10
//������ �Է�(���� ����) : 45 92 75 13 2 65 25 63 90 17  
//>>���� ū �� -> 92
//����Ϸ��� �ƹ� Ű�� ��������....


import java.util.Scanner;

public class Test083
{
	public static void main(String[] args)
	{

		Scanner sc =new Scanner(System.in);

		int n=0;
		int max=0;

		System.out.print("�Է��� �������� ���� :  ");
		n=sc.nextInt();

		int[]num = new int [n];

		for (int i=0;i<n ;i++ )
		{
			System.out.print("������ �Է�(���� ����) : ");
			num[i]=sc.nextInt();
		}
		
		for (; ; )
		{
			if (num[i]>max)
			{
				max = num[i];
			}
		}




	}
}