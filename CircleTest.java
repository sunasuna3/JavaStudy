/*=======================================
  ���� Ŭ������ �ν��Ͻ� ����
========================================*/

//�۽ǽ� ����
//���� ���̿� �ѷ� ���ϱ�

//���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ ���������� (������) �����Ѵ�.
//(Ŭ������ : CircleTest) -> CircleTest.java

//���� ���� = ������ * ������ * 3.141592
//���� �ѷ� = ������ * 2 * 3.141592

//���� ��)
// ������ �Է� :xxxxxx

// >> �������� xxx�� ����
// >> ���� : xxxx.xxx
// >> �ѷ� : xxx.xx
//����Ϸ��� �ƹ� Ű�� ��������....

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest 
{
	
	int r;
	
	void input() throws IOException 
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("������ �Է� : ");
		r =Integer.parseInt(br.readLine());
	}

	double calLentgh()
	{
		return r * r * 3.141592;

	}
	
	
	double calArea()
	{
		return r * 2 * 3.141592;

	}

	void print(double a, double l)
	{
		System.out.printf("�������� %d�� ���� ����",r);
		System.out.println(">>���� : " + a);
		System.out.println(">>�ѷ� : " + l);

	}
	*/




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest 
{
	int r;
	final double PI = 3.141592;
		//final ���� �빮�� 
	
	//BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	// Ŭ���� �ȿ��� ���������� �ν��Ͻ� ���� ������ �ٶ��� xx
	// �޼ҵ� �ȿ��� ����ϴ°��� ����.										

	void input() throws IOException 
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("������ �Է� : ");
		r =Integer.parseInt(br.readLine());

	}

	double calArea()
	{
		double result;
		
		result = r * r * PI;

		return result;
	}

	double calLentgh()
	{
		double result;

		result = r * 2 * PI;

		return result;
	}

	void print(double a, double l)
	{
		System.out.printf("n>>�������� %d�� ���� ����\n",r);
		System.out.printf(">>���� : %.2f\n", a);
		System.out.printf(">>�ѷ� : %.2f\n", l);
	}

}