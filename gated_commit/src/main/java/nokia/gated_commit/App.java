package nokia.gated_commit;


public class App 
{
	public int addNumbers(int a, int b) {
		return a + b;
	}
	
	public int multiplyNumbers(int x, int y) {
		return x * y;
	}
	
    public static void main( String[] args )
    {
    	App a = new App();
        System.out.println(a.addNumbers(6, 4));
    }
}
