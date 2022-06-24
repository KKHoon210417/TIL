public class Ex3 {
    public static void main(String[] args) {
        int i = -10;
        i = +i;
        System.out.println(i); // -10 변화 없음

        i = -10;
        i = -i;
        System.out.println(i); // +10 -는 +로 +는 -로 변환
    }
}
