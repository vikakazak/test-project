package lesson9.Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> names = new ArrayList<>();
        Set <String> nameSet = new HashSet<>();
        for (int i = 0; i < 10; i++){
            String name = scanner.next();
            names.add(name);
            nameSet.add(name);
        }
        if (names.size() != nameSet.size()){
            int sum = names.size() - nameSet.size();
            System.out.println("Повторений:" + sum);
        }
        else {
            System.out.println("Повторений нет");
        }
    }
}
