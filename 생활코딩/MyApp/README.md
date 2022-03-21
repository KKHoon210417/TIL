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
