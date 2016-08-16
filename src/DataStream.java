import java.io.*;

public class DataStream {

	public static void main(String[] args) {
		try{
			FileOutputStream fos=new FileOutputStream("hello.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			DataOutputStream dos=new DataOutputStream(bos);
			dos.writeUTF("ab 中国");
			dos.writeBytes("ab 中国");
			dos.writeChars("ab 中国");
			dos.close();
			FileInputStream fis=new FileInputStream("hello.txt");
			BufferedInputStream bis=new BufferedInputStream(fis);
			DataInputStream dis=new DataInputStream(bis);
			System.out.println(dis.readUTF());
			byte []buf=new byte[1024];
			int len=dis.read(buf);
			System.out.println(new String(buf,0,len));
			fis.close();
			
		}catch(Exception e){
			
		}

	}

}
