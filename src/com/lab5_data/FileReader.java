package com.lab5_data;

import java.io.*;
import java.time.LocalDateTime;


public class FileReader {

    public void fileReader(Collection collection) {
        try {
            File file = new File(System.getenv("FILE"));
            file.setReadable(true);
            InputStream is = new FileInputStream(file);
            Reader isr = new InputStreamReader(is);
            StringBuilder string = new StringBuilder();
            String[] command;
            while (isr.ready()) {
                char chr = (char) isr.read();
                if (chr == '\n') {
                    command = string.toString().trim().split(",");
                    string = new StringBuilder();
                    collection.collection.put(command[0], new Movie(collection.id, FileReceiver.getName(command[1]),
                            FileReceiver.getCoordinates(command[2].replace("(", "").replace(")", "").split(";")),
                            LocalDateTime.parse(command[3]), FileReceiver.getOscarCount(command), FileReceiver.getGoldenPalm(command),
                            FileReceiver.getTotalBoxOffice(command), FileReceiver.getMpaaRating(command), FileReceiver.getOperator(command)));
                    collection.id++;
                }
                else {
                    string.append(chr);
                }
            }
            if (!string.toString().equals("")) {
                command = string.toString().trim().split(",");
                collection.collection.put(command[0], new Movie(collection.id, FileReceiver.getName(command[1]),
                        FileReceiver.getCoordinates(command[2].replace("(", "").replace(")", "").split(";")),
                        LocalDateTime.parse(command[3]), FileReceiver.getOscarCount(command), FileReceiver.getGoldenPalm(command),
                        FileReceiver.getTotalBoxOffice(command), FileReceiver.getMpaaRating(command), FileReceiver.getOperator(command)));
                collection.id++;
            }
            isr.close();
            System.out.println("___");
        }
        catch (FileNotFoundException ignored) { } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File processing error");
        }
    }
}