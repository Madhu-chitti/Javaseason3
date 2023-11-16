package oct25th;

import java.io.File;

public class FolderDemo1 {

	public static void main(String[] args) {
		File folder = new File("D:\\Books\\day25");
		System.out.println(folder.mkdir());
		System.out.println("End of programe");
	}

}
