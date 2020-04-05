import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-04
 * Time: 23:06
 */
class student implements Comparable<student >{
    private String name;
    private int age;
    public student (String name,int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(student o) {
        return this.age - o.age;
    }
}
public class Test {
    public static void main(String[] args) {
      student []students = new student[3];
      students[0] = new student("张三",14);
      students[1] = new student("李四",12);
      students[2] = new student("王麻子",10);
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
