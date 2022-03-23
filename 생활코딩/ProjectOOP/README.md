## 객체지향프로그래밍

- 절차지향프로그래밍 : 함수(메소드)를 이용해서 프로그래밍을 정리 정돈하는 프로그래밍 방법론

  예) C언어

- 객체지향프로그래밍 : 클래스를 기준으로프로그램의 구조를 만들어가는 방법론
- 클래스와 인스턴스
    - 클래스를 썼을 경우(static) 클래스 내부의 변수에 값을 직접 저장하기 때문에 클래스를 여러 용도로 사용하기 위해서는 매번 변수를 용도에 맞게 넣어줘야한다.
    - 하지만, 인스턴스를 사용할 경우(no static) 클래스와 메소드는 동일한 복제된 클래스를 가져다 사용하기 때문에 여러 용도에 맞는 인스턴스를 여러 개 생성할 수 있고, 해당 인스턴스에 용도에 맞는 변수값을 저장해놓고 해당 인스턴스가 필요할 때마다 사용할 수 있게 됩니다.
- Static vs No Static

  static은 클래스를 가리키는 것이고, static이 없다는 것은 인스턴스를 가리키는 것입니다.

    - 클래스 변수에 static을 선언하는 경우

      같은 클래스 내 메소드에서 호출이 가능하고 다른 클래스에서도 호출이 가능합니다.

    - 클래스 변수에 static을 선언하지 않는 경우

      같은 클래스 내 static을 선언한 메소드에서 호출이 불가능하고 다른 클래스에서 인스턴스로 만든 경우에만 호출이 가능합니다.

    - 클래스 메소드에 static을 선언하는 경우

      다른 클래스에서 호출이 가능합니다.

    - 클래스 메소드에 static을 선언하지 않는 경우

      다른 클래스에서 인스턴스로 만든 경우에만 호출이 가능합니다.

    - 인스턴스와 static 정리

      인스턴스를 만들게되면, 클래스의 해당 인스턴스가 복제되는 것으로 각각의 인스턴스와 클래스에서 독립적으로 존재하지만, static의 경우 인스턴스를 만들더라도 각각의 인스턴스가 클래스를 참조하기 때문에 각 인스턴스 또는 클래스에서 해당 변수의 값이 변경되면 모든 인스턴스 클래스에서 그 값이 변경됩니다. 반면에 static이 없는 독립족으로 존재하는 경우에는 하나의 인스턴스의  변수 값이 변경되더라도 다른 인스턴스 또는 클래스에는 아무런 영향을 미치지 않습니다.


    ```java
    class Foo{
        public static String classVar = "I class var";
        public String instanceVar = "I instance var";
    
        public static void classMethod() {
            System.out.println(classVar); // OK
    //        System.out.println(instanceVar); // Error
        }
        public void instanceMethod() {
            System.out.println(classVar); // OK
            System.out.println(instanceVar); // OK
        }
    }
    public class StaticApp {
        public static void main(String[] args) {
            System.out.println(Foo.classVar); // OK
    //        System.out.println(Foo.instanceVar); // Error
            Foo.classMethod(); // OK
    //        Foo.instanceMethod(); // Error
    
            Foo f1 = new Foo();
            Foo f2 = new Foo();
    
            System.out.println(f1.classVar); // I class var
            System.out.println(f1.instanceVar); // I instance var
    
            f1.classVar = "changed by f1";
            System.out.println(Foo.classVar); // changed by f1
            System.out.println(f2.classVar); // changed by f1
    
            f1.instanceVar = "changed by f1";
            System.out.println(f1. instanceVar); // changed by f1
            System.out.println(f2.instanceVar); // I instance var
        }
    }
    ```


- 생성자 : 생성될 때 주입해야할 값을 넣어주는 함수입니다.
- this : 생성한 인스턴스를 가르킵니다.

```java
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
```

- 응용

```java
class Accounting{
    // 공급가액
    public double valueOfSupply;
    // 부가가치세율
    public static double vatRate = 0.1;
		// 생성자
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
```