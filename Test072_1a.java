/*=======================================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ���� ���� �ǽ�
========================================*/

//�۽ǽ� ����
//����ڷκ��� ������ ������ �Է¹޾�
//1���� �Է¹��� �� ������ ���� �����Ͽ�
//������� ����ϴ� ���α׷��� �����Ѵ�.

//��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
//����, �Է� ó�� �������� BurrefedReader �� readLine()�� ����ϸ�,
//�Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
//�ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

//���� ��)
//������ ���� �Է�(1~1000) : 1002
//������ ���� �Է�(1~1000) : -20
//������ ���� �Է�(1~1000) : 100
//>>1~100������ �� : 5050
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Test072_1
{
	int n;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.print("������ ���� �Է� : ");
		n=Integer.parseInt(br.readLine());		
	}

	int nsum()
	{
		int i=1 ,result=0;
		while (i<=n)
		{
			result += i;
			i++;		
		}
		return result;
	}

	void print(int result)
	{
		System.out.printf(">>1~%d������ �� : %d\n",n,result );
	}

}

public class Test072_1a
{
	public static void main(String [] args) throws IOException
	{

		TTest072_1 ob = new Test072_1();


		while (true)
		{
			ob.input();

			if (ob.n>=1 && ob.n<=1000)
			{
				break;
			}
		}

		int sum = ob.nsum();

		ob.print(sum);


	}
}