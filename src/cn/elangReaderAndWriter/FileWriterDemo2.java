package cn.elangReaderAndWriter;

import java.io.FileWriter;
import java.io.IOException;
/**
 * 写文件
 * @author elang
 *
 */
public class FileWriterDemo2
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = null;
		try
		{
			// 如果存在同名文件，直接覆盖
			fw = new FileWriter("M:/workspace/IO/src/cn/elang/writer/fileWriter2.txt");
			fw.write("这是为什么呢");
			fw.close();
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		} 
		finally
		{
			try
			{
				if (fw!= null)
				{
					fw.close();
				}
			} 
			catch (IOException e)
			{
				System.out.println(e.getMessage());
			}
		}

	}
}
