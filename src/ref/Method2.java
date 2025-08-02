package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 20, 1);
        System.out.println("student1 = " + student1);
        Student student2 = createStudent("학생2", 21, 2);
        System.out.println("student2 = " + student2);
        Student student3 = createStudent("학생3", 22, 3);
        System.out.println("student3 = " + student3);

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("student = " + student);

        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}
