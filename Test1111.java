import java.util.Scanner;
import java.util.Vector;

public class Test1111
{
		
	public static Vector<Object> v = new Vector<Object>();
	public static int sel=0;

	public static void menuDisp()
	{

		System.out.println("1.�Է�");
		System.out.println("2.���");
		System.out.println("3.�˻�");
		System.out.println("4.����");
		System.out.println("5.����");
		System.out.println("��ȣ�� �Է��ϼ���");


	}

	public static void menuSelect() 
	{
		
		Scanner sc= new Scanner(System.in);
		sel =sc.nextInt();

	}

	//���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun()  
	{

		switch (sel)
		{
		case 1 : addElement(); break;
		case 2 : dispElement(); break;
		case 3 : findElement(); break;
		case 4 : selElement(); break;
		case 5: chElement(); break;
		}
			
		
	}

	public static void addElement() 
	{
		String name;
		String con="y";

		Scanner sc= new Scanner(System.in);

		do
		{
			System.out.print("�Է��� ������ :");
			name = sc.next();
			v.add((Object)name);
			System.out.print("��� ���� ? ");
			con=sc.next();


		}
		while (con.equals("Y") || con.equals("y"));

		
	}

	//��� ��� �޼ҵ�
	public static void dispElement()
	{
		if (!v.isEmpty())
		{
			for (Object name : v )
			{
				System.out.println(name);
			}
			System.out.println();
		}
		else
			System.out.println("��� �� �����Ͱ� �����ϴ�.");
		
	}

	//��� �˻� �޼ҵ�
	public static void findElement() 
	{
		Scanner sc= new Scanner(System.in);
		String name;
		System.out.print("�˻��� ������");
		name=sc.next();

		if (v.contains(name))
		{
			System.out.println("�˻��� �����Ͱ� �ֽ��ϴ�.");
		}
		else
			System.out.println("�˻��� �����Ͱ� �����ϴ�.");

	}

	public static void selElement()
	{
		Scanner sc= new Scanner(System.in);
		String name;
		System.out.print("������ ������ : ");
		name=sc.next();

		if (v.contains(name))
		{
			int i = v.indexOf(name);
			v.remove(i);
			dispElement();
		}

	}

	public static void chElement()
	{
		Scanner sc = new Scanner(System.in);
		String name;
		String name2;
		System.out.print("������ ������ : ");
		name=sc.next();
		System.out.print("���� ���� : ");
		name2 = sc.next();

		if (v.contains(name))
		{
			int i = v.indexOf(name);
			v.set(i,name2);
			dispElement();
		}

	}







	public static void main(String[] args)
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
