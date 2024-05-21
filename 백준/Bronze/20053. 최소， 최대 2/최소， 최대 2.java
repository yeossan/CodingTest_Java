import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 개수를 입력 받음

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // 정수의 개수를 입력 받음
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }


            int min = arr[0];
            int max = arr[0];


            for (int i = 1; i < N; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
                if (max < arr[i]) {
                    max = arr[i];
                }
            }

            System.out.println(min + " " + max);
        }
        sc.close();
    }
}
