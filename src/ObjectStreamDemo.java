import java.io.*;

/**
 * 对象的写入
 * @author elang
 *
 */
public class ObjectStreamDemo
{
	public static void main(String args[]) throws IOError, ClassNotFoundException, IOException
	{
		Student stu = new Student(19, "elang", 25, "huaxue");
		FileOutputStream fos = new FileOutputStream("file/mytext.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		try
		{
			os.writeObject(stu);
			os.close();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		stu = null;
		FileInputStream fis = new FileInputStream("file/mytext.txt");
		ObjectInputStream is = new ObjectInputStream(fis);
		try
		{
			stu = (Student) is.readObject();
			is.close();
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("ID:" + stu.id);
		System.out.println("name:" + stu.name);
		System.out.println("age:" + stu.age);
		System.out.println("department:" + stu.department);
	}
}
//写入的对象必须继承Serializable
class Student implements Serializable
{
	int id;
	String name;
	int age;
	String department;

	public Student(int id, String name, int age, String department)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
	}
}
