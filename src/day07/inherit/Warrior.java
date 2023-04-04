package day07.inherit;

public class Warrior {

    String nickName; // 캐릭터 이름
    int level;
    int hp;
    int exp;
    int rage; // 분노게이지

    public Warrior(String nickName) {
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
        this.rage = 20;
    }

    // 캐릭터 상태창을 보는 기능
    public void showStatus() {
        System.out.println("\n======= Character's Info =========");
        System.out.println("# name: " + this.nickName);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }

    // 파워슬래시
    public void powerSlash() {
        System.out.println("파워슬래시를 시전합니다.");
    }


}