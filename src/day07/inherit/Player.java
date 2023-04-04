package day07.inherit;

// 수퍼 클래스 (부모 클래스) : 객체의 공통 기능과 속성을 설계
public class Player {

    String nickName; // 캐릭터 이름
    int level;
    int hp;
    int exp;

    // 캐릭터 상태창을 보는 기능
    public void showStatus() {
        System.out.println("\n======= Character's Info =========");
        System.out.println("# name: " + this.nickName);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }

}