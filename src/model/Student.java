package model;

public class Student {
    private String Sname;
    private int age;
    private String sex;
    private String Sno;
    public Student(String Sname,int age,String sex,String Sno){
        this.Sname = Sname;
        this.age = age;
        this.sex = sex;
        this.Sno = Sno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }
}
