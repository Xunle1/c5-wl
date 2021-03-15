/**
 * @author Xunle
 */
public class Student {
    private String sno;
    private String Name;
    private int age;
    private String college;

    public Student() {
    }

    public Student(String sno, String name, int age, String college) {
        this.sno = sno;
        Name = name;
        this.age = age;
        this.college = college;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", college='" + college + '\'' +
                '}';
    }
}

