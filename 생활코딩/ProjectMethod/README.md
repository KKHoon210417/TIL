## 메소드

- JAVA는 기본적으로 클래스를 실행시키면 main이라는 메소드를 찾아 실행시킵니다.
- 메소드는 반복되는 코드를 모아놓은 것이며 그 코드들의 목적을 알리는 역할을 합니다.
- 메소드를 이용해서 코드의 가독성을 획기적으로 증가시킬 수 있습니다.
- 입력
    - main의 (String[] args)는 args라는 문자열 배열의 입력을 받는다는 의미입니다. 사용자가 준비한 변수를 메인 메소드 안에서 사용할 수 있게됩니다.
    - 매개변수(parameter) : 매소드에 입력 받아야 하는 변수를 매개변수라고 합니다.
    - 인자(argument) : 매소드를 사용할 때 넣는 값을 인자라고 합니다.

```java
																// 매개변수, parameter
public static void printTwoTimes(String text, String dlimiter) {
        System.out.println(dlimiter);
        System.out.println(text);
        System.out.println(text);
    }

public static void main(String[] args) {
								// 인자, argument
	printTwoTimes("a", "-");
}
```

- 출력
    - void : 리턴값이 존재하지 않다는 의미입니다.
    - return을 쓰기 위해서는 void자리에 출력 타입을 지정해줘야합니다.
    - print를 내부적으로 쓰지 않고 return해준 값을 프린트하는 방식이 더 유용한 이유는 단순히 터미널창에 출력하는 것 뿐만 아니라 텍스트 쓰기와 같이 다른 상황에서도 동일한 동작을 하는 유연성 높은 메소드를 만들기 위해서 return값을 print하는 방식을 사용합니다.

    ```java
    public static String twoTimes(String text, String delimiter) {
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;
    }
    
    public static void main(String[] args) {
        System.out.println(twoTimes("a", "-"));
    }
    ```


### Access Level Modifiers

외부에서 접근할 수 있는 레벨을 정의하는 기능입니다.

- public : 모든 곳에서 사용(접근)할 수 있습니다.
- private : 같은 클래스 내에서만 사용(접근)할 수 있습니다.

### Static

- static - class method

  클래스의 소속

    ```java
    class Print{
      public static void c(String delimiter) {
          System.out.println(delimiter);
          System.out.println("b");
      }
    }
    
    public class StaticMethod {
    
        public static void main(String[] args) {
            Print.c("-");
    
    }
    ```

- no static - instance method

  인스턴스의 소속

    ```java
    class Print{
        public String delimiter;
        public void a() {
            System.out.println(this.delimiter);
            System.out.println("a");
        }
        public void b() {
            System.out.println(this.delimiter);
            System.out.println("b");
        }
    }
    
    public class StaticMethod {
    
        public static void main(String[] args) {
            // instance
            Print t1 = new Print();
            t1.delimiter = "-";
            t1.a();
            t1.b();
    
            Print t2 = new Print();
            t2.delimiter = "-";
            t2.a();
            t2.b();
        }
    }
    ```