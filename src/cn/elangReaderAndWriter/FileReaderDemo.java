package cn.elangReaderAndWriter;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo
{

	public static void main(String[] args)
	{
		FileReader fr=null;
		try
		{
			fr= new FileReader("E:/workspace/IO/src/cn/elang/writer/fileWriter.txt");
			while(true)
			{
				int ch=fr.read();
				if(ch==-1)
					break;
				System.out.print((char)ch);
			}
//			char buf[]=new char[100];
//			
//			fr.read(buf,0,10);
//			fr.read(buf);
//			System.out.println(buf);
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{
			try
			{
				fr.close();
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}

}
