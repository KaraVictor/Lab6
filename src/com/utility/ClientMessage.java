package com.utility;

import java.io.Serializable;

public class ClientMessage implements Serializable {
    public String message;

    public ClientMessage(String message){
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void plusMessage(String message){
        this.message += message;
    }
}

