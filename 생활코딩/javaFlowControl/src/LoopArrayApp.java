public class LoopArrayApp {
    public static void main(String[] args) {
        String[] users = new String[3];
        users[0] = "foo";
        users[1] = "joo";
        users[2] = "row";

        for(int i=0; i< users.length; i++) {
            System.out.println("<li>"+users[i]+"</li>");
        }
    }
}