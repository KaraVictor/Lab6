package com.lab5_command;

import com.lab5_data.Collection;

public class RemoveGreaterKey {

    public void removeGreaterKey(String key, Collection collection) {
        if (collection.collection.isEmpty()) {
            System.out.println("Collection is empty");
            System.out.println("___");
        }
        else {
            String[] check = collection.collection.keySet().toArray(new String[0]);
            for (String i : check) {
                if (i.compareTo(key) > 0) {
                    collection.collection.remove(i);
                }
            }
            System.out.println("All elements of the collection whose key is greater than" + key +
                    " have been removed from the collection");
            System.out.println("___");
        }
    }
}
