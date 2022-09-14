package com.lab5_command;

import com.lab5_data.*;

import java.util.Scanner;

public class UpdateId {

    public void updateId(int id, Collection collection) {

        String newKey = "";
        for (String key : collection.collection.keySet()) {
            if (collection.collection.get(key).getId() == id) {
                newKey = key;
                break;
            }
        }
        if (newKey.equals("")) {
            System.out.println("There is no element with this id");
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the field you want to change");
            System.out.println("Available fields for editing: name, coordinates, oscar count, golden palm, total box" +
                    "office, mpaa rating, operator");
            System.out.println("If you want to finish editing, type: finish");
            while (true) {
                String[] string = scanner.nextLine().trim().toLowerCase().split(" ");
                boolean f = false;
                switch (string[0]) {
                    case "name": {
                        String name = Receiver.getName();
                        collection.collection.get(newKey).setName(name);
                        break;
                    }
                    case "coordinates": {
                        Coordinates coordinates = Receiver.getCoordinates();
                        collection.collection.get(newKey).setCoordinates(coordinates);
                        break;
                    }
                    case "oscar": {
                        Integer oscarCount = Receiver.getOscarCount();
                        collection.collection.get(newKey).setOscarsCount(oscarCount);
                        break;
                    }
                    case "golden": {
                        Long goldenPalm = Receiver.getGoldenPalm();
                        collection.collection.get(newKey).setGoldenPalmCount(goldenPalm);
                        break;
                    }
                    case "total": {
                        Double totalBoxOffice = Receiver.getTotalBoxOffice();
                        collection.collection.get(newKey).setTotalBoxOffice(totalBoxOffice);
                        break;
                    }
                    case "mpaa": {
                        MpaaRating mpaaRating = Receiver.getMpaaRating();
                        collection.collection.get(newKey).setMpaaRating(mpaaRating);
                        break;
                    }
                    case "operator": {
                        Person operator = Receiver.getOperator();
                        collection.collection.get(newKey).setOperator(operator);
                        return;
                    }
                    default:
                        f = true;
                }
                if (f) {
                    System.out.println("There is no such field, please enter again:");
                } else {
                    System.out.println("Item changed");
                }
                System.out.println("Enter the name of the field you would like to change" +
                        "or type finish if you've finished making changes");
            }
        }
            System.out.println();
    }
}
