package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); //이렇게 인스턴스를 통한 접근은 권장되지 않는다. 그 이유는 이렇게 쓰인 count를 보았을 때, 이 변수가 인스턴스 변수에 접근하는 것처럼 보이기 때문이다.

        //클래스를 통한 접근
        System.out.println(Data3.count);

    }
}
