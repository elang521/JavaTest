package cn.elang.array;

import java.io.*;
/**
 * 字节数组
 * @author elang
 *
 */
public class ByteArray
{
	public static void main(String args[])
	{
		String tmp = "abcdefghijklmnopqrstuvwxyz";
		byte[] src = tmp.getBytes(); //
		ByteArrayInputStream input = new ByteArrayInputStream(src);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		new ByteArray().transform(input, output);
		byte[] result = output.toByteArray();
		System.out.println(new String(result));
	}

	// 转换成大写
	public void transform(InputStream input, OutputStream output)
	{
		int c = 0;
		try
		{
			while ((c = input.read()) != -1)
			{
				int C = (int) Character.toUpperCase((char) c);
				output.write(C);
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
