package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();

        //단, 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운 캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly; //poly를 강제로 Child 타입으로 변경
        child.childMethod();

        //일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운 캐스팅
        ((Child) poly).childMethod(); //연산자 우선 순위로 인해 다운 캐스팅을 먼저 괄호로 감싸준 후 메서드 호출

    }
}
