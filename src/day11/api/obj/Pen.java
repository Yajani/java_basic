package day11.api.obj;

import java.util.List;
import java.lang.String;

public class Pen extends Object {
    Company company;  //제조 회사
    long  serial; //시리얼 번호
    String color; //색상
    int price; //가격

    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    //객체의 필드데이터를 빠르게 확인해볼 때


    @Override
    public String toString() {
        return "Pen{" +
                "company: "+company +
                ", serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    //시리얼 번호가 같으면 같은 객체로 보고 싶다.
    //equals를 오버라이딩하면 반드시 hashCode도 같이 오버라이딩 해라
    @Override
    public boolean equals(Pen this,Object obj) {
        if(obj instanceof Pen){
            Pen target = (Pen) obj;
            return this.serial == target.serial
                    && this.color.equals(target.color);
        }
        //시리얼 번호도 같고, 색도 같으면 ~~~~
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
