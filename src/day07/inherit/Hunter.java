package day07.inherit;

public class Hunter extends Player{
    int concentrate; //집중력

    public Hunter(String nickName) {
        super(nickName);
        this.concentrate = 100;
    }
//3 / 2 / 3 /this.name = name => super.name = name;
//    "Parent() call"
//    "Parent(String) call"
//   "Child() call"
//   "Child(String) call"
    public  void summonBeast(){

    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# concentrate: " + this.concentrate);
    }
}
