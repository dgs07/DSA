import java.util.*;

public class combinations {
	static Set<String> f = new TreeSet<>();
	static void fun(String s, String ans,int i) {
		if(i==s.length()) {
			if(ans=="") {
				return;
			}
			f.add(ans);
			return;
		}
		fun(s,ans+s.charAt(i),i+1);
		fun(s,ans,i+1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		fun(s,"",0);
		System.out.println(f);

	}

}
