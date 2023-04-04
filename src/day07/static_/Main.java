package day07.static_;

public class Main {

    public static void main(String[] args) {

        Count c1 = new Count();
        Count c2 = new Count();

        c1.x = 10;
        c2.y = 20;

        System.out.printf("c1 = x: %d, y: %d\n", c1.x, c1.y);
        System.out.printf("c2 = x: %d, y: %d\n", c2.x, c2.y);
    }
}