package com.lab5_command;


import com.lab5_data.Collection;

public class Clear {

    public void clear(Collection collection) {
        collection.collection.clear();
        System.out.println("Collection cleared");
    }
}
