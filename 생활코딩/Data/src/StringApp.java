public class StringApp {
    public static void main(String[] args) {
        // Character VS String
        System.out.println("Hello World"); // String
        System.out.println('H'); // Character Java에서는 ''는 Character를 나타냅니다.

        System.out.println("Hello " +
                "world"); // 소스 코드 상 줄바꿈일 때는, 이처럼 코드를 작성해야한다.

        // new line
        System.out.println("Hello \nWorld");
        // escape
        System.out.println("Hello \"World\""); // Hello "World"

    }
}
