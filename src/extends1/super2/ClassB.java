package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        super(); //기본 생성자 생략 가능
        //this(a, 0);
        System.out.println("ClassB 생성자 a=" + a);
    }

    //생성자가 두개일때 super를 꼭 호출을 해야한다 (즉, this, super)

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a="+a + " b=" + b);
    }

}
