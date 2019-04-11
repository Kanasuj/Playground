import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.print(sum_numbers(n));
	}
  public static int sum_numbers(int x)
  {
    int sum=0;
    for(int i=1;i<=x;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
}