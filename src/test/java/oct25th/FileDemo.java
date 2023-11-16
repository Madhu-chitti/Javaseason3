package oct25th;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\Books\\abc.txt");
		f.createNewFile();
		System.out.println(f.createNewFile());
		System.out.println("End of programe");
	}

}
