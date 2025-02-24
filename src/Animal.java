//문제 1: 다음 요구사항에 맞는 클래스를 설계하고, 메소드 오버라이딩을 활용해 문제를 해결해 보세요.
//
//Animal 클래스를 만들고, 이 클래스에는 sound()라는 메소드를 정의합니다. 이 메소드는 기본적으로 "동물이 소리를 낸다"라고 출력합니다.
//Dog 클래스는 Animal을 상속받고, sound() 메소드를 오버라이드하여 "멍멍"을 출력하게 만듭니다.
//Cat 클래스는 Animal을 상속받고, sound() 메소드를 오버라이드하여 "야옹"을 출력하게 만듭니다.
//Main 클래스에서 Animal 타입의 변수로 Dog와 Cat 객체를 생성하여 sound() 메소드를 호출해 보세요. 각 객체의 메소드가 오버라이딩 되어 동작하는지 확인해 보세요.

public class Animal {
    public void sound(){
        System.out.println("동물이 소리를 낸다.");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("야옹");
    }
}

class Main{
    public static void main(String[] args) {
        Animal dog = new Dog();
        //상속받은 변수명 + 객체 이름 + new + 클래스 이름
        dog.sound();

        Animal cat = new Cat();
        cat.sound();
    }
}

