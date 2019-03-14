/*==============================
���� �÷��� (collection)����
===============================*/

//Set  -> hashSet, TreeSet
//- ���� ����
//- �ߺ� ������� �ʴ� ����(�⺻)

/*
�� TreeSet<E> Ŭ����
	
	java.util.TreeSet<E> Ŭ������
	Set �������̽��� ����� SortedSet �������̽��� ������ Ŭ������
	�����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ������ �ȴ�.  (HashSet�� �� ���� => TreeSet�� Ư���� ��� �ƴϸ� ��� x)

*/
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

//VO -> Value Object
//DTO -> Data Transfer Object
//DAO -> Data Access Object

class GradeVO
{
	// �ֿ� �Ӽ� ����
	private String hak;
	private String name;
	private int kor,eng, mat;
	// ������ (����� ���� ������ -> �Ű����� ���� ������)
	GradeVO()
	{
	}

	// ������ (����� ���� ������ -> 5���� �Ű������� ���� ������)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	//getter /setter ����

	public String getHak()
	{
		return hak;
	}
	public void setHak(String hak)
	{
		this.hak=hak;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}

	public int getKor()
	{
		return kor;
	}
	public void setKor(int kor)
	{
		this.kor=kor;
	}

	public int getEng()
	{
		return eng;
	}
	public void setEng(int eng)
	{
		this.eng=eng;
	}

	public int getMat()
	{
		return mat;
	}
	public void setMat(int mat)
	{
		this.mat=mat;
	}

	//�߰� �޼ҵ� ����
	int getTot()
	{
		return kor+eng+mat;
	}

}




class MyComparator<T> implements Comparator<T> 
{
	@Override
	public int compare(T o1, T o2) 
	{
		GradeVO s1 =(GradeVO)o1;
		GradeVO s2 =(GradeVO)o2;

		// �й� ����
		//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());

		//���� ����
		//return s1.getTot() - s2.getTot();  //s1 s2 ��ġ �ٲ��ָ� ��������

		//�̸� ����
		return s1.getName().compareTo(s2.getName());     //- �й��� ���������� ��Ʈ��  

	}
}




public class Test163
{
	public static void main(String[] args) 
	{

		//TreeSet �ڷᱸ�� �ν��Ͻ� ����
		TreeSet<String> set=new TreeSet<String>();

		//TreeSet �ڷᱸ�� set�� ��� �߰� -> add()
		set.add("���ϸ���");
		set.add("������");
		set.add("���ǽ�");
		set.add("����ö��999");
		set.add("�Ƿη�");
		set.add("�̴��߻�");
		set.add("�ڷ����");
		set.add("ī��ĸ��ä��");
		set.add("��");
		set.add("¯���¸�����");
		set.add("�λ��̵�ƿ�");
		set.add("�����̸�");
		set.add("�̻��ѳ�������");
		set.add("�ϸ�ã�Ƽ�");

		//Iterator �� Ȱ���Ͽ� set ��� ��ü ���

		Iterator<String> it = set.iterator();

		while (it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println();
		//--==> �ϸ�ã�Ƽ� �����̸� ������ �Ƿη� �� ���ǽ� ����ö��999 �̴��߻� �̻��ѳ������� �λ��̵�ƿ� ¯���¸����� ī��ĸ��ä�� �ڷ���� ���ϸ���

		//TreeSet �ڷᱸ�� �ν��Ͻ� ����
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();


		//TreeSet �ڷᱸ�� �ν��Ͻ� ����. ��, �й� �������� ����
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());


		set2.add(new GradeVO("16" ,"������",90,80,70));
		set2.add(new GradeVO("21" ,"������",80,70,60));
		set2.add(new GradeVO("02" ,"�ѽ¿�",100,100,100));
		set2.add(new GradeVO("24" ,"��ȫ��",12,23,34));
		set2.add(new GradeVO("10" ,"���Ѿ�",50,50,50));



		//set2 �ڷᱸ�� ��ü ��� ���
		Iterator<GradeVO> it2 =set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n",vo.getHak(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),vo.getTot());
		}
		System.out.println();









		
	}
}