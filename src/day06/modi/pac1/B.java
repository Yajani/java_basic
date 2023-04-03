package day06.modi.pac1;

class B { //default 제한 : 클래스에는 public과 같은 패키지만 접근 가능

    public int x1;
    int x2;
    private int x3;


    void test() {
        A a= new A();
        new A(10);
//        new A("zzz");

        a.f1 =1; //public
        a.f2 =2; //default
//        a.f3 =3; //private

        a.m1(); //public
        a.m2(); //default
//        a.m3(); //private
    }

}
