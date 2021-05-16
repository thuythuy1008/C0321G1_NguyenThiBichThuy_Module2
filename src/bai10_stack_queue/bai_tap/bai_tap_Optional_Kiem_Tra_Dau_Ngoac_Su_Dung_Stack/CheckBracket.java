package bai10_stack_queue.bai_tap.bai_tap_Optional_Kiem_Tra_Dau_Ngoac_Su_Dung_Stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    private static final char LEFT_BRACKET = '(';
    private static final char RIGHT_BRACKET = ')';

    public static boolean checkBracket(String str) {
        Stack<Character> stack = new Stack<>();
        if (str.isEmpty()) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char sym = str.charAt(i);
                if (sym == LEFT_BRACKET) {
                    stack.push(sym);
                } else if (sym == RIGHT_BRACKET) {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char left = stack.peek();
                        if (sym == RIGHT_BRACKET && left == LEFT_BRACKET) {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String string = in.nextLine();
        System.out.println(checkBracket(string));
    }
}
