/*==============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if ~ else �ǽ�
===============================================*/

//�ǽ� ����
//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������ 2�� �������, 3�� �������
//2�� 3�� �������, 2��3�� ����� �ƴ��� �Ǻ��Ͽ�
//����� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
//������ ���� �Է�: 8
// 8 -> 2�� ���~!!!
//����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է�: 8
// 9 -> 3�� ���~!!!
//����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է�: 8
// 6 -> 2�� 3�� ���~!!!
//����Ϸ��� �ƹ� Ű�� ��������...

//������ ���� �Է�: 8
// 11 -> 2�� 3�� ����� �ƴ�~~!
//����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int n;

		System.out.print("������ ���� �Է�  ");
		n = Integer.parseInt(br.readLine());
		

		 if ((n%3==0) && (n%2==0))
		{
			System.out.printf("%d -> 2�� 3�� ���~!!! \n",n);
		}
	
		else if (n%2==0)
		{
			System.out.printf("%d -> 2�� ���~!!! \n",n);
		}

		else if (n%3==0)
		{
			System.out.printf("%d -> 3�� ���~!!! \n",n);
		}

		else if ((n%3!=0) && (n%2!=0))
		{
			System.out.printf("2�� 3�� ����� �ƴ�~~!!");
		}
		else 
		{
			System.out.printf("�Ǻ��� �Ұ����� ��Ȳ~!!!");
		}


		


			
   /*
		 if (n%2==0)
		{
			System.out.printf("%d -> 2�� ���~!!! \n",n);
		}
	
		else if (n%3==0)
		{
			System.out.printf("%d -> 3�� ���~!!! \n",n);
		}

		else if ((n%3==0) && (n%2==0))
		{
			System.out.printf("%d -> 2�� 3�� ���~!!! \n",n);
		}
		else if ((n%3!=0) && (n%2!=0))
		{
			System.out.printf("2�� 3�� ����� �ƴ�~~!!");
		}
		else 
		{
			System.out.printf("�Ǻ��� �Ұ����� ��Ȳ~!!!");
		}

		*/


		
	
	}
}