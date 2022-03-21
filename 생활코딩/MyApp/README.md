## 나의 앱 만들기

### 구성

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/c000cbf7-e824-432b-a222-870bdd23de28/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220321%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220321T132625Z&X-Amz-Expires=86400&X-Amz-Signature=5f13539caddd7a7e3a39764869a24ab16bc3edbfc3d315fe0bdbc116ce607081&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### 변수를 선언하지 않고 작성했을 때

```java
System.out.println("Value of supply : "+ 10000.0);
System.out.println("VAT : "+ (10000.0*0.1));
System.out.println("Total : "+ (10000.0 + 10000.0*0.1));
System.out.println("Expense : "+ (10000.0*0.3));
System.out.println("Income : "+ (10000.0 - 10000.0*0.3));
System.out.println("Dividend : "+ (10000.0 - 10000.0*0.3) * 0.5);
System.out.println("Dividend : "+ (10000.0 - 10000.0*0.3) * 0.3);
System.out.println("Dividend : "+ (10000.0 - 10000.0*0.3) * 0.2);
```

### 변수 도입

```java
double valueOfSupply = 12345.0;
double vatRate = 0.1;
double expenseRate = 0.3;

double vat = valueOfSupply * vatRate;
double total = valueOfSupply + vat;
double expense = valueOfSupply * expenseRate;
double income = valueOfSupply - expense;
double dividend1 = income * 0.5;
double dividend2 = income * 0.3;
double dividend3 = income * 0.2;

System.out.println("Value of supply : "+ valueOfSupply);
System.out.println("VAT : "+ vat);
System.out.println("Total : "+ total);
System.out.println("Expense : "+ expense);
System.out.println("Income : "+ income);
System.out.println("Dividend : "+ dividend1);
System.out.println("Dividend : "+ dividend2);
System.out.println("Dividend : "+ dividend3);
```

### 입력값 도입

```java
double valueOfSupply = Double.parseDouble(args[0]);
```

### IF문

만일 10000.0원 이하의 수입이 들어온다면, 1번 수령자가 모든 돈을 수령한다면 아래와 같이 작성해서 해결할 수 있다.

```java
double dividend1;
double dividend2;
double dividend3;

if (income > 10000.0) {
    dividend1 = income * 0.5;
    dividend2 = income * 0.3;
    dividend3 = income * 0.2;
} else {
    dividend1 = income * 1.0;
    dividend2 = income * 0;
    dividend3 = income * 0;
}
```

### 배열

배열을 사용하면 성격이 비슷한 변수들을 정리할 수 있습니다.

- double[] : double 타입을 갖는 배열을 선언합니다.
- new double[3] : double 타입 3개의 수납상자를 갖는 배열을 선언합니다.

```java
double[] dividendRates = new double[3];
dividendRates[0] = 0.5;
dividendRates[1] = 0.3;
dividendRates[2] = 0.2;

double dividend1 = income * dividendRates[0];
double dividend2 = income * dividendRates[1];
double dividend3 = income * dividendRates[2];
```

### 반복문

반복문을 이용해 배열의 원소들을 적은 소스코드로 출력해줄 수 있습니다.

```java
int i = 0;
while(i < dividendRates.length) {
    System.out.println("Dividend : "+ (income * dividendRates[i]));
    i = i + 1;
}
```

### 메서드

- 메서드를 사용하면 다음과 같이 main안을 정리할 수 있습니다.
- 메서드는 서로 연관된 코드를 그룹핑 해서 이름 붙인 정리정돈 목적의 상자입니다.

