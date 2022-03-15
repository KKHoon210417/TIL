# Hello World

### Hello World 출력

- Java를 실행시키면, main 메서드를 찾아 그 안에 로직을 실행시킨다.
- Java를 실행시키면(IntelliJ 기준) .java 파일을 가지고 .class 파일을 생성합니다. 해당 .class 파일을 JVM이 읽어내서 원하는 코드를 출력할 수 있게 됩니다.
- ‘src’ 에 .java 파일을 넣는 이유 : 초기 프로젝트 설정에서 자바 파일의 패스를 설정하는 부분에서 src폴더로 설정했기 때문입니다.
    - Project Structure에서 Source Folders를 바꿔주면 폴더를 변경할 수 있다.
- ‘out’에 .class 파일이 생성되는 이유 : 초기 프로젝트 설정에서 자바 파일의 패스를 설정하는 부분에서 out폴더에 .class파일이 생성되도로 설정했기 때문입니다.
    - Project Structure에서 Path탭의 Output path를 바꿔주면 폴더를 변경할 수 있다.

```python
public class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
    }
}
```

### Java의 동작 원리

- 사람이 이해할 수 있게 만들어진 컴퓨터 언어 ‘java’로 소스코드를 작성합니다. (.java)
- 컴파일 하면 자바 소스코드를 JVM이 이해할 수 있는 언어로 변환해줍니다. (.class)
- 실행을 누르면 JVM이 해당 (.class)파일을 갖고 네이티브 언어로 변환해줍니다.
- 네이티브 언어는 컴퓨터에 의해 실행됩니다.

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/f525ef7d-7d47-4366-beb4-482d9246a8d9/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220315%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220315T173808Z&X-Amz-Expires=86400&X-Amz-Signature=328bf05a277b266c7f5805b5e8c3b963d89ddd0fbad9a7d6da3571c22364208b&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)
