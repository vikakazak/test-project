package lesson9.Task2;

public class Student {
    private String name;
    private int group;
    private int mark;

    public Student() {
    }

    public Student(String name, int group, int mark) {
        this.name = name;
        this.group = group;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
