package com.lab5_command;

import com.lab5_data.Collection;

public class RemoveGreater {

    public void removeGreater (Collection collection, String key) {
        RemoveGreaterKey removeGreaterKey = new RemoveGreaterKey();
        removeGreaterKey.removeGreaterKey(key, collection);
    }
}

