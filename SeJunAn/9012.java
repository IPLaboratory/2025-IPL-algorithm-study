import java.util.Scanner;
import java.util.Stack;

public class test12312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cn = sc.nextInt(); 
        sc.nextLine(); 
        
        for (int i = 0; i < cn; i++) {
            String check = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean distinction = true; 

            for (int j = 0; j < check.length(); j++) {
                char ch = check.charAt(j);

                if (ch == '(') {
                    stack.push(ch); 
                } else {
                    if (stack.isEmpty()) {
                    	distinction = false; 
                        break; 
                    }
                    stack.pop(); 
                }
            }

            if (!stack.isEmpty()) {
            	distinction = false;
            }

            if (distinction) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close(); 
    }
}