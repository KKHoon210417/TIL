## 입력과 출력

### 입력과 출력

- 자바 입력 팝업 라이브러리

```java
import javax.swing.*;

String id = JOptionPane.showInputDialog("Enter a ID");
```

- 자바 스트링 타입 더블로 변환하는 방법

```java
import org.opentutorials.iot.DimmingLights;
import javax.swing.*;

String bright = JOptionPane.showInputDialog("Enter a ID");

DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
moodLamp.setBright(Double.parseDouble(bright));
moodLamp.on();
```

- 어떤 input이 있는지 인지하고 input을 프로그래밍 안으로 적용하는 것은 굉장히 중요하다.
