/*=======================================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ���� ���� �ǽ�
========================================*/

//�� �ǽ� ����
//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//��Ģ ������ �����ϴ� ���α׷��� �����Ѵ�.
//��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

//���� ��)
//������ �� ���� �Է� (���� ����) : 10 5
//������ ������ �Է�(+ - * /) : +
//>>10 + 5 =15
//����Ϸ��� �ƹ� Ű�� ��������....
 
import java.util.Scanner;
import java.io.IOException;

class Hap
{
	int a,b;
	int ch;

	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է� (���� ����) : ");
		a=sc.nextInt();
		b=sc.nextInt();

		System.out.print("������ ������ �Է�(+ - * /) :");
		ch=System.in.read();
		
	}

	int result()
	{
		int result =0;

		if (ch=='+')
		{
			result = a + b;
		}
		else if (ch=='-')
		{
			result = a - b;
		}
		else if (ch== '*')
		{
			result = a *b;
		}
		else
			result = a / b;

		return result;
	}

	void print(int re)
	{
		System.out.printf("%d %c %d  =  %d\n",a,ch,b,re);
	}


}


public class Test073_1
{
	public static void main(String[] args) throws IOException
	{
		Hap ob = new Hap();

		ob.input();

		int re = ob.result();

		ob.print(re);

	}
}

