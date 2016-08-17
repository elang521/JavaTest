package cn.elangReaderAndWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 写文件字符流测试
 * @author elang
 *
 */
public class FileWriterDemo
{

	public static void main(String[] args) throws IOException
	{
		//如果存在同名文件，直接覆盖
		FileWriter fw=new FileWriter("file/fileWriter.txt",true);
		fw.write("这是为什么呢？");
//		fw.flush();//刷新，刷新该流的缓冲，流缓冲中的数据清空，
		fw.write("\r\n不为什么");//windows中换行，换行需要加\r\n
		fw.close(); 
	}

}
