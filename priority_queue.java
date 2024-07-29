import java.util.PriorityQueue;
public class priority_queue {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2) {
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student("A",4));
        
    }
}

