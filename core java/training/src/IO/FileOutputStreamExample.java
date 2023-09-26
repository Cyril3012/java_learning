package IO;

/*
 *  1--> write file using write only Char
 *  2--> write string using getBytes 
 *  3--> read using read and print using char
 *  
 *  (read,write,close)
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\testout.txt");// it will override the file if already
																			// exist
			fout.write(65);
			String s = ": Welcome to javaTpoint.";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
			FileInputStream fin = new FileInputStream("D:\\testout.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();

			System.out.println("\nsuccess...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}