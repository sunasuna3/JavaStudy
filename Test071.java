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




import java.io.IOException;


public class Test071
{

	public static void main(String[] args) throws IOException
	{

		CircleTest ob = new CircleTest();

		ob.input();

		double lentgh = ob.calLentgh();
		double area = ob.calArea();


		ob.print(area, lentgh);

	}
}
