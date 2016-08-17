import java.io.*;

/**
 * 挂载测试
 * @author elang
 *
 */
public class Cmd {

	public static void main(String[] args) throws IOException {
		String mgt_host = "host1";
		String vol = "vol1";
		String mountCommand = "mount -t gfs " + mgt_host + "/" + vol + " " + "/mnt" + vol;
		System.out.println(mountCommand);
		try {
			Process p = Runtime.getRuntime().exec(mountCommand);
			System.out.print(loadStream(p.getInputStream()));
			System.err.print(loadStream(p.getErrorStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static String loadStream(InputStream in) throws IOException {
		int ptr = 0;
		in = new BufferedInputStream(in);
		StringBuffer buffer = new StringBuffer();
		while ((ptr = in.read()) != -1) {
			buffer.append((char) ptr);
		}
		return buffer.toString();
	}
}
