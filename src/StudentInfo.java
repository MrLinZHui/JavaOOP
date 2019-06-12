import model.Student;

public class StudentInfo {
    public static void main(String[]args){
        Student student = new Student("Tomi",23,"男","S15020");
        System.out.println("学生姓名："+student.getSname());
        System.out.println("学生年龄："+student.getAge());
        System.out.println("学生性别："+student.getSex());
        System.out.println("学生学号："+student.getSno());
    }
}
