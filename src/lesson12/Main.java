package lesson12;

import java.util.Comparator;
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

        students.stream()
                .sorted(Comparator.comparingInt(Student::getGroup))
                .filter(student -> student.getMark() > 4)
                .forEach (student -> System.out.println(
                        "имя: " + student.getName() + " группа: " + student.getGroup() + " отметка: " + student.getMark()));

    }
}