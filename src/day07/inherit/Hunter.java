package day07.inherit;

public class Hunter extends Player{
    int concentrate; //집중력

    public Hunter(String nickName) {
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
        this.concentrate = 100;
    }

    public  void summonBeast(){

    }
}
