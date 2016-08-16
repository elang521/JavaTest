import java.io.*;

public class FileStream {
	public static void main(String args[]) {
		File f = new File("hello.txt");
		try {
			FileOutputStream out = new FileOutputStream(f);
			byte buf[] = "hello world".getBytes();
			out.write(buf);
			out.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			FileInputStream in = new FileInputStream(f);
			byte[] buf = new byte[1024];
			int len = in.read(buf);
			System.out.println("len:" + len);
			System.out.println(new String(buf, 0, len));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		f.delete();
	}
}
