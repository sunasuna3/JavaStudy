/*==============================
■■■ 컬렉션 (collection)■■■
===============================*/

//Set  -> hashSet, TreeSet
//- 순서 없음
//- 중복 허용하지 않는 구조(기본)

/*
○ TreeSet<E> 클래스
	
	java.util.TreeSet<E> 클래스는
	Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
	데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 된다.  (HashSet이 더 빠름 => TreeSet은 특별한 경우 아니면 사용 x)

*/
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

//VO -> Value Object
//DTO -> Data Transfer Object
//DAO -> Data Access Object

class GradeVO
{
	// 주요 속성 구성
	private String hak;
	private String name;
	private int kor,eng, mat;
	// 생성자 (사용자 정의 생성자 -> 매개변수 없는 생성자)
	GradeVO()
	{
	}

	// 생성자 (사용자 정의 생성자 -> 5개의 매개변수를 가진 생성자)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	//getter /setter 구성

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

	//추가 메소드 정의
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

		// 학번 기준
		//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());

		//총점 기준
		//return s1.getTot() - s2.getTot();  //s1 s2 위치 바꿔주면 내림차순

		//이름 기준
		return s1.getName().compareTo(s2.getName());     //- 학번은 숫자형식의 스트링  

	}
}




public class Test163
{
	public static void main(String[] args) 
	{

		//TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set=new TreeSet<String>();

		//TreeSet 자료구조 set에 요수 추가 -> add()
		set.add("포켓몬스터");
		set.add("디지몬");
		set.add("원피스");
		set.add("은하철도999");
		set.add("뽀로로");
		set.add("이누야샤");
		set.add("텔레토비");
		set.add("카드캡터채리");
		set.add("업");
		set.add("짱구는못말려");
		set.add("인사이드아웃");
		set.add("도라이몽");
		set.add("이상한나라의폴");
		set.add("니모를찾아서");

		//Iterator 를 활용하여 set 요소 전체 출력

		Iterator<String> it = set.iterator();

		while (it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println();
		//--==> 니모를찾아서 도라이몽 디지몬 뽀로로 업 원피스 은하철도999 이누야샤 이상한나라의폴 인사이드아웃 짱구는못말려 카드캡터채리 텔레토비 포켓몬스터

		//TreeSet 자료구조 인스턴스 생성
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();


		//TreeSet 자료구조 인스턴스 생성. 단, 학번 기준으로 정렬
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());


		set2.add(new GradeVO("16" ,"조수연",90,80,70));
		set2.add(new GradeVO("21" ,"윤희진",80,70,60));
		set2.add(new GradeVO("02" ,"한승원",100,100,100));
		set2.add(new GradeVO("24" ,"권홍비",12,23,34));
		set2.add(new GradeVO("10" ,"곽한얼",50,50,50));



		//set2 자료구조 전체 요소 출력
		Iterator<GradeVO> it2 =set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n",vo.getHak(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),vo.getTot());
		}
		System.out.println();









		
	}
}