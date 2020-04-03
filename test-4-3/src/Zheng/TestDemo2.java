package Zheng;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-03
 * Time: 23:23
 */
class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        /*if(this.age < o.age) {
            return -1;
        }
        if(this.age == o.age) {
            return 0;
        }
        return 1;*/
        //return this.age-o.age;
        //return this.score-o.score;
        return this.name.compareTo(o.name);//字符串的比较大小
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
public class TestDemo2 {

    /**
     * 对自定义的类型进行比较：---》 implements Comparable
     * @param args
     */
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("bit",10,89);
        students[1] = new Student("gaobo",18,99);
        students[2] = new Student("caocao",7,20);
        students.sort(students);
        //把数组当中的元素转化为字符串的时候  会调用Student的toString()
        String str = students.toString(students);
        System.out.println(str);
        System.out.println("=======================");
        System.out.println(students[0]);
    }