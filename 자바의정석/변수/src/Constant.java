public class Constant {
    public static void main(String[] args) {
        final int MAX_SPEED = 10; // 불변하는 상수의 경우 final과 함께 대문자로 변수를 표기합니다.
        // MAX_SPEED = 20; // final로 선언한 변수의 경우 초기 값을 수정하는 것은 불가능하다.

        // 변수 : 하나의 값을 저장하기 위한 공간
        // 상수 : 값을 한번만 저장할 수 있는 공간
        // 리터럴 : 그 자체로 값을 의미하는 것

        // 접미사
        int octNum = 010; // 8진수를 표기할때는 앞에 0을 붙인다.
        System.out.println(octNum);

        int hexNum = 0x10; // 16진수를 표기할때는 앞에 0x를 붙인다.
        System.out.println(hexNum);

        long big = 100_000_000L; // 정수형 리터럴의 경우 _를 이용해서 편하게 읽을 수 있다.
        long hex = 0xFFFF_FFFF_FFFFL;
        System.out.println(big + ", " + hex);

        float pi = 3.14f; // 실수형 float는 f를 붙여준다.
        double rate = 1.618d; // 실수형 double은 d를 붙여준다.
        System.out.println(pi + ", " + rate);

    }
}
