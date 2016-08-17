import java.net.URI;

/**
 *  分隔符测试
 * @author elang
 *
 */
public class Split {

	public static void main(String[] args) {
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
