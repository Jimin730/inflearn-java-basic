package construct;

public class MemberThis {

    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // 매개변수와 멤버변수의 이름이 다를때는 this를 생략한다.
    }
}
