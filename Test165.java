/*==============================
■■■ 컬렉션 (collection)■■■
===============================*/

//Map - Hashtable , HashMap
// - java.util.Map 인터페이스 키(key)를 값(value)에 매핑하며,
//   동일한 키를 등록할 수 없고 유일해야 하며,
//   각 키는 한개의 값만을 매핑해야 한다.
//   즉, 하나의 키 값을 대응하는 하나의 값을 갖는 자료구조이다.

/*
○ HashMap<K,V>클래스

	- Hashtable 클래스와 마찬가지로 Map 인터페이스를 구현한
	  HashMap 클래스의 기능은 Hashtable 클래스와 동일하지만
	  Synchronozation  이 없기 때문에 동시성 문제가 없다면
	  (즉, 멀티 스레드 프로그램이 아닌 경우라면)
	  HashMap 을 사용하는 것이 성능을 향상시킬 수 있다.

	- 또한, HashMap은 Hashtable 과 다르게 null 을 허용한다.



*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

 

public class Test165
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//HashMap 자료구조 인스턴스 생성
		//HashMap<String,String> map = new HashMap<String,String>(); - 이것도 가능
		Map<String,String> map = new HashMap<String,String>();  //이것도 가능  (업캐스팅)
		
		//map 이라는 해시맵 자료구조에 요소 추가 -> put()
		map.put("드라마","SKY캐슬");
		map.put("영화","캡틴마블");
		map.put("만화","아기상어");

		//null 입력 시도
		map.put(null,null);
		map.put("소설",null);
		map.put(null,"절규");
		//--위의 데이터 입력 유형에 따라 모든 종류의 데이터 입력이 가능하지만
		//  마지막 null 을 key 로 매핑된 "절규" 가
		//  최소 null을 key로 매핑하는 null을 덮어쓰는 상황이 발생하게 된다.
		//  즉, HashMap은 null을 하나의 고유한 key 값으로 간주한다.(인식한다.)

		System.out.print("카테고리, 타이틀 입력(컴마 구분) : ");

		String[] temp;

		for (String str; (str=br.readLine()) !=null; )
		{
			temp = str.split(",");
			if (temp.length<2)
			{
				System.out.print("카테고리, 타이틀 입력(컴마 구분) [종료 Ctrl+z] : ");
				continue; //뒷부분 무시하고 계속해라 ↓
			}

			map.put(temp[0].trim(),temp[1].trim());
			System.out.println(map);
		}


	}
}