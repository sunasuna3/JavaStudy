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

public class Test017
{
	public static void main(String [] args)
	{
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		//�ֿ� ���� ����
		String name;
		int kor, eng, mat;
		int sum;

		//���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();

		System.out.print("���� ���� �Է� : ");
		kor = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;

		//��� ���
		System.out.println("�̸� : " + name);
		System.out.printf("%d\n",sum);




	}
}
/*
�̸��� �Է��ϼ��� : ��ȫ��
���� ���� �Է� : 10
���� ���� �Է� : 0
���� ���� �Է� : 10
�̸� : ��ȫ��
20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/