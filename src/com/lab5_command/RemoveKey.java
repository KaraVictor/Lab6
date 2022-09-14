package com.lab5_command;

import com.lab5_data.Collection;

public class RemoveKey {

    public void removeKey(String key, Collection collection) {

        if (collection.collection.containsKey(key)) {
            collection.collection.remove(key);
        }
        else {
            System.out.println("No element with this key");
        }
    }
}
