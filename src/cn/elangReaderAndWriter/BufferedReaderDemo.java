package cn.elangReaderAndWriter;

import java.io.*;

public class BufferedReaderDemo
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader in= new BufferedReader(new FileReader("file/fileWriter.txt"));
		String line=null;
		while((line=in.readLine())!=null)
		{
			System.out.println(line);
		}
		in.close();

	}

}
