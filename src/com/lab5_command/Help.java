package com.lab5_command;

public class Help {

    public static void help() {
        System.out.println("info : print information about the collection to the standard output stream (type, initialization date, number of elements, etc.)\n" +
                "show : print to standard output all elements of the collection in string representation\n" +
                "insert null : add new element with given key\n" +
                "update id : update the value of the collection element whose id is equal to the given one\n" +
                "remove_key null : remove an element from a collection by its key\n" +
                "clear : clear the collection\n" +
                "save : save collection to file\n" +
                "execute_script file_name : read and execute the script from the specified file. " +
                "The script contains commands in the same form in which they are entered by the user in interactive mode.\n" +
                "exit : terminate program (without saving to file)\n" +
                "remove_greater null: remove from the collection all elements greater than the given one. Same as remove_greater_key\n" +
                "remove_greater_key null : remove from the collection all elements whose key is greater than the given one\n" +
                "remove_lower_key null : remove from the collection all elements whose key is less than the given one\n" +
                "max_by_total_box_office : display any object from the collection whose totalBoxOffice field value is the maximum\n" +
                "filter_starts_with_name name : display elements whose name field value starts with the given substring\n" +
                    "filter_less_than_oscars_count oscarsCount : display elements whose oscarsCount field value is less than the given one");
        System.out.println("___");
    }
}
