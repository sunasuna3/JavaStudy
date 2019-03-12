/*===============================
���� ����(Exception) ó������
- �ٸ� ���� �ٽ� ������
================================*/


public class Test148
{
	public int getValue(int value) throws Exception
	{
		int a=0;

		try
		{
			a=getData(-2);
			//-- �� ������ ���� ��ź ��Ƴ���
		}
		catch (Exception e)
		{
			// �� ������ ���� ��ź ó��
			System.out.println("printStackTrace....(getValue)");
			e.printStackTrace();

			//���� �߻� -> �� ������ �Ķ� ��ź
			throw new Exception("value �� �����Դϴ�.");
		}

		return a;
	}

	public int getData(int data) throws Exception
	{
		if (data<0)
			throw new Exception("data�� 0���� �۽��ϴ�");
			//--���� �߻� �� ������ ���� ��ź


		return data+10;
	}



	public static void main(String[] args) 
	{
		Test148 ob =new Test148();

		try
		{
			//�� ������ �Ķ� ��ź ��Ƴ���
			int a =ob.getValue(-2);
			System.out.println("a : " +a);
		}
		catch (Exception e)
		{
			//�� ������ �Ķ� ��ź ó��
			System.out.println("printStackTrace....(main)");
			e.printStackTrace();
		}




	}
}