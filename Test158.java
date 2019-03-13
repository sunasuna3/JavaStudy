/*==============================
���� �÷��� (collection)����
===============================*/

//�� �ǽ� ����
// ���� �ۼ����� Test158 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)

	[�޴� ����]
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	>> �޴� ����(1~6) : 1

	1��° ��� �Է� : ���Ѿ�
	1��° ��� �Է� ����~!!
	��� �Է� ���(Y/N)? : y

	2��° ��� �Է� : ��ȫ��
	2��° ��� �Է� ����~!!
	��� �Է� ���(Y/N)? : n

	[�޴� ����]
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
		���Ѿ� 
		��ȫ��
	���� ��ü ��� �Ϸ�~!!

	[�޴� ����]
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : ���Ѿ�

	[�˻� ��� ���]
	�׸��� �����մϴ�.

	[�޴� ����]
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ���ȯ

	[���� ��� ���]
	�׸��� �������� �ʾ� ������ �� �����ϴ�.

	[�޴� ����]
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : ��ȫ��
	������ ���� �Է� : �輱��

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.

	[�޴� ����]
	1.��� �߰�
	2.��� ���
	3.��� �˻�
	4.��� ����
	5.��� ����
	6.����
	>> �޴� ����(1~6) : 6

	���α׷� ����
	����Ϸ��� �ƹ�Ű��.......




*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Vector;

class Menus //--�ϼ�~!!
{
	public static final int E_ADD=1;   //��� �߰�
	public static final int E_DISP=2;	//��� ���
	public static final int E_FIND=3;	//��� �˻�
	public static final int E_DEL=4;	//��� ����
	public static final int E_CHA=5;	//��� ����
	public static final int E_EXIT=6;   //����
}



public class Test158 extends Menus
{
	//�ֿ� �Ӽ� ����  --�ϼ�
	public static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;			//���ð�
	private static String con;			//��� ����

	//static �ʱ�ȭ ��  -- �ϼ�
	static
	{
		//Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		//BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		//����� �Է°� �ʱ�ȭ
		sel=1;
		con = "Y";
	}

	//�޴� ��� �޼ҵ�

	public static void menuDisp()
	{
		System.out.println("[�޴� ����]");
		System.out.println("1.��� �߰�");
		System.out.println("2.��� ���");
		System.out.println("3.��� �˻�");
		System.out.println("4.��� ����");
		System.out.println("5.��� ����");
		System.out.println("6.����");
		System.out.print(">> �޴� ����(1~6) : ");
		
	
	}

	//�޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException
	{
		sel = Integer.parseInt(br.readLine());
		System.out.println();
	
	}

	//���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun()  throws IOException
	{
			
		switch (sel)
		{
		case E_ADD : addElement(); break;
		case E_DISP : dispElement(); break;
		case E_FIND : findElement();break;
		case E_DEL : delElement();break;
		case E_CHA : chaElement();break;
		case E_EXIT : exit(); break;
		}


	}

	//��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		
		int i=0;
		do
		{
			System.out.printf("%d��° ��� �Է� : ",i+1);
			vt.add(br.readLine().trim());
			System.out.printf("%d��° ��� �Է� ����~!!\n",i+1);
			i++;
			System.out.print("��� �Է� ���(Y/N)? : ");
			con=br.readLine();
			
		}
		while (con.equals("y") || con.equals("Y"));

		System.out.println();

	}

	//��� ��� �޼ҵ�
	public static void dispElement()
	{

		System.out.println("[���� ��ü ���]");
		for (Object str : vt)
		{
			System.out.println("  " +str);
		}
		
		System.out.println("���� ��ü ��� �Ϸ�~!!");
		System.out.println();
	}

	//��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		//String g;
		System.out.print("�˻��� ��� �Է� : ");
		//g=br.readLine();
		if (vt.contains(br.readLine().trim()))
		{
			System.out.println();
			System.out.println("[�˻� ��� ���]");
			System.out.println("�׸��� �����մϴ�.");
		}
		else
			System.out.println("�˻��� ��Ұ� �����ϴ�.");
		System.out.println();

	}

	//��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		
		String na;
		System.out.print("������ ��� �Է� : ");
		na=br.readLine();
		
		
		System.out.println("[���� ��� ���]");

		if (vt.contains(na))
		{	
			int i = vt.indexOf(na);
			vt.remove(i);
			dispElement();
		}
		else
			
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");

		System.out.println();

	}


	// ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		
		String a1,a2;
		System.out.print("������ ��� �Է� :  ");
		a1=br.readLine();
		System.out.print("������ ���� �Է� :  ");
		a2=br.readLine();

		if (vt.contains(a1))
		{
			int i = vt.indexOf(a1);
			vt.set(i,a2);
			System.out.println("[���� ��� ���] ");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			dispElement();	
		}
		else
			System.out.println("������ ����� �����ϴ�.");

		System.out.println();
	}


	// ���α׷� ���� �޼ҵ� --- �ϼ�
	public static void exit()
	{
		System.out.println("\n\t���α׷� ����~!!!");
		System.exit(-1);

	}
	


	public static void main(String[] args) throws IOException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
		
	}
}
