## 컴파일

### 컴파일 환경

- .java를 .class로 컴파일은 javac에서 수행해줍니다.
- 윈도우에서 명령프롬포트를 이용해 javac를 입력하면 자바 명령어를 확인할 수 있습니다.
- 만약 명령어가 동작하지 않다면 java의 환경변수 설정이 안되어 있어서입니다. 환경변수에 java 경로를 설정해주면 어떤 위치에서든 java 명령어를 입력할 때 수행됩니다.

### 컴파일 실행

- 컴파일 실행

```java
javac <파일이름>
```

- .class 파일 실행
    - 파일 이름에 .class는 제외한다.

```java
java <파일이름>
```

- 다른 경로 library를 사용하는 파일 컴파일 실행
    - .은 현재 디렉토리 주소를 의미한다.
    - ;는 해당 디렉토리 내부까지 다 확인한다는 뜻이다.
    - ‘—cp’는 “class path”의 약자이다.
    - lib은 폴더 이름

```java
javac --cp ".;lib" <파일이름>
```

- 다른 경로 library를 사용하는 파일 실행

```java
java --cp ".;lib" <파일이름>
```

### 컴파일 실행_args 넣기

- main함수 args 넣기

```java
java OkJavaGoInHomeInput "busan apt 1004" "15"
// .class 파일 뒤에 넣을 args를 공백을 구분으로 입력해주면 됩니다.
```
