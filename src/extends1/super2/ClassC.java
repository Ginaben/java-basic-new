package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        //super();
        super(10, 20); //부모가 기본생성자가 없으면 직접 설정해야 함
        System.out.println("ClassC 생성자"); }

}
