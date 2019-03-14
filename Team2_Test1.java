import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/*
[장 사 준 비]
1. 재고 보기
2. 재고 보충
3. 음료 제거
4. 음료 추가
5. 종     료
행동을 선택하세요 (1~5) : 1

----------------------------
    이름   재고     가격
----------------------------
   cider     10     1000
    coke     15     2000
   juice     12      800
----------------------------

[장 사 준 비]
1. 재고 보기
2. 재고 보충
3. 음료 제거
4. 음료 추가
5. 종     료
행동을 선택하세요 (1~5) : 2

--------------------------------------
어떤 음료의 재고를 조정하시겠습니까?
--------------------------------------
택1 >> cider   coke   juice
입력 : coke
얼마나 조정하시겠습니까? : 20

[장 사 준 비]
1. 재고 보기
2. 재고 보충
3. 음료 제거
4. 음료 추가
5. 종     료
행동을 선택하세요 (1~5) : 1

----------------------------
    이름   재고     가격
----------------------------
   cider     10     1000
    coke     35     2000
   juice     12      800
----------------------------

[장 사 준 비]
1. 재고 보기
2. 재고 보충
3. 음료 제거
4. 음료 추가
5. 종     료
행동을 선택하세요 (1~5) : 4

--------------------------------------
      추가할 음료명을 입력하세요
--------------------------------------
입력 >> juice
가격을 얼마로 설정하시겠습니까? : 700
[장 사 준 비]
1. 재고 보기
2. 재고 보충
3. 음료 제거
4. 음료 추가
5. 종     료
행동을 선택하세요 (1~5) : 1

----------------------------
    이름   재고     가격
----------------------------
   cider     10     1000
    coke     35     2000
   juice      0      700
   juice      0      700
----------------------------

[장 사 준 비]
1. 재고 보기
2. 재고 보충
3. 음료 제거
4. 음료 추가
5. 종     료
행동을 선택하세요 (1~5) : 2

--------------------------------------
어떤 음료의 재고를 조정하시겠습니까?
--------------------------------------
택1 >> cider   coke   juice   juice
입력 : juice
얼마나 조정하시겠습니까? : 10

[장 사 준 비]
1. 재고 보기
2. 재고 보충
3. 음료 제거
4. 음료 추가
5. 종     료
행동을 선택하세요 (1~5) : 3

--------------------------------------
      제거할 음료명을 입력하세요
--------------------------------------
입력 >> cider

[장 사 준 비]
1. 재고 보기
2. 재고 보충
3. 음료 제거
4. 음료 추가
5. 종     료
행동을 선택하세요 (1~5) : 1

----------------------------
    이름   재고     가격
----------------------------
    coke     35     2000
   juice     10      700
   juice     10      700
----------------------------

[장 사 준 비]
1. 재고 보기
2. 재고 보충
3. 음료 제거
4. 음료 추가
5. 종     료
행동을 선택하세요 (1~5) :
*/

class Seller
{	
	static ArrayList<String> productList = new ArrayList<String>();              // 가지고 있는 음료의 모든 목록
	static HashMap<String, Integer> stock = new HashMap<String, Integer>();       // 음료별 재고
	static HashMap<String, Integer> priceList = new HashMap<String, Integer>();   // 음료별 가격
	
	//완성 - 초기값 설정
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
		System.out.println("    이름   재고     가격");
		System.out.println("----------------------------");
		
		// 가지고 있는 음료와 재고 출력위한 Iterator 생성
		Iterator<String> it = productList.iterator();
		
		// 가지고 있는 음료를 출력
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
		System.out.println("어떤 음료의 재고를 조정하시겠습니까?");
		System.out.println("--------------------------------------");
		System.out.print("택1 >> ");
		Iterator<String> it = productList.iterator();

		while (it.hasNext())
		{
			System.out.print(it.next() + "   ");
		}
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String temp = sc.next();
		
		System.out.print("얼마나 조정하시겠습니까? : ");
		// 조정할 값을 입력받아 증감 후 다시 저장
		int temp2 = stock.get(temp) + sc.nextInt();
		stock.put(temp, temp2);
		System.out.println();
	}

	static void removeStock()
	{
		System.out.println("\n--------------------------------------");
		System.out.println("      제거할 음료명을 입력하세요");
		System.out.println("--------------------------------------");

		System.out.print("입력 >> ");
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();
		
		// 입력받은 음료수를 목록과 재고, 가격표에서 제거
		productList.remove(temp);
		stock.remove(temp);
		priceList.remove(temp);
		System.out.println();
	}

	static void addDrink()
	{
		System.out.println("\n--------------------------------------");
		System.out.println("      추가할 음료명을 입력하세요");
		System.out.println("--------------------------------------");
		
		System.out.print("입력 >> ");
		Scanner sc = new Scanner(System.in);
		String temp = sc.next();

		productList.add(temp);
		stock.put(temp, 0);
			
		System.out.print("가격을 얼마로 설정하시겠습니까? : ");
		int temp2 = sc.nextInt();
		// 가격표에 입력받은 음료와 가격 추가
		priceList.put(temp, temp2);
	}
	
	//완성
	static void exit()
	{
		System.out.println("\n종료합니다~");
		System.exit(-1);
	}
}

//완성
class Tester
{	
	int sel;
	
	//완성
	void menuDisp()
	{
		System.out.println("[장 사 준 비]");
		System.out.println("1. 재고 보기");
		System.out.println("2. 재고 보충");
		System.out.println("3. 음료 제거");
		System.out.println("4. 음료 추가");
		System.out.println("5. 종     료");
	}
	
	//완성
	void menuSelect()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("행동을 선택하세요 (1~5) : ");
		try
		{
			sel=sc.nextInt();
		}
		catch (NumberFormatException e)
		{
			sel = 0;
		}
	}
	
	//완성
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
			System.out.println("\n1~5 중에 선택해 주세요");
	}


}
//완성
public class Team2_Test1
{	
	//완성
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