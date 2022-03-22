public class BooleanApp {
    public static void main(String[] args) {
        System.out.println("One"); // 문자열
        System.out.println(1); // 정수형

        System.out.println(true); // Boolean
        System.out.println(false);

        String foo = "Hello world";
        // true, false는 변수의 이름으로 사용할 수 없다. -> reserved word

        System.out.println(foo.contains("world")); // true
        System.out.println(foo.contains("kwanghun")); // false


    }
}
