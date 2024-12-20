package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

//        System.out.println("동물 소리 테스트 시작");
//        cow.sound();
//        System.out.println("동물 소리 테스트 종료");

        soundCow(cow);

    }

    private static void soundCow(Cow cow) { //Cat이나 Dog는 타입이 완전히 달라 넣을 수 없다.
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }



}