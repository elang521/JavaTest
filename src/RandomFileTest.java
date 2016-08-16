import java.io.*;

public class RandomFileTest {
	public static void main(String args[]) throws Exception {
		Employee e1 = new Employee("zhangsan", 23);
		Employee e2 = new Employee("Lisi", 24);
		Employee e3 = new Employee("Wangwu", 25);
		RandomAccessFile ra = new RandomAccessFile("1.txt", "rw");
		ra.write(e1.name.getBytes());
		ra.writeInt(e1.age);
		ra.write(e2.name.getBytes());
		ra.writeInt(e2.age);
		ra.write(e3.name.getBytes());
		ra.writeInt(e3.age);
		ra.close();
		RandomAccessFile rb = new RandomAccessFile("1.txt", "rw");
		int len = 8;
		rb.skipBytes(12);// 跳过第一个员工信息
		System.out.println("position:" + rb.getFilePointer());
		System.out.println("第2个员工信息：");
		String str = "";
		for (int i = 0; i < len; i++) {
			str += (char) rb.readByte();
		}
		System.out.println("name:" + str);
		System.out.println("age:" + rb.readInt());
		rb.seek(0);
		System.out.println("position:" + rb.getFilePointer());
		System.out.println("第1个员工信息：");
		str = "";
		for (int i = 0; i < len; i++) {
			str += (char) rb.readByte();
		}
		System.out.println("name:" + str);
		System.out.println("age:" + rb.readInt());
		rb.seek(24);
		System.out.println("position:" + rb.getFilePointer());
		System.out.println("第3个员工信息：");
		str = "";
		for (int i = 0; i < len; i++) {
			str += (char) rb.readByte();
		}
		System.out.println("name:" + str);
		System.out.println("age:" + rb.readInt());
		rb.close();
	}
}

class Employee {
	String name;
	int age;
	final static int LEN = 8;

	public Employee(String name, int age) {
		if (name.length() > LEN)
			name = name.substring(0, 8);
		else {
			while (name.length() < LEN)
				name = name + "\u0000";
		}
		this.name = name;
		this.age = age;
	}
}
