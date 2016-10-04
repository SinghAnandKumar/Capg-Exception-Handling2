//import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestStringMethod {

	@Test
	@Ignore
	public void test() {
		Assert.fail("Not yet implemented");
	}

	@Test
	public void testSomeStringMethods(){
		String msg = new String("Hello World !");
		String msg2 = "Hello World !"; //Interned String
		String msg3 = "Hello World !";

		Assert.assertEquals(msg, msg2);//checking value not reference
		Assert.assertSame(msg, msg3);
//		Assert.assertSame(msg2, msg3); 
		
//		msg = null;
		
		Assert.assertTrue(msg.length()>0);
	}
}
