# Data

### 데이터 타입

- String : 문자열

```java
System.out.println("Six"); // String
System.out.println("6"); // String 6
System.out.println("6" + "6"); // Stirng 66
System.out.println("1111".length()); // 문자열 길이 출력
//        System.out.println("6" * "6");  // Fail
```

- Number : 숫자

```java
System.out.println(6); // Number
System.out.println("6"); // String 6
System.out.println(6 + 6); // 12
System.out.println(6 * 6); // 36
//        System.out.println(1111.length()); Fail
```

- 문자열과 숫자는 서로 혼용해서 연산할 수 없습니다.

### 숫자와 연산

- Operator(연산자)

```java
System.out.println(6 + 2); // 8
System.out.println(6 - 2); // 4
System.out.println(6 * 2); // 12
System.out.println(6 / 2); // 3
```

- Math
    - Math.PI : 파이를 출력한다.
    - Math.floor() : 소수점을 내림한다.
    - Math.ceil() : 소수점을 올림한다.

```java
System.out.println(Math.PI); // 3.141592653589793...
System.out.println(Math.floor(Math.PI)); // 3.0
System.out.println(Math.ceil(Math.PI)); // 4.0
```

### 문자열

- 문자열은 “ ”로 구분하고, Character는 ‘ ‘로 구분합니다.

```java
System.out.println("Hello World"); // String
System.out.println('H'); // Character Java에서는 ''는 Character를 나타냅니다.
```

- 문자의 줄을 바꾸기 위해서는 \n을 사용합니다.

```java
// new line
System.out.println("Hello \nWorld");

System.out.println("Hello " +
                "world"); // 소스 코드 상 줄바꿈일 때는, 이처럼 코드를 작성해야한다.
```

- ‘\’을 이용해서 뒤에 따라오는 문자를 해당 역할로부터 해방시키는 것을 escape라고 합니다.

```java
// escape
System.out.println("Hello \"World\""); // Hello "World"
```

### 문자열 연산

- “문자열내용”.length() : 문자열의 길이를 구할 수 있습니다.

```java
System.out.println("Hello World".length()); // 11
```

- “”.replace(target, replacement) : replace()를 이용해 문자열 내에 타겟 문자를 대체문자로 변환할 수 있습니다.

```java
// [[[name]]] -> kwanghun 으로 변환
System.out.println("Hello, [[[name]]] ... bye.".replace("[[[name]]]", "kwanghun"));
```
