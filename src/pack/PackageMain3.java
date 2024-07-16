package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); // 클래스 이름이 같을 경우 import는 하나만 해줄 수 있다.
    }
}
