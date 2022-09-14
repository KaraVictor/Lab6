package com.client;

import com.utility.ClientMessage;
import com.utility.Serializer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        DatagramChannel clientChannel = DatagramChannel.open();
        InetSocketAddress serverAddress = new InetSocketAddress("localhost", 2003);
        clientChannel.connect(serverAddress);
        ClientReceiver clientReceiver = new ClientReceiver(clientChannel);
        ClientSender clientSender = new ClientSender(clientChannel, serverAddress);
        Client client = new Client(clientSender, clientReceiver);
        String messages;
        String[] arrayMessages;

        while (true) {
            System.out.println("Type - help - if you want to see a list of commands");
            messages = scanner.nextLine().toLowerCase().trim();
            arrayMessages = messages.split(" ");
            if (arrayMessages[0].equals("exit")) {
                break;
            }
            // отправляем сообщение на сервер
            ClientMessage clientMessage = new ClientMessage(messages);
            ByteBuffer buffer = Serializer.Serialization(clientMessage);
            clientSender.send(buffer);

            // получаем ответ от сервера
            clientReceiver.receive();
        }
        clientChannel.close();
    }
}