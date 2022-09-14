package com.server;

import com.lab5_data.Collection;
import com.utility.Serializer;
import com.utility.ClientMessage;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class MainServer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DatagramChannel serverChannel = DatagramChannel.open();
        InetSocketAddress serverAddress = new InetSocketAddress("localhost", 2003);
        serverChannel.bind(serverAddress);
        System.out.println("сервер начинает работу #" + serverAddress);
        ServerReceiver serverReceiver = new ServerReceiver(serverChannel);
        ServerSender serverSender = new ServerSender(serverChannel);
        Server server = new Server(serverSender, serverReceiver);

        File serverFile = new File(System.getenv("FILE"));
        Collection collection = new Collection();

        while (true) {
            ByteBuffer byteBuffer;
            byteBuffer = serverReceiver.receive(serverSender);
            ClientMessage message = (ClientMessage) Serializer.Deserialization(byteBuffer);
            System.out.println(message.message);
            if ("exit_server".equals(message.message)) {
                break;
            }
        }

    }


}