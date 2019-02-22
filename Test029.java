
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      // 주요 변수 선언
      int n;
      String strResult;

      // 연산 및 처리
      System.out.print("임의의 연도 입력 : ");
      n = Integer.parseInt(br.readLine());

      strResult = n%400==0 ? "윤년" : ( ((n%4==0)&&(n%100!=0)) ? "윤년" : "평년" );

      System.out.printf("%d년 → %s\n",n,strResult);