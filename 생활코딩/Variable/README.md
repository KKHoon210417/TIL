## 변수

### 변수

- int(integer) : 정수범위만 올수 있습니다.

```java
int a = 1; // Number -> integer
```

- double : 실수 범위가 옵니다.

```java
double b = 1.1; // real number -> double ... -2.0, -1.0, 0 , 1.0 ...
```

- String : 문자열이 올 수 있습니다.

```java
String c = "Hello World";
```

- 왜 JAVA에서는 데이터 타입을 선언해줘야 할까?
    
    변수에 데이터 타입을 선언해준다면, 해당 변수에 지정 데이터 타입 이외의 데이터가 접근했을 때, 에러를 발생시켜준다. 이러한 에러는 컴파일이 되지 않는 다는 것을 의미합니다. 즉, 내가 작성한 변수에 잘못된 값이 접근하는 것을 미연에 방지할 수 있게됩니다. 또한, 개발자 입장에서도 변수에 데이터 타입이 선언되어 있어서 소스코드를 보고 내용을 이해하는데 큰 도움이 됩니다.
    

### 변수의 효용

- 변수를 사용함으로서, 이후에 내가 볼 때 또는 다른 사람이 볼때, 소스코드를 더 이해하기 쉽도록 할 수 있습니다.
- 변수를 사용함으로서, 특정 값의 수정이 필요할 때, 동시 다발적으로 수정해줄 수 있습니다.

```java
String name = "kwanghun";
System.out.println("Hello, "+name+" ... "+name+" ... "+name+" ... bye");

double VAT = 10.0;
System.out.println(VAT);
```

### 데이터 타입의 변환(casting)

- Java는 데이터 변환에 있어 값의 손실이 없는 경우에 자동으로 데이터 타입을 변환해줄 수 있습니다.

```java
double b = 1.0;
double b2 = (double) 2; // 이것과 동일하다.
System.out.println(b); // 1.0
```

- Java에서는 값의 손실이 있을 때, 데이터 타입 변환을 시켜주는 두가지 방식이 존재합니다.
    - 첫번째, 데이터 타입을 변경합니다.
    - 두번째, 변수 앞에 데이터 타입을 명시합니다.

```java
// 첫번째
int c = 1.1; // Fail
double c = 1.1; // int -> double

// 두번째
int e = (int) 1.1; // 값 앞에 (int)를 명시해줍니다.
```

- 정수를 문자열로 변환하는 방법은 다음과 같습니다.
    - Integer.toString();

```java
String strI = Integer.toString(1); // Integer -> String
System.out.println(strI.getClass()); // .getClass()는 해당 변수의 데이터 타입을 출력합니다.
```
