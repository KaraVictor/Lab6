package com.lab5_command;

import com.lab5_data.Collection;

public class FilterStartsWithName {

    public void filterStartsWithName (Collection collection, String targetSymbol) {
        String currentSymbol;
        String[] symbols;
        if (collection.collection.isEmpty()) {
            System.out.println("Collection is empty");
            System.out.println("___");
        }
        else {
            for (String key : collection.collection.keySet()) {
                symbols = collection.collection.get(key).getName().split("");
                currentSymbol = String.valueOf(symbols[0]);
                if (currentSymbol.toLowerCase().equals(targetSymbol)) {
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
