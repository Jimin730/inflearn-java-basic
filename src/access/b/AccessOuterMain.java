package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //패키지가 달라 호출 불가
//        data.defalutField = 2;
//        data.defalutMethod();

        //private 호출 불가
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
