import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // nextInt() : 정수를 입력받는다.
        System.out.println(input);
        // 변환
        int num = Integer.parseInt(input);
        System.out.println(num);
    }
}
