package static2;

//import static static2.DecoData.staticCall; //정적 메서드 지정해서 사용할 때
//import static static2.DecoData.*; //클래스 내 모든 정적 메서드에 사용할 때


public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data1 = new DecoData(); //객체 생성 후 호출 가능
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData.staticCall(data1); //정적 메서드에 참조값을 넘겨준다.

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); //마찬가지로 이렇게 사용하는 것은 권장되지 않는다. 정적 메서드가 인스턴스 메서드처럼 보이기 때문이다.

        //클래스를 통한 접근
        DecoData.staticCall();

    }
}
