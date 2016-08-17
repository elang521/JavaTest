package cn.elang.file;
import java.io.*;

/**
 * 文件夹下的文件列表
 * @author elang
 *
 */
public class DirListDemo {
	public static void main(String[] args) {
		try {
			File path = new File("file");
			String[] list;
			if (args.length == 0)
				list = path.list();
			else
				list = path.list(new DirFilter(args[0]));
			for (int i = 0; i < list.length; i++)
				System.out.println(list[i]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class DirFilter implements FilenameFilter {
	String afn;

	DirFilter(String afn) {
		this.afn = afn;
	}

	public boolean accept(File dir, String name) {
		String f = new File(name).getName();
		return f.indexOf(afn) != -1;
	}
}