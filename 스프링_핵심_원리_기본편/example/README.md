# Example

### 프로젝트 설정
- Java 11
- Project: Gradle Project
- Spring Boot: 2.3.x
- Language: Java
- Packaging: Jar

### 비지니스 요구사항과 설계
- 회원
    - 회원을 가입하고 조회할 수 있다.
    - 회원은 일반과 VIP 두 가지 등급이 있다.
    - 회원 데이터는 자체 DB를 구축할 수 있고, 외부 시스템과 연동할 수 있다.(미정)
- 주문과 할인 정책
    - 회원은 상품을 주문할 수 있다.
    - 회원 등급에 따라 할인 정책을 적용할 수 있다.
    - 할인 정책은 모든 VIP는 1000원을 할인해주고 고정 금액 할인을 적용해달라.(나중에 변경 할 수 있다.)
    - 할인 정책은 변경 가능성이 높다. 회사의 기본 할인 정책을 아직 정하지 못했고, 오픈 직전까지 고민을 미루고 싶다. 최악의 경우 할인을 적용하지 않을 수 도 있다.(미확정)
    
### 회원 도메인 설계

## 회원 도메인 설계

- 회원 도메인 요구사항
    - 회원을 가입하고 조회할 수 있다.
    - 회원은 일반과 VIP 두 가지 등급이 있다.
    - 회원 데이터는 자체 DB를 구축할 수 있고, 외부 시스템과 연동할 수 있다.(미확정)
    
- 회원 도메인 협력 관계

![1](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/ccbbd7f6-a222-4360-9319-23527a3917ec/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220325%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220325T074249Z&X-Amz-Expires=86400&X-Amz-Signature=5e7738539ae1a66797a5517ecca1067b1177c099959354b39c1b8ed95ff36f76&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- 회원 클래스 다이어그램

![2](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/09d7206b-d42c-472c-9f97-5c7f7ad56002/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220325%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220325T074208Z&X-Amz-Expires=86400&X-Amz-Signature=92172046e0cb332ae5d86d92ab0a71c5b904c152e206eb63f9b2cc1810b1a6b1&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- 회원 객체 다이어그램

![3](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/9cbeab1a-bb3c-4e12-b006-e124d211b68c/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220325%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220325T074150Z&X-Amz-Expires=86400&X-Amz-Signature=76bac3d7d2728a4a66900daacd0d23fc50baf441ffba4a12eb1360314ccdadfb&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

이때, 회원 서비스는 ‘**MemberServiceImpl**’입니다.
