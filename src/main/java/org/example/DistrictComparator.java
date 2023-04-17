package org.example;
import java.util.Comparator;

public class DistrictComparator implements Comparator<City> {
    public int compare(City c1, City c2) {
        if (c1.getDistrict().compareTo(c2.getDistrict()) == 0) {
            return 0;
        }
        if (c1.getDistrict().compareTo(c2.getDistrict()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
