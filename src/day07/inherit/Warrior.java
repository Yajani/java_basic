package day07.inherit;

//서브 클래스(자식 클래스)
public class Warrior  extends Player{
    int rage; // 분노게이지

    public Warrior(String nickName) {
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
        this.rage = 20;
    }


    // 파워슬래시
    public void powerSlash() {
        System.out.println("파워슬래시를 시전합니다.");
    }

    //오버라이딩
    //조건 : 부모의 시그니처(리턴타입, 이름, 파아미터)를 똑같이 사용
    //      접근제한자는 무조건 부모보다 public해야 함.
    public void showStatus(){

    }



}