## 제어문

### Boolean Datatype

- 불리언은 ‘true’, ‘false’ 두가지 형태만이 존재하고, 참일 경우 true 거짓일 경우 false를 반환합니다.
- ‘true’와 ‘false’와 같이 이미 컴퓨터에서 예약되서 사용되는 언어를 reserved word라고 합니다.
- boolean 반환해보기

```java
String foo = "Hello world";

System.out.println(foo.cotains("world")) // true
System.out.println(foo.cotains("kwanghun")) // false
```

### 비교연산자

- a > b : a가 b보다 크다면 true 작거나 같다면 false를 반환합니다.
- a < b : a가 b보다 작다면 true 크거나 같다면 false를 반환합니다.
- a ≥ b : a가 b보다 크거나 같다면 true 작다면 false를 반환합니다.
- a ≤ b : a가 b보다 작거나 같다면 true 크다면 false를 반환합니다.
- a == b : a와 b가 같다면 true 다르다면 false를 반환합니다.
- a != b : a와 b가 다르면 true 같다면 false를 반환합니다.

### 조건문 형식

- if, else if, else를 이용해서 조건에 따라 프로그램을 실행시킬 수 있습니다.

```java
if(false) {
    System.out.println(1);
} else if(true) {
    System.out.println(2);
} else {
    System.out.println(3);
}
```

### 조건문 응용

- primitive : 원시 데이터 즉, 더이상 쪼개질 수 없는 데이터 타입을 의미합니다.
- non primitive : 원시 데이터가 아닌 데이터 타입입니다.
- == : 객체의 주소가 서로 같은지 비교합니다.(원시데이터 타입과 같은 경우 동일한 값은 같은 주소를 가르키고 있기 때문에 ==를 씁니다.)
- .equals() : 객체의 값이 서로 같은지 비교합니다.(원시데이터 타입이 아닌 객체는 주소를 각각 같기 때문에, 값을 확인하는 equals()를 써야합니다.
- 즉, 원시데이터 타입은 == 원시데이터 타입이 아닌 경우는 equals()를 씁니다.

```java
// 아이디 체크
String id = "kwanghun";
String inputId = args[0];

System.out.println("Hi. ");

// if(inputId == id) {
if(inputId.equals(id)) {
    System.out.println("Master!");
} else {
    System.out.println("Who are you?");
}
```

- a && b : a와 b 둘다 참일 경우 참입니다.

```java
String id = "kwanghun";
String inputId = args[0];

String pass = "1111";
String inputPass = args[1];

System.out.println("Hi. ");

// 개선 전
// if(inputId == id) {
//        if(inputId.equals(id)) {
//            if(inputPass.equals(pass)) {
//                System.out.println("Master!");
//            } else {
//                System.out.println("Wrong password");
//            }
//        } else {
//            System.out.println("Who are you?");
//        }

// 개선 후
if(inputId.equals(id) && inputPass.equals(pass)) {
    System.out.println("Master!");
} else {
    System.out.println("Who are you?");
}
```

### 논리 연산자

- 논리연산자의 종류는 다음과 같다.

```java
// AND
System.out.println(true && true); // true
System.out.println(true && false); // false
System.out.println(false && true); // false
System.out.println(false && false); // false

// OR
System.out.println(true || true); // true
System.out.println(true || false); // true
System.out.println(false || true); // true
System.out.println(false || false); // false

// not
System.out.println(!true); // false
System.out.println(!false); // true
```

### 반복문

- while
    - int i = 0; 이 선언되어 i값을 초기화 합니다.
    - while(i < 3) 가 참인지 거짓인지 확인합니다. 참이라면 while문을 실행합니다.
    - while문을 실행하고 마지막 줄 i += 1에서 i값을 1증가시켜줍니다.
    - 다시 while(i < 3) 가 참인지 거짓인지 확인합니다. 만약 거짓이라면 while문을 실행하지 않습니다.
    - while문의 경우 변수 i와 같이 while문을 실행시키는 조건이 서로 떨어져 있어 반복문 사이에 i변수에 대한 간섭이 껴있을 경우 프로그래밍에 심각한 문제를 초래할 수 있습니다.

```java
int i = 0;
while(i < 3) {
    System.out.println(2);
    System.out.println(3);
    i += 1;
}
```

- for
    - int j=0;을 단 한번 실행합니다.
    - j < 3이 참인지 확인합니다. 참이라면 for문을 실행합니다.
    - j++를 실행합니다.
    - 다시 j < 3이 참인지 확인합니다. 만약 거짓이라면 for문을 실행하지 않습니다.
    - 단 한번 초기에 j를 초기화하기 때문에 그리고 j값 증가에 대한 로직이 한줄에 적혀 있어 반복 중간에 j에 간섭이 끼어들 경우가 극히 적습니다.

```java
for(int j=0; j < 3; j++) {
    System.out.println(2);
    System.out.println(3);
}
```

### 배열

- 인덱스 : 배열의 각 자리 번호
- 원소 : 배열의 각 자리의 값

```java
// 배열에 원소를 넣는 방법1
String[] users = new String[3];
users[0] = "foo";
users[1] = "joo";
users[2] = "row";

System.out.println(users[1]);
System.out.println(users.length);

// 배열에 원소를 넣는 방법2
int[] scores = {10, 100, 100};
System.out.println(scores[1]);
System.out.println(scores.length);
```

### 배열 + 반복문

- 배열에 반복문을 사용하는 경우

```java
String[] users = new String[3];
users[0] = "foo";
users[1] = "joo";
users[2] = "row";

for(int i=0; i<users.length; i++) {
	System.out.println("<li>"+users[i]+"</li>");
}
```

### 응용

```java
public class AuthApp3 {
    public static void main(String[] args) {

//        String[] users = {"egoing", "jinhuck", "youbin"};
        String[][] users = {
                {"egoing", "1111"},
                {"jinhuck", "2222"},
                {"youbin", "3333"}
        };
        String inputId = args[0];
        String inputPass = args[1];

        boolean isLogined = false;
        for(int i=0; i< users.length; i++) {
            String[] current = users[i];
            if(current[0].equals(inputId) && current[1].equals(inputPass)) {
                isLogined = true;
                break;
            }
        }
        System.out.println("Hi,");
        if(isLogined) {
            System.out.println("Master!!");
        } else {
            System.out.println("Who are you?");
        }

    }
}
```