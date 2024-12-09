package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); //정적 메서드를 사용했기 때문에 인스턴스 생성을 따로하지 않아도 된다.

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
