package day09.quiz;

public class Main {
    public static void main(String[] args) {

        SmartPhone[] smartPhones = {
                new Galaxy("삼성"),
                new IPhone("애플")
        };
        for (SmartPhone smartPhone: smartPhones){
            System.out.println(smartPhone.information());
            System.out.println(smartPhone.makeCall());
            System.out.println(smartPhone.takeCall());
            System.out.println(smartPhone.takePicture());
            System.out.println(smartPhone.charge());
            if(smartPhone instanceof Galaxy){
                System.out.println("블루투스 펜 탑재 여부: "+ ((Galaxy) smartPhone).bluetoothPen());
            }
            System.out.println();
        }



    }

}
