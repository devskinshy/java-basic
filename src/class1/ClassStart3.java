package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 20;
        student1.grade = 1;

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 21;
        student2.grade = 2;

        Student student3;
        student3 = new Student();
        student3.name = "학생3";
        student3.age = 22;
        student3.grade = 3;

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("이름 : " + student1.name + "나이 : " + student1.age + "성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + "나이 : " + student2.age + "성적 : " + student2.grade);
        System.out.println("이름 : " + student3.name + "나이 : " + student3.age + "성적 : " + student3.grade);
    }
}
