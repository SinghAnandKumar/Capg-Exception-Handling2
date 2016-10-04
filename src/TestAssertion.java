
public class TestAssertion {
	public static void main(String[] args) {
		int dist = 90;
		System.out.println("logic .. ");
		
		assert dist>0;
		
		System.out.println("logic .. ");
		
		dist = -10;
				
		assert dist>0 : "distance is -ve value";
		
		System.out.println("End of main");
	}
}
