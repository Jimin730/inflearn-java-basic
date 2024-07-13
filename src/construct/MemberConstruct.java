package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) { // 생성자 오버로딩
        this(name, age, 50); // 변경 (기존 코드의 중복을 없앴음)
    }

    MemberConstruct(String name, int age, int grade) { // 생성자
        System.out.println("생성자 호출 name= " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;

    }


}
