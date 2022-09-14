package com.client;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class ClientReceiver {
    private final DatagramChannel channel;

    public ClientReceiver(DatagramChannel channel) {
        this.channel = channel;
    }

    public void receive() throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.allocate(65536);
        try {
            StringBuilder serverAnswer;
            serverAnswer = new StringBuilder();
            while (true) {
                if (channel.isConnected()) {
                    channel.receive(byteBuffer);
                    String message = extractMessage(byteBuffer);
                    if (message.equals("end")) {
                        break;
                    }
                    serverAnswer.append(message);
                    byteBuffer = ByteBuffer.allocate(65536);
                }
            }
            System.out.println(serverAnswer);
        }
        catch (Exception ignored) {
            System.out.println("Server is not responding, try again later");
        }
    }

    private String extractMessage(ByteBuffer byteBuffer) {
        byteBuffer.flip();
        byte[] bytes = new byte[byteBuffer.remaining()];
        byteBuffer.get(bytes);
        String msg;
        msg = new String(bytes);
        return msg;
    }
}
