# 웹 MVC 개발

### 홈 화면 추가

- HomeController

```java
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}

// 기본으로 세팅되어 있는 정적파일이 index.html파일이여도, 정적 파일 검색에 앞서 Controller에서 "/"으로 연동 되는 Controller를 먼저 매핑하기 때문에 templates폴더에서 home.html파일을 열어주게 됩니다.
```

- home.html

```html
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<body>
<div class="container">
    <div>
        <h1>Hello Spring</h1>
        <p>회원 기능</p>
        <p>
            <a href="/members/new">회원 가입</a>
            <a href="/members">회원 목록</a>
        </p>
    </div>
</div> <!-- /container -->
</body>
</html>
```

### 멤버 등록 - 등록 페이지

- HomeController

```java
@GetMapping("members/new")
    public String createForm() {
        return "members/createMemberForm";
    }
// members/createMemberForm -> templates/members 디렉토리에서 createMemberForm.html파일을 엽니다.
```

- members/createMemberForm.html

```html
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<body>
<div class="container">
    <form action="/members/new" method="post">
        <div class="form-group">
            <label for="name">이름</label>
            <input type="text" id="name" name="name" placeholder="이름을 입력하세요">
        </div>
        <button type="submit">등록</button>
    </form>
</div> <!-- /container -->
</body>
</html>

// form 방식의 데이터 전송으로 input 태그 안의 name 프로퍼티의 값이 해당 값의 키값으로 서버로 넘어갑니다.
```

### 멤버 등록 - 멤버 등록

- MemberFormDto

```java
public class MemberFormDto {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
// POST로 넘어오는 값 name을 저장할 DTO를 생성합니다.
```

- HomeController

```java
@PostMapping("members/new")
    public String create(MemberFormDto formDto) {
        Member member = new Member();
        member.setName(formDto.getName());

        memberService.join(member);

        return "redirect:/";
    }

// MemberFormDto로 넘어오는 name값을 받고, 해당 name값을 이용해 memberService의 join메서드를 실행시킵니다.
// "redirect:/"는 해당 api가 실행되고, "/"으로 get호출한다는 의미입니다.
```

### 멤버 조회 - 멤버 조회

- HomeController

```java
@GetMapping("members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
// model에 메모리에 저장되어 있는 members들을 모두 저장하여 반환해줍니다.
```

- members/memberList.html

```java
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<body>
<div class="container">
    <div>
        <table>
            <thead>
            <tr>
                <th>#</th>
                <th>이름</th>
            </tr>
            </thead>
            <tbody>
            <tr th:each="member : ${members}">
                <td th:text="${member.id}"></td>
                <td th:text="${member.name}"></td>
            </tr>
            </tbody>
        </table>
    </div>
</div> <!-- /container -->
</body>
</html>

// thymeleaf 방식의 서버사이드 랜더링 방식으로 동작합니다.
// th:each에 의해 member값에 있는 배열의 모든 원소를 다 돌면서 실행합니다.
// th:text에 의해 member변수에 존재하는 값을 출력합니다.
```
