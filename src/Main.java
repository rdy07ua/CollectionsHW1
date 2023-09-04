import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> listTen = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listTen.add(i);
        }
        for (int num : listTen) {
            System.out.println(num);
        }

            List<Integer> hugeList = new LinkedList<>();
            for (int i = 1; i <= 2000000; i++) {
             hugeList.add(i);
         }


           for (int i = 0; i < 10; i++) {
            System.out.println(hugeList.get(i));
          }


        List<Student> students = new ArrayList<>();
        students.add(new Student("Serhii", 30));
        students.add(new Student("Artem", 21));
        students.add(new Student("Petro", 25));

        System.out.println(students);



    }
}