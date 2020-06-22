import java.util.*;

public class Main3{
    static class student{
        String name;
        int score;

        public student(String name,int score) {
            this.name = name;
            this.score = score;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int order = scanner.nextInt();
            List<student> list = new ArrayList<>();
            for(int i = 0; i<n; i++) {
                String name = scanner.next();
                int score = scanner.nextInt();
                list.add(new student(name,score));
            }
            if(order==0) {
                Collections.sort(list, new Comparator<student>() {
                    @Override
                    public int compare(student o1, student o2) {
                        return o2.score-o1.score;
                    }
                });
            }
            if(order==1) {
                Collections.sort(list, new Comparator<student>() {
                    @Override
                    public int compare(student o1, student o2) {
                        return o1.score-o2.score;
                    }
                });
            }
            for(int i = 0; i<list.size(); i++) {
                System.out.println(list.get(i).name+" "+list.get(i).score);
            }
        }
    }
}