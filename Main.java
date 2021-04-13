
public class Main
{
	private static int evenSum(int n){
		return (n/2)*(1 + n/2);
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