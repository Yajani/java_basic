package day11.api.string;

public class StrBuilder {

    private static void makeString() {

        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 50000; i++) {
            s += "A";
        }
        long end = System.currentTimeMillis();

        System.out.println("스트링 총 소요 시간: " + (end - start) + "밀리초");
    }

    private static void makeStringBuilder() {

        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < 50000; i++) {
            s.append("A");
        }
        long end = System.currentTimeMillis();

        System.out.println("빌더 총 소요 시간: " + (end - start) + "밀리초");
    }

    public static void main(String[] args) {
        makeStringBuilder();
        makeString();

        Integer a= 10; //오토박싱 => 기본값은 null(클래스 타입이기 때문에)
        Character c = 'A';
        Byte b = 1;
        Double d = 11.1;

    }
}