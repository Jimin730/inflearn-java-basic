package final1.ex;

public class Member {

    private final String id; //id는 바뀌면 안되니까 final
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name) {
        //this.id = id; //컴파일 오류, 이미 생성자를 통해 만들 때 값을 초기화 해주기 때문에 값을 변경해줄 수 없다.
        this.name = name;
    }

    public void print() {
        System.out.println("id: " + id + ", name: " + name);
    }
}
