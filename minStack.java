import java.util.*;
class MyStack{
	Stack<Integer> s;
	int minEle;

//constructor
MyStack(){
	s = new Stack<Integer>();
}
// get min method
void getMin() {
	if(s.isEmpty()) {
		System.out.println("stack is empty");
	}else {
		System.out.println(minEle);
	}
}
void peek() {
	if(s.isEmpty()) {
		System.out.println("stack is empty");
		return;
	}
	int t = s.peek();
	System.out.println("Top most element ");
	if(t<minEle) {
		System.out.println(minEle);
	}else {
		System.out.println(t);
	}
}
void pop() {
	if(s.isEmpty()) {
		System.out.println("stack is empty");
	}
	int t = s.pop();
	System.out.println("Top most removed element ");
	if(t<minEle) {
		System.out.println(minEle);
		minEle = 2*minEle - t;
	}else {
		System.out.println(t);
	}
}
void push(int x) {
	if(s.isEmpty()) {
		minEle = x;
		s.push(x);
		System.out.println(x);//inserted number
		return;
	}
	
	if(x<minEle) {
		s.push(2*x-minEle);
		minEle = x;
	}else {
		s.push(x);
	}
	System.out.println("inserted number"+x);
}
}
public class minStack {

	public static void main(String[] args) {
		MyStack s = new MyStack();
		Scanner sc = new Scanner(System.in);
        int choice = -1;
        do{
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. getMin");
            System.out.println("5. exit");
            
            System.out.println("Enter choice");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the number to push: ");
                    int num = sc.nextInt();
                    s.push(num);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.getMin();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }while(choice!=5);

	}

}
