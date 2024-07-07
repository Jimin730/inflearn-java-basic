package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt(); // int로 저장
        scanner.nextLine(); // 자바 버그로 인해 1을 입력하면 1\n이 입력되고, 1은 int로 받아들여지지만 뒤에 줄바꿈 표시가 남게되어 빈칸이 발생한다. 그래서 nextLine으로 처리하여 없애주는 것.

        ProductOrder[] orders = new ProductOrder[n];
        for(int i = 0; i < orders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine(); // 문자열로 받아옴

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼를 비우기 위한 코드 (정수 값을 입력한 후 문자열을 입력하려고 할 때, 무조건 nextLine() 한 번 실행해 주어야 함.)

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);


    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for(ProductOrder o : orders){
            System.out.println("상품명: " + o.productName + ", 가격: " + o.price+ ", 수량: " + o.quantity);
        }
    }

//    static int getTotalAmount(ProductOrder[] orders){
//        return orders[0].price * orders[0].quantity + orders[1].price * orders[1].quantity + orders[2].price * orders[2].quantity;
//    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder o: orders){
            totalAmount += o.price * o.quantity;
        }
        return totalAmount;
    }
}
