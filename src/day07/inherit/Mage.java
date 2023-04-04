package day07.inherit;

public class Mage extends Player{

    int mana; //마력 게이지

    public Mage(String nickName) {
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
        this.mana = 100;

    }


    //썬더볼트
    public void thunderBolt(){

    }
}
