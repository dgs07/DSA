import java.util.Scanner;

public class longest_1s {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		String s=Integer.toBinaryString(a);
		int ans=0;
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			int temp=0;
			int zeros=0;
			for(int j=i;j<s.length();j++) {
				
				
				if (s.charAt(j)=='0') {
					temp+=1;
					zeros+=1;
				}
				if (zeros==2) {
					temp-=1;
					break;
				}
				if(s.charAt(j)=='1') {
					temp+=1;
				}
				
			}
			ans=Math.max(ans, temp);
		}
		System.out.println(ans);
		
	}

}
