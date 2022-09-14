package com.lab5_command;

import com.lab5_data.Collection;

public class MaxByTotalBoxOffice {

    public void maxByTotalBoxOffice (Collection collection) {
        double count = 0;
        String targetKey = "";
        for (String key : collection.collection.keySet()) {
            if (collection.collection.get(key).getTotalBoxOffice() > count) {
                count = collection.collection.get(key).getTotalBoxOffice();
                targetKey = key;
            }
        }
        if (count == 0) {
            System.out.println("There are no such items in the collection");
            System.out.println("___");
        }
        else {
            System.out.println(targetKey + ":");
            System.out.println(collection.collection.get(targetKey).toString());
            System.out.println("Element removed");
            System.out.println("___");
        }
    }
}
