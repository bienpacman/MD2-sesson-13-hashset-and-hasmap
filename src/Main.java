import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
Student student1 = new Student("Bien",20,"Hn");
Student student2 = new Student("Sin",21,"Hn");
Student student3 = new Student("Jonh",22,"Hn");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
studentMap.put(1,student1);
studentMap.put(2,student2);
studentMap.put(3,student3);
studentMap.put(4,student1);
        for (Map.Entry<Integer, Student> studentEntry:studentMap.entrySet()) {
            System.out.println(studentEntry.toString());
        }
        System.out.println("............Set");
        Set<Student> student = new HashSet<Student>();
        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student1);

        for (Student students : student) {
            System.out.println(students.toString());
        }
    }
}