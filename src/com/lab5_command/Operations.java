package com.lab5_command;

import com.lab5_data.Collection;

public class Operations {

    ExecuteScript executeScript = new ExecuteScript();
    Info info = new Info();
    Show show = new Show();
    InsertNull insertNull = new InsertNull();
    UpdateId updateId = new UpdateId();
    RemoveKey removeKey = new RemoveKey();
    Clear clear = new Clear();
    RemoveGreater removeGreater = new RemoveGreater();
    RemoveGreaterKey removeGreaterKey = new RemoveGreaterKey();
    RemoveLowerKey removeLowerKey = new RemoveLowerKey();
    MaxByTotalBoxOffice maxByTotalBoxOffice = new MaxByTotalBoxOffice();
    FilterStartsWithName filterStartsWithName = new FilterStartsWithName();
    FilterLessThanOscarsCount filterLessThanOscarsCount = new FilterLessThanOscarsCount();

    public void operations(String[] command, Operations operations, Collection collection) {
        if (command[0].equals("help") & command.length == 1){
            Help.help();
        }
        else if (command[0].equals("execute_script") & command.length == 2) {
            executeScript.executeScript(command[1], operations, collection);
        }
        else if (command[0].equals("info") & command.length == 1) {
            info.info(collection);
        }
        else if (command[0].equals("show") & command.length == 1) {
            show.show(collection);
        }
        else if (command[0].equals("insert") & command.length == 2) {
            insertNull.insertNull(command[1], collection);
        }
        else if (command[0].equals("update") & command.length == 2) {
            try {
                int id = Integer.parseInt(command[1]);
                updateId.updateId(id, collection);
            }
            catch (NumberFormatException ignored) {
                System.out.println("You must pass an int value");
            }
        }
        else if (command[0].equals("remove_key") & command.length == 2) {
            removeKey.removeKey(command[1], collection);
        }
        else if (command[0].equals("clear") & command.length == 1) {
            clear.clear(collection);
        }
        else if (command[0].equals("remove_greater") & command.length == 2) {
            removeGreater.removeGreater(collection, command[1]);
        }
        else if (command[0].equals("remove_greater_key") & command.length == 2) {
            removeGreaterKey.removeGreaterKey(command[1], collection);
        }
        else if (command[0].equals("remove_lower_key") & command.length == 2) {
            removeLowerKey.removeLowerKey(command[1], collection);
        }
        else if (command[0].equals("max_by_total_box_office") & command.length == 1) {
            maxByTotalBoxOffice.maxByTotalBoxOffice(collection);
        }
        else if (command[0].equals("filter_starts_with_name") & command.length == 2) {
            filterStartsWithName.filterStartsWithName(collection, command[1]);
        }
        else if (command[0].equals("filter_less_than_oscars_count") & command.length == 2) {
            try {
                int id = Integer.parseInt(command[1]);
                filterLessThanOscarsCount.filterLessThanOscarsCount(collection, id);
            }
            catch (NumberFormatException ignored) {
                System.out.println("You must pass an int value");
            }
        }
    }
}
