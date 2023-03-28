package Lesson_29;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonExample {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        Human Mark = new Human("Mark", 30, "Russia");
        System.out.println("Mark = " + Mark);
        String MarkJson = GSON.toJson(Mark);
        System.out.println(MarkJson);
    }
}
