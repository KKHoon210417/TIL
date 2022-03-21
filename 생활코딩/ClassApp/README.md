## API Documentation java

### API vs UI

- **UI** : User Interface로서 내가 만든 프로그램을 유저가 사용하게되면 UI라고 합니다.
- **API** : Application Programming Interface는 자바가 제공하는 문법을 응용해 시간의 순서에 따라 프로그램을 만든다는 뜻이고 이런 조작방식을 API라고 합니다. 즉, 프로그램을 만들기 위한 조작 방법을 의미합니다.

### API Documentation JAVA

- 자바에 내장된 API를 확인하고 싶다면 아래 링크에서 찾아서 확인할 수 있다.
    
    [https://docs.oracle.com/javase/7/docs/api/](https://docs.oracle.com/javase/7/docs/api/)
    
- **패키지** : 서로 연관된 클래스를 모아 묶어놓은 것 클래스의 경로에 혼잡을 방지합니다.
- **클래스** : 변수와 메서드의 집합

### 클래스

클래스는 변수와 메서드의 집합이므로 클래스를 가져다 쓰기 위해서는 클래스의 사용법을 알아야 합니다.

- 예)

```java
System.out.println(Math.PI) // Math 클래스의 PI라는 변수에 파이 값이 저장되어 있다.
System.out.println(Math.floor(1.6)) // Math 클래스의 floor()라는 메서드는 소수점을 내림해주는 기능을 갖고 있습니다.
```

### 인스턴스

인스턴스는 클래스를 하나의 독립된 상태로 복사한 것을 말합니다. 인스턴스는 아래와 같이 선언합니다.

```java
import java.io.PrintWriter;
import java.io.IOException;

PrintWriter p1 = new PrintWriter("result1.txt");
```

- 인스턴스는 주로 자주사용하거나 복잡한 메커니즘을 갖는 클래스를 사용해야할 때 사용합니다. 대게 생성자가 존재합니다.
- 그 외의 간단하거나 또는 일시적으로 사용하는 클래스는 Math.PI 처럼 사용할 수 있습니다. 대게 생성자가 존재하지 않습니다.

### 상속

상속이란 다른 클래스의 메서드나 기능을 가져다 쓰기 위해서 사용하는 것으로 대표적인 효용은 두가지가 있습니다.

- Extends
    
    내가 구현하지 않아도, 상속받는 클래스에 존재한다면 해당 메서드를 사용할 수 있습니다.
    
    ```java
    import java.io.PrintWriter;
    
    PrintWriter p1 = new PrintWriter("result1.txt");
    p1.toString() // 모든 클래스는 object라는 클래스를 상속받음으로 해당 클래스에서 구현하지 않더라도 사용할 수 있습니다.
    ```
    
- Override
    
    이미 상속받은 클래스에서 메서드를 구현했더라도 내가 해당 메서드를 수정해서 다시 선언할 수 있습니다.
    
    ```java
    import java.io.PrintWriter;
    
    PrintWriter p1 = new PrintWriter("result1.txt");
    p1.write("Hello"); 
    // 이미 상위 클래스 Writer에서 write메서드를 선언했지만, write 메서드를 수정하여 다시 선언했습니다. 해당 메서드는 PrintWriter에 write()메서드가 실행됩니다.
    ```
