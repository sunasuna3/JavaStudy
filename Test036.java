/*==============================================
  ���� ���� �帧�� ��Ʈ�� (���) ����
  - if ~ else �ǽ�
===============================================*/
//�ǽ� ����
//����ڷκ��� ������ ������ �Է¹޾�
//���� ������ ū �� ������ ����ϴ� ���α׷��� �ۼ��Ѵ�.

//���� ��)
//ù ��° ���� �Է� : 4
//�� ��° ���� �Է� : 8
//�� ��° ���� �Է� : 73

// >> ���� ��� : 4 8 73
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

/*
		int a,b,c;

		System.out.print("ù ��° ���� �Է� : " );
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : " );
		b = Integer.parseInt(br.readLine());


		System.out.print("�� ��° ���� �Է� : " );
		c = Integer.parseInt(br.readLine());


		if ((a>b) && (b>c) && (a>c))
		{
			System.out.printf(" >> ���� ��� : %d %d %d \n",c,b,a);
		}
		else if ((b>a) && (a>c) && (b>c))
		{
			System.out.printf(" >> ���� ��� : %d %d %d \n",c,a,b);
		}
		else if ((c>b) && (b>a) && (c>a))
		{
			System.out.printf(" >> ���� ��� : %d %d %d \n",a,b,c);
		}
		else if ((a>c) && (c>b) && (a>b))
		{
			System.out.printf(" >> ���� ��� : %d %d %d \n",b,c,a);
		}
		else if ((b>c) && (c>a) && (b>a))
		{
			System.out.printf(" >> ���� ��� : %d %d %d \n",a,c,b);
		}
		else if ((c>a) && (a>b)&& (c>b));
		{
			System.out.printf(" >> ���� ��� : %d %d %d \n",b,a,c);
		}

		else if ((a>b) && ( b<c) && (a==c));
		{
			System.out.printf(" >> ���� ��� : %d %d %d \n",a,b,c);		
		}

		else if ((b>a) && (a<c) && (b==c) );
		{
			System.out.printf(" >> ���� ��� : %d %d %d \n",c,a,b);		
		}

		else if ((c>a) && (a<b) && (c==b) );
		{
			System.out.printf(" >> ���� ��� : %d %d %d \n",b,c,a);		
		}
*/
		

		int a,b,c; //-- ����ڰ� �Է��ϴ� ������ ������ ���� ����
		int temp;   //-- �ӽ� ���� ���� (�� ��)

		System.out.print("ù ��° ���� �Է� : " );
		a = Integer.parseInt(br.readLine());
		

		System.out.print("�� ��° ���� �Է� : " );
		b = Integer.parseInt(br.readLine());


		System.out.print("�� ��° ���� �Է� : " );
		c = Integer.parseInt(br.readLine());

		if (a>b) //1) ù ��° ������ �� ��° �������� ũ�ٸ�...
		{	
			//�� ������ �ڸ��� �ٲ۴�.
			temp =a;
			a=b;
			b=temp;
		}	
		
		if (b>c) //2) �� ��° ������ �� ��° �������� ũ�ٸ�...
		{
			//�� ������ �ڸ��� �ٲ۴�.
			temp =b;
			b=c;
			c=temp;
		}
		
		if (a>b) //3) ù ��° ������ �� ��° �������� ũ�ٸ�...
		{
			//�� ������ �ڸ��� �ٲ۴�.
			temp =a;
			a=b;
			b=temp;
		}
		System.out.printf("n>>���� ��� : %d %d %d\n",a,b,c);
		


	}
}
/* ��� ���
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 77
�� ��° ���� �Է� : 1
n>>���� ��� : 1 5 77
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
