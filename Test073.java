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

class calculate
{
	//���ֿ� �Ӽ� ����
	int su1, su2;
	char op;
	

	//�۸޼ҵ� ����(��� : �Է�)
	void input() throws IOException
				//System.in.read ������ IOException �Է��ؾ���
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է� (���� ����) : ");
		su1=sc.nextInt();
		su2=sc.nextInt();

		System.out.print("������ ������ �Է�(+ - * /) : ");
		op=(char)System.in.read();  //������� ����ȯ 
		
	}

	//�۸޼ҵ� ����(��� : ����)
	int cal()
	{
		int result=0;
		//default�� ������ result�� 0���� �ʱ�ȭ �ϴ��� 2���� 1���� �� �����ؾ���
		switch (op)
		{
		case '+':result=su1+su2;break;
		case '-':result=su1-su2;break;
		case '*':result=su1*su2;break;
		case '/':result=su1/su2;break;
		
		}


		return result;
	}
	//�۸޼ҵ� ����(��� :���)  
	//return  �ڷ����� void
	void print(int r)
	{
		System.out.printf(">>%d %c %d = %d\n",su1,op,su2,r);
	}

}


public class Test073
{
	public static void main(String[] args) throws IOException
	{
		//calculate Ŭ���� ����� �ν��Ͻ� ����
		calculate ob = new calculate();

		ob.input();				//--������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		int result = ob.cal();	//--������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ�� 
		ob.print(result);		//--������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��

	}
}


//���� ���
/*
������ �� ���� �Է� (���� ����) : 10 5
������ ������ �Է�(+ - * /) : +
>>10 + 5 = 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/