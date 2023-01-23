package lesson9.Task2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Viktoria", 101, 9 ),
                new Student("Maria", 125, 8 ),
                new Student("Slava", 162, 9 ),
                new Student("Boris", 115, 9 ),
                new Student("Polina", 101, 6 ));
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (Student eachStudent: students){
            if (eachStudent.getName() != null && name.equals(eachStudent.getName())){
                System.out.println(eachStudent.getGroup() + " " + eachStudent.getMark());
                return;
            }
        }
    }
}
