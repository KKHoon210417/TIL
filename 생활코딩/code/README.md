## 상속

상속이 나온 이유는 기존에 존재하는 클래스를 변경해야하는데 내가 만든 클래스가 아니거나 수정할 수 없을 때 이를 해결하고자 상속함으로써 해당 클래스의 모든 메소드를 동일하게 사용할 수 있게됩니다.

- 상속 받는 법

```java
class Cal{
  public int sum(int v1, int v2) {
    return v1 + v2;
  }
}

class Cal3 extends Cal {
  public int minus(int v1, int v2) {
    return v1 - v2;
  }
}
```

- Overriding 하는 법

```java
class Cal{
  public int sum(int v1, int v2) {
    return v1 + v2;
  }
}

class Cal3 extends Cal {
  public int minus(int v1, int v2) {
    return v1 - v2;
  }
  // Override
  public int sum(int v1, int v2){
    System.out.println("Cal3!!");
    return v1 + v2;
  }
}
```

- Overriding vs Overloading
  - Overriding : 상속하는 클래스의 메소드를 수정합니다.
  - Overloading : 메소드의 매개변수가 갯수, 타입이 다르다면 중복된 이름의 메소드가 존재할 수 있습니다.

```java
class Cal{
  public int sum(int v1, int v2) {
    return v1 + v2;
  }
  // Overloading
  public int sum(int v1, int v2, int v3) {
    return v1 + v2 + v3;
  }
}
class Cal3 extends Cal {
  public int minus(int v1, int v2) {
    return v1 - v2;
  }
  // Override
  public int sum(int v1, int v2){
    System.out.println("Cal3!!");
    return v1 + v2;
  }
}
```

- this vs super
  - this : 자기 자신의 인스턴스를 가르킵니다.
  - super : 상속받는 클래스를 가르킵니다.

```java
class Cal{
  public int sum(int v1, int v2) {
    return v1 + v2;
  }
  // this : 자기 자신의 인스턴스를 가르킵니다.
  public int sum(int v1, int v2, int v3) {
    return this.sum(v1, v2) + v3;
  }
}
class Cal3 extends Cal {
  // 상속받은 Cal의 sum을 가르킵니다.
  public int sum(int v1, int v2){
    System.out.println("Cal3!!");
    return super.sum(v1, v2);
  }
  public int minus(int v1, int v2) {
    return v1 - v2;
  }
}
```

- 상속과 생성자

  상속받는 클래스가 만약 생성자가 존재한다면 해당 클래스를 상속하는 클래스도 반드시 상속받는 클래스가 필요로 하는 생성자를 주입해야합니다.


```java
class Cal{
    int v1, v2;
    Cal(int v1, int v2) {
        System.out.println("Cal init!!");
        this.v1 = v1; this.v2 = v2;
    }
    public int sum() {return this.v1+v2;}
}
class Cal3 extends Cal {

    Cal3(int v1, int v2) {
        super(v1, v2);
        System.out.println("Cal3 init!!");
    }
    public int minus(){return this.v1-v2;}
}
```