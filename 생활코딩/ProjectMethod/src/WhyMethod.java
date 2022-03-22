public class WhyMethod {
    public static void printTwoTimes(String text, String dlimiter) {

        System.out.println(dlimiter);
        System.out.println(text);
        System.out.println(text);
    }

    public static String twoTimes(String text, String delimiter) {
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;
    }

    public static void main(String[] args) {

        printTwoTimes("A", "-");
        // 10000000
        printTwoTimes("B", "*");
        // 10000000
        printTwoTimes("C", "&");
        System.out.println(twoTimes("a", "-"));

    }
}