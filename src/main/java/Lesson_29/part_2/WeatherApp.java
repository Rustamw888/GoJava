package Lesson_29.part_2;

import Lesson_29.part_2.models.Coord;
import Lesson_29.part_2.models.Main;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WeatherApp {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final String key = "37c7e0119d3cf69dbbfa1a631c6412da";
    private static BufferedReader bufferedReader;

    static String getContent(String city) {
        StringBuffer content = new StringBuffer();
        try {
            URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + key);
            URLConnection urlConnection = url.openConnection();
            bufferedReader = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line);
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return content.toString();
    }

    public static void main(String[] args) {
        String yourCity = "Grozny";

        String jsonContent = getContent(yourCity);
        System.out.println("jsonContent = " + jsonContent);
        System.out.println("jsonContent = " + GSON.fromJson(jsonContent, Main.class));

        if (!jsonContent.isEmpty()) {
            JSONObject object = new JSONObject(jsonContent);
            String s = String.format("Temp in %s = %s", yourCity, Math.floor(object.getJSONObject("main").getDouble("temp") - 273));
            System.out.println(s);
        }
    }
}
