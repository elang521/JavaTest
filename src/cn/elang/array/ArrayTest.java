package cn.elang.array;

public class ArrayTest {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Fun a=new Fun();
		a.fun(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
}

class Fun{
	public  void fun(int []arr){
		int len=10;
		for(int i=0;i<len;i++){
			arr[i]=i;
		}
	}
}
