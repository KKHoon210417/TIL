class Print{
    public String delimiter;
    public String text;

    public Print(String delimiter, String text) {
        this.delimiter = delimiter;
        this.text = text;
    }

    public void print() {
        System.out.println(this.delimiter);
        System.out.println(this.text);
        System.out.println(this.text);
    }
}

public class MyOOP {

    public static void main(String[] srgs) {
        //..
        Print p1 = new Print("----", "a");
        p1.print();
        //..
        Print p2 = new Print("****", "b");
        p2.print();
        p1.print();
    }
}
