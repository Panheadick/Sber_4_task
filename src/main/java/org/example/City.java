package org.example;
import java.util.Comparator;

public class City {
    private int id = 0;
    private String name = "";
    private String region = "";
    private String district = "";
    private int population = 0;
    private String foundation = "";

    public City(String city) {
        String[] cityArray = city.split(";");
        if(cityArray.length == 6) {
            this.id = Integer.parseInt(cityArray[0]);
            this.name = cityArray[1];
            this.region = cityArray[2];
            this.district = cityArray[3];
            this.population = Integer.parseInt(cityArray[4]);
            this.foundation = cityArray[5];
        } else {
            this.id = Integer.parseInt(cityArray[0]);
            this.name = cityArray[1];
            this.region = cityArray[2];
            this.district = cityArray[3];
            this.population = Integer.parseInt(cityArray[4]);
        }
    }

    //Формирование модели и вывод ее в консоль
    public void printModel() {
        StringBuilder result = new StringBuilder();
        result.append("City{name='").append(name).append("',region='").append(region);
        result.append("',district='").append(district).append("',population=").append(population);
        result.append(",foundation='").append(foundation).append("'}");
        System.out.println(result);
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public int getPopulation() {
        return population;
    }

    public String getRegion() {
        return region;
    }
}
