/*==================================
���� �ڹ��� �ֿ�(�߿�) Ŭ��������
-Object Ŭ����
===================================*/

class Test
{
	private int a=10;

	public void write()
	{
		System.out.println("a : "+a);
	}

}

public class Test123 
{

	public static void main(String[] args)
	{
		Test ob1=new Test();
		Test ob2=new Test();

		System.out.println("10==9 : " + (10==9));
		//--==> 10==9 : false

		int a=10;
		int b=10;
		System.out.println("a==b : "+ (a==b));
		//--==> a==b : true

		// �� ��==�� �� �����ڴ� �ǿ������� ũ�⸦ ������ Ȯ��

		System.out.println("ob1 == ob2 :" + (ob1==ob2));
		//--==> ob1 == ob2 :false 

		// �� ��ü(Object)���� ���ϴ� �������� ����ϴ� ��==�� �����ڴ�
		//    ũ�⸦ ���ϴ°��� �ƴ϶� ��ü�� �ּҰ��� ��.

		System.out.println("ob1.equals(ob2) : " +(ob1.equals(ob2)));
		//--==> ob1.equals(ob2) : false

		// �� ��==�� �����ڿ� Object Ŭ������ ��equals()�� �޼ҵ��
		//    ������ �������� ��ü�� �ּҰ��� ��.

		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();

		System.out.println("ob1		: " +ob1);
		//--==> ob1             : Test@15db9742

		System.out.println("ob1.toString() : " + ob1.toString());
		//--==> ob1.toString() : Test@15db9742
		System.out.println("ob2		: " +ob2);
		//--==> ob2             : Test@6d06d69c

		System.out.println("ob2.toString() : " + ob2.toString());
		//--==> ob2.toString() : Test@6d06d69c

		//��Ŭ������@�ؽ��ڵ塻

		// �� �ؽ��ڵ�
		//	   : �ڹ� ���������� ��ü�� �����ϱ� ���� ����ϴ� ��.
		//		 �޸��� �ּҰ����� �����ϸ� �ȵȴ�.

		// �� ��ü�� ������ �ؽ��ڵ尡 ������
		//    �ؽ��ڵ尡 ���ٰ� ���� ��ü�� �ƴϴ�.


	
	}

}