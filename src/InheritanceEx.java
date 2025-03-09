class Person {
    int age;
    public String name;
    protected int height;
    private int weight;

    public void setWeight (int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }
}

class Student extends Person {
    public void set() {
        age = 30;
        name = "홍길동";
        height = 175;
        //weight = 65 -> private 때문에 에러 발생
        setWeight(65); //반환 메소드로 간접접근
    }

    public void show1(){
        System.out.println(age);
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        Student s = new Student();
        s.show1();
        s.set();
    }
}
