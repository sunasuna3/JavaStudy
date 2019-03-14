
import java.util.ArrayList ;
import java.util.Vector;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.Iterator;

public class Test1234
{
	public static void main(String[] args)
	{
		// ArrayList 자료구조 인스턴스 생성
		List<String> list = new ArrayList<String>();

		list.add("가");
		list.add("나");
		list.add("다");

		System.out.print(list + " ");

		ListIterator<String> it = list.listIterator();
		
		/*
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println("\n");
		while(it.hasPrevious())
		{
			System.out.print(it.previous() + " ");
		}
		System.out.println("\n");  */

		list.subList(0,1);

		System.out.print(list);




	}
}


