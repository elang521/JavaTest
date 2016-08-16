import java.net.URI;


public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="glory://host1:/vol1";
		URI uri = URI.create(str); 
		str=uri.getPath();
		System.out.println(str);
		String[] arr=str.split("/");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
