package oop1.ex;

public class Rectangle {
    int width = 5;
    int height = 8;


    // 자기 자신의 멤버 변수를 전달하면 되니, 메소드에 매개변수를 전달하지 않아도 된다. 외부에서 넣어주는 것이 아니기 때문
    int calculateArea() {
        return width * height;
    }
    int calculatePerimeter() {
        return 2 * (width + height);
    }
    boolean isSquare() {
        return width == height;
    }
}
