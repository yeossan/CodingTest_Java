import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();

		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < S.length(); i++) {
                    switch (S.charAt(i)) {
                        case '<':
                            while(!stack.isEmpty()) sb.append(stack.pop());
                            while(S.charAt(i) != '>') sb.append(S.charAt(i++));
                            sb.append('>');
                            break;
                        case ' ':
                            while(!stack.isEmpty()) sb.append(stack.pop());
                            sb.append(' ');
                            break;
                        default:
                            stack.push(S.charAt(i));
                            break;
                    }
		}
		while(!stack.isEmpty()) sb.append(stack.pop());
		System.out.println(sb);
	}
}