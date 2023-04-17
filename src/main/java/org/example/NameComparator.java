package org.example;
import java.util.Comparator;

public class NameComparator implements Comparator<City> {
    public int compare(City c1, City c2) {
        if (c1.getName().toLowerCase().compareTo(c2.getName().toLowerCase()) == 0) {
            return 0;
        }
        if (c1.getName().toLowerCase().compareTo(c2.getName().toLowerCase()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
