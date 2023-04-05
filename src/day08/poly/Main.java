package day08.poly;

public class Main {
    public static void main(String[] args) {

        //객체는 항상 역할에 의존해야지 구현체에 의존하면 안됨
        Computer com = new Computer();
        LgMonitor lgMonitor = new LgMonitor();

        com.monitor = lgMonitor;

        //모니터 교환
        com.monitor = new HpMonitor(); //객체의 교환성이 증가된다.
        com.monitor = new LgMonitor();



    }
}
