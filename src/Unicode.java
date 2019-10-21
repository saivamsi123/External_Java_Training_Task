
public class Unicode {

	private static final int start = 0;
	private static final int last = 65536;
	
	public static void display() {
		int i = start;
		for(;i<=last;i++)
		{
			System.out.println((char)i);
		}
	}
	public static void main(String[] args) {
		Unicode.display();
		
	}

}
