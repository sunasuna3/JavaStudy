/*==============================================
  ���� ���� �帧�� ��Ʈ�� (�ݺ���) ����
  -   - �ݺ���(while) �ǽ�
===============================================*/

//�ǽ� ����
//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
//����� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
//������ ���� �Է� : 10
//10 -> �Ҽ� �ƴ�
//����Ϸ��� �ƹ� Ű��...

//������ ���� �Է� : 11
//1 -> �Ҽ� �ƴ�
//����Ϸ��� �ƹ� Ű��...


//�� �Ҽ� : 1�Ǵ� �ڱ��ڽ��� �� �̿��� � ���ε� ���� �� ���� ��.

// 2 5 7 11 13 17 19 23 27 29 31 


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test050
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

/*
		int n; //�Է� ���� ����
		System.out.print("������ ���� �Է� : ");
		n=Integer.parseInt(br.readLine());

		String result = "�Ҽ�";

		if (n==1)
		{
			result = "�Ҽ� �ƴ�";
		}
		else
		{
			int i=2;
			while (i<n)
			{
				if (n%i==0)
				{
					result = "�Ҽ��ƴ�";
				}
				i++;
			}
		}
		System.out.println(result);
*/

		//�ֿ� ���� ���� �� �ʱ�ȭ
		int num;    //����� �Է°��� ���� ����

		//���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num=Integer.parseInt(br.readLine());

		int n=2;     //--������� �Է°��� �������
					//   ������ ������ ������ ����(1�� ���� ����)

		boolean flag=true;   //--�Ҽ���~!!! (check~~~!!!)
		
		while (n<num)
		{
			if (num%n==0)
			{
				flag=false;  //--�Ҽ� �ƴϴ�~1!!
				break;
			}

			n++;
		}

		//��� ���(��� ���� �����ؾ� �� �߰� Ȯ�� -> 1���� ���ο� ���� Ȯ��)
		//�Ҽ� && 1�� �ƴϴ�
		//->�������� ������� �Ҽ���
		//�׷��� ������ 
		//->�������� ������� �Ҽ� �ƴϴ�.

		if (flag && num!=1)
			System.out.printf("%d -> �Ҽ�~!!!\n",num);
		else
			System.out.printf("%d -> �Ҽ��ƴ�~~!!!\n",num);



	}
}
	
