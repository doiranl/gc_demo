package nokia.gated_commit;

/**
 * Hello world!
 *
 */
public class App 
{
	public int addNumbers(int a, int b) {
		return a - b;
	}
	
    public static void main( String[] args )
    {
    	App a = new App();
        System.out.println(a.addNumbers(6, 4));
    }
}
