package cn.elang.file;

import java.io.*;

public class FileDemo
{
	public static void main(String[] args)
	{
		File f = new File("1.txt");
		if (f.exists())
			f.delete();
		else
		{
			try
			{
				f.createNewFile();
			} catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println("File name:" + f.getName());
		System.out.println("File path:" + f.getPath());
		System.out.println("Abs path:" + f.getAbsolutePath());
		System.out.println("Parent:" + f.getParent());
		System.out.println(f.exists() ? "exists" : "does not exist");
		System.out.println(f.canWrite() ? "is writeable" : "is not writeable");
		System.out.println(f.canRead() ? "is readable" : "is not readable");
		System.out.println(f.isDirectory() ? "is " : "is not" + " a directory");
		System.out.println(f.isFile() ? "is normal file" : "might be a namedpipe");
		System.out.println(f.isAbsolute() ? "is absolute" : "is not absolute");
		System.out.println("File last modified:" + f.lastModified());
		System.out.println("File size:" + f.length() + " Bytes");
		System.out.println("URI: " + f.toURI());
	}
}
