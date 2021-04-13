
public class Main
{
public static int evenSum(int n) {
   if(n <= 1)
       return 0;

   else if (n % 2 == 0)
       return (n + evenSum(n - 1));
   else
       return evenSum(n - 1);
}
	public static void main(String[] args) {
	        final long startTime = System.nanoTime();

	    Main p = new Main();
	    p.evenSum(10);
		System.out.println(p.evenSum(10));
			final long duration = System.nanoTime() - startTime;
    System.out.println(duration);
	}


}