import java.util.Scanner;
import java.util.Vector;

public class Test1111
{
		
	public static Vector<Object> v = new Vector<Object>();
	public static int sel=0;

	public static void menuDisp()
	{

		System.out.println("1.입력");
		System.out.println("2.출력");
		System.out.println("3.검색");
		System.out.println("4.삭제");
		System.out.println("5.변경");
		System.out.println("번호를 입력하세요");


	}

	public static void menuSelect() 
	{
		
		Scanner sc= new Scanner(System.in);
		sel =sc.nextInt();

	}

	//선택된 메뉴 실행에 따른 기능 호출 메소드
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
			System.out.print("입력할 데이터 :");
			name = sc.next();
			v.add((Object)name);
			System.out.print("계속 진행 ? ");
			con=sc.next();


		}
		while (con.equals("Y") || con.equals("y"));

		
	}

	//요소 출력 메소드
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
			System.out.println("출력 할 데이터가 없습니다.");
		
	}

	//요소 검색 메소드
	public static void findElement() 
	{
		Scanner sc= new Scanner(System.in);
		String name;
		System.out.print("검색할 데이터");
		name=sc.next();

		if (v.contains(name))
		{
			System.out.println("검색할 데이터가 있습니다.");
		}
		else
			System.out.println("검색할 데이터가 없습니다.");

	}

	public static void selElement()
	{
		Scanner sc= new Scanner(System.in);
		String name;
		System.out.print("삭제할 데이터 : ");
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
		System.out.print("변경할 데이터 : ");
		name=sc.next();
		System.out.print("변경 내용 : ");
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
