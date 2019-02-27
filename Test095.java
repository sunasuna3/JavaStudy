/*===============================
  ���� �޼ҵ� �ߺ�����(Method Overloading) ����
================================*/

/*
 �� �޼ҵ� �ߺ����� ����
	�޼ҵ� �ߺ�����(Method Overloading)��
	�޼ҵ尡 ó���ϴ� ����� ����(Ȥ�� �ſ� �����ϰ�)
	�޼ҵ� ��ȣ �ӿ� �Ѱ��ְ� �Ǵ� ����(����, �Ű�����, �Ƕ����)�� ������ �ٸ��ų�
	�ڷ����� �ٸ����
	�޼ҵ��� �̸��� ������ �̸����� �ο��Ͽ� �޼ҵ带 ������ �� �ֵ���
	���������� ����ϰ� �Ǵµ�
	�̸� �޼ҵ� �����ε� (Method Overloading)�̶�� �Ѵ�.
*/

public class Test095
{
	public static void main(String[] args)
	{
		drawLine();
		//--==> ====================
		//drawLine2('*',50); 

		drawLine('-');
		//--==>	--

		drawLine('+');
		//--==>++

		drawLine('>',20);
		//--==> >>>>>>>>>>>>>>>>>>>>

		drawLine('*',50);
		//--==> **************************************************
		
	}


	//���� �׸��� �޼ҵ� ����
	public static void drawLine()
	{
		System.out.println("===================="); //  = -> 20��
	}
	//���� ���¸� �ٲپ� �׸��� �޼ҵ� ����
	//public static void drawLine2(char c)  
	public static void drawLine(char c)
	{
		for (int i=0; i<2; i++ )
		{
			System.out.print(c);
		}
		System.out.println();
	}

	//���� ���¿� ���̸� �ٲپ� �׸��� �޼ҵ� ����
	//public static void drawLine3(char c, int n)
	public static void drawLine(char c, int n)
	{
		for (int i=0; i<n; i++ )
		{
			System.out.print(c);
		}
		System.out.println();
	}
}