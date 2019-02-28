/*====================================
■■■ 주민등록번호 유효성 검사 ■■■
====================================*/

/*
○ 주민등록번호 검증 공식

	1. 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

	  123456-1234567(-> 주민번호)
	  ****** ******
	  234567 892345 (->각 자리에 곱해질 수)

	2. 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.
	
	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * * * 
		2 3 4 5 6 7   8 9 2 3 4 5
		---------------------------
	-> 14+15+0+30+6+35+8+72+12+6+4+15 

		==217

	3. 더해진 결과물을 11로 나누어 『나머지』를 구한다.
		 19   -> 몫
	   ---------
	11 | 217
		 11
	   ---------
	     107
		  99      
	   ---------
	   	   8  -> 나머지
   132%11 
	4. 11에서 나머지를 뺀 결과값을 구한다.
		11-8 
		
	5. 4번째에서 처리한 연산 결과가 주민번호를 구성하는 마지막 숫자와 일치하는지 비교한다.
	   11-8  연산결과 3  == 주민번호 마지막 숫자 3
						 일치

	※ 마지막 숫자와 같은 경우 유효한 주민등록번호 
*/


//실행 예)
//주민번호 입력(xxxxxx-xxxxxxx) : 123456-12345678 -> 입력갯수 초과
//>>입력오류~!!!

//주민번호 입력(xxxxxx-xxxxxxx) : 123456-123456  -> 입력갯수 부족
//>>입력오류~!!!

//주민번호 입력(xxxxxx-xxxxxxx) : 750615-1252085 -> 유효한 주민번호
//>> 정확한 주민번호~~!!

//주민번호 입력(xxxxxx-xxxxxxx) : 750615-1252086 -> 유효하지 않은 주민번호
//>> 잘못된 주민번호~!!!

//※문자열.length() -> 문자열의 길이 반환
//	문자열.substring()  -> 문자열 추출

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test101
{
	public static void main(String[] arg)throws IOException
	{
		//테스트

		//String strTemp = "동해물과백두산이 마르고닳도록";
		//System.out.println(strTemp.length());

		//테스트
		//System.out.println("남산위의 저 소나무".length());

		//테스트
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3,4));
		//--==> de

		//테스트
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3,50));
		//--==> StringIndexOutOfBoundsException 오류 발생

		//테스트
		//System.out.println("봄이오니졸려죽겠네".substirng(4,9));
		//--==>졸려죽겠네
		
		//테스트
		//System.out.println("졸려도좀참자".substring(3));
		//System.out.println("졸려도좀참자".substring(3,"졸려도좀참자".length()));
		//--==>좀참자
		
		String num;
	
		int q=0;
		int a=0;
		int r=0;

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		num=br.readLine();

		if (num.length()<14 || num.length()>14)
		{
			System.out.println(">>입력오류~!!!");	
		}
		
		int[] arr2 ={2,3,4,5,6,7,8,9,2,3,4,5};

		String [] arr = new String [num.length()];

		int[] arr3 =new int[13];
		for (int i=0,j=0; i<num.length(); i++,j++ )
		{
			if (i!=6)
			{
				arr3[j] = Integer.parseInt(num.substring(i,i+1));     //스트링배열을 
			}
			else
			j--;	
			
		}

	
		for (int i=0; i<arr2.length; i++ )
		{
			q += arr3[i] * arr2[i];		
		}
		


		a = 11- (q%11);

		//System.out.println(a);
			if (a==10 || a==11)
			{
				r=a%10;

				
			}
			else{
				r=a;

				
			}

		
		if (r==arr3[(arr3.length)-1])
		{
			
			System.out.println(">> 정확한 주민번호~~!!");

		}
		else{
			
			System.out.println(">> 잘못된 주민번호~!!!");

		}

		



		

		






		




		
		
	

		

		

		
	
		







	}
}

//234567 892345