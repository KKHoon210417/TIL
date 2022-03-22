public class ArrayApp {
    public static void main(String[] args) {

        // foo, joo, row
        String[] users = new String[3];
        users[0] = "foo";
        users[1] = "joo";
        users[2] = "row";

        System.out.println(users[1]);
        System.out.println(users.length);

        int[] scores = {10, 100, 100};
        System.out.println(scores[1]);
        System.out.println(scores.length);

    }
}
