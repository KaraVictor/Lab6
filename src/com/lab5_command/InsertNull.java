package com.lab5_command;

import com.lab5_data.*;

import java.time.LocalDateTime;

public class InsertNull {

    public void insertNull(String element, Collection collection) {
        int flag = 0;
        for (String i : collection.collection.keySet()) {
            if (i.equals(element)) {
                System.out.println("An element with this key already exists, try another key");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            String name = Receiver.getName();
            Coordinates coordinates = Receiver.getCoordinates();
            LocalDateTime creationDate = LocalDateTime.now();
            Integer oscarCount = Receiver.getOscarCount();
            Long goldenPalmCount = Receiver.getGoldenPalm();
            Double totalBoxOffice = Receiver.getTotalBoxOffice();
            MpaaRating mpaaRating = Receiver.getMpaaRating();
            Person operator = Receiver.getOperator();
            collection.collection.put(element, new Movie(collection.id, name, coordinates, creationDate, oscarCount, goldenPalmCount,
                    totalBoxOffice, mpaaRating, operator));
            collection.id++;
            System.out.println("New movie added to collection");
        }
    }
}
