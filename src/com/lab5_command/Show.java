package com.lab5_command;

import com.lab5_data.Collection;

public class Show{

    public void show(Collection collection) {

        if(collection.collection.size() == 0) {
            System.out.println("Collection is empty");
            System.out.println();
        }
        else {
            System.out.println("All elements of the collection:");
            for (String key : collection.collection.keySet()) {
                System.out.println(key + ":");
                System.out.println(collection.collection.get(key).toString());
                System.out.println("___");
            }
        }
    }
}
