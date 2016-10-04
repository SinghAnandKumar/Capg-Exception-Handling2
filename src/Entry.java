import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Entry {
	public static void main(String[] args) throws FileNotFoundException {

		try {
			// setValue(70);
			saveValue(10);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (FileNotFoundException fne) {
			fne.printStackTrace();
		}

		System.out.println("End of main()...");
	}

	static public void setValue(int value) {
		System.out.println("Inside setValue()....");
		int ans = value / 0;

		System.out.println("End of setValue()...");
	}

	public static void saveValue(int value) throws FileNotFoundException {
		try {
			FileOutputStream fOut = new FileOutputStream("\\dev\\demos\\test.txt");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw (new FileNotFoundException());
		}
	}
}
