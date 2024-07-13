package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) { // static 뺴야함
        this.name = name; // 자기 자신의 인스턴스를 가리키게 된다.
        this.age = age;
        this.grade = grade;
    }
}
