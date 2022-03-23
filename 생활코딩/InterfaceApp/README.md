### 인터페이스

인터페이스란 클래스를 규정하여 같은 양식을 강제로 사용하도록 하게 제약을 걸어주는 것입니다.

- 예) 계산 로직을 외주 맡겼을 때, 원하는 형식과 메소드 이름, 매개변수를 지정해주면 계산 로직을 받았을 때 호환이 안되는 상황이 일어나지 않는다.

```java
interface Calculable{
    int sum(int v1, int v2);
}

class RealCal implements Calculable {
    public int sum(int v1, int v2){
        return v1 + v2;
    }
}
```

- 하나의 클래스는 여러개의 인터페이스를 구현할 수 있습니다.
- 인터페이스에는 메소드와 변수가 정의될 수 있는데, 메소드는 내용이 없지만 변수의 경우 값이 들어있습니다.

```java
interface Calculable{
    double PI = 3.14;
    int sum(int v1, int v2);
}
interface Printable{
    void print();
}

class RealCal implements Calculable, Printable {
    public int sum(int v1, int v2){
        return v1 + v2;
    }
    public void print(){
        System.out.println("This is RealCal!!");
    }
}
```

- 다형성

  인스턴스를 생성할 때 변수의 타입에 인터페이스를 넣어줄 수 있는데, 특정 인터페이스를 넣어준다면 해당 클래스에서 특정 인터페이스를 구현한 부분에 대해서만 사용할 수 있게됩니다. 즉, 하나의 클래스를 인스턴스화 시켜도 사용할 수 있는 메소드를 제한할 수 있게됩니다.

  이렇게 하는 이유로 너무 많은 기능이 주어졌을 때, 모든 기능에 대해서 배울 필요 없이 타입의 인터페이스에 있는 기능만 확인하고도 해당 인스턴스를 사용할 수 있게 만들어줍니다.

  또한, 인터페이스를 타입으로 선언해줬다면, 인스턴스를 구현한 클래스 중에 해당 인터페이스를 구현한 클래스라면 그 클래스로 인스턴스를 만드는데 문제가 없다는 점에서 호환성을 높여주게 됩니다.

    ```java
    interface Calculable{
        double PI = 3.14;
        int sum(int v1, int v2);
    }
    interface Printable{
        void print();
    }
    
    class RealCal implements Calculable, Printable {
        public int sum(int v1, int v2){
            return v1 + v2;
        }
        public void print(){
            System.out.println("This is RealCal!!");
        }
    }
    class AdvancedPrint implements Printable{
        public void print(){
            System.out.println("This is RealCal!!");
        }
    }
    
    public class InterfaceApp {
        public static void main(String[] args) {
    				// Printable에서 선언한 메소드만 사용할 수 있습니다.
            Printable c = new RealCal();
    				// Printable을 구현한 클래스라면 모두 호환이 가능합니다.
            Printable c1 = new AdvancedPrint();
            
        }
    }
    ```