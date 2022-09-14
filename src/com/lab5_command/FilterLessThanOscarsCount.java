package com.lab5_command;

import com.lab5_data.Collection;

import java.util.Objects;

public class FilterLessThanOscarsCount {

    public void filterLessThanOscarsCount(Collection collection, int targetCount) {
        int currentCount;
        if (collection.collection.isEmpty()) {
            System.out.println("Collection is empty");
            System.out.println("___");
        }
        else {
            String[] check = collection.collection.keySet().toArray(new String[0]);
            for (String key : check) {
                String res = String.valueOf(collection.collection.get(key).getOscarsCount());
                if (Objects.equals(res, "null")) {
                    currentCount = 0;
                }
                else {
                    currentCount = collection.collection.get(key).getOscarsCount();
                }
                if (currentCount < targetCount) {
                    System.out.println(key + ":");
                    System.out.println(collection.collection.get(key).toString());
                    System.out.println("___");
                }
            }
            System.out.println("All such elements of the collection are displayed");
            System.out.println("___");
        }
    }

}
