public class StringType {
    public static void main(String[] args) {
        String name = "ja";
        int a = 3;

        System.out.println(name + a); // 문자열과 다른 타입을 결합할 경우 결과는 문자열로 나온다.

        System.out.println("----------------------");

        int age = 29;
        String bb = "김광훈";
        System.out.printf("age:%d, name:%s ", age, bb); // printf를 사용하면 %d를 이용해
        // %d 정수 형식으로 출력
        // %x 16진 정수의 형식으로 출력
        // %f 부동 소수점 형식으로 출력
        // %c char형식으로 출력
        // %s 문자열 형식으로 출력
    }
}
