
/*==============================================
  ���� �ڹ��� �⺻ ���α׷��� ����
  - �ڹ��� �⺻ ����� : java.util.Scanner 
===============================================*/

// �� java.utill.Scanner
// �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
// ����Ʈ(default) �� ���Ǵ� �ܶ� ���ڴ� �����̴�.
// �ۼ��� ���� ��ū�� next() �޼ҵ带 ���
// �ٸ� ������ ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test018
{
	public static void main(String[] args)
	{
		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner (System.in);

		// �ֿ� ���� ����
		String name ; //--�̸�
		int kor, eng, mat, tot; //-- ���� ���� ���� ���� 

		// ���� �� ó��
		System.out.print("�̸� �������� �������� �������� �Է�(���鱸��) : ");
		//-- ��ȫ�� 90 80 70

		//�ػ���ڰ� �Է��� �����͸� �� ������ ��Ƴ���
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		tot = kor + eng + mat;

		
		// �� ��� ��� 
		System.out.println();
		System.out.printf("�̸� : %s\n",name);
		System.out.printf("���� : %d\n",tot);
	}
}

//��� ���
/*
�̸� �������� �������� �������� �Է�(���鱸��) : ��ȫ�� 10 20 30

�̸� : ��ȫ��
���� : 60
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/