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

class Hap
{
	//�ֿ� ���� ����(������� �Է°��� ��Ƶ� ����)
	int su;

	//�Է� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			su =Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000);	

	}
	//���� �޼ҵ� ����
	int calculate()
	{
		int result=0;

		for (int i=1; i<=su ; i++ )
			result += i;

		return result;
	}

	//��� ��� �޼ҵ� ����
	//>>1~100������ �� :
	void print(int sum)
	{
		System.out.printf(">>1~%d������ �� : %d\n",su,sum);
	}

}



//main() �޼ҵ带 �����ϰ� �ִ� �ܺ� Ŭ����
public class Test072
{
	public static void main(String[] args) throws IOException
	{
		//Hap Ŭ���� �ν��Ͻ� ����
		Hap ob = new Hap();

		//������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ�� -> throws IoException ó��
		ob.input();

		//������ �ν��Ͻ��� ���� ���� ó�� �޼ҵ� ȣ�� -> int�� ����� ��ȯ -> �޾Ƴ� �� �ֵ��� ó��
		int s = ob.calculate();

		//������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ�� -> �Ű����� ����

		ob.print(s);
	
	}
}
