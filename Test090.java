/*===============================
  ���� Ŭ������ �ν��Ͻ� ����
  - �������а� ��������������
================================*/
import java.util.Scanner;

class CircleTest2
{
	// ���� �δ�(Information Hiding)
	// ��� ����, �ν��Ͻ� ����, ���� ����
	//��private�� �̶�� �������� �������� ������
	// Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�.
	// int �� ���� 0���� �ʱ�ȭ ����.
	private int r;

	//�׽�Ʈ
	void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("������ �Է� : ");
		r = sc.nextInt();

	}

	double calArea()
	{
		return r * r * 3.141592;
	}

	void write(double a)
	{
		System.out.println("������ : " +r);
		System.out.println("��  �� : " +a);
	}

	void setR(int r)
	{
		//r=r;
		//--�̿� ���� ���·� ǥ���ϰ� �Ǹ�
		//	��� ������ ���� ������ ���� �̸��� ���� �ִ� ��Ȳ�̱� ������
		//	 �� �� ���� ���� ������ �ν��Ͽ� ó���Ѵ�.
		
		//��this���� �ڱ� �ڽ��� ���³��� ���Ǿ�.
		this.r=r;
		//-��� ������ ���� ������ �����ϱ� ���Ͽ� 
		// Ŭ������ ��� ���� �տ� ��this�� ǥ��~~!!!
	}

	
}

//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test090
{
	public static void main(String[] args)
	{
		//CircleTest2 Ŭ���� ��� �ν��Ͻ� ����
		CircleTest2 ob1 =new CircleTest2();
		CircleTest2 ob2 =new CircleTest2();

		//���� ���� ����� ���� ���� ����
		double result;

		//ob1.r=10;                    //--���� �߻�(������ ����)
		//System.out.println(ob1.r);   //--���� �߻�(������ ����)

		// �ء�private�������� �ܺο��� ������ �Ұ����ϴ�.

		//�׽�Ʈ
		/*
		ob1.input();
		result = ob1.calArea();
		ob1.write(result);
		//--==>>
		/*
		������ �Է� : 10
		������ : 10
		��  �� : 314.1592
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
		

		//�� ��° �ν��Ͻ�(ob.2)�� �������� 20���� �ʱ�ȭ~~!!
		//ob2.r = 20;

		ob2.setR(20);
		result = ob2.calArea();
		ob2.write(result);
		//--==>
		/*
		������ : 20
			��  �� : 1256.6368
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
			
		
	}
}