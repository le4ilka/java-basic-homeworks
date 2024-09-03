package ru.olga.java.basic.homeworks.homework13_network_calc.client;

import java.io.*;
import java.net.Socket;

public class PingClient implements AutoCloseable{
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public PingClient(Socket socket) throws IOException {
        this.inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        this.outputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    }

    public void send(String bytes) throws IOException {
        outputStream.writeUTF(bytes);
        outputStream.flush();
    }

    public String read() throws IOException {

        String result = inputStream.readUTF();
        return result;
    }


    @Override
    public void close() throws Exception {
        inputStream.close();
        outputStream.close();
    }
}
