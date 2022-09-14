package com.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class Server {
    ServerSender serverSender;
    ServerReceiver serverReceiver;

    public Server(ServerSender serverSender, ServerReceiver serverReceiver) {
        this.serverSender = serverSender;
        this.serverReceiver = serverReceiver;
    }

    public void run() throws IOException {
        ByteBuffer byteBuffer = serverReceiver.receive(serverSender);
    }
}
