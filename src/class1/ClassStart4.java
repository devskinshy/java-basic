package class1;

public class ClassStart4 {
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

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        System.out.println("이름 : " + students[0].name + "나이 : " + students[0].age + "성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + "나이 : " + students[1].age + "성적 : " + students[1].grade);
        System.out.println("이름 : " + students[2].name + "나이 : " + students[2].age + "성적 : " + students[2].grade);
    }
}
