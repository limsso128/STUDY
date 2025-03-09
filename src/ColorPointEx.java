class Point {
    private int x, y;//근데 굳이 왜 프라이빗으로 만들어야하지

    //인스턴스 변수를 매개변수에 넣어주는 메소드 / 값 설정
    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + ", "+ y + ")");
    }
}

class ColorPoint extends Point {
    private String color;

    public void setColor(String color){
        this.color = color;
    }

    public void showColor() {
        System.out.print(color);
        showPoint();
    }
}

public class ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point();
        p.set(1,2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("blue");
        cp.showColor();
    }
}
