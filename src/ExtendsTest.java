/**
 * 继承只要是覆盖了父类的方法，即使用父类接收子类，那么方法依旧是子类的实现
 * @author zhaoyongming
 *
 */

public class ExtendsTest {

	public static void main(String[] args) {
		B b=new B();
		A a=new A();
		System.out.println("A.a"+a.a);
		System.out.println("B.a"+b.a);
		fun(b);
	}
	public static void fun(A a){
		a.fun1();
		//System.out.println(a.a);
		//System.out.println(((B)a).b);
	}
}
class A
{
	public static final int a=5;
	public void fun1(){
		System.out.println("hello a fun1");
	}
	public void fun2(){
		System.out.println("helllo a fun2");
	}
}
class B extends A
{
	public static final int a=6;
	public static final int b=100;
	public void fun1(){
		System.out.println("hello b fun1");
		System.out.println(this.b);
	}
	public void fun2(){
		System.out.println("helllo b fun2");
	}
}