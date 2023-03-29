package Lesson_29.part_1;

public class Human {

    private String name;
    private int age;
    private String country;

    public Human(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s ", name, age, country);
    }
}
