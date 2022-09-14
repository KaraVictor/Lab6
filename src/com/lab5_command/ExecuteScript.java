package com.lab5_command;


import com.lab5_data.Collection;

import java.io.*;

public class ExecuteScript {

    String errorNames = "";

    public void setErrorNames(String errorNames) {
        this.errorNames = this.errorNames + errorNames + " ";
    }

    public void executeScript(String nameFile, Operations operations, Collection collection) {
        String[] checkNames = errorNames.toLowerCase().trim().split(" ");
        for (String s: checkNames) {
            if (nameFile.equals(s)) {
                System.out.println("File " + nameFile + " causes a recursion, so the execution of the command is finished");
                break;
            }
            else {
                setErrorNames(nameFile);
                try {
                    InputStream is = new FileInputStream(nameFile);
                    Reader isr = new InputStreamReader(is);
                    StringBuilder string = new StringBuilder();
                    String[] command;
                    while (isr.ready()) {
                        char chr = (char) isr.read();
                        if (chr == '\n') {
                            command = string.toString().toLowerCase().trim().split(" ");
                            operations.operations(command, operations, collection);
                            string = new StringBuilder();
                        }
                        else {
                            string.append(chr);
                        }
                    }
                    if (!string.toString().equals("")) {
                        command = string.toString().toLowerCase().trim().split(" ");
                        operations.operations(command, operations, collection);
                    }
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
