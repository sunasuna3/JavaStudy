/*==============================
���� �÷��� (collection)����
===============================*/

// �˻� �� ����

import java.util.Vector;

public class Test156
{

	//���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors
		={"����","���","�ʷ�","�Ķ�","����","����"};


	public static void main(String[] args)
	{
		//���� �ڷᱸ�� �ν��Ͻ� ����
		Vector<String> v =new Vector<String>();

		//���� �ڷᱸ�� v�� colors ��� �߰�
		for(String color : colors)
			v.add(color);

		//���� �ڷᱸ�� v�� ��ü ��� ���
		System.out.print("��ü ��� : ");
		for (String str :v )
		{
			System.out.print(str + " ");
		}
		System.out.println("\n");
		//--==> ��ü ��� : ���� ��� �ʷ� �Ķ� ���� ����


		String s1 ="��ȫ";

		//indexOf()
		int i = v.indexOf(s1);
		System.out.println(s1 + "-> index ��ġ : "+i);
		System.out.println();
		//��ȫ-> �ε��� ��ġ : -1

		String s2 ="���";
		/*
		i=v.indexOf(s2);
		v.removeElementAt(i);  //At �迭 ��ȣ

		System.out.print("��ü ��� : ");
		for (String str :v )
		{
			System.out.print(str + " ");
		}
		System.out.println("\n");
		*/
		//v.comtains(s) : ���� �ڷᱸ�� v�� s�� ���ԵǾ� �ִٸ�....indexȮ��
		if (v.contains(s2))
		{
			// v.indexOf(s) : ���� �ڷᱸ�� v���� s�� �ε��� ��ġ ��ȯ(Ȯ��)
			i = v.indexOf(s2);
			System.out.println(s2 + "-> index ��ġ : " +i);

			// �켱 ���� �ڵ带 ���� ã��...ã������ �����ض�~!!!
			v.remove(i);
			//--==>���-> index ��ġ : 1

		}

		//ã�Ƽ� ������ �� ��ü ��� ���
		System.out.print("���� �� ��ü ��� : ");
		for(String str : v)
			System.out.print(str+" ");
		System.out.println();
		//--==>���� �� ��ü ��� : ���� �ʷ� �Ķ� ���� ����
		
		System.out.println();

			
		//�߰� �׽�Ʈ(���ǻ���)
		System.out.println(colors);
		//--==> [Ljava.lang.String;@15db9742
		System.out.println();
		

		// Ȯ�ο� ���� ������ ����
		System.out.println(v);
		//--==> [����, �ʷ�, �Ķ�, ����, ����]   
		
		// �� Ȯ�ο�(�׽�Ʈ��) ���� �����ʹ�
		//	  ���� ���(������)�� �ƴϱ� ������
		//    �̸� Ȱ���Ͽ� ������ �����ϰų� �ϸ� �ȵȴ�~!!!!!! check

	}
}