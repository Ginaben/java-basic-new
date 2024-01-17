package ref;

public class Method1 {
    public static void main(String[] args) {
//        Student student1; student1 = new Student();
//        student1.name = "학생1";
//        student1.age = 15;
//        student1.grade = 90;
//
//        Student student2 = new Student();
//        student2.name = "학생2";
//        student2.age = 16;
//        student2.grade = 80;
//
//        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성 적:" + student1.grade);
//        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성 적:" + student2.grade);

        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);
        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student1) {
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
    }

}
