import java.util.*;
public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		if(r<0){
			System.out.println("Enter the positive value");
		}else {
			r = r%arr.length;
			System.out.println(r);
			for(int i=r; i<arr.length; i++) {
				System.out.print(arr[i]);
			}
			for(int i=0; i<r; i++) {
				System.out.print(arr[i]);
			}
		}
	}

}
