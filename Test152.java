/*==============================
���� �÷��� (collection)����
===============================*/

import java.util.Queue;
import java.util.LinkedList;

public class Test152
{
	//���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors
		={"����","���","�ʷ�","�Ķ�","����","����"};


	public static void main(String[] args)
	{
		//Queue �ڷᱸ�� ����
		Queue<String> qu = new LinkedList<String>();
		//--�� Queue �������̽� ����� �ν��Ͻ��� �����ϱ� ���ؼ���
		//		new �����ڸ� �̿��Ͽ� Queue �������̽��� implements ��
		//		���� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�.

		// qu ��� Queue �ڷᱸ���� ������ �Է� -> offer()
		for (String color : colors )
			qu.offer(color);

		//qu ��� Queue �ڷᱸ���� ��� ������ ���
		/*
		String val;

		while (!qu.isEmpty())
		{
			val = (String)qu.poll();
			System.out.print(val+" ");
		}
		System.out.println();
		*/

		while (qu.peek() != null)
			System.out.print(qu.poll()+" ");
		System.out.println();
		//--==> ���� ��� �ʷ� �Ķ� ���� ����

	}


}