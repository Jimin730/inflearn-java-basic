package static1;

public class Data3 {
    public String name;
    public static int count; // static

    public Data3(String name) {
        this.name = name;
        count++; //Data3.count++ 이렇게도 사용할 수 있지만 본인의 클래스 내부에서 사용하니까 앞 클래스 명 생략
    }
}
