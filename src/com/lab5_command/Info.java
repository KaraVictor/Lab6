package com.lab5_command;

import com.lab5_data.Collection;

public class Info{

    public void info(Collection collection) {
        System.out.println("Collection Information:");
        System.out.println("Collection type: " + "LinkedHashMap" + "\n" +
                "Collection item type: " + "Movies" + "\n" +
                "Initialization date:" + collection.primitiveTime + "\n" +
                "Number of items in the collection:" + collection.collection.size());
        System.out.println("___");
    }
}
