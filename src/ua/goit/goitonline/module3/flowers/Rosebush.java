package ua.goit.goitonline.module3.flowers;

import java.util.ArrayList;
import java.util.List;

public class Rosebush {
    static String type;
    static List<Rose> roseBush = new ArrayList<>();

    static public String getType() {
        return type;
    }

    static public void cutRose() {
        roseBush.remove(1);
        System.out.println("Осталось роз: " + roseBush);
    }

    @Override
    public String toString() {
        return "Rosebush contains " + getType();
    }
}
