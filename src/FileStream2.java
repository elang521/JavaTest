import java.io.*;

public class FileStream2 {
        public static void main(String srag[])
        {
                File f =new File("hello.txt");
                try{
                        FileWriter out= new FileWriter(f);
                        out.write("hello world");
                        out.close();
                }
                catch(Exception e){
                        System.out.println(e.getMessage());
                }

                try{
                        FileReader in =new FileReader(f);
                        char [] buf=new char[1024];
                        int len =in.read(buf);
                        System.out.println(new String(buf,0,len));
                }
                catch(Exception e){
                        System.out.println(e.getMessage());
                }
        }
}

