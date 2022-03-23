class Accounting{
    // 공급가액
    public double valueOfSupply;
    // 부가가치세율
    public double vatRate = 0.1;

    public Accounting(double valueOfSupply) {
        this.valueOfSupply = valueOfSupply;
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {
    public static void main(String[] args) {
        Accounting v1 = new Accounting(10000.0);
        Accounting v2 = new Accounting(20000.0);

        System.out.println("Value of supply : " + v1.valueOfSupply);
        System.out.println("Value of supply : " + v2.valueOfSupply);

        System.out.println("VAT : " + v1.getVAT());
        System.out.println("VAT : " + v2.getVAT());

        System.out.println("Total : " + v1.getTotal());
        System.out.println("Total : " + v2.getTotal());
    }
}