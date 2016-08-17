package cn.elangReaderAndWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 带缓冲区的字符流实现文件拷贝
 * @author elang
 *
 */
public class CopyTextByBuf
{

	public static void main(String[] args)
	{
		BufferedReader buffR=null;
		BufferedWriter buffW=null;
		try
		{
			buffR=new BufferedReader(new FileReader("file/source.txt"));
			buffW=new BufferedWriter(new FileWriter("file/target.txt",true));
		
			String line=null;
			while((line=buffR.readLine())!=null )
			{
				buffW.write(line);
				buffW.newLine();
				buffW.flush();
			}
		}
		catch(IOException e)
		{
			
		}
		finally {
			try
			{
				buffR.close();
				buffW.close();
			} catch (Exception e2)
			{
				
			}
		}
	}

}
