## 도메인 설계하는 방법

### 예시

- 주문과 할인 정책
    - 회원은 상품을 주문할 수 있다.
    - 회원 등급에 따라 할인 정책을 적용할 수 있다.
    - 할인 정책은 모든 VIP는 1000원을 할인해주는 고정 금액 할인을 적용해달라(나중에 변경 될 수 있다.)
    - 할인 정책은 변경 가능성이 높다. 회사의 기본 할인 정책을 아직 정하지 못했고, 오픈 직전까지 고민을 미루고 싶다. 최악의 경우 할인을 적용하지 않을 수 있다.(미확정)
    

### 1. 역할을 갖고 로직을 작성해봅니다.

![image](https://user-images.githubusercontent.com/82690689/162867984-3c8b0d88-0872-40c9-9c32-f8c956978297.png)

1. **주문 생성:** 클라이언트는 주문 서비스에 주문 생성을 요청합니다.
2. **회원 조회:** 할인을 위해서 회원 등급이 필요합니다. 그래서 주문 서비스는 회원 저장소에 회원을 조회합니다.
3. **할인 적용:** 주문 서비스는 회원 등급에 따른 할인 여부를 할인 정책에 위임합니다.
4. **주문 결과 반환:** 주문 서비스는 할인 결과를 포함한 주문 결과를 반환합니다.

- 참고 : 예시의 단순함을 위해 상품 주문에 대한 데이터베이스가 존재하지 않으므로 주문 결과를 그대로 반환해줍니다.

### 2. 역할과 구현체를 분리합니다.

![image](https://user-images.githubusercontent.com/82690689/162868101-730a64fd-9d1b-4f1f-a362-b906b7ab1ab5.png)

- 역할과 구현체를 분리해서 자유롭게 구현 객체를 조립할 수 있게 설계합니다. 이를 통해 회원 저장소는 물론 할인 정책도 유연하게 변경할 수 있습니다.

### 3. 개발 다이어그램 작성

![image](https://user-images.githubusercontent.com/82690689/162868012-572999d9-48fd-473c-b068-465a6d646b46.png)

- 실제 서비스를 개발할 때 참조할 로직입니다.
- 인터페이스에 구현체가 하나만 존재할 경우 Impl을 붙여줍니다.

### 4. 동적 다이어그램 작성

- 실제 동적으로 동작하는 객체 다이어 그램입니다. 해당 다이어그램을 통해 실제 동작하는 구현체를 확인할 수 있습니다.

- 주문 도메인 객체 다이어그램1

![image](https://user-images.githubusercontent.com/82690689/162868019-b962a9a4-fb9e-41e8-b70d-6ed6f5e80139.png)

- 주문 도메인 객체 다이어그램2

![image](https://user-images.githubusercontent.com/82690689/162868024-70f734b1-2835-4ead-87f4-90f25da7aa05.png)
