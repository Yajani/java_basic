package day07.inherit;

public class Hunter extends Player{
    int concentrate; //집중력

    public Hunter(String nickName) {
        super(nickName);
        this.concentrate = 100;
    }

    public  void summonBeast(){

    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# concentrate: " + this.concentrate);
    }
}
