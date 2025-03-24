import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int[] req = new int[1000001];
	static int[] res = new int[1000001];
	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			req[i] = Integer.parseInt(st.nextToken());
			res[i] = -1;
		}

		for(int i = 0; i < N; i++) {
			while(!stack.isEmpty() && req[stack.peek()] < req[i]) {
				int idx = stack.pop();
				res[idx] = req[i];
			}
			stack.push(i);
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(res[i]);
			sb.append(" ");
		}
		System.out.println(sb);
	}
}