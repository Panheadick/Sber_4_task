package org.example;

import java.io.File;
import java.text.DecimalFormat;
import java.util.*;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        File citiesDirectory = new File("src\\main\\resources\\Задача ВС Java Сбер.csv");
        ArrayList<City> citiesArray = new ArrayList<>();

        //Чтение файла и запись объектов city в список
        try {
            Scanner scanner = new Scanner(citiesDirectory);
            while (scanner.hasNextLine()) {
                String strCity = scanner.nextLine();
                City city = new City(strCity);
                citiesArray.add(city);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Map<String, Integer> citiesInRegionMap = new HashMap<>();
        for (City city :
                citiesArray) {
            //Если в хэш таблице нет региона добавим его
            if (!citiesInRegionMap.containsKey(city.getRegion())) {
                citiesInRegionMap.put(city.getRegion(), 1);
            } else {//Если есть прибавим один к количеству его городов
                citiesInRegionMap.put(city.getRegion(),citiesInRegionMap.get(city.getRegion()) + 1);
            }
        }
        citiesInRegionMap.forEach((key, value) -> System.out.println(key + " - " + value));


    }
}
