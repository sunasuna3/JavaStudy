/*========================= 
   ■■■ 배열 ■■■ 
   - 배열의 기본적인 활용 
 ==========================*/ 
 //○과제 
 //사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아 
 //입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현한다. 
 //단, 배열을 활용하여 구현할 수 있도록 한다. 
 
 
 //실행 예) 
 //입력할 데이터의 갯수 : 10 
 //데이터 입력(공백 구분) : 45 92 75 13 2 65 25 63 90 17   
 //>>가장 큰 수 -> 92 
 //계속하려면 아무 키나 누르세요.... 
 
 
 
 
 import java.util.Scanner; 
 
 
 public class Test083 
 { 
 	public static void main(String[] args) 
 	{ 
 		Scanner sc =new Scanner(System.in); 

		int total; //--사용자에게 입력받을 변수
		
		System.out.print("입력할 데이터의 갯수 : ");   
		total = sc.nextInt();                    // total에 입력 받은 데이터 갯수 대입

		System.out.print("데이터 입력(공백 구분) : ");  

		int [] arr = new int[total];   //배열의 길이가 total인 int형 배열 선언
		for (int i=0;i<total ;i++ )   //반복문을 활용하여 사용자의 입력 데이터를 배열에 담아내기
		{
			arr [i] = sc.nextInt();
		}
		
		int max=0;   //최대값을 0으로 초기화

		for (int i=0; i<total ;i++ )  //반복문을 활용하여 배열에서 가장 큰 수 찾기
		{
			if (arr[i]>max)   // 최대값 보다 크면
			{
				max = arr[i]; //최대값에 대입한다.
			}
		}
		//가장 큰수 출력
		System.out.printf(">>가장 큰 수 -> %d\n",max);
 
 	} 
 } 

 //실행 결과
 /*
입력할 데이터의 갯수 : 10
데이터 입력(공백 구분) : 45 92 75 13 2 65 25 63 90 17
>>가장 큰 수 -> 92
계속하려면 아무 키나 누르십시오 . . .
 */
