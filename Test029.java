
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      // �ֿ� ���� ����
      int n;
      String strResult;

      // ���� �� ó��
      System.out.print("������ ���� �Է� : ");
      n = Integer.parseInt(br.readLine());

      strResult = n%400==0 ? "����" : ( ((n%4==0)&&(n%100!=0)) ? "����" : "���" );

      System.out.printf("%d�� �� %s\n",n,strResult);