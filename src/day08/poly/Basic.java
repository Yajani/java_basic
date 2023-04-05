package day08.poly;

class A {}
class B extends A {}
class C extends A{}
class D extends B{}
class E extends C{}
public class Basic {
    //자식객체는 상속관계에 있는 상위타입을 사용할 수 있다.
     Object x1 = new A();
//     B x2 = new B();
     A x2 = new B(); //부모의 타입을 가질수 있다.
     A x3 = new C();
     A x4 = new D();
     A x5 = new E();

     void test() {
         int a = 10;
         double b = a; //업 캐스팅
         B x = new B();
         A z = x;
//         C y = (C)z; //A가 더 크니까 불가능 -> 다운 캐스팅

     }


}
