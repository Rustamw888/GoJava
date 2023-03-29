package Lesson_29.part_2.models;

import java.util.List;
import lombok.Data;

@Data
public class Main{
	private int visibility;
	private int timezone;
	private Main main;
	private Clouds clouds;
	private Sys sys;
	private int dt;
	private Coord coord;
	private List<WeatherItem> weather;
	private String name;
	private int cod;
	private int id;
	private String base;
	private Wind wind;
	private Object temp;
	private Object tempMin;
	private int humidity;
	private int pressure;
	private Object feelsLike;
	private Object tempMax;
}