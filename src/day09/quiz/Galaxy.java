package day09.quiz;

public class Galaxy extends SmartPhone implements Pencil {
    public Galaxy(String model) {
        super(model);
    }

    @Override
    public String information() {
        return "갤럭시는 "+getModel()+"에서 만들어졌고 제원은 다음과 같다";
    }

    @Override
    public String charge() {
        return "정전식, 와콤펜 지원";
    }

    @Override
    public String takePicture() {
        return "13000만 듀얼카메라";
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름";
    }

    @Override
    public String takeCall() {
        return "전화받기 버튼을 누름";
    }

    @Override
    public boolean bluetoothPen() {
        return true;
    }
}
