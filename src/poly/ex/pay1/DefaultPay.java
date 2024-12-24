package poly.ex.pay1;

//코드 상 null이 들어가지 않게
public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
