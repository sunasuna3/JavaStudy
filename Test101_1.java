import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test101_1
{
	public static void main(String[] arg)throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		//입력받은 주민번호
		String str;

		//곱해지는 수 배열 구성
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		//							   - check~!!


		//곱셈 연산 후 누적합
		int tot=0;

		//사용자에게 안내 메세지 출력 및 주민번호 입력받기
		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		str=br.readLine();
		
		if (str.length() !=14)
		{
			System.out.println(">>입력 오류~!!!!");
			return;
		}
		
		//확인
		//System.out.println(">>자릿수 적합~!!");

		for (int i=0; i<13; i++ )  //i -> 0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			if (i==6)
				continue;

			tot += chk[i] * Integer.parseInt(str.substring(i,(i+1)));
		}

		//--여기까지 수행하면 1 과 2를 모두 끝낸 상황이며
		//	규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 값은
		//	변수 tot에 담겨있는 상태가 된다.

		int su = 11 - tot % 11;
		
		//확인
		//System.out.println(su);  //--==> 11
		
		//최종 결과 출력 이저에 추가 연산 필요~!!!
		//-> su에 대한 연산 결과가 두자리로 나올 경우
		//	주민번호 마지막 자릿수와 비교할 수 없는 상황
		su =su%10; //su %= 10;

		//--여기까지 수해하면 3과 4를 모두 끝낸 상황이며
		//	최종 연산 결과는 변수 su에 담겨있는 상황이 된다.

		//최종 결과 출력
		if (su == Integer.parseInt(str.substring(13)))
		{
			System.out.println(">> 정확한 주민번호~!!!");
		}
		else
		{
			System.out.println(">> 잘못된 주민번호~!!!");
		}


	}
}