## 프로그래밍

### 프로그래밍이란

- 컴퓨터로 하여금 어떤 일을 순차적으로 실행하도록 하는 것으로, 일을 효율적으로 하기 위해 기계에게 위임해서 자동으로 진행되는 것을 의미합니다.

### 라이브러리 적용해보기

- 자바는 다른 사람이 작성한 라이브러리를 가져다가 내 코드에다가 적용할 수도 있습니다.
    - 내 프로젝트 폴더(’src’)에 사용하고 싶은 라이브러리 폴더를 넣습니다.
    - 내 main 코드 내에서 해당 폴더 경로를 입력해서, 미리 작성된 클래스의 메서드를 사용할 수 있습니다.
    - 다음과 같은 두가지 방식으로 사용이 가능합니다.
    
    ```java
    // 전부 기입하는 방식
    org.opentutorials.iot.Elevator myElevator = new org.opentutorials.iot.Elevator("JAVA APT 507");
    
    // 위와 같은 방식은 일일이 선언해줘야하기 때문에, 이를 해결하기 import를 사용합니다.
    import org.opentutorials.iot.Security
    
    Security mySecurity = new Security("JAVA APT 507");
    ```
