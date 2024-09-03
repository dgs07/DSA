import java.util.*;

public class stockSpan {
    
    static void CalSpan(int price[], int l, int S[]) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        S[0] = 1;
        for(int i = 0; i < l; i++) {
            while(!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            S[i] = st.isEmpty() ? (i+1) : (i - st.peek());
            st.push(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int l = sc.nextInt(); 

        int[] price = new int[l];
        int S[] = new int[l]; 
        
        System.out.println("Enter the stock prices for each day:");
        for (int i = 0; i < l; i++) {
            price[i] = sc.nextInt();
        }

        CalSpan(price, l, S); 

        System.out.println(Arrays.toString(S)); 
    }
}