```java
public class AccountingMethodApp {
    public static double valueOfSupply;
    public static double vatRate;
    public static double expenseRate;

    public static void main(String[] args) {
        expenseRate = 0.3;
        valueOfSupply = 10000.0;
        vatRate = 0.1;

        print();
    }

    private static double getIncome() {
        return valueOfSupply - getExpense();
    }

    private static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    private static void print() {
        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : "+ getVat());
        System.out.println("Total : "+ getTotal());
        System.out.println("Expense : "+ getExpense());
        System.out.println("Income : "+ getIncome());
        System.out.println("Dividend : "+ getDividend1());
        System.out.println("Dividend : "+ getDividend2());
        System.out.println("Dividend : "+ getDividend3());
    }

    private static double getDividend3() {
        return getIncome() * 0.2;
    }

    private static double getDividend2() {
        return getIncome() * 0.3;
    }

    private static double getDividend1() {
        return getIncome() * 0.5;
    }

    private static double getTotal() {
        return valueOfSupply + getVat();
    }

    private static double getVat() {
        return valueOfSupply * vatRate;
    }
}
```

### 클래스

클래스는 서로 연관된 메서드와 변수를 그룹핑한것이다. 

```java
class Accounting{
    public static double valueOfSupply;
    public static double vatRate;
    public static double expenseRate;

    private static double getIncome() {
        return valueOfSupply - getExpense();
    }

    private static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    public static void print() {
        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : "+ getVat());
        System.out.println("Total : "+ getTotal());
        System.out.println("Expense : "+ getExpense());
        System.out.println("Income : "+ getIncome());
        System.out.println("Dividend : "+ getDividend1());
        System.out.println("Dividend : "+ getDividend2());
        System.out.println("Dividend : "+ getDividend3());
    }

    private static double getDividend3() {
        return getIncome() * 0.2;
    }

    private static double getDividend2() {
        return getIncome() * 0.3;
    }

    private static double getDividend1() {
        return getIncome() * 0.5;
    }

    private static double getTotal() {
        return valueOfSupply + getVat();
    }

    private static double getVat() {
        return valueOfSupply * vatRate;
    }
}

public class AccountingClassApp {
    public static void main(String[] args) {
        Accounting.expenseRate = 0.3;
        Accounting.valueOfSupply = 10000.0;
        Accounting.vatRate = 0.1;
        Accounting.print();
    }
}
```

### 인스턴스

인스턴스는 하나의 클래스를 복제해서 서로 다른 데이터의 값과 서로 같은 메소드를 같는 복제본을 갖는 것 입니다.

- 인스턴스를 만드는 이유는 서로 다른 데이터를 갖는 동일한 동작을 해야할 필요가 있기 때문입니다.
- 인스턴스를 쓰기 위해서는 static을 없애야 합니다.

```java
class Accounting{
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;

    private double getIncome() {
        return valueOfSupply - getExpense();
    }

    private double getExpense() {
        return valueOfSupply * expenseRate;
    }

    public void print() {
        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : "+ getVat());
        System.out.println("Total : "+ getTotal());
        System.out.println("Expense : "+ getExpense());
        System.out.println("Income : "+ getIncome());
        System.out.println("Dividend : "+ getDividend1());
        System.out.println("Dividend : "+ getDividend2());
        System.out.println("Dividend : "+ getDividend3());
    }

    private double getDividend3() {
        return getIncome() * 0.2;
    }

    private double getDividend2() {
        return getIncome() * 0.3;
    }

    private double getDividend1() {
        return getIncome() * 0.5;
    }

    private double getTotal() {
        return valueOfSupply + getVat();
    }

    private double getVat() {
        return valueOfSupply * vatRate;
    }
}

public class AccountingClassApp {
    public static void main(String[] args) {
//        Accounting.expenseRate = 0.3;
//        Accounting.valueOfSupply = 10000.0;
//        Accounting.vatRate = 0.1;
//        Accounting.print();

        Accounting a1 = new Accounting();
        a1.valueOfSupply = 10000.0;
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();
        
        Accounting a2 = new Accounting();
        a2.valueOfSupply = 20000.0;
        a2.vatRate = 0.05;
        a2.expenseRate = 0.2;
        a2.print();
    }
}
```
