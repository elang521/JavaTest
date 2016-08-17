import java.io.*;

public class PipeStreamDemo {
	public static void main(String args[])
	{
		try{
			Sender sender=new Sender();
			Receiver receiver=new Receiver();
			PipedOutputStream out =sender.getOutputStream();
			PipedInputStream in=receiver.getInputStream();
			out.connect(in);
			sender.run();
			receiver.run();
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}

class Sender extends Thread {
	private PipedOutputStream out = new PipedOutputStream();

	public PipedOutputStream getOutputStream() {
		return out;
	}

	public void run() {
		String s = new String("hello reciver,how are you");
		try {
			out.write(s.getBytes());
			out.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class Receiver extends Thread{
	private PipedInputStream in =new PipedInputStream();
	public PipedInputStream getInputStream(){
		return in;
	}
	public void run(){
		String s=null;
		byte []buf = new byte[1024];
		try{
			int len=in.read(buf);
			s = new String(buf,0,len);
			System.out.println("message\n"+s);
			in.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}