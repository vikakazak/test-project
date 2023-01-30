package lesson10.practice;

public class Methods {
    public static void method1(String string){
        System.out.println("Task1 : " + string.substring(0,4) + string.substring(9,13));
    }

    public static void method2(String string){
        StringBuilder str = new StringBuilder(string);
        str.replace(5, 8, "***");
        str.replace(14, 17, "***");
        System.out.println("Task2 : " + str);
    }

    public static void method3(String string){
        StringBuilder str = new StringBuilder(string);
        str.replace(20, 21, "/");
        str.replace(17, 19, "/");
        str.replace(8, 14, "/");
        str.delete(0, 5);
        System.out.println("Task3 : " + str.toString().toLowerCase());
    }

    public static void method4(String string){
        StringBuilder str = new StringBuilder(string);
        str.replace(20, 21, "/");
        str.replace(17, 19, "/");
        str.replace(8, 14, "/");
        str.delete(0, 5);
        str.insert(0, "Letters:");
        System.out.println("Task4 : " + str.toString().toUpperCase());
    }

    public static void method5 (String string){
        String substring = "abc";
        if (string.toLowerCase().contains(substring.toLowerCase())){
            System.out.println("Содержит");
        }
        else{
            System.out.println("Не содержит");
        }
    }

    public static void method6 (String string){
        String substring = "555";
        System.out.println(string.startsWith(substring));
    }

    public static void method7 (String string){
        String substring = "1a2b";
        System.out.println(string.endsWith(substring));
    }
}
