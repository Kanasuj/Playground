import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int c,fact=1;
      if(n<0)
        System.out.println("Number should be non-negative");
      else
      {
        for(c=1;c<=n;c++)
          fact=fact*c;
      System.out.println(fact);
      }                    
    }
}