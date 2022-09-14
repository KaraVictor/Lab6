package com.client;

import java.io.IOException;
import java.nio.ByteBuffer;

public class Client {
    ClientReceiver clientReceiver;
    ClientSender clientSender;

    public Client(ClientSender clientSender, ClientReceiver clientReceiver) {
        this.clientReceiver = clientReceiver;
        this.clientSender = clientSender;
    }

    public void run() throws IOException, ClassNotFoundException {
    }
}
