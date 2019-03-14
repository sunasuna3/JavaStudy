import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/*
[�� �� �� ��]
1. ��� ����
2. ��� ����
3. ���� ����
4. ���� �߰�
5. ��     ��
�ൿ�� �����ϼ��� (1~5) : 1

----------------------------
    �̸�   ���     ����
----------------------------
   cider     10     1000
    coke     15     2000
   juice     12      800
----------------------------

[�� �� �� ��]
1. ��� ����
2. ��� ����
3. ���� ����
4. ���� �߰�
5. ��     ��
�ൿ�� �����ϼ��� (1~5) : 2

--------------------------------------
� ������ ��� �����Ͻðڽ��ϱ�?
--------------------------------------
��1 >> cider   coke   juice
�Է� : coke
�󸶳� �����Ͻðڽ��ϱ�? : 20

[�� �� �� ��]
1. ��� ����
2. ��� ����
3. ���� ����
4. ���� �߰�
5. ��     ��
�ൿ�� �����ϼ��� (1~5) : 1

----------------------------
    �̸�   ���     ����
----------------------------
   cider     10     1000
    coke     35     2000
   juice     12      800
----------------------------

[�� �� �� ��]
1. ��� ����
2. ��� ����
3. ���� ����
4. ���� �߰�
5. ��     ��
�ൿ�� �����ϼ��� (1~5) : 4

--------------------------------------
      �߰��� ������� �Է��ϼ���
--------------------------------------
�Է� >> juice
������ �󸶷� �����Ͻðڽ��ϱ�? : 700
[�� �� �� ��]
1. ��� ����
2. ��� ����
3. ���� ����
4. ���� �߰�
5. ��     ��
�ൿ�� �����ϼ��� (1~5) : 1

----------------------------
    �̸�   ���     ����
----------------------------
   cider     10     1000
    coke     35     2000
   juice      0      700
   juice      0      700
----------------------------

[�� �� �� ��]
1. ��� ����
2. ��� ����
3. ���� ����
4. ���� �߰�
5. ��     ��
�ൿ�� �����ϼ��� (1~5) : 2

--------------------------------------
� ������ ��� �����Ͻðڽ��ϱ�?
--------------------------------------
��1 >> cider   coke   juice   juice
�Է� : juice
�󸶳� �����Ͻðڽ��ϱ�? : 10

[�� �� �� ��]
1. ��� ����
2. ��� ����
3. ���� ����
4. ���� �߰�
5. ��     ��
�ൿ�� �����ϼ��� (1~5) : 3

--------------------------------------
      ������ ������� �Է��ϼ���
--------------------------------------
�Է� >> cider

[�� �� �� ��]
1. ��� ����
2. ��� ����
3. ���� ����
4. ���� �߰�
5. ��     ��
�ൿ�� �����ϼ��� (1~5) : 1

----------------------------
    �̸�   ���     ����
----------------------------
    coke     35     2000
   juice     10      700
   juice     10      700
----------------------------

[�� �� �� ��]
1. ��� ����
2. ��� ����
3. ���� ����
4. ���� �߰�
5. ��     ��
�ൿ�� �����ϼ��� (1~5) :
*/

class Seller
{	
	static ArrayList<String> productList = new ArrayList<String>();              // ������ �ִ� ������ ��� ���
	static HashMap<String, Integer> stock = new HashMap<String, Integer>();       // ���Ằ ���
	static HashMap<String, Integer> priceList = new HashMap<String, Integer>();   // ���Ằ ����
	
	//�ϼ� - �ʱⰪ ����
	static {
		productList.add("cider");
		productList.add("coke");
		productList.add("juice");
		stock.put("cider", 10);
		stock.put("coke", 15);
		stock.put("juice", 12);
		priceList.put("cider", 1000);
		priceList.put("coke", 2000);
		priceList.put("juice", 800);
	}

	static void printStock()
	{
		System.out.println("\n----------------------------");
		System.out.println("    �̸�   ���     ����");
		System.out.println("----------------------------");
		
		// ������ �ִ� ����� ��� ������� Iterator ����
		Iterator<String> it = productList.iterator();
		
		// ������ �ִ� ���Ḧ ���
		while (it.hasNext())
		{	
			String temp = (String)it.next();
			System.out.printf("%8s    %3d     %4d\n", temp, stock.get(temp), priceList.get(temp));
		}
		System.out.println("----------------------------");
		System.out.println();
	}

	static void adjustStock()
	{	
		System.out.println("\n--------------------------------------");
		System.out.println("� ������ ��� �����Ͻðڽ��ϱ�?");
		System.out.println("--------------------------------------");
		System.out.print("��1 >> ");
		Iterator<String> it = productList.iterator();

		while (it.hasNext())
		{
			System.out.print(it.next() + "   ");
		}
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String temp = sc.next();
		
		System.out.print("�󸶳� �����Ͻðڽ��ϱ�? : ");
		// ������ ���� �Է¹޾� ���� �� �ٽ� ����
		int temp2 = stock.get(temp) + sc.nextInt();
		stock.put(temp, temp2);
		System.out.println();
	}

	static void removeStock()
	{
		System.out.println("\n--------------------------------------");
		System.out.println("      ������ ������� �Է��ϼ���");
		System.out.println("--------------------------------------");

		System.out.print("�Է� >> ");
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
		
		// �Է¹��� ������� ��ϰ� ���, ����ǥ���� ����
		productList.remove(temp);
		stock.remove(temp);
		priceList.remove(temp);
		System.out.println();
	}

	static void addDrink()
	{
		System.out.println("\n--------------------------------------");
		System.out.println("      �߰��� ������� �Է��ϼ���");
		System.out.println("--------------------------------------");
		
		System.out.print("�Է� >> ");
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();

		productList.add(temp);
		stock.put(temp, 0);
			
		System.out.print("������ �󸶷� �����Ͻðڽ��ϱ�? : ");
		int temp2 = sc.nextInt();
		// ����ǥ�� �Է¹��� ����� ���� �߰�
		priceList.put(temp, temp2);
	}
	
	//�ϼ�
	static void exit()
	{
		System.out.println("\n�����մϴ�~");
		System.exit(-1);
	}
}

//�ϼ�
class Tester
{	
	int sel;
	
	//�ϼ�
	void menuDisp()
	{
		System.out.println("[�� �� �� ��]");
		System.out.println("1. ��� ����");
		System.out.println("2. ��� ����");
		System.out.println("3. ���� ����");
		System.out.println("4. ���� �߰�");
		System.out.println("5. ��     ��");
	}
	
	//�ϼ�
	void menuSelect()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("�ൿ�� �����ϼ��� (1~5) : ");
		try
		{
			sel=sc.nextInt();
		}
		catch (NumberFormatException e)
		{
			sel = 0;
		}
	}
	
	//�ϼ�
	void menuRun()
	{
		if (sel == 1)
			Seller.printStock();
		else if (sel == 2)
			Seller.adjustStock();
		else if (sel == 3)
			Seller.removeStock();
		else if (sel == 4)
			Seller.addDrink();
		else if (sel == 5)
			Seller.exit();
		else
			System.out.println("\n1~5 �߿� ������ �ּ���");
	}


}
//�ϼ�
public class Team2_Test1
{	
	//�ϼ�
	public static void main(String[] args)
	{	
		Tester game = new Tester();
		do
		{
			game.menuDisp();
			game.menuSelect();
			game.menuRun();
		}
		while (true);
	}
}